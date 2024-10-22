package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqx implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;

    public zzeqx(zzgad zzgadVar, zzfdn zzfdnVar) {
        this.zza = zzgadVar;
        this.zzb = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqx.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqy zzc() throws Exception {
        return new zzeqy("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
