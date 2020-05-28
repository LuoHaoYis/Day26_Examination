package com.lhy.contract;

import com.lhy.base.IBasePresenter;
import com.lhy.base.IBaseView;
import com.lhy.data.HomeRecyclerBean;


public interface HomeContract {

    interface View extends IBaseView{
        void successUI(HomeRecyclerBean homeRecyclerBean);
    }

    interface  Presenter extends IBasePresenter<View>{
        void getData();
    }
}
