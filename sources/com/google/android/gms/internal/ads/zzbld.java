package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbld implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcbl zza;
    final /* synthetic */ zzblf zzb;

    public zzbld(zzblf zzblfVar, zzcbl zzcblVar) {
        this.zzb = zzblfVar;
        this.zza = zzcblVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbks zzbksVar;
        try {
            zzcbl zzcblVar = this.zza;
            zzbksVar = this.zzb.zza;
            zzcblVar.zzc(zzbksVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException(hx2.m("onConnectionSuspended: ", i)));
    }
}
