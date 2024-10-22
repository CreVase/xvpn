package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzemo implements com.google.android.gms.ads.internal.client.zza, zzdfd {
    private com.google.android.gms.ads.internal.client.zzbe zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                zzcat.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzbK() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                zzcat.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzs() {
    }
}
