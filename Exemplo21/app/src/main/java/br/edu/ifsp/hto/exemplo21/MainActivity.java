package br.edu.ifsp.hto.exemplo21;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    NotificationManager notificationManager;
    boolean isNotificationActive = false;
    int notificationID = 33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtMostrarNotificacao(View view) {
        NotificationCompat.Builder notificationBuilder = new
                NotificationCompat
                        .Builder(this)
                .setContentTitle("Mensagem")
                .setContentText("Nova Mensagem")
                .setTicker("Alerta Nova Mensagem")
                .setSmallIcon(R.drawable.ic_error_outline_black_24dp);

        Intent detalheIntent = new Intent(this, DetalheActivity.class);

        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(this);

        taskStackBuilder.addParentStack(DetalheActivity.class);
        taskStackBuilder.addNextIntent(detalheIntent);

        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

        notificationBuilder.setContentIntent(pendingIntent);

        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(notificationID, notificationBuilder.build());

        isNotificationActive = true;
    }

    public void onClickBtPararNotificacao(View view) {
        if (isNotificationActive) {
            notificationManager.cancel(notificationID);
        }
    }

    public void onClickBtAlerta(View view) {
        Long alertTime = new GregorianCalendar().getTimeInMillis() + (5 * 1000);

        Intent intent = new Intent(this, AlertReceiver.class);

        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alarmManager.set(AlarmManager.RTC_WAKEUP, alertTime, alarmIntent);
    }
}
