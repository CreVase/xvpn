package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzfd implements zzdy {
    @Override // com.google.android.gms.internal.ads.zzdy
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzei zzb(Looper looper, Handler.Callback callback) {
        return new zzfg(new Handler(looper, callback));
    }
}
