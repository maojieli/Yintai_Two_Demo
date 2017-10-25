package com.jiyun.asus.yintai_two_demo.GRDAO;

import android.content.Context;

/**
 * 今天的你，一定要比昨天厉害那么一丢丢；
 * 作者：小昭 on 2017/10/25 22:29；
 */

public class DaoManager {
    private static DaoManager manager;
    private DaoMaster.DevOpenHelper helper;
    public static final String DB_NAME = "car.db";
    private DaoManager(Context context){
        helper = new DaoMaster.DevOpenHelper(context,DB_NAME);
    }
    public static synchronized DaoManager getInstance(Context context){
        if(manager==null)
            manager = new DaoManager(context);
        return manager;
    }
    public CarDaoDao getDao(){
        DaoMaster master = new DaoMaster(helper.getWritableDatabase());
        DaoSession daoSession = master.newSession();
        CarDaoDao studentDao = daoSession.getCarDaoDao();
        return studentDao;
    }

}
