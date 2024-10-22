package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbsb implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbgi zza;

    public zzbsb(zzbgi zzbgiVar) {
        this.zza = zzbgiVar;
        try {
            zzbgiVar.zzm();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return false;
        }
    }
}
