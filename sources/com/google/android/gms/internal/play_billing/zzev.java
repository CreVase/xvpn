package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzev {
    public static final /* synthetic */ int zza = 0;
    private static final zzes zzb;

    static {
        if (zzeq.zzx() && zzeq.zzy()) {
            int i = zzam.zza;
        }
        zzb = new zzet();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b2 = bArr[i - 1];
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:            return r9 + r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzev.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
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
                                throw new zzeu(i2, length2);
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

    public static boolean zzd(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zze(byte[] bArr, int i, int i2) {
        return zzb.zzb(bArr, i, i2);
    }
}
