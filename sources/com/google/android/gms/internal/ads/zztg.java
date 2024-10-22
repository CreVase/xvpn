package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zztg implements zzvq {
    protected final zzvq[] zza;

    public zztg(zzvq[] zzvqVarArr) {
        this.zza = zzvqVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzvq zzvqVar : this.zza) {
            long zzb = zzvqVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzvq zzvqVar : this.zza) {
            long zzc = zzvqVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzm(long j) {
        for (zzvq zzvqVar : this.zza) {
            zzvqVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final boolean zzo(zzks zzksVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long zzc = zzc();
            long j = Long.MIN_VALUE;
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            zzvq[] zzvqVarArr = this.zza;
            int length = zzvqVarArr.length;
            int i = 0;
            z = false;
            while (i < length) {
                zzvq zzvqVar = zzvqVarArr[i];
                long zzc2 = zzvqVar.zzc();
                if (zzc2 != j && zzc2 <= zzksVar.zza) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (zzc2 == zzc || z2) {
                    z |= zzvqVar.zzo(zzksVar);
                }
                i++;
                j = Long.MIN_VALUE;
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final boolean zzp() {
        for (zzvq zzvqVar : this.zza) {
            if (zzvqVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
