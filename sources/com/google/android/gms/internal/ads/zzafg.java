package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzafg {
    public static final zzafe zza = new zzafe() { // from class: com.google.android.gms.internal.ads.zzafd
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzby zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzafe r13, com.google.android.gms.internal.ads.zzaeh r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafg.zza(byte[], int, com.google.android.gms.internal.ads.zzafe, com.google.android.gms.internal.ads.zzaeh):com.google.android.gms.internal.ads.zzby");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd < length - 1) {
                int i3 = zzd + 1;
                if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                    return zzd;
                }
                zzd = zzd(bArr, i3);
            } else {
                return length;
            }
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            } else {
                return length;
            }
        }
    }

    private static int zze(zzfb zzfbVar, int i) {
        byte[] zzI = zzfbVar.zzI();
        int zzc = zzfbVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < zzc + i) {
                if ((zzI[i2] & 255) == 255 && zzI[i3] == 0) {
                    System.arraycopy(zzI, i2 + 2, zzI, i3, (i - (i2 - zzc)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0273, code lost:            if (r9 == 67) goto L142;     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04fa A[Catch: all -> 0x051f, TRY_LEAVE, TryCatch #2 {all -> 0x051f, blocks: (B:57:0x04fa, B:97:0x0219, B:113:0x0275, B:115:0x0287, B:119:0x02c8, B:121:0x02a9, B:123:0x02c2, B:135:0x030a, B:142:0x0351, B:145:0x0386, B:148:0x0397, B:149:0x039f, B:151:0x03a5, B:154:0x03ac, B:159:0x03b0, B:166:0x03d2, B:169:0x03ff, B:171:0x0409, B:173:0x043c, B:174:0x0448, B:176:0x044e, B:179:0x0455, B:184:0x0459, B:187:0x046e, B:198:0x0499, B:200:0x04c3, B:202:0x04d2, B:203:0x04e9), top: B:46:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzafh zzf(int r35, com.google.android.gms.internal.ads.zzfb r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzafe r39) {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafg.zzf(int, com.google.android.gms.internal.ads.zzfb, boolean, int, com.google.android.gms.internal.ads.zzafe):com.google.android.gms.internal.ads.zzafh");
    }

    private static zzfvs zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfvs.zzm("");
        }
        zzfvp zzfvpVar = new zzfvp();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfvpVar.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfvs zzi = zzfvpVar.zzi();
        if (zzi.isEmpty()) {
            return zzfvs.zzm("");
        }
        return zzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset zzj(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return zzfsi.zzb;
                }
                return zzfsi.zzc;
            }
            return zzfsi.zzd;
        }
        return zzfsi.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:            if ((r10 & 128) != 0) goto L42;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzk(com.google.android.gms.internal.ads.zzfb r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzc()
        L8:
            int r3 = r21.zza()     // Catch: java.lang.Throwable -> Lb0
            r4 = 1
            r5 = r23
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r21.zzf()     // Catch: java.lang.Throwable -> Lb0
            long r8 = r21.zzt()     // Catch: java.lang.Throwable -> Lb0
            int r10 = r21.zzp()     // Catch: java.lang.Throwable -> Lb0
            goto L2c
        L22:
            int r7 = r21.zzn()     // Catch: java.lang.Throwable -> Lb0
            int r8 = r21.zzn()     // Catch: java.lang.Throwable -> Lb0
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 == 0) goto L37
            goto L3b
        L37:
            r1.zzG(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r24 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.zzG(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L73
            goto L74
        L73:
            r4 = 0
        L74:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8b
            goto L8c
        L8a:
            r3 = 0
        L8b:
            r4 = 0
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L99
            r1.zzG(r2)
            return r6
        L99:
            int r3 = r21.zza()     // Catch: java.lang.Throwable -> Lb0
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La6
            r1.zzG(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.zzH(r3)     // Catch: java.lang.Throwable -> Lb0
            goto L8
        Lac:
            r1.zzG(r2)
            return r4
        Lb0:
            r0 = move-exception
            r1.zzG(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafg.zzk(com.google.android.gms.internal.ads.zzfb, int, int, boolean):boolean");
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzfk.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }
}
