package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzxh extends zzxe {
    private final boolean zze;
    private final zzww zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzxh(int r5, com.google.android.gms.internal.ads.zzcx r6, int r7, com.google.android.gms.internal.ads.zzww r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.<init>(int, com.google.android.gms.internal.ads.zzcx, int, com.google.android.gms.internal.ads.zzww, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxh zzxhVar, zzxh zzxhVar2) {
        zzfxb zzfxbVar;
        zzfxb zza;
        zzfxb zzfxbVar2;
        if (zzxhVar.zze && zzxhVar.zzh) {
            zza = zzxi.zzc;
        } else {
            zzfxbVar = zzxi.zzc;
            zza = zzfxbVar.zza();
        }
        zzfvh zzj = zzfvh.zzj();
        Integer valueOf = Integer.valueOf(zzxhVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzxhVar2.zzi);
        boolean z = zzxhVar.zzf.zzA;
        zzfxbVar2 = zzxi.zzd;
        return zzj.zzc(valueOf, valueOf2, zzfxbVar2).zzc(Integer.valueOf(zzxhVar.zzj), Integer.valueOf(zzxhVar2.zzj), zza).zzc(Integer.valueOf(zzxhVar.zzi), Integer.valueOf(zzxhVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxh zzxhVar, zzxh zzxhVar2) {
        zzfvh zzc = zzfvh.zzj().zzd(zzxhVar.zzh, zzxhVar2.zzh).zzb(zzxhVar.zzl, zzxhVar2.zzl).zzd(true, true).zzd(zzxhVar.zze, zzxhVar2.zze).zzd(zzxhVar.zzg, zzxhVar2.zzg).zzc(Integer.valueOf(zzxhVar.zzk), Integer.valueOf(zzxhVar2.zzk), zzfxb.zzc().zza());
        boolean z = zzxhVar.zzo;
        zzfvh zzd = zzc.zzd(z, zzxhVar2.zzo);
        boolean z2 = zzxhVar.zzp;
        zzfvh zzd2 = zzd.zzd(z2, zzxhVar2.zzp);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzxhVar.zzq, zzxhVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final /* bridge */ /* synthetic */ boolean zzc(zzxe zzxeVar) {
        zzxh zzxhVar = (zzxh) zzxeVar;
        if (zzfk.zzE(this.zzd.zzm, zzxhVar.zzd.zzm)) {
            boolean z = this.zzf.zzK;
            if (this.zzo == zzxhVar.zzo && this.zzp == zzxhVar.zzp) {
                return true;
            }
            return false;
        }
        return false;
    }
}
