package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaee extends zzacb {
    final /* synthetic */ zzacm zza;
    final /* synthetic */ zzaef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaee(zzaef zzaefVar, zzacm zzacmVar, zzacm zzacmVar2) {
        super(zzacmVar);
        this.zzb = zzaefVar;
        this.zza = zzacmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzacb, com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long j2;
        long j3;
        zzack zzg = this.zza.zzg(j);
        zzacn zzacnVar = zzg.zza;
        long j4 = zzacnVar.zzc;
        j2 = this.zzb.zzb;
        zzacn zzacnVar2 = new zzacn(zzacnVar.zzb, j2 + j4);
        zzacn zzacnVar3 = zzg.zzb;
        long j5 = zzacnVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzack(zzacnVar2, new zzacn(zzacnVar3.zzb, j3 + j5));
    }
}
