package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzyr {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzyq) obj).zza - ((zzyq) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzyq) obj).zzc, ((zzyq) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzyq[] zzd = new zzyq[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzyr(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            float f3 = 0.5f * f2;
            zzyq zzyqVar = (zzyq) this.zzc.get(i2);
            i += zzyqVar.zzb;
            if (i >= f3) {
                return zzyqVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzyq) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzyq zzyqVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzyq[] zzyqVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzyqVar = zzyqVarArr[i3];
        } else {
            zzyqVar = new zzyq(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzyqVar.zza = i4;
        zzyqVar.zzb = i;
        zzyqVar.zzc = f;
        this.zzc.add(zzyqVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                zzyq zzyqVar2 = (zzyq) this.zzc.get(0);
                int i7 = zzyqVar2.zzb;
                if (i7 <= i6) {
                    this.zzg -= i7;
                    this.zzc.remove(0);
                    int i8 = this.zzh;
                    if (i8 < 5) {
                        zzyq[] zzyqVarArr2 = this.zzd;
                        this.zzh = i8 + 1;
                        zzyqVarArr2[i8] = zzyqVar2;
                    }
                } else {
                    zzyqVar2.zzb = i7 - i6;
                    this.zzg -= i6;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
