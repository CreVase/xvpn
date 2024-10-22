package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfb {
    private static final zzfvx zza = zzfvx.zzo(zzfsi.zza, zzfsi.zzc, zzfsi.zzf, zzfsi.zzd, zzfsi.zze);
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfb(byte[] bArr, int i) {
        this.zzb = bArr;
        this.zzd = i;
    }

    public final void zzA(int i) {
        byte[] bArr = this.zzb;
        if (i > bArr.length) {
            this.zzb = Arrays.copyOf(bArr, i);
        }
    }

    public final void zzB(zzfa zzfaVar, int i) {
        zzC(zzfaVar.zza, 0, i);
        zzfaVar.zzj(0);
    }

    public final void zzC(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzb, this.zzc, bArr, i, i2);
        this.zzc += i2;
    }

    public final void zzD(int i) {
        byte[] bArr = this.zzb;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzE(bArr, i);
    }

    public final void zzE(byte[] bArr, int i) {
        this.zzb = bArr;
        this.zzd = i;
        this.zzc = 0;
    }

    public final void zzF(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzb.length) {
            z = true;
        }
        zzdx.zzd(z);
        this.zzd = i;
    }

    public final void zzG(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd) {
            z = true;
        }
        zzdx.zzd(z);
        this.zzc = i;
    }

    public final void zzH(int i) {
        zzG(this.zzc + i);
    }

    public final byte[] zzI() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzd - this.zzc;
    }

    public final int zzb() {
        return this.zzb.length;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zzb[this.zzc] & 255;
    }

    public final int zzf() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        int i6 = i4 + 1;
        int i7 = bArr[i4] & 255;
        this.zzc = i6 + 1;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        this.zzc = i4 + 1;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        int i6 = i4 + 1;
        int i7 = bArr[i4] & 255;
        this.zzc = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i3 | (i5 << 8) | (i7 << 16);
    }

    public final int zzi() {
        int zzh = zzh();
        if (zzh >= 0) {
            return zzh;
        }
        throw new IllegalStateException(hx2.m("Top bit not zero: ", zzh));
    }

    public final int zzj() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzc = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int zzk() {
        return (zzl() << 21) | (zzl() << 14) | (zzl() << 7) | zzl();
    }

    public final int zzl() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        this.zzc = i + 1;
        return bArr[i] & 255;
    }

    public final int zzm() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = bArr[i2] & 255;
        this.zzc = i2 + 1 + 2;
        return i4 | (i3 << 8);
    }

    public final int zzn() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        this.zzc = i4 + 1;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int zzo() {
        int zzf = zzf();
        if (zzf >= 0) {
            return zzf;
        }
        throw new IllegalStateException(hx2.m("Top bit not zero: ", zzf));
    }

    public final int zzp() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzc = i2 + 1;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long zzq() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        this.zzc = i8 + 1;
        return ((bArr[i8] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long zzr() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        long j3 = bArr[i3];
        this.zzc = i3 + 1 + 1;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzs() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        long j7 = bArr[i7];
        this.zzc = i7 + 1 + 1;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzt() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        long j3 = bArr[i3];
        this.zzc = i3 + 1 + 1;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzu() {
        long zzs = zzs();
        if (zzs >= 0) {
            return zzs;
        }
        throw new IllegalStateException("Top bit not zero: " + zzs);
    }

    public final long zzv() {
        int i;
        int i2;
        long j = this.zzb[this.zzc];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            for (i2 = 1; i2 < i; i2++) {
                if ((this.zzb[this.zzc + i2] & 192) == 128) {
                    j = (j << 6) | (r2 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.zzc += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public final String zzw(char c) {
        int i = this.zzd;
        int i2 = this.zzc;
        if (i - i2 != 0) {
            while (i2 < this.zzd && this.zzb[i2] != 0) {
                i2++;
            }
            byte[] bArr = this.zzb;
            int i3 = this.zzc;
            String zzy = zzfk.zzy(bArr, i3, i2 - i3);
            this.zzc = i2;
            if (i2 < this.zzd) {
                this.zzc = i2 + 1;
            }
            return zzy;
        }
        return null;
    }

    public final String zzx(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.zzc;
        int i4 = (i3 + i) - 1;
        if (i4 < this.zzd && this.zzb[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        String zzy = zzfk.zzy(this.zzb, i3, i2);
        this.zzc += i;
        return zzy;
    }

    public final String zzy(int i, Charset charset) {
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        String str = new String(bArr, i2, i, charset);
        this.zzc = i2 + i;
        return str;
    }

    public final short zzz() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzc = i2 + 1;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public zzfb() {
        this.zzb = zzfk.zzf;
    }

    public zzfb(int i) {
        this.zzb = new byte[i];
        this.zzd = i;
    }

    public zzfb(byte[] bArr) {
        this.zzb = bArr;
        this.zzd = bArr.length;
    }
}
