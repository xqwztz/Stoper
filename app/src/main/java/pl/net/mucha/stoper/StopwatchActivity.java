package pl.net.mucha.stoper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StopwatchActivity extends AppCompatActivity {
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    public void onClickStart(View view){
        running = true;
    }

    public void onClickStop(View view){
        running = false;
    }

    public void onClickReset(View view){
        seconds = 0;
        running = false;
    }
}

