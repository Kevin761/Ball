package pl.edu.pwr.student.s235958.ball;

import android.app.Activity;
import android.os.Bundle;

import android.os.Handler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BallActivity ballActivity = (BallActivity)findViewById(R.id.ball);

        Thread t = new Thread(new BallThread(new Handler(), ballActivity));
        t.start();



    }


}
