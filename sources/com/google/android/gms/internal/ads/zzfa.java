package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfa {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzfa(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    private final void zzo() {
        int i;
        int i2 = this.zzb;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.zzd) || (i2 == i && this.zzc == 0))) {
            z = true;
        }
        zzdx.zzf(z);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        boolean z;
        if (this.zzc == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i3 = 0;
        while (true) {
            i2 = this.zzc;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.zzc = i4;
            byte[] bArr = this.zza;
            int i5 = this.zzb;
            this.zzb = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.zza;
        int i6 = this.zzb;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.zzc = 0;
            this.zzb = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        zzo();
        return i9;
    }

    public final void zze() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzo();
    }

    public final void zzf(int i, int i2) {
        int min = Math.min(8 - this.zzc, 14);
        int i3 = this.zzc;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.zza;
        int i5 = this.zzb;
        byte b2 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b2;
        int i6 = 14 - min;
        int i7 = i & 16383;
        bArr[i5] = (byte) (b2 | ((i7 >>> i6) << i4));
        int i8 = i5 + 1;
        while (i6 > 8) {
            i6 -= 8;
            this.zza[i8] = (byte) (i7 >>> i6);
            i8++;
        }
        byte[] bArr2 = this.zza;
        byte b3 = (byte) (bArr2[i8] & ((1 << r0) - 1));
        bArr2[i8] = b3;
        bArr2[i8] = (byte) (((i7 & ((1 << i6) - 1)) << (8 - i6)) | b3);
        zzl(14);
        zzo();
    }

    public final void zzg(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i5 = this.zzb;
            int i6 = i5 + 1;
            this.zzb = i6;
            byte b2 = bArr2[i5];
            int i7 = this.zzc;
            byte b3 = (byte) (b2 << i7);
            bArr[i4] = b3;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b3);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b4;
        int i9 = this.zzc;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.zza;
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            b4 = (byte) (b4 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b4;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.zzc = i11;
        byte[] bArr4 = this.zza;
        int i12 = this.zzb;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b4);
        if (i11 == 8) {
            this.zzc = 0;
            this.zzb = i12 + 1;
        }
        zzo();
    }

    public final void zzh(zzfb zzfbVar) {
        zzi(zzfbVar.zzI(), zzfbVar.zzd());
        zzj(zzfbVar.zzc() * 8);
    }

    public final void zzi(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final void zzj(int i) {
        int i2 = i / 8;
        this.zzb = i2;
        this.zzc = i - (i2 * 8);
        zzo();
    }

    public final void zzk() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzo();
    }

    public final void zzl(int i) {
        int i2 = i / 8;
        int i3 = this.zzb + i2;
        this.zzb = i3;
        int i4 = (i - (i2 * 8)) + this.zzc;
        this.zzc = i4;
        if (i4 > 7) {
            this.zzb = i3 + 1;
            this.zzc = i4 - 8;
        }
        zzo();
    }

    public final void zzm(int i) {
        boolean z;
        if (this.zzc == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        this.zzb += i;
        zzo();
    }

    public final boolean zzn() {
        int i = this.zza[this.zzb] & (128 >> this.zzc);
        zzk();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public zzfa() {
        this.zza = zzfk.zzf;
    }
}
