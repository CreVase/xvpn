package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcqy extends zzcqv {
    private final Context zzc;
    private final View zzd;
    private final zzcgb zze;
    private final zzfcs zzf;
    private final zzcsv zzg;
    private final zzdju zzh;
    private final zzdff zzi;
    private final zzhaw zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    public zzcqy(zzcsw zzcswVar, Context context, zzfcs zzfcsVar, View view, zzcgb zzcgbVar, zzcsv zzcsvVar, zzdju zzdjuVar, zzdff zzdffVar, zzhaw zzhawVar, Executor executor) {
        super(zzcswVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcgbVar;
        this.zzf = zzfcsVar;
        this.zzg = zzcsvVar;
        this.zzh = zzdjuVar;
        this.zzi = zzdffVar;
        this.zzj = zzhawVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcqy zzcqyVar) {
        zzdju zzdjuVar = zzcqyVar.zzh;
        if (zzdjuVar.zze() == null) {
            return;
        }
        try {
            zzdjuVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcqyVar.zzj.zzb(), ObjectWrapper.wrap(zzcqyVar.zzc));
        } catch (RemoteException e) {
            zzcat.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhE)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfds unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzfcs zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfdr.zzb(zzqVar);
        }
        zzfcr zzfcrVar = this.zzb;
        if (zzfcrVar.zzae) {
            for (String str : zzfcrVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfcs(view.getWidth(), view.getHeight(), false);
        }
        return (zzfcs) this.zzb.zzt.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzfcs zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcgb zzcgbVar;
        if (viewGroup != null && (zzcgbVar = this.zze) != null) {
            zzcgbVar.zzag(zzchq.zzc(zzqVar));
            viewGroup.setMinimumHeight(zzqVar.zzc);
            viewGroup.setMinimumWidth(zzqVar.zzf);
            this.zzl = zzqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcsx
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                zzcqy.zzi(zzcqy.this);
            }
        });
        super.zzj();
    }
}
