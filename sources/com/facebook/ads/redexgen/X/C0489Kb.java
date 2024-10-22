package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0489Kb {
    public static Intent A00(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0488Ka.A00(context, broadcastReceiver, intentFilter, z);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
