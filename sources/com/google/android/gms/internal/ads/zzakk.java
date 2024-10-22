package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakk implements zzakd {
    final /* synthetic */ zzakm zza;
    private final zzfa zzb = new zzfa(new byte[4], 4);

    public zzakk(zzakm zzakmVar) {
        this.zza = zzakmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzfb zzfbVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzfbVar.zzl() != 0 || (zzfbVar.zzl() & 128) == 0) {
            return;
        }
        zzfbVar.zzH(6);
        int zza = zzfbVar.zza() / 4;
        for (int i2 = 0; i2 < zza; i2++) {
            zzfbVar.zzB(this.zzb, 4);
            zzfa zzfaVar = this.zzb;
            int zzd = zzfaVar.zzd(16);
            zzfaVar.zzl(3);
            if (zzd == 0) {
                this.zzb.zzl(13);
            } else {
                int zzd2 = this.zzb.zzd(13);
                sparseArray2 = this.zza.zzf;
                if (sparseArray2.get(zzd2) == null) {
                    zzakm zzakmVar = this.zza;
                    sparseArray3 = zzakmVar.zzf;
                    sparseArray3.put(zzd2, new zzake(new zzakl(zzakmVar, zzd2)));
                    zzakm zzakmVar2 = this.zza;
                    i = zzakmVar2.zzl;
                    zzakmVar2.zzl = i + 1;
                }
            }
        }
        sparseArray = this.zza.zzf;
        sparseArray.remove(0);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzb(zzfi zzfiVar, zzabp zzabpVar, zzakq zzakqVar) {
    }
}
