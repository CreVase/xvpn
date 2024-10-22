package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdnl extends zzbgc {
    private final String zza;
    private final zzdje zzb;
    private final zzdjj zzc;

    public zzdnl(String str, zzdje zzdjeVar, zzdjj zzdjjVar) {
        this.zza = str;
        this.zzb = zzdjeVar;
        this.zzc = zzdjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final com.google.android.gms.ads.internal.client.zzdq zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfg zze() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfo zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final IObjectWrapper zzg() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzm() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzn() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final List zzo() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzp() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzJ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zzW(bundle);
    }
}
