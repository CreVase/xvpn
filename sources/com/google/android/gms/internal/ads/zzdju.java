package com.google.android.gms.internal.ads;

import defpackage.uu2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzdju {
    public static final zzdju zza = new zzdju(new zzdjs());
    private final zzbgp zzb;
    private final zzbgm zzc;
    private final zzbhc zzd;
    private final zzbgz zze;
    private final zzbmb zzf;
    private final uu2 zzg;
    private final uu2 zzh;

    public final zzbgm zza() {
        return this.zzc;
    }

    public final zzbgp zzb() {
        return this.zzb;
    }

    public final zzbgs zzc(String str) {
        return (zzbgs) this.zzh.getOrDefault(str, null);
    }

    public final zzbgv zzd(String str) {
        return (zzbgv) this.zzg.getOrDefault(str, null);
    }

    public final zzbgz zze() {
        return this.zze;
    }

    public final zzbhc zzf() {
        return this.zzd;
    }

    public final zzbmb zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.c);
        int i = 0;
        while (true) {
            uu2 uu2Var = this.zzg;
            if (i < uu2Var.c) {
                arrayList.add((String) uu2Var.i(i));
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdju(zzdjs zzdjsVar) {
        this.zzb = zzdjsVar.zza;
        this.zzc = zzdjsVar.zzb;
        this.zzd = zzdjsVar.zzc;
        this.zzg = new uu2(zzdjsVar.zzf);
        this.zzh = new uu2(zzdjsVar.zzg);
        this.zze = zzdjsVar.zzd;
        this.zzf = zzdjsVar.zze;
    }
}
