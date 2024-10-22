package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes.dex */
final class zzfcn implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzfco zzb;

    public zzfcn(zzfco zzfcoVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zzb = zzfcoVar;
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdox zzdoxVar;
        zzdoxVar = this.zzb.zzd;
        if (zzdoxVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcat.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
