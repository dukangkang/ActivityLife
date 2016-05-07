package com.docking.activitylife;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LifeActivity extends Activity {

    private static String TAG = "docking";
    private Button mBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        print("-->onCreate");
        init();
    }

    private void init() {
        mBtn = (Button) this.findViewById(R.id.btn);
        mBtn.setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if(id == mBtn.getId()) {
                startActivity();
            }
        }
    };

    private void startActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        print("-->onConfigurationChanged");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        print("-->onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        print("-->onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        print("-->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        print("-->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        print("-->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        print("-->onDestroy");
    }

    public static void print(String msg) {
        Log.e(TAG, msg);
    }
}
