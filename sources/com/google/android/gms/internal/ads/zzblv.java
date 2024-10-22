package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface zzblv extends IInterface {
    com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException;

    zzbfl zzc() throws RemoteException;

    void zzd() throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbly zzblyVar) throws RemoteException;
}
