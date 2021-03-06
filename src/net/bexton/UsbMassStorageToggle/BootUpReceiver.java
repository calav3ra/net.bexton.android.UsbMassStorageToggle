package net.bexton.UsbMassStorageToggle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootUpReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Intent i = new Intent(context, MassStorageActivity.class);  
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra(MassStorageActivity.ActivityFlags.FlagHide, true);
        context.startActivity(i);
    }
}
