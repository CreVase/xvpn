package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzenu implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;
    private final zzfea zzc;

    public zzenu(zzgad zzgadVar, zzfdn zzfdnVar, zzfea zzfeaVar) {
        this.zza = zzgadVar;
        this.zzb = zzfdnVar;
        this.zzc = zzfeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenu.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzenv zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhf)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzfea.zza();
        }
        return new zzenv(str);
    }
}
