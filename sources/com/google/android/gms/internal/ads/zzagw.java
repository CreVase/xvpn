package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class zzagw extends zzagy {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzagw(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final String toString() {
        List list = this.zzb;
        return zzagy.zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzagw zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzagw zzagwVar = (zzagw) this.zzc.get(i2);
            if (zzagwVar.zzd == i) {
                return zzagwVar;
            }
        }
        return null;
    }

    public final zzagx zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzagx zzagxVar = (zzagx) this.zzb.get(i2);
            if (zzagxVar.zzd == i) {
                return zzagxVar;
            }
        }
        return null;
    }

    public final void zzc(zzagw zzagwVar) {
        this.zzc.add(zzagwVar);
    }

    public final void zzd(zzagx zzagxVar) {
        this.zzb.add(zzagxVar);
    }
}
