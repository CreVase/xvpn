package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzxv {
    private final Handler zza;
    private final zzxx zzb;
    private boolean zzc;

    public zzxv(Handler handler, zzxx zzxxVar) {
        this.zza = handler;
        this.zzb = zzxxVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}
