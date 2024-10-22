package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcli implements zzfaw {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzcli(zzcjs zzcjsVar, zzclh zzclhVar) {
        this.zza = zzcjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final /* synthetic */ zzfaw zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final /* synthetic */ zzfaw zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final /* synthetic */ zzfaw zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final zzfax zzd() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, String.class);
        zzhbk.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzclk(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
