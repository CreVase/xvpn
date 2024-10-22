package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzacl implements zzacm {
    private final long zza;
    private final zzack zzb;

    public zzacl(long j, long j2) {
        zzacn zzacnVar;
        this.zza = j;
        if (j2 == 0) {
            zzacnVar = zzacn.zza;
        } else {
            zzacnVar = new zzacn(0L, j2);
        }
        this.zzb = new zzack(zzacnVar, zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return false;
    }
}
