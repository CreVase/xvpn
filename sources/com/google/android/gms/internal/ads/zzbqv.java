package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface zzbqv extends IInterface {
    com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException;

    zzbrj zzf() throws RemoteException;

    zzbrj zzg() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbqy zzbqyVar) throws RemoteException;

    void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqg zzbqgVar, zzbpd zzbpdVar) throws RemoteException;

    void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqj zzbqjVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException;

    void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqj zzbqjVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException;

    void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqm zzbqmVar, zzbpd zzbpdVar) throws RemoteException;

    void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqp zzbqpVar, zzbpd zzbpdVar) throws RemoteException;

    void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqp zzbqpVar, zzbpd zzbpdVar, zzbfc zzbfcVar) throws RemoteException;

    void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqs zzbqsVar, zzbpd zzbpdVar) throws RemoteException;

    void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqs zzbqsVar, zzbpd zzbpdVar) throws RemoteException;

    void zzq(String str) throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
