package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahl {
    public final zzacs zza;
    public zzahy zzd;
    public zzahh zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzahx zzb = new zzahx();
    public final zzfb zzc = new zzfb();
    private final zzfb zzj = new zzfb(1);
    private final zzfb zzk = new zzfb();

    public zzahl(zzacs zzacsVar, zzahy zzahyVar, zzahh zzahhVar) {
        this.zza = zzacsVar;
        this.zzd = zzahyVar;
        this.zze = zzahhVar;
        zzh(zzahyVar, zzahhVar);
    }

    public final int zza() {
        int i;
        if (!this.zzl) {
            i = this.zzd.zzg[this.zzf];
        } else if (this.zzb.zzj[this.zzf]) {
            i = 1;
        } else {
            i = 0;
        }
        if (zzf() != null) {
            return i | 1073741824;
        }
        return i;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfb zzfbVar;
        boolean z;
        int i3;
        zzahw zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i4 = zzf.zzd;
        if (i4 != 0) {
            zzfbVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i5 = zzfk.zza;
            zzfb zzfbVar2 = this.zzk;
            int length = bArr.length;
            zzfbVar2.zzE(bArr, length);
            zzfbVar = this.zzk;
            i4 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        if (!zzb && i2 == 0) {
            z = false;
        } else {
            z = true;
        }
        zzfb zzfbVar3 = this.zzj;
        if (true != z) {
            i3 = 0;
        } else {
            i3 = 128;
        }
        zzfbVar3.zzI()[0] = (byte) (i3 | i4);
        zzfbVar3.zzG(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzfbVar, i4, 1);
        if (!z) {
            return i4 + 1;
        }
        if (!zzb) {
            this.zzc.zzD(8);
            zzfb zzfbVar4 = this.zzc;
            byte[] zzI = zzfbVar4.zzI();
            zzI[0] = 0;
            zzI[1] = 1;
            zzI[2] = 0;
            zzI[3] = (byte) i2;
            zzI[4] = (byte) ((i >> 24) & 255);
            zzI[5] = (byte) ((i >> 16) & 255);
            zzI[6] = (byte) ((i >> 8) & 255);
            zzI[7] = (byte) (i & 255);
            this.zza.zzs(zzfbVar4, 8, 1);
            return i4 + 9;
        }
        int i6 = i4 + 1;
        zzfb zzfbVar5 = this.zzb.zzn;
        int zzp = zzfbVar5.zzp();
        zzfbVar5.zzH(-2);
        int i7 = (zzp * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzD(i7);
            byte[] zzI2 = this.zzc.zzI();
            zzfbVar5.zzC(zzI2, 0, i7);
            int i8 = (((zzI2[2] & 255) << 8) | (zzI2[3] & 255)) + i2;
            zzI2[2] = (byte) ((i8 >> 8) & 255);
            zzI2[3] = (byte) (i8 & 255);
            zzfbVar5 = this.zzc;
        }
        this.zza.zzs(zzfbVar5, i7, 1);
        return i6 + i7;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzahx zzahxVar = this.zzb;
        return zzahxVar.zzi[this.zzf];
    }

    public final zzahw zzf() {
        if (!this.zzl) {
            return null;
        }
        zzahx zzahxVar = this.zzb;
        zzahh zzahhVar = zzahxVar.zza;
        int i = zzfk.zza;
        int i2 = zzahhVar.zza;
        zzahw zzahwVar = zzahxVar.zzm;
        if (zzahwVar == null) {
            zzahwVar = this.zzd.zza.zza(i2);
        }
        if (zzahwVar == null || !zzahwVar.zza) {
            return null;
        }
        return zzahwVar;
    }

    public final void zzh(zzahy zzahyVar, zzahh zzahhVar) {
        this.zzd = zzahyVar;
        this.zze = zzahhVar;
        this.zza.zzl(zzahyVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzahx zzahxVar = this.zzb;
        zzahxVar.zzd = 0;
        zzahxVar.zzp = 0L;
        zzahxVar.zzq = false;
        zzahxVar.zzk = false;
        zzahxVar.zzo = false;
        zzahxVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
