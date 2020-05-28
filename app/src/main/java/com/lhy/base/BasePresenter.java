package com.lhy.base;

import java.lang.ref.WeakReference;

public class BasePresenter<V> implements IBasePresenter<V> {
    public V view;
    private WeakReference<V> vWeakReference;

    @Override
    public void attach(V view) {
        vWeakReference = new WeakReference<>(view);
        this.view=vWeakReference.get();
    }

    @Override
    public void datch() {
        if (view != null) {
            view=null;
        }
    }
}
