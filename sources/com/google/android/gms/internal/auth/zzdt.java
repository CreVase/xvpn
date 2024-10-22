package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdt {
    public static int zza(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int zzj = zzj(bArr, i, zzdsVar);
        int i2 = zzdsVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzj) {
                if (i2 == 0) {
                    zzdsVar.zzc = zzee.zzb;
                    return zzj;
                }
                zzdsVar.zzc = zzee.zzk(bArr, zzj, i2);
                return zzj + i2;
            }
            throw zzfa.zzf();
        }
        throw zzfa.zzc();
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i, int i2, int i3, zzds zzdsVar) throws IOException {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object zzd = zzfzVar.zzd();
        int zzb = zzfzVar.zzb(zzd, bArr, i, i2, i3, zzdsVar);
        zzfzVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return zzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzdsVar);
            i4 = zzdsVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zzd = zzghVar.zzd();
            int i6 = i4 + i5;
            zzghVar.zzg(zzd, bArr, i5, i6, zzdsVar);
            zzghVar.zze(zzd);
            zzdsVar.zzc = zzd;
            return i6;
        }
        throw zzfa.zzf();
    }

    public static int zze(zzgh zzghVar, int i, byte[] bArr, int i2, int i3, zzey zzeyVar, zzds zzdsVar) throws IOException {
        int zzd = zzd(zzghVar, bArr, i2, i3, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i3, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzey zzeyVar, zzds zzdsVar) throws IOException {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i, zzdsVar);
        int i2 = zzdsVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int zzj = zzj(bArr, i, zzdsVar);
        int i2 = zzdsVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdsVar.zzc = "";
                return zzj;
            }
            zzdsVar.zzc = new String(bArr, zzj, i2, zzez.zzb);
            return zzj + i2;
        }
        throw zzfa.zzc();
    }

    public static int zzh(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int zzj = zzj(bArr, i, zzdsVar);
        int i2 = zzdsVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdsVar.zzc = "";
                return zzj;
            }
            zzdsVar.zzc = zzhm.zzb(bArr, zzj, i2);
            return zzj + i2;
        }
        throw zzfa.zzc();
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzgzVar.zzf(i, Integer.valueOf(zzb(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzfa.zza();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzgz zzc = zzgz.zzc();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int zzj = zzj(bArr, i2, zzdsVar);
                            int i7 = zzdsVar.zza;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = zzj;
                                break;
                            }
                            i6 = i7;
                            i2 = zzi(i7, bArr, zzj, i3, zzc, zzdsVar);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzgzVar.zzf(i, zzc);
                            return i2;
                        }
                        throw zzfa.zzd();
                    }
                    int zzj2 = zzj(bArr, i2, zzdsVar);
                    int i8 = zzdsVar.zza;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - zzj2) {
                            if (i8 == 0) {
                                zzgzVar.zzf(i, zzee.zzb);
                            } else {
                                zzgzVar.zzf(i, zzee.zzk(bArr, zzj2, i8));
                            }
                            return zzj2 + i8;
                        }
                        throw zzfa.zzf();
                    }
                    throw zzfa.zzc();
                }
                zzgzVar.zzf(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            }
            int zzm = zzm(bArr, i2, zzdsVar);
            zzgzVar.zzf(i, Long.valueOf(zzdsVar.zzb));
            return zzm;
        }
        throw zzfa.zza();
    }

    public static int zzj(byte[] bArr, int i, zzds zzdsVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            zzdsVar.zza = b2;
            return i2;
        }
        return zzk(b2, bArr, i2, zzdsVar);
    }

    public static int zzk(int i, byte[] bArr, int i2, zzds zzdsVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzdsVar.zza = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzdsVar.zza = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            zzdsVar.zza = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzdsVar.zza = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzdsVar.zza = i11;
                return i12;
            }
        }
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i2, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzds zzdsVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzdsVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzdsVar.zzb = j2;
        return i3;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
