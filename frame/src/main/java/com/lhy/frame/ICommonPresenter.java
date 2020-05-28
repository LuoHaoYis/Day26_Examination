package com.lhy.frame;

import com.lhy.data.HomeRecyclerBean;

public interface ICommonPresenter<P> extends ICommonView {
    //1,由他作为中间层发起网络请求;
    //2,将请求的结果回调到view层
    void getData(int whichApi,P...pPs);

    //    void getData(int whichApi,int loadType,P... pPS);
//    default void getTrendsData(int whichApi,int loadType,P... pPS){}
}
