//package com.lhy.utils;
//
//import com.lhy.beans.HomeBean;
//import com.lhy.day26_examination.db.DaoSession;
//import com.lhy.day26_examination.db.HomeBeanDao;
//
//public class DbUtils {
//
//    static{
//        daoSession=MyApp.getDaoSession();
//    }
//
//    private static DaoSession daoSession;
//
//
//    public static void insertHome (HomeBean homeBean){
//        if (!queryOne(homeBean)) {
//            daoSession.insert(homeBean);
//        }
//    }
//
//    public static void deleteHome(HomeBean homeBean){
//        if (queryOne(homeBean)) {
//            daoSession.delete(homeBean);
//        }
//    }
//
//    public static boolean queryOne(HomeBean homeBean){
//        HomeBean unique = daoSession.queryBuilder(HomeBean.class).where(HomeBeanDao.Properties.Title.eq(homeBean.getTitle())).unique();
//        return unique==null ? false:true;
//    }
//}
