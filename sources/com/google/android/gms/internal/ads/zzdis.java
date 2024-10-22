package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzdis extends zzbfk {
    private final zzdjj zza;
    private IObjectWrapper zzb;

    public zzdis(zzdjj zzdjjVar) {
        this.zza = zzdjjVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final float zze() throws RemoteException {
        float f;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgi)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e) {
                zzcat.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbfo zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        if (zzm.zzd() != -1 && zzm.zzc() != -1) {
            f = zzm.zzd() / zzm.zzc();
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return zzb(zzm.zzf());
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final float zzf() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgj)).booleanValue() || this.zza.zzj() == null) {
            return 0.0f;
        }
        return this.zza.zzj().zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final float zzg() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgj)).booleanValue() || this.zza.zzj() == null) {
            return 0.0f;
        }
        return this.zza.zzj().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgj)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbfo zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzk() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgj)).booleanValue()) {
            return false;
        }
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzl() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgj)).booleanValue() || this.zza.zzj() == null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzm(zzbgw zzbgwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgj)).booleanValue() && (this.zza.zzj() instanceof zzcgx)) {
            ((zzcgx) this.zza.zzj()).zzv(zzbgwVar);
        }
    }
}
