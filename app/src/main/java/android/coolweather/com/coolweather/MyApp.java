package android.coolweather.com.coolweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by LouisShark on 2017/3/8.
 */

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
