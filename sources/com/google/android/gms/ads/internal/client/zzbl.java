package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* loaded from: classes.dex */
public final class zzbl extends zzaum implements zzbn {
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzlVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzlVar);
        zza.writeInt(i);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
