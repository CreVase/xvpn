package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeph implements zzetw {
    private final zzgad zza;

    public zzeph(zzgad zzgadVar) {
        this.zza = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepi.zzb();
            }
        });
    }
}
