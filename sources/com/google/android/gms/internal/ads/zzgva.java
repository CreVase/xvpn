package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgva implements zzgvh {
    private final zzgvh[] zza;

    public zzgva(zzgvh... zzgvhVarArr) {
        this.zza = zzgvhVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public final zzgvg zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgvh zzgvhVar = this.zza[i];
            if (zzgvhVar.zzc(cls)) {
                return zzgvhVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
