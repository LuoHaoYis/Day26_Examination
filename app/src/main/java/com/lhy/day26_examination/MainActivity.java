package com.lhy.day26_examination;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.lhy.adapters.HomeAdapter;
import com.lhy.data.HomeBean;
import com.lhy.data.HomeRecyclerBean;
import com.lhy.frame.ApiConfig;
import com.lhy.frame.CommonPresenter;
import com.lhy.frame.ICommonModel;
import com.lhy.frame.ICommonPresenter;
import com.lhy.frame.ICommonView;
import com.lhy.frame.LoadTypeConfig;
import com.lhy.frame.ParamHashMap;
import com.lhy.frame.TestModel;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements ICommonView {
    private int pageId = 0;
    private List<HomeBean> datas = new ArrayList<>();
    private TextView text;
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private SmartRefreshLayout smart;
    private ICommonModel mModel;
    private ICommonPresenter mPresenter;
    //MVP抽取
//    @Override
//    protected void initData() {
//        presenter.getData();
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mModel = new TestModel();
        mPresenter = new CommonPresenter(this,mModel);
        smart = (SmartRefreshLayout) findViewById(R.id.smart);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final Map<String, Object> params = new ParamHashMap().add("c", "api").add("a", "getList");
        smart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                pageId = 0;
                mPresenter.getData(ApiConfig.TEST_GET, LoadTypeConfig.REFRESH,params,pageId);
            }
        });
        smart.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                pageId++;
                mPresenter.getData(ApiConfig.TEST_GET, LoadTypeConfig.MORE,params,pageId);
            }
        });
        //给recyclerview设置间隔线 和 列表方向
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        //绑定
        homeAdapter = new HomeAdapter(this);
        recyclerView.setAdapter(homeAdapter);
        //接口回调
//        //做一些 插入数据到数据库和 删除数据库中的数据 的操作
//        homeAdapter.setAdditemClick(new HomeAdapter.additemClick() {
//            @Override
//            public void itemClick(HomeBean homeBean) {
//                DbUtils.insertHome(homeBean);
//                Toast.makeText(MainActivity.this, "数据已存入数据库", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void deleteClick(HomeBean homeBean,int i) {
//                homeAdapter.deleteList(i);
////                DbUtils.deleteHome(homeBean);
//                Toast.makeText(MainActivity.this, "数据已从数据库中移除", Toast.LENGTH_SHORT).show();
//            }
//        });


    }


    //Mvp抽取
//    @Override
//    protected HomePresenter initPresenter() {
//        return new HomePresenter();
//    }
//
//    @Override
//    protected int getLayout() {
//        return R.layout.activity_main;
//    }
//
//    //抽取MVP传回来的值 赋值给适配器
//    @Override
//    public void successUI(HomeRecyclerBean homeRecyclerBean) {
//        homeAdapter.setHomeList(homeRecyclerBean.getDatas());
//    }
//
//    @Override
//    public void errorUI(String error) {
//        Log.d(TAG, "errorUI: "+error);
//    }
//
//    private static final String TAG = "MainActivity";


    //-----------------
    @Override
    public void onSuccess(int whichApi, int loadType, Object[] pD) {
        switch (whichApi) {
            case ApiConfig.TEST_GET:
                if (loadType == LoadTypeConfig.MORE) {
                    smart.finishLoadMore();
                } else if (loadType == LoadTypeConfig.REFRESH) {
                    smart.finishRefresh();
                    datas.clear();
                }
                List<HomeBean> datas = ((HomeRecyclerBean) pD[0]).getDatas();
                MainActivity.this.datas.addAll(datas);
                homeAdapter.notifyDataSetChanged();
                break;
        }
    }

    @Override
    public void onFailed(int whichApi, Throwable pThrowable) {
        Toast.makeText(MainActivity.this, pThrowable.getMessage()!=null ? pThrowable.getMessage():"网络请求发生错误", Toast.LENGTH_SHORT).show();
    }
}