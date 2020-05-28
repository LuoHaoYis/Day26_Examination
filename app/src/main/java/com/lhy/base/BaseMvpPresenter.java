package com.lhy.base;

public abstract class BaseMvpPresenter<P extends BasePresenter> extends BaseMainActivity {
    protected  P presenter;

    @Override
    protected void initView() {
        presenter=initPresenter();
        if (presenter != null) {
            presenter.attach(this);
        }
    }

    protected abstract P initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.datch();
        }
    }
}
