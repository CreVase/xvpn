package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzbfm extends zzaum implements zzbfo {
    public zzbfm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfo
    public final double zzb() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfo
    public final int zzc() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfo
    public final int zzd() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfo
    public final Uri zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        Uri uri = (Uri) zzauo.zza(zzbg, Uri.CREATOR);
        zzbg.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfo
    public final IObjectWrapper zzf() throws RemoteException {
        return p71.j(zzbg(1, zza()));
    }
}
