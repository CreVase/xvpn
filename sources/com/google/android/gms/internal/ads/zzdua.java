package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzdua implements zzdto {
    private final long zza;
    private final zzems zzb;

    public zzdua(long j, Context context, zzdtt zzdttVar, zzchw zzchwVar, String str) {
        this.zza = j;
        zzfaw zzu = zzchwVar.zzu();
        zzu.zzc(context);
        zzu.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzu.zzb(str);
        zzems zza = zzu.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdtz(this, zzdttVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
