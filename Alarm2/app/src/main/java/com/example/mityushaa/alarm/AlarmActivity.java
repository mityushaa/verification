package com.example.mityushaa.alarm;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class AlarmActivity extends AppCompatActivity {
    private AlarmManagerBroadcastReceiver alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        alarm=new AlarmManagerBroadcastReceiver();
    }
    @Override
    protected void onStart(){
        super.onStart();
    }
    public void startRepeatingTimer(View view){
        Context context= this.getApplicationContext();
        if(alarm!=null){
            alarm.SetAlarm(context);
        }else{
            Toast.makeText(context,"Alarm is null", Toast.LENGTH_SHORT).show();
        }
    }

    public void cancelRepeatingTimer(View view){
        Context context= this.getApplicationContext();
        if(alarm!=null){
            alarm.CancelAlarm(context);
        }else{
            Toast.makeText(context,"Alarm is null", Toast.LENGTH_SHORT).show();
        }
    }

    public void onetimeTimer(View view) {
        Context context = this.getApplicationContext();
        if (alarm != null) {
            alarm.setOnetimeTimer(context);
        } else {
            Toast.makeText(context, "Alarm is null", Toast.LENGTH_SHORT).show();
        }
    }
}
