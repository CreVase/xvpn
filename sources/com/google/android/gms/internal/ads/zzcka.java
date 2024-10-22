package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcka implements zzexr {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcka(zzcjs zzcjsVar, zzcjz zzcjzVar) {
        this.zza = zzcjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final /* synthetic */ zzexr zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final /* synthetic */ zzexr zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final zzexs zzc() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, String.class);
        return new zzckc(this.zza, this.zzb, this.zzc, null);
    }
}
