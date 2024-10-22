package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdnp implements zzbfb {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdnq zzb;

    public zzdnp(zzdnq zzdnqVar, String str) {
        this.zzb = zzdnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zzc() {
        zzdje zzdjeVar;
        zzdje zzdjeVar2;
        zzdnq zzdnqVar = this.zzb;
        zzdjeVar = zzdnqVar.zzd;
        if (zzdjeVar != null) {
            String str = this.zza;
            zzdjeVar2 = zzdnqVar.zzd;
            zzdjeVar2.zzD(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zzd(MotionEvent motionEvent) {
    }
}
