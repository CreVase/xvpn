package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckk implements zzezf {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzckk(zzcjs zzcjsVar, zzckj zzckjVar) {
        this.zza = zzcjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* synthetic */ zzezf zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* synthetic */ zzezf zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* synthetic */ zzezf zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final zzezg zzd() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, String.class);
        zzhbk.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzckm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
