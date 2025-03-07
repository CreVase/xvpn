package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfz {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfz(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i2;
        zzh();
    }

    private final int zzg() {
        int i = 0;
        int i2 = 0;
        while (!zzf()) {
            i2++;
        }
        int i3 = 1 << i2;
        if (i2 > 0) {
            i = zza(i2);
        }
        return (i3 - 1) + i;
    }

    private final void zzh() {
        int i;
        int i2 = this.zzc;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.zzb) || (i2 == i && this.zzd == 0))) {
            z = true;
        }
        zzdx.zzf(z);
    }

    private final boolean zzi(int i) {
        if (i >= 2 && i < this.zzb) {
            byte[] bArr = this.zza;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        this.zzd += i;
        int i4 = 0;
        while (true) {
            i2 = this.zzd;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.zzd = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != zzi(i6 + 1)) {
                i3 = 1;
            }
            this.zzc = i6 + i3;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzc;
        int i8 = i4 | ((bArr2[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.zzd = 0;
            if (true != zzi(i7 + 1)) {
                i3 = 1;
            }
            this.zzc = i7 + i3;
        }
        int i10 = ((-1) >>> i9) & i8;
        zzh();
        return i10;
    }

    public final int zzb() {
        int zzg = zzg();
        int i = zzg % 2;
        int i2 = 1;
        int i3 = zzg + 1;
        if (i == 0) {
            i2 = -1;
        }
        return (i3 / 2) * i2;
    }

    public final int zzc() {
        return zzg();
    }

    public final void zzd() {
        int i = 1;
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            if (true == zzi(i3 + 1)) {
                i = 2;
            }
            this.zzc = i3 + i;
        }
        zzh();
    }

    public final void zze(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.zzc = i4;
        int i5 = (i - (i3 * 8)) + this.zzd;
        this.zzd = i5;
        if (i5 > 7) {
            this.zzc = i4 + 1;
            this.zzd = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.zzc) {
                if (zzi(i2)) {
                    this.zzc++;
                    i2 += 2;
                }
            } else {
                zzh();
                return;
            }
        }
    }

    public final boolean zzf() {
        int i = this.zza[this.zzc] & (128 >> this.zzd);
        zzd();
        if (i != 0) {
            return true;
        }
        return false;
    }
}
