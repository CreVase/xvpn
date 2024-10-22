package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzdga {
    private final zzdhf zza;
    private final zzcgb zzb;

    public zzdga(zzdhf zzdhfVar, zzcgb zzcgbVar) {
        this.zza = zzdhfVar;
        this.zzb = zzcgbVar;
    }

    public static final zzdev zzh(zzfiq zzfiqVar) {
        return new zzdev(zzfiqVar, zzcbg.zzf);
    }

    public static final zzdev zzi(zzdhk zzdhkVar) {
        return new zzdev(zzdhkVar, zzcbg.zzf);
    }

    public final View zza() {
        zzcgb zzcgbVar = this.zzb;
        if (zzcgbVar == null) {
            return null;
        }
        return zzcgbVar.zzG();
    }

    public final View zzb() {
        zzcgb zzcgbVar = this.zzb;
        if (zzcgbVar != null) {
            return zzcgbVar.zzG();
        }
        return null;
    }

    public final zzcgb zzc() {
        return this.zzb;
    }

    public final zzdev zzd(Executor executor) {
        final zzcgb zzcgbVar = this.zzb;
        return new zzdev(new zzdby() { // from class: com.google.android.gms.internal.ads.zzdfz
            @Override // com.google.android.gms.internal.ads.zzdby
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzl zzL;
                zzcgb zzcgbVar2 = zzcgb.this;
                if (zzcgbVar2 != null && (zzL = zzcgbVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdhf zze() {
        return this.zza;
    }

    public Set zzf(zzcwi zzcwiVar) {
        return Collections.singleton(new zzdev(zzcwiVar, zzcbg.zzf));
    }

    public Set zzg(zzcwi zzcwiVar) {
        return Collections.singleton(new zzdev(zzcwiVar, zzcbg.zzf));
    }
}
