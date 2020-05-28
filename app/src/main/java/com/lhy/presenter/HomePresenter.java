//package com.lhy.presenter;
//
//import android.util.Log;
//
//import com.lhy.api.ApiService;
//import com.lhy.base.BasePresenter;
//import com.lhy.beans.HomeRecyclerBean;
//import com.lhy.contract.HomeContract;
//
//import io.reactivex.Observable;
//import io.reactivex.Observer;
//import io.reactivex.android.schedulers.AndroidSchedulers;
//import io.reactivex.disposables.Disposable;
//import io.reactivex.schedulers.Schedulers;
//import retrofit2.Retrofit;
//import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//import static android.support.constraint.Constraints.TAG;
//
//public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
//    @Override
//    public void getData() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(ApiService.pathUrl)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        Observable<HomeRecyclerBean> homeRecycler = retrofit.create(ApiService.class).getHomeRecycler();
//
//        homeRecycler.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<HomeRecyclerBean>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(HomeRecyclerBean homeRecyclerBean) {
//                        view.successUI(homeRecyclerBean);
//                        Log.d(TAG, "onNext: "+homeRecyclerBean.toString());
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        view.errorUI(e.getMessage());
//                        Log.d(TAG, "onError: "+e.getMessage().toString());
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }
//}
