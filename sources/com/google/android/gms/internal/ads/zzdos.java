package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* loaded from: classes.dex */
public final class zzdos extends VideoController.VideoLifecycleCallbacks {
    private final zzdjj zza;

    public zzdos(zzdjj zzdjjVar) {
        this.zza = zzdjjVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdt zza(zzdjj zzdjjVar) {
        com.google.android.gms.ads.internal.client.zzdq zzj = zzdjjVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdt zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e) {
            zzcat.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdt zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e) {
            zzcat.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdt zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException e) {
            zzcat.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
