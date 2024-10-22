package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmh {
    private static final zzmi zza;

    static {
        if (zzmg.zzc()) {
            zzmg.zzd();
        }
        zza = new zzml();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            byte b3 = bArr[i];
            if (b2 > -12 || b3 > -65) {
                return -1;
            }
            return (b3 << 8) ^ b2;
        }
        if (i3 == 2) {
            byte b4 = bArr[i];
            byte b5 = bArr[i + 1];
            if (b2 > -12 || b4 > -65 || b5 > -65) {
                return -1;
            }
            return (b5 << 16) ^ ((b4 << 8) ^ b2);
        }
        throw new AssertionError();
    }

    public static String zzb(byte[] bArr, int i, int i2) throws zzji {
        return zza.zza(bArr, i, i2);
    }

    public static boolean zzc(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }

    public static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zza.zza(charSequence, bArr, i, i2);
    }

    public static int zza(CharSequence charSequence) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new zzmk(i2, length2);
                            }
                            i2++;
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

    public static boolean zza(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }
}
