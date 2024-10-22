package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgwu {
    private static final zzgwu zza = new zzgwu(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgwu(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgwu zzc() {
        return zza;
    }

    public static zzgwu zze(zzgwu zzgwuVar, zzgwu zzgwuVar2) {
        int i = zzgwuVar.zzb + zzgwuVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgwuVar.zzc, i);
        System.arraycopy(zzgwuVar2.zzc, 0, copyOf, zzgwuVar.zzb, zzgwuVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgwuVar.zzd, i);
        System.arraycopy(zzgwuVar2.zzd, 0, copyOf2, zzgwuVar.zzb, zzgwuVar2.zzb);
        return new zzgwu(i, copyOf, copyOf2, true);
    }

    public static zzgwu zzf() {
        return new zzgwu(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgwu)) {
            return false;
        }
        zzgwu zzgwuVar = (zzgwu) obj;
        int i = this.zzb;
        if (i == zzgwuVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgwuVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgwuVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzB;
        int zzA;
        int i;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.zzd[i4]).intValue();
                                    i = zzgtg.zzA(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzgul.zza());
                                }
                            } else {
                                int i8 = i6 << 3;
                                int i9 = zzgtg.zzf;
                                zzB = ((zzgwu) this.zzd[i4]).zza();
                                int zzA2 = zzgtg.zzA(i8);
                                zzA = zzA2 + zzA2;
                            }
                        } else {
                            int i10 = i6 << 3;
                            zzgsr zzgsrVar = (zzgsr) this.zzd[i4];
                            int i11 = zzgtg.zzf;
                            int zzd = zzgsrVar.zzd();
                            i = zzgtg.zzA(i10) + zzgtg.zzA(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzgtg.zzA(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i12 = i6 << 3;
                    zzB = zzgtg.zzB(((Long) this.zzd[i4]).longValue());
                    zzA = zzgtg.zzA(i12);
                }
                i = zzA + zzB;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = this.zzc[i3] >>> 3;
                zzgsr zzgsrVar = (zzgsr) this.zzd[i3];
                int i5 = zzgtg.zzf;
                int zzd = zzgsrVar.zzd();
                int zzA = zzgtg.zzA(zzd) + zzd;
                int zzA2 = zzgtg.zzA(16);
                int zzA3 = zzgtg.zzA(i4);
                int zzA4 = zzgtg.zzA(8);
                int i6 = zzA2 + zzA3;
                i2 += zzgtg.zzA(24) + zzA + i6 + zzA4 + zzA4;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final zzgwu zzd(zzgwu zzgwuVar) {
        if (zzgwuVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgwuVar.zzb;
        zzl(i);
        System.arraycopy(zzgwuVar.zzc, 0, this.zzc, this.zzb, zzgwuVar.zzb);
        System.arraycopy(zzgwuVar.zzd, 0, this.zzd, this.zzb, zzgwuVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgvl.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgth zzgthVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    zzgthVar.zzk(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzgul.zza());
                                }
                            } else {
                                zzgthVar.zzE(i4);
                                ((zzgwu) obj).zzk(zzgthVar);
                                zzgthVar.zzh(i4);
                            }
                        } else {
                            zzgthVar.zzd(i4, (zzgsr) obj);
                        }
                    } else {
                        zzgthVar.zzm(i4, ((Long) obj).longValue());
                    }
                } else {
                    zzgthVar.zzt(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzgwu() {
        this(0, new int[8], new Object[8], true);
    }
}
