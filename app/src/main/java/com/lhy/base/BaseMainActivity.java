package com.lhy.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseMainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayout();

}
