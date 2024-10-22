package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
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
public final class zzbo extends zzaum implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzbg = zzbg(1, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzbn) {
                zzblVar = (zzbn) queryLocalInterface;
            } else {
                zzblVar = new zzbl(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbgm zzbgmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbgp zzbgpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbgv zzbgvVar, zzbgs zzbgsVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, zzbgvVar);
        zzauo.zzf(zza, zzbgsVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbmb zzbmbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgz zzbgzVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgzVar);
        zzauo.zzd(zza, zzqVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbhc zzbhcVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhcVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, adManagerAdViewOptions);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbls zzblsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbfc zzbfcVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbfcVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) throws RemoteException {
        throw null;
    }
}
