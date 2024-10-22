package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.ho3;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GCoreWakefulBroadcastReceiver extends ho3 {
    @KeepForSdk
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return ho3.completeWakefulIntent(intent);
    }
}
