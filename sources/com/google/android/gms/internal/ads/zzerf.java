package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerf implements zzetw {
    private final zzgad zza;
    private final zzdvm zzb;

    public zzerf(zzgad zzgadVar, zzdvm zzdvmVar) {
        this.zza = zzgadVar;
        this.zzb = zzdvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzere
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerf.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerg zzc() throws Exception {
        zzdvm zzdvmVar = this.zzb;
        String zzc = zzdvmVar.zzc();
        boolean zzq = zzdvmVar.zzq();
        boolean zzl = com.google.android.gms.ads.internal.zzt.zzs().zzl();
        zzdvm zzdvmVar2 = this.zzb;
        return new zzerg(zzc, zzq, zzl, zzdvmVar2.zzo(), zzdvmVar2.zzr());
    }
}
