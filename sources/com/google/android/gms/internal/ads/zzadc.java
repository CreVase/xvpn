package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzadc implements zzacm {
    final /* synthetic */ zzadf zza;
    private final long zzb;

    public zzadc(zzadf zzadfVar, long j) {
        this.zza = zzadfVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        zzadi[] zzadiVarArr;
        zzadi[] zzadiVarArr2;
        zzadi[] zzadiVarArr3;
        zzadiVarArr = this.zza.zzg;
        zzack zza = zzadiVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzadf zzadfVar = this.zza;
            zzadiVarArr2 = zzadfVar.zzg;
            if (i < zzadiVarArr2.length) {
                zzadiVarArr3 = zzadfVar.zzg;
                zzack zza2 = zzadiVarArr3[i].zza(j);
                if (zza2.zza.zzc < zza.zza.zzc) {
                    zza = zza2;
                }
                i++;
            } else {
                return zza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }
}
