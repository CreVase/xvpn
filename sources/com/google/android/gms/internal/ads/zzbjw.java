package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbjw implements zzbjx {
    final /* synthetic */ zzcbl zza;

    public zzbjw(zzbjy zzbjyVar, zzcbl zzcblVar) {
        this.zza = zzcblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zza(String str) {
        this.zza.zzd(new zzbnp(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
