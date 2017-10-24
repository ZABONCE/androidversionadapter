package com.example.darry.api23runpermission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * create by 巴山夜雨 Darry on 2017.10.24
 * desc:安卓6.0运行时权限分析
 * E-mail：18772833900@163.com
 */
public class MainActivity extends AppCompatActivity {

    private ImageView iv_pic_show;
    private ProgressBar pg_down_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_pic_show = (ImageView) findViewById(R.id.iv_pic);
        pg_down_rate = (ProgressBar) findViewById(R.id.pg_down_rate);
    }

    public void test(View view){
        switch (view.getId()){
            case R.id.btn_open_pic:
                openSDPic();
                break;
            case R.id.btn_down_apk:
                downloadApk();
                break;
        }

    }

    private void downloadApk() {

    }

    private void openSDPic() {

    }
}
