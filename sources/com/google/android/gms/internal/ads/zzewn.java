package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzewn implements zzetw {
    final zzgad zza;
    final List zzb;
    final zzbbt zzc;

    public zzewn(zzbbt zzbbtVar, zzgad zzgadVar, List list) {
        this.zzc = zzbbtVar;
        this.zza = zzgadVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewo(zzewn.this.zzb);
            }
        });
    }
}
