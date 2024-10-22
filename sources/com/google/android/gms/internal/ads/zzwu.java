package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzwu extends zzdb {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzwu() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdb
    public final /* synthetic */ zzdb zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzwu zzo(int i, boolean z) {
        if (this.zzh.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzh.put(i, true);
        } else {
            this.zzh.delete(i);
        }
        return this;
    }

    public zzwu(Context context) {
        super.zzd(context);
        Point zzt = zzfk.zzt(context);
        zze(zzt.x, zzt.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public /* synthetic */ zzwu(zzww zzwwVar, zzwt zzwtVar) {
        super(zzwwVar);
        this.zza = zzwwVar.zzH;
        this.zzb = zzwwVar.zzJ;
        this.zzc = zzwwVar.zzL;
        this.zzd = zzwwVar.zzQ;
        this.zze = zzwwVar.zzR;
        this.zzf = zzwwVar.zzT;
        SparseArray zza = zzww.zza(zzwwVar);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zza.size(); i++) {
            sparseArray.put(zza.keyAt(i), new HashMap((Map) zza.valueAt(i)));
        }
        this.zzg = sparseArray;
        this.zzh = zzww.zzb(zzwwVar).clone();
    }
}
