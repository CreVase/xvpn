package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlf implements zzug, zzqy {
    final /* synthetic */ zzlj zza;
    private final zzlh zzb;

    public zzlf(zzlj zzljVar, zzlh zzlhVar) {
        this.zza = zzljVar;
        this.zzb = zzlhVar;
    }

    private final Pair zzf(int i, zztw zztwVar) {
        zztw zztwVar2;
        zztw zztwVar3 = null;
        if (zztwVar != null) {
            zzlh zzlhVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 < zzlhVar.zzc.size()) {
                    if (((zztw) zzlhVar.zzc.get(i2)).zzd == zztwVar.zzd) {
                        zztwVar2 = zztwVar.zza(Pair.create(zzlhVar.zzb, zztwVar.zza));
                        break;
                    }
                    i2++;
                } else {
                    zztwVar2 = null;
                    break;
                }
            }
            if (zztwVar2 == null) {
                return null;
            }
            zztwVar3 = zztwVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztwVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzac(int i, zztw zztwVar, final zzts zztsVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztwVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzld
                @Override // java.lang.Runnable
                public final void run() {
                    zzmb zzmbVar;
                    Pair pair = zzf;
                    zzmbVar = zzlf.this.zza.zzh;
                    zzmbVar.zzac(((Integer) pair.first).intValue(), (zztw) pair.second, zztsVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzad(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztwVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlb
                @Override // java.lang.Runnable
                public final void run() {
                    zzmb zzmbVar;
                    Pair pair = zzf;
                    zzmbVar = zzlf.this.zza.zzh;
                    zzmbVar.zzad(((Integer) pair.first).intValue(), (zztw) pair.second, zztnVar, zztsVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzae(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztwVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
                @Override // java.lang.Runnable
                public final void run() {
                    zzmb zzmbVar;
                    Pair pair = zzf;
                    zzmbVar = zzlf.this.zza.zzh;
                    zzmbVar.zzae(((Integer) pair.first).intValue(), (zztw) pair.second, zztnVar, zztsVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzaf(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar, final IOException iOException, final boolean z) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztwVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    zzmb zzmbVar;
                    Pair pair = zzf;
                    zzmbVar = zzlf.this.zza.zzh;
                    zzmbVar.zzaf(((Integer) pair.first).intValue(), (zztw) pair.second, zztnVar, zztsVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzag(int i, zztw zztwVar, final zztn zztnVar, final zzts zztsVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztwVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlc
                @Override // java.lang.Runnable
                public final void run() {
                    zzmb zzmbVar;
                    Pair pair = zzf;
                    zzmbVar = zzlf.this.zza.zzh;
                    zzmbVar.zzag(((Integer) pair.first).intValue(), (zztw) pair.second, zztnVar, zztsVar);
                }
            });
        }
    }
}
