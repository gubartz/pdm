package br.edu.ifsp.hto.exemplo21;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by gustavohome on 23/05/2016.
 */
public class AlertReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {

        createNotification(context, "Fim do tempo", "5 segudos se passaram", "Alert");
    }

    public void createNotification(Context context, String msg, String msgText, String msgAlert){

        PendingIntent alertIntent = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder notificationBuilder = new
                NotificationCompat
                .Builder(context)
                .setContentTitle(msg)
                .setContentText(msgText)
                .setTicker(msgAlert)
                .setSmallIcon(R.drawable.ic_error_outline_black_24dp);

        notificationBuilder.setAutoCancel(true);

        notificationBuilder.setContentIntent(alertIntent);

        notificationBuilder.setDefaults(NotificationCompat.DEFAULT_SOUND);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(40, notificationBuilder.build());
    }
}
