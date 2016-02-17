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
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        mAAView.setInitCount(3);
        mAAView.setRestCount(5);
        mAAView.setRotateSpeed((float) 1.5);

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

        mAAView.setOnPointBiuFinishedListener(new OnPointBiuFinished() {
            @Override
            public void onPointFinished(int index) {
                Log.i("TAG", "" + index);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAAView.restart();
            }
        });

    }

    private void initView() {

        mAAView = (AAView) findViewById(R.id.aaview);
        button = (Button) findViewById(R.id.restart);
    }
}
