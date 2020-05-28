package com.lhy.frame;

import com.lhy.data.HomeRecyclerBean;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestModel implements ICommonModel {
    @Override
    public void getData(final ICommonPresenter pPresenter, final int whichApi, Object[] params) {
        final int loadType= (int) params[0];
        Map param=(Map) params[1];
        int pageId= (int) params[2];
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://static.owspace.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Observable<HomeRecyclerBean> treData = retrofit.create(ApiService.class).getTreData(param, pageId);
        treData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeRecyclerBean>() {
                    @Override
                    public void accept(HomeRecyclerBean homeRecyclerBean) throws Exception {
                        pPresenter.onSuccess(whichApi,loadType,homeRecyclerBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        pPresenter.onFailed(whichApi,throwable);
                    }
                });
    }
}
