package basti.com.aasample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import basti.com.aalib.AAView;
import basti.com.aalib.CrashUtils;
import basti.com.aalib.Point;
import basti.com.aalib.callback.OnGameFinished;
import basti.com.aalib.callback.OnPointBiuFinished;

public class MainActivity extends AppCompatActivity {

    private AAView mAAView;
    private Button bt_restart,bt_pause,bt_resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        //设置初始时圆的个数
        mAAView.setInitCount(3);
        //设置需要添加圆的个数
        mAAView.setRestCount(5);
        //设置旋转速度
        mAAView.setRotateSpeed((float) 1.5);
        //设置发射速度
        mAAView.setBiuSpeed(5f);
        //设置底部动画速度
        mAAView.setBottomSpeed(1f);
        //设置关卡
        mAAView.setLevel(1);
        //其他涉及到Dimension设置的函数
        //setXXX(float dimension),
        //单位：字体大小：sp
        //      半径、线的宽度等：dp

        //游戏结束的回调函数
        mAAView.setOnGameFinishedListener(new OnGameFinished() {
            @Override
            public void onSuccess() {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.success), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFail() {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
            }
        });

        //每发射一个圆的回调函数
        mAAView.setOnPointBiuFinishedListener(new OnPointBiuFinished() {
            @Override
            public void onPointFinished(int index) {
                Log.i("TAG", "" + index);
            }
        });

        bt_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重新开始
                mAAView.restart();
            }
        });

        bt_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //暂停
                mAAView.pause();
            }
        });

        bt_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //暂停后继续
                mAAView.resume();
            }
        });
    }

    private void initView() {

        mAAView = (AAView) findViewById(R.id.aaview);
        bt_restart = (Button) findViewById(R.id.restart);
        bt_pause = (Button) findViewById(R.id.pause);
        bt_resume = (Button) findViewById(R.id.resume);
    }
}
