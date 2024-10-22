package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeor implements zzetv {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzcaz zzb;
    private final boolean zzc;

    public zzeor(com.google.android.gms.ads.internal.client.zzw zzwVar, zzcaz zzcazVar, boolean z) {
        this.zza = zzwVar;
        this.zzb = zzcazVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfe)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzff)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
