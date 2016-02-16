package basti.com.aasample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import basti.com.aalib.AAView;

public class MainActivity extends AppCompatActivity {

    private AAView mAAView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        mAAView.setInitCount(3);
        mAAView.setRestCount(5);

    }

    private void initView() {

        mAAView = (AAView) findViewById(R.id.aaview);

    }
}
