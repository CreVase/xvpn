package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzflz implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfmc.zzc;
        if (handler != null) {
            handler2 = zzfmc.zzc;
            runnable = zzfmc.zzd;
            handler2.post(runnable);
            handler3 = zzfmc.zzc;
            runnable2 = zzfmc.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
