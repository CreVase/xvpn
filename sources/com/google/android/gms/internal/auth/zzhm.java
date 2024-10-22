package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i = zzdr.zza;
        }
        zza = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b3 = bArr[i];
                    byte b4 = bArr[i + 1];
                    if (b2 <= -12 && b3 <= -65 && b4 <= -65) {
                        return ((b3 << 8) ^ b2) ^ (b4 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b5 = bArr[i];
                if (b2 <= -12 && b5 <= -65) {
                    return b2 ^ (b5 << 8);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    public static String zzb(byte[] bArr, int i, int i2) throws zzfa {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!zzhj.zzd(b2)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b3 = bArr[i];
                if (zzhj.zzd(b3)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b4 = bArr[i];
                            if (!zzhj.zzd(b4)) {
                                break;
                            }
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b4;
                        }
                    }
                } else if (b3 < -32) {
                    if (i5 < i3) {
                        zzhj.zzc(b3, bArr[i5], cArr, i4);
                        i = i5 + 1;
                        i4++;
                    } else {
                        throw zzfa.zzb();
                    }
                } else if (b3 < -16) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        zzhj.zzb(b3, bArr[i5], bArr[i7], cArr, i4);
                        i = i7 + 1;
                        i4++;
                    } else {
                        throw zzfa.zzb();
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    int i9 = i8 + 1;
                    zzhj.zza(b3, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                    i4 += 2;
                    i = i9 + 1;
                } else {
                    throw zzfa.zzb();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }
}
