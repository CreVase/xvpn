package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.facebook.ads.redexgen.X.Ka, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0488Ka {
    public static Intent A00(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (context.getApplicationInfo().targetSdkVersion >= 34) {
            return context.registerReceiver(broadcastReceiver, intentFilter, z ? 2 : 4);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
