package com.mlabs.bbm.digiletter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        PlayGif pGif = (PlayGif) findViewById(R.id.viewGif);
        pGif.setImageResource(R.drawable.animated_logo_txt_small);

    Thread timerThread = new Thread(){
        public void run(){
            try{
                sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            finally{
                Intent intent = new Intent(SplashScreen.this,LoginActivity.class );
                startActivity(intent);
            }
        }
    };
        timerThread.start();
    }

    @Override
    protected  void onPause(){
        super.onPause();
        finish();
    }
}
