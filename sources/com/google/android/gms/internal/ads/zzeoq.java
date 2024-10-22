package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeoq implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;
    private final zzcaz zzc;
    private final zzcag zzd;

    public zzeoq(zzgad zzgadVar, zzfdn zzfdnVar, zzcaz zzcazVar, zzcag zzcagVar) {
        this.zza = zzgadVar;
        this.zzb = zzfdnVar;
        this.zzc = zzcazVar;
        this.zzd = zzcagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeop
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoq.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeor zzc() throws Exception {
        return new zzeor(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
