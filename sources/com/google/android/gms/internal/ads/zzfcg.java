package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes.dex */
final class zzfcg implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzfci zzb;

    public zzfcg(zzfci zzfciVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzb = zzfciVar;
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdox zzdoxVar;
        zzdoxVar = this.zzb.zzi;
        if (zzdoxVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcat.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
