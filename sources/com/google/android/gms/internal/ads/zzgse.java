package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgse {
    public static int zza(byte[] bArr, int i, zzgsd zzgsdVar) throws zzgul {
        int zzh = zzh(bArr, i, zzgsdVar);
        int i2 = zzgsdVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzh) {
                if (i2 == 0) {
                    zzgsdVar.zzc = zzgsr.zzb;
                    return zzh;
                }
                zzgsdVar.zzc = zzgsr.zzv(bArr, zzh, i2);
                return zzh + i2;
            }
            throw zzgul.zzj();
        }
        throw zzgul.zzf();
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzgwc zzgwcVar, byte[] bArr, int i, int i2, int i3, zzgsd zzgsdVar) throws IOException {
        Object zze = zzgwcVar.zze();
        int zzl = zzl(zze, zzgwcVar, bArr, i, i2, i3, zzgsdVar);
        zzgwcVar.zzf(zze);
        zzgsdVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzgwc zzgwcVar, byte[] bArr, int i, int i2, zzgsd zzgsdVar) throws IOException {
        Object zze = zzgwcVar.zze();
        int zzm = zzm(zze, zzgwcVar, bArr, i, i2, zzgsdVar);
        zzgwcVar.zzf(zze);
        zzgsdVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzgwc zzgwcVar, int i, byte[] bArr, int i2, int i3, zzgui zzguiVar, zzgsd zzgsdVar) throws IOException {
        int zzd = zzd(zzgwcVar, bArr, i2, i3, zzgsdVar);
        zzguiVar.add(zzgsdVar.zzc);
        while (zzd < i3) {
            int zzh = zzh(bArr, zzd, zzgsdVar);
            if (i != zzgsdVar.zza) {
                break;
            }
            zzd = zzd(zzgwcVar, bArr, zzh, i3, zzgsdVar);
            zzguiVar.add(zzgsdVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzgui zzguiVar, zzgsd zzgsdVar) throws IOException {
        zzgua zzguaVar = (zzgua) zzguiVar;
        int zzh = zzh(bArr, i, zzgsdVar);
        int i2 = zzgsdVar.zza + zzh;
        while (zzh < i2) {
            zzh = zzh(bArr, zzh, zzgsdVar);
            zzguaVar.zzh(zzgsdVar.zza);
        }
        if (zzh == i2) {
            return zzh;
        }
        throw zzgul.zzj();
    }

    public static int zzg(int i, byte[] bArr, int i2, int i3, zzgwu zzgwuVar, zzgsd zzgsdVar) throws zzgul {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzgwuVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzgul.zzc();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzgwu zzf = zzgwu.zzf();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int zzh = zzh(bArr, i2, zzgsdVar);
                            int i7 = zzgsdVar.zza;
                            i6 = i7;
                            if (i7 != i5) {
                                int zzg = zzg(i6, bArr, zzh, i3, zzf, zzgsdVar);
                                i6 = i7;
                                i2 = zzg;
                            } else {
                                i2 = zzh;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzgwuVar.zzj(i, zzf);
                            return i2;
                        }
                        throw zzgul.zzg();
                    }
                    int zzh2 = zzh(bArr, i2, zzgsdVar);
                    int i8 = zzgsdVar.zza;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - zzh2) {
                            if (i8 == 0) {
                                zzgwuVar.zzj(i, zzgsr.zzb);
                            } else {
                                zzgwuVar.zzj(i, zzgsr.zzv(bArr, zzh2, i8));
                            }
                            return zzh2 + i8;
                        }
                        throw zzgul.zzj();
                    }
                    throw zzgul.zzf();
                }
                zzgwuVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            }
            int zzk = zzk(bArr, i2, zzgsdVar);
            zzgwuVar.zzj(i, Long.valueOf(zzgsdVar.zzb));
            return zzk;
        }
        throw zzgul.zzc();
    }

    public static int zzh(byte[] bArr, int i, zzgsd zzgsdVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            zzgsdVar.zza = b2;
            return i2;
        }
        return zzi(b2, bArr, i2, zzgsdVar);
    }

    public static int zzi(int i, byte[] bArr, int i2, zzgsd zzgsdVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            zzgsdVar.zza = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            zzgsdVar.zza = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            zzgsdVar.zza = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzgsdVar.zza = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzgsdVar.zza = i11;
                return i12;
            }
        }
    }

    public static int zzj(int i, byte[] bArr, int i2, int i3, zzgui zzguiVar, zzgsd zzgsdVar) {
        zzgua zzguaVar = (zzgua) zzguiVar;
        int zzh = zzh(bArr, i2, zzgsdVar);
        zzguaVar.zzh(zzgsdVar.zza);
        while (zzh < i3) {
            int zzh2 = zzh(bArr, zzh, zzgsdVar);
            if (i != zzgsdVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgsdVar);
            zzguaVar.zzh(zzgsdVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i, zzgsd zzgsdVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgsdVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= (b3 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b2 = b3;
        }
        zzgsdVar.zzb = j2;
        return i3;
    }

    public static int zzl(Object obj, zzgwc zzgwcVar, byte[] bArr, int i, int i2, int i3, zzgsd zzgsdVar) throws IOException {
        int zzc = ((zzgvm) zzgwcVar).zzc(obj, bArr, i, i2, i3, zzgsdVar);
        zzgsdVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzgwc zzgwcVar, byte[] bArr, int i, int i2, zzgsd zzgsdVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzi(i4, bArr, i3, zzgsdVar);
            i4 = zzgsdVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            zzgwcVar.zzi(obj, bArr, i5, i6, zzgsdVar);
            zzgsdVar.zzc = obj;
            return i6;
        }
        throw zzgul.zzj();
    }

    public static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
