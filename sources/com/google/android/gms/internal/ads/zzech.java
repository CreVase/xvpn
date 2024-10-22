package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzech {
    private final zzecd zza;
    private final zzgad zzb;

    public zzech(zzecd zzecdVar, zzgad zzgadVar) {
        this.zza = zzecdVar;
        this.zzb = zzgadVar;
    }

    public final void zza(zzfgu zzfguVar) {
        final zzecd zzecdVar = this.zza;
        zzfzt.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzecd.this.getWritableDatabase();
            }
        }), new zzecg(this, zzfguVar), this.zzb);
    }
}
