package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzxc extends zzxe implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxc(int i, zzcx zzcxVar, int i2, zzww zzwwVar, int i3, String str) {
        super(i, zzcxVar, i2);
        boolean z;
        boolean z2;
        zzfvs zzfvsVar;
        int i4;
        boolean z3;
        boolean z4;
        int i5 = 0;
        this.zzf = zzxi.zzn(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzwwVar.zzy;
        if (1 != (i6 & 1)) {
            z = false;
        } else {
            z = true;
        }
        this.zzg = z;
        if ((i6 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzh = z2;
        if (zzwwVar.zzw.isEmpty()) {
            zzfvsVar = zzfvs.zzm("");
        } else {
            zzfvsVar = zzwwVar.zzw;
        }
        int i8 = 0;
        while (true) {
            if (i8 < zzfvsVar.size()) {
                i4 = zzxi.zza(this.zzd, (String) zzfvsVar.get(i8), false);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i10 = this.zzd.zzf;
        this.zzm = false;
        if (zzxi.zzg(str) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        int zza = zzxi.zza(this.zzd, str, z3);
        this.zzl = zza;
        if (i4 <= 0 && ((!zzwwVar.zzw.isEmpty() || bitCount <= 0) && !this.zzg && (!this.zzh || zza <= 0))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (zzxi.zzn(i3, zzwwVar.zzR) && z4) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxc zzxcVar) {
        zzfxb zza;
        zzfvh zzd = zzfvh.zzj().zzd(this.zzf, zzxcVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxcVar.zzi), zzfxb.zzc().zza()).zzb(this.zzj, zzxcVar.zzj).zzb(this.zzk, zzxcVar.zzk).zzd(this.zzg, zzxcVar.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzxcVar.zzh);
        if (this.zzj == 0) {
            zza = zzfxb.zzc();
        } else {
            zza = zzfxb.zzc().zza();
        }
        zzfvh zzb = zzd.zzc(valueOf, valueOf2, zza).zzb(this.zzl, zzxcVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final /* bridge */ /* synthetic */ boolean zzc(zzxe zzxeVar) {
        return false;
    }
}
