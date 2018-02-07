package cn.levey.myapplication;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import cn.levey.myapplication.utils.FrescoBase;

/**
 * Created by Levey on 2018/2/7 11:56.
 * e-mail: m@levey.cn
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(getApplicationContext(),FrescoBase.getConfig(getApplicationContext()));
    }
}
