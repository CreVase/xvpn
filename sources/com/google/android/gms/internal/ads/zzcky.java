package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcky implements zzdtx {
    private final zzcjs zza;
    private Context zzb;
    private zzbkh zzc;

    public /* synthetic */ zzcky(zzcjs zzcjsVar, zzckx zzckxVar) {
        this.zza = zzcjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtx
    public final /* synthetic */ zzdtx zza(zzbkh zzbkhVar) {
        zzbkhVar.getClass();
        this.zzc = zzbkhVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtx
    public final /* synthetic */ zzdtx zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtx
    public final zzdty zzc() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, zzbkh.class);
        return new zzcla(this.zza, this.zzb, this.zzc, null);
    }
}
