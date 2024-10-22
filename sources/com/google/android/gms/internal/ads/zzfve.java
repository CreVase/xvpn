package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzfve extends zzfvh {
    public zzfve() {
        super(null);
    }

    public static final zzfvh zzf(int i) {
        zzfvh zzfvhVar;
        zzfvh zzfvhVar2;
        zzfvh zzfvhVar3;
        if (i < 0) {
            zzfvhVar3 = zzfvh.zzb;
            return zzfvhVar3;
        }
        if (i > 0) {
            zzfvhVar2 = zzfvh.zzc;
            return zzfvhVar2;
        }
        zzfvhVar = zzfvh.zza;
        return zzfvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final zzfvh zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final zzfvh zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final zzfvh zzd(boolean z, boolean z2) {
        return zzf(zzfxz.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final zzfvh zze(boolean z, boolean z2) {
        return zzf(zzfxz.zza(false, false));
    }
}
