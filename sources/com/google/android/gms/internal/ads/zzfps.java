package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class zzfps extends Handler {
    private final Looper zza;

    public zzfps() {
        this.zza = Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfps(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
