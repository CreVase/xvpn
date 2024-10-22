package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzam {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    private int zzap;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzby zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzad zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzs zzy;
    public final int zzz;
    private static final zzam zzI = new zzam(new zzak());
    private static final String zzJ = Integer.toString(0, 36);
    private static final String zzK = Integer.toString(1, 36);
    private static final String zzL = Integer.toString(2, 36);
    private static final String zzM = Integer.toString(3, 36);
    private static final String zzN = Integer.toString(4, 36);
    private static final String zzO = Integer.toString(5, 36);
    private static final String zzP = Integer.toString(6, 36);
    private static final String zzQ = Integer.toString(7, 36);
    private static final String zzR = Integer.toString(8, 36);
    private static final String zzS = Integer.toString(9, 36);
    private static final String zzT = Integer.toString(10, 36);
    private static final String zzU = Integer.toString(11, 36);
    private static final String zzV = Integer.toString(12, 36);
    private static final String zzW = Integer.toString(13, 36);
    private static final String zzX = Integer.toString(14, 36);
    private static final String zzY = Integer.toString(15, 36);
    private static final String zzZ = Integer.toString(16, 36);
    private static final String zzaa = Integer.toString(17, 36);
    private static final String zzab = Integer.toString(18, 36);
    private static final String zzac = Integer.toString(19, 36);
    private static final String zzad = Integer.toString(20, 36);
    private static final String zzae = Integer.toString(21, 36);
    private static final String zzaf = Integer.toString(22, 36);
    private static final String zzag = Integer.toString(23, 36);
    private static final String zzah = Integer.toString(24, 36);
    private static final String zzai = Integer.toString(25, 36);
    private static final String zzaj = Integer.toString(26, 36);
    private static final String zzak = Integer.toString(27, 36);
    private static final String zzal = Integer.toString(28, 36);
    private static final String zzam = Integer.toString(29, 36);
    private static final String zzan = Integer.toString(30, 36);
    private static final String zzao = Integer.toString(31, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzam.class == obj.getClass()) {
            zzam zzamVar = (zzam) obj;
            int i2 = this.zzap;
            if ((i2 == 0 || (i = zzamVar.zzap) == 0 || i2 == i) && this.zze == zzamVar.zze && this.zzg == zzamVar.zzg && this.zzh == zzamVar.zzh && this.zzn == zzamVar.zzn && this.zzq == zzamVar.zzq && this.zzr == zzamVar.zzr && this.zzs == zzamVar.zzs && this.zzu == zzamVar.zzu && this.zzx == zzamVar.zzx && this.zzz == zzamVar.zzz && this.zzA == zzamVar.zzA && this.zzB == zzamVar.zzB && this.zzC == zzamVar.zzC && this.zzD == zzamVar.zzD && this.zzE == zzamVar.zzE && this.zzF == zzamVar.zzF && this.zzG == zzamVar.zzG && this.zzH == zzamVar.zzH && Float.compare(this.zzt, zzamVar.zzt) == 0 && Float.compare(this.zzv, zzamVar.zzv) == 0 && zzfk.zzE(this.zzb, zzamVar.zzb) && zzfk.zzE(this.zzc, zzamVar.zzc) && zzfk.zzE(this.zzj, zzamVar.zzj) && zzfk.zzE(this.zzl, zzamVar.zzl) && zzfk.zzE(this.zzm, zzamVar.zzm) && zzfk.zzE(this.zzd, zzamVar.zzd) && Arrays.equals(this.zzw, zzamVar.zzw) && zzfk.zzE(this.zzk, zzamVar.zzk) && zzfk.zzE(this.zzy, zzamVar.zzy) && zzfk.zzE(this.zzp, zzamVar.zzp) && zzd(zzamVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i2 = this.zzap;
        if (i2 == 0) {
            String str = this.zzb;
            int i3 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.zzc;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i4 = hashCode + 527;
            String str3 = this.zzd;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i5 = (i4 * 31) + i;
            int i6 = this.zze;
            int i7 = this.zzg;
            int i8 = this.zzh;
            String str4 = this.zzj;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i9 = ((((((((((i5 * 31) + hashCode2) * 31) + i6) * 961) + i7) * 31) + i8) * 31) + hashCode3) * 31;
            zzby zzbyVar = this.zzk;
            if (zzbyVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = zzbyVar.hashCode();
            }
            int i10 = (i9 + hashCode4) * 31;
            String str5 = this.zzl;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i11 = (i10 + hashCode5) * 31;
            String str6 = this.zzm;
            if (str6 != null) {
                i3 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.zzv) + ((((Float.floatToIntBits(this.zzt) + ((((((((((i11 + i3) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH;
            this.zzap = floatToIntBits;
            return floatToIntBits;
        }
        return i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzy);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.zzb);
        sb.append(", ");
        sb.append(this.zzc);
        sb.append(", ");
        sb.append(this.zzl);
        sb.append(", ");
        sb.append(this.zzm);
        sb.append(", ");
        sb.append(this.zzj);
        sb.append(", ");
        sb.append(this.zzi);
        sb.append(", ");
        sb.append(this.zzd);
        sb.append(", [");
        sb.append(this.zzr);
        sb.append(", ");
        sb.append(this.zzs);
        sb.append(", ");
        sb.append(this.zzt);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(this.zzz);
        sb.append(", ");
        return hx2.r(sb, this.zzA, "])");
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzak zzb() {
        return new zzak(this, null);
    }

    public final zzam zzc(int i) {
        zzak zzakVar = new zzak(this, null);
        zzakVar.zzC(i);
        return new zzam(zzakVar);
    }

    public final boolean zzd(zzam zzamVar) {
        if (this.zzo.size() != zzamVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzamVar.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }

    private zzam(zzak zzakVar) {
        this.zzb = zzak.zzag(zzakVar);
        this.zzc = zzak.zzah(zzakVar);
        this.zzd = zzfk.zzB(zzak.zzai(zzakVar));
        this.zze = zzak.zzo(zzakVar);
        this.zzf = 0;
        int zzd = zzak.zzd(zzakVar);
        this.zzg = zzd;
        int zzl = zzak.zzl(zzakVar);
        this.zzh = zzl;
        this.zzi = zzl != -1 ? zzl : zzd;
        this.zzj = zzak.zzae(zzakVar);
        this.zzk = zzak.zzad(zzakVar);
        this.zzl = zzak.zzaf(zzakVar);
        this.zzm = zzak.zzaj(zzakVar);
        this.zzn = zzak.zzj(zzakVar);
        this.zzo = zzak.zzak(zzakVar) == null ? Collections.emptyList() : zzak.zzak(zzakVar);
        zzad zzv = zzak.zzv(zzakVar);
        this.zzp = zzv;
        this.zzq = zzak.zzt(zzakVar);
        this.zzr = zzak.zzs(zzakVar);
        this.zzs = zzak.zzi(zzakVar);
        this.zzt = zzak.zza(zzakVar);
        this.zzu = zzak.zzm(zzakVar) == -1 ? 0 : zzak.zzm(zzakVar);
        this.zzv = zzak.zzb(zzakVar) == -1.0f ? 1.0f : zzak.zzb(zzakVar);
        this.zzw = zzak.zzal(zzakVar);
        this.zzx = zzak.zzp(zzakVar);
        this.zzy = zzak.zzu(zzakVar);
        this.zzz = zzak.zze(zzakVar);
        this.zzA = zzak.zzn(zzakVar);
        this.zzB = zzak.zzk(zzakVar);
        this.zzC = zzak.zzg(zzakVar) == -1 ? 0 : zzak.zzg(zzakVar);
        this.zzD = zzak.zzh(zzakVar) != -1 ? zzak.zzh(zzakVar) : 0;
        this.zzE = zzak.zzc(zzakVar);
        this.zzF = zzak.zzq(zzakVar);
        this.zzG = zzak.zzr(zzakVar);
        this.zzH = (zzak.zzf(zzakVar) != 0 || zzv == null) ? zzak.zzf(zzakVar) : 1;
    }
}
