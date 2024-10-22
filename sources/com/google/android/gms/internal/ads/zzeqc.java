package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqc implements zzetw {
    private final zzgad zza;
    private final zzdqo zzb;
    private final String zzc;
    private final zzfdn zzd;

    public zzeqc(zzgad zzgadVar, zzdqo zzdqoVar, zzfdn zzfdnVar, String str) {
        this.zza = zzgadVar;
        this.zzb = zzdqoVar;
        this.zzd = zzfdnVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqc.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqd zzc() throws Exception {
        zzfdn zzfdnVar = this.zzd;
        zzdqo zzdqoVar = this.zzb;
        return new zzeqd(zzdqoVar.zzb(zzfdnVar.zzf, this.zzc), zzdqoVar.zza());
    }
}
