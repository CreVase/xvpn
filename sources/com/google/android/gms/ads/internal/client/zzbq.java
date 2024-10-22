package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbmb;

/* loaded from: classes.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbgm zzbgmVar) throws RemoteException;

    void zzg(zzbgp zzbgpVar) throws RemoteException;

    void zzh(String str, zzbgv zzbgvVar, zzbgs zzbgsVar) throws RemoteException;

    void zzi(zzbmb zzbmbVar) throws RemoteException;

    void zzj(zzbgz zzbgzVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbhc zzbhcVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbls zzblsVar) throws RemoteException;

    void zzo(zzbfc zzbfcVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
