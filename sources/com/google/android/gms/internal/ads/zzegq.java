package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzegq extends zzbpc implements zzcyv {
    private zzbpd zza;
    private zzcyu zzb;

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final synchronized void zza(zzcyu zzcyuVar) {
        this.zzb = zzcyuVar;
    }

    public final synchronized void zzc(zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zze() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzf() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzg(int i) throws RemoteException {
        zzcyu zzcyuVar = this.zzb;
        if (zzcyuVar != null) {
            zzcyuVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcyu zzcyuVar = this.zzb;
        if (zzcyuVar != null) {
            zzcyuVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzi(int i, String str) throws RemoteException {
        zzcyu zzcyuVar = this.zzb;
        if (zzcyuVar != null) {
            zzcyuVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzj(int i) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzl(String str) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzm() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzn() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzo() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzo();
        }
        zzcyu zzcyuVar = this.zzb;
        if (zzcyuVar != null) {
            zzcyuVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzp() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzr(zzbgi zzbgiVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzs(zzbwi zzbwiVar) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzs(zzbwiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzt(zzbwm zzbwmVar) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzt(zzbwmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzu() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzv() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzw() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzx() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzy() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzy();
        }
    }
}
