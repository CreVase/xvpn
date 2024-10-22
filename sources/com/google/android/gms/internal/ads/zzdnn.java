package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdnn extends zzbge {
    private final String zza;
    private final zzdje zzb;
    private final zzdjj zzc;

    public zzdnn(String str, zzdje zzdjeVar, zzdjj zzdjjVar) {
        this.zza = str;
        this.zzb = zzdjeVar;
        this.zzc = zzdjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final com.google.android.gms.ads.internal.client.zzdq zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final zzbfg zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final zzbfo zze() throws RemoteException {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final String zzh() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final List zzm() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzJ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzW(bundle);
    }
}
