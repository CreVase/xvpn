package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdns extends zzbhk {
    private final String zza;
    private final zzdje zzb;
    private final zzdjj zzc;
    private final zzdso zzd;

    public zzdns(String str, zzdje zzdjeVar, zzdjj zzdjjVar, zzdso zzdsoVar) {
        this.zza = str;
        this.zzb = zzdjeVar;
        this.zzc = zzdjjVar;
        this.zzd = zzdsoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzA() {
        this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzJ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzC() {
        this.zzb.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        this.zzb.zzM(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        try {
            if (!zzdgVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e) {
            zzcat.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzN(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzF(zzbhi zzbhiVar) throws RemoteException {
        this.zzb.zzO(zzbhiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final boolean zzG() {
        return this.zzb.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final boolean zzH() throws RemoteException {
        if (!this.zzc.zzH().isEmpty() && this.zzc.zzk() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzW(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final zzbfg zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final zzbfl zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final zzbfo zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final List zzv() throws RemoteException {
        if (zzH()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzw() throws RemoteException {
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        this.zzb.zzA(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }
}
