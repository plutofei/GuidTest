package com.pfma.guidtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.pfma.guidtest.global.AppConstants;
import com.pfma.guidtest.utils.SpUtils;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean isFirstOpen = SpUtils.getBoolean(this, AppConstants.FIRST_OPEN);

        if (!isFirstOpen) {
            Intent intent = new Intent(this, GuideActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        // 如果不是第一次启动app，则正常显示启动屏
        setContentView(R.layout.activity_home);
    }

}
