package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzbfj extends zzaum implements zzbfl {
    public zzbfj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final float zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final float zzf() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final float zzg() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final IObjectWrapper zzi() throws RemoteException {
        return p71.j(zzbg(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzk() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzl() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzm(zzbgw zzbgwVar) throws RemoteException {
        throw null;
    }
}
