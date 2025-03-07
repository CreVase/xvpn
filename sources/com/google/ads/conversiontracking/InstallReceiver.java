package com.google.ads.conversiontracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes.dex */
public class InstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String stringExtra = intent.getStringExtra("referrer");
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) && stringExtra != null) {
            if (stringExtra.length() != 0) {
                str = "Received install referrer: ".concat(stringExtra);
            } else {
                str = new String("Received install referrer: ");
            }
            Log.i("GoogleConversionReporter", str);
            AdWordsConversionReporter.registerReferrer(context, Uri.parse("http://hostname/").buildUpon().appendQueryParameter("referrer", stringExtra).build());
        }
    }
}
