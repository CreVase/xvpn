package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
final class zzlz {
    private final PowerManager zza;

    public zzlz(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
