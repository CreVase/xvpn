package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzbpe extends zzaum implements zzbpg {
    public zzbpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final IObjectWrapper zze() throws RemoteException {
        return p71.j(zzbg(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
