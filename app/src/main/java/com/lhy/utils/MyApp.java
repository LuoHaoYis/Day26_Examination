//package com.lhy.utils;
//
//import android.app.Application;
//
//import com.lhy.day26_examination.db.DaoMaster;
//import com.lhy.day26_examination.db.DaoSession;
//
//public class MyApp extends Application {
//
//    private static DaoSession daoSession;
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        setDatBase();
//    }
//
//    private void setDatBase() {
//        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "home.db");
//
//        daoSession = new DaoMaster(devOpenHelper.getWritableDatabase()).newSession();
//    }
//
//    public static DaoSession getDaoSession(){
//        return daoSession;
//    }
//}
