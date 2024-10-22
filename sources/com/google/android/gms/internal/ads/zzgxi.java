package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgxi {
    private static final zzgxf zza;

    static {
        if (zzgxd.zzA() && zzgxd.zzB()) {
            int i = zzgsc.zza;
        }
        zza = new zzgxg();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b2 = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return zzl(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return zzk(b2, bArr[i]);
        }
        if (b2 > -12) {
            return -1;
        }
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:            return r10 + r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxi.zzd(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zze(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzgxh(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int zzf(int i, byte[] bArr, int i2, int i3) {
        return zza.zza(i, bArr, i2, i3);
    }

    public static String zzg(ByteBuffer byteBuffer, int i, int i2) throws zzgul {
        zzgxf zzgxfVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgxfVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        if (byteBuffer.isDirect()) {
            return zzgxf.zzd(byteBuffer, i, i2);
        }
        return zzgxf.zzd(byteBuffer, i, i2);
    }

    public static String zzh(byte[] bArr, int i, int i2) throws zzgul {
        return zza.zzb(bArr, i, i2);
    }

    public static boolean zzi(byte[] bArr) {
        return zza.zzc(bArr, 0, bArr.length);
    }

    public static boolean zzj(byte[] bArr, int i, int i2) {
        return zza.zzc(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
