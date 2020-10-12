
package com.theappwizard.loginpageandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rell1, rell2;

    Handler handler = new Handler ();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //My two Relative Layouts
            rell1.setVisibility(View.VISIBLE);
            rell2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        rell1 = (RelativeLayout)findViewById(R.id.rel1);
        rell2 = (RelativeLayout)findViewById(R.id.rel2);

        handler.postDelayed(runnable,2000);
        //This is delay for timeout
    }
}