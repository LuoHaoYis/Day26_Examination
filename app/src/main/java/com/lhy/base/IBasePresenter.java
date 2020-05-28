package com.lhy.base;

public interface IBasePresenter<V> {

    void attach(V view);
    void datch();
}
