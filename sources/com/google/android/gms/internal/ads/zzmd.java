package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzmd {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmd(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i = 0; i < zzahVar.zzb(); i++) {
            int zza = zzahVar.zza(i);
            zzmc zzmcVar = (zzmc) sparseArray.get(zza);
            zzmcVar.getClass();
            sparseArray2.append(zza, zzmcVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmc zzc(int i) {
        zzmc zzmcVar = (zzmc) this.zzb.get(i);
        zzmcVar.getClass();
        return zzmcVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
