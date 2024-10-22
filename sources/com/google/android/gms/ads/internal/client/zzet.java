package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzet extends zzbm {
    final /* synthetic */ zzeu zza;

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) throws RemoteException {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i) throws RemoteException {
        zzcat.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcam.zza.post(new zzer(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() throws RemoteException {
        return false;
    }
}
