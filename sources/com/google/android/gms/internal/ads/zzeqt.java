package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqt implements zzetw {
    private final zzgad zza;

    public zzeqt(zzgad zzgadVar) {
        this.zza = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzequ(com.google.android.gms.ads.internal.zzt.zzs().zzb(), com.google.android.gms.ads.internal.zzt.zzs().zzm());
            }
        });
    }
}
