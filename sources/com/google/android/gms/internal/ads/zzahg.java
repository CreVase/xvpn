package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.p71;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class zzahg {
    private static final byte[] zza;

    static {
        int i = zzfk.zza;
        zza = "OpusHead".getBytes(zzfsi.zzc);
    }

    public static zzby zza(zzagw zzagwVar) {
        zzfo zzfoVar;
        zzagx zzb = zzagwVar.zzb(1751411826);
        zzagx zzb2 = zzagwVar.zzb(1801812339);
        zzagx zzb3 = zzagwVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzh(zzb.zza) != 1835299937) {
            return null;
        }
        zzfb zzfbVar = zzb2.zza;
        zzfbVar.zzG(12);
        int zzf = zzfbVar.zzf();
        String[] strArr = new String[zzf];
        for (int i = 0; i < zzf; i++) {
            int zzf2 = zzfbVar.zzf();
            zzfbVar.zzH(4);
            strArr[i] = zzfbVar.zzy(zzf2 - 8, zzfsi.zzc);
        }
        zzfb zzfbVar2 = zzb3.zza;
        zzfbVar2.zzG(8);
        ArrayList arrayList = new ArrayList();
        while (zzfbVar2.zza() > 8) {
            int zzf3 = zzfbVar2.zzf() + zzfbVar2.zzc();
            int zzf4 = zzfbVar2.zzf() - 1;
            if (zzf4 >= 0 && zzf4 < zzf) {
                String str = strArr[zzf4];
                while (true) {
                    int zzc = zzfbVar2.zzc();
                    if (zzc < zzf3) {
                        int zzf5 = zzfbVar2.zzf();
                        if (zzfbVar2.zzf() == 1684108385) {
                            int zzf6 = zzfbVar2.zzf();
                            int zzf7 = zzfbVar2.zzf();
                            int i2 = zzf5 - 16;
                            byte[] bArr = new byte[i2];
                            zzfbVar2.zzC(bArr, 0, i2);
                            zzfoVar = new zzfo(str, bArr, zzf7, zzf6);
                            break;
                        }
                        zzfbVar2.zzG(zzc + zzf5);
                    } else {
                        zzfoVar = null;
                        break;
                    }
                }
                if (zzfoVar != null) {
                    arrayList.add(zzfoVar);
                }
            } else {
                p71.y("Skipped metadata with unknown key index: ", zzf4, "AtomParsers");
            }
            zzfbVar2.zzG(zzf3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:            if (r7 != 13) goto L43;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzby zzb(com.google.android.gms.internal.ads.zzagx r12) {
        /*
            com.google.android.gms.internal.ads.zzfb r12 = r12.zza
            r0 = 8
            r12.zzG(r0)
            com.google.android.gms.internal.ads.zzby r1 = new com.google.android.gms.internal.ads.zzby
            r2 = 0
            com.google.android.gms.internal.ads.zzbx[] r3 = new com.google.android.gms.internal.ads.zzbx[r2]
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r3)
        L14:
            int r3 = r12.zza()
            if (r3 < r0) goto Lf1
            int r3 = r12.zzc()
            int r6 = r12.zzf()
            int r6 = r6 + r3
            int r7 = r12.zzf()
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            r9 = 0
            if (r7 != r8) goto L80
            r12.zzG(r3)
            r12.zzH(r0)
            zze(r12)
        L36:
            int r3 = r12.zzc()
            if (r3 >= r6) goto L7a
            int r3 = r12.zzc()
            int r7 = r12.zzf()
            int r7 = r7 + r3
            int r8 = r12.zzf()
            r10 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r10) goto L76
            r12.zzG(r3)
            r12.zzH(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L59:
            int r8 = r12.zzc()
            if (r8 >= r7) goto L69
            com.google.android.gms.internal.ads.zzbx r8 = com.google.android.gms.internal.ads.zzahn.zza(r12)
            if (r8 == 0) goto L59
            r3.add(r8)
            goto L59
        L69:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L70
            goto L7a
        L70:
            com.google.android.gms.internal.ads.zzby r9 = new com.google.android.gms.internal.ads.zzby
            r9.<init>(r3)
            goto L7a
        L76:
            r12.zzG(r7)
            goto L36
        L7a:
            com.google.android.gms.internal.ads.zzby r1 = r1.zzd(r9)
            goto Lec
        L80:
            r8 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r7 != r8) goto Ldf
            r12.zzG(r3)
            r3 = 12
            r12.zzH(r3)
        L8d:
            int r7 = r12.zzc()
            if (r7 >= r6) goto Lda
            int r7 = r12.zzc()
            int r8 = r12.zzf()
            int r10 = r12.zzf()
            r11 = 1935766900(0x73617574, float:1.7862687E31)
            if (r10 != r11) goto Ld5
            r7 = 14
            if (r8 >= r7) goto La9
            goto Lda
        La9:
            r7 = 5
            r12.zzH(r7)
            int r7 = r12.zzl()
            r8 = 1123024896(0x42f00000, float:120.0)
            if (r7 == r3) goto Lba
            r3 = 13
            if (r7 == r3) goto Lbe
            goto Lda
        Lba:
            if (r7 != r3) goto Lbe
            r8 = 1131413504(0x43700000, float:240.0)
        Lbe:
            r3 = 1
            r12.zzH(r3)
            int r7 = r12.zzl()
            com.google.android.gms.internal.ads.zzby r9 = new com.google.android.gms.internal.ads.zzby
            com.google.android.gms.internal.ads.zzbx[] r3 = new com.google.android.gms.internal.ads.zzbx[r3]
            com.google.android.gms.internal.ads.zzafx r10 = new com.google.android.gms.internal.ads.zzafx
            r10.<init>(r8, r7)
            r3[r2] = r10
            r9.<init>(r4, r3)
            goto Lda
        Ld5:
            int r7 = r7 + r8
            r12.zzG(r7)
            goto L8d
        Lda:
            com.google.android.gms.internal.ads.zzby r1 = r1.zzd(r9)
            goto Lec
        Ldf:
            r3 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r7 != r3) goto Lec
            com.google.android.gms.internal.ads.zzby r3 = zzl(r12)
            com.google.android.gms.internal.ads.zzby r1 = r1.zzd(r3)
        Lec:
            r12.zzG(r6)
            goto L14
        Lf1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzb(com.google.android.gms.internal.ads.zzagx):com.google.android.gms.internal.ads.zzby");
    }

    public static zzfu zzc(zzfb zzfbVar) {
        long zzs;
        long zzs2;
        zzfbVar.zzG(8);
        if (zzagy.zze(zzfbVar.zzf()) == 0) {
            zzs = zzfbVar.zzt();
            zzs2 = zzfbVar.zzt();
        } else {
            zzs = zzfbVar.zzs();
            zzs2 = zzfbVar.zzs();
        }
        return new zzfu(zzs, zzs2, zzfbVar.zzt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x00b9, code lost:            if (r4 == 0) goto L31;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0e78 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0c1b  */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzagw r55, com.google.android.gms.internal.ads.zzacc r56, long r57, com.google.android.gms.internal.ads.zzad r59, boolean r60, boolean r61, com.google.android.gms.internal.ads.zzfsk r62) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 3714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzd(com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzacc, long, com.google.android.gms.internal.ads.zzad, boolean, boolean, com.google.android.gms.internal.ads.zzfsk):java.util.List");
    }

    public static void zze(zzfb zzfbVar) {
        int zzc = zzfbVar.zzc();
        zzfbVar.zzH(4);
        if (zzfbVar.zzf() != 1751411826) {
            zzc += 4;
        }
        zzfbVar.zzG(zzc);
    }

    private static int zzf(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzg(zzfb zzfbVar) {
        int zzl = zzfbVar.zzl();
        int i = zzl & 127;
        while ((zzl & 128) == 128) {
            zzl = zzfbVar.zzl();
            i = (i << 7) | (zzl & 127);
        }
        return i;
    }

    private static int zzh(zzfb zzfbVar) {
        zzfbVar.zzG(16);
        return zzfbVar.zzf();
    }

    private static Pair zzi(zzagw zzagwVar) {
        long zzt;
        long zzf;
        zzagx zzb = zzagwVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzfb zzfbVar = zzb.zza;
        zzfbVar.zzG(8);
        int zze = zzagy.zze(zzfbVar.zzf());
        int zzo = zzfbVar.zzo();
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        for (int i = 0; i < zzo; i++) {
            if (zze == 1) {
                zzt = zzfbVar.zzu();
            } else {
                zzt = zzfbVar.zzt();
            }
            jArr[i] = zzt;
            if (zze == 1) {
                zzf = zzfbVar.zzs();
            } else {
                zzf = zzfbVar.zzf();
            }
            jArr2[i] = zzf;
            if (zzfbVar.zzz() == 1) {
                zzfbVar.zzH(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzj(zzfb zzfbVar) {
        int i;
        int i2 = 8;
        zzfbVar.zzG(8);
        int zze = zzagy.zze(zzfbVar.zzf());
        if (zze == 0) {
            i = 8;
        } else {
            i = 16;
        }
        zzfbVar.zzH(i);
        long zzt = zzfbVar.zzt();
        if (zze == 0) {
            i2 = 4;
        }
        zzfbVar.zzH(i2);
        int zzp = zzfbVar.zzp();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzp >> 10) & 31) + 96));
        sb.append((char) (((zzp >> 5) & 31) + 96));
        sb.append((char) ((zzp & 31) + 96));
        return Pair.create(Long.valueOf(zzt), sb.toString());
    }

    private static Pair zzk(zzfb zzfbVar, int i, int i2) throws zzcc {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        zzahw zzahwVar;
        Pair create;
        int i3;
        int i4;
        boolean z4;
        byte[] bArr;
        int zzc = zzfbVar.zzc();
        while (zzc - i < i2) {
            zzfbVar.zzG(zzc);
            int zzf = zzfbVar.zzf();
            boolean z5 = true;
            if (zzf > 0) {
                z = true;
            } else {
                z = false;
            }
            zzabq.zzb(z, "childAtomSize must be positive");
            if (zzfbVar.zzf() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zzf) {
                    zzfbVar.zzG(i5);
                    int zzf2 = zzfbVar.zzf();
                    int zzf3 = zzfbVar.zzf();
                    if (zzf3 == 1718775137) {
                        num2 = Integer.valueOf(zzfbVar.zzf());
                    } else if (zzf3 == 1935894637) {
                        zzfbVar.zzH(4);
                        str = zzfbVar.zzy(4, zzfsi.zzc);
                    } else if (zzf3 == 1935894633) {
                        i6 = i5;
                        i7 = zzf2;
                    }
                    i5 += zzf2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzabq.zzb(z2, "frma atom is mandatory");
                    if (i6 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zzabq.zzb(z3, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 < i7) {
                            zzfbVar.zzG(i8);
                            int zzf4 = zzfbVar.zzf();
                            if (zzfbVar.zzf() == 1952804451) {
                                int zze = zzagy.zze(zzfbVar.zzf());
                                zzfbVar.zzH(1);
                                if (zze == 0) {
                                    zzfbVar.zzH(1);
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    int zzl = zzfbVar.zzl();
                                    int i9 = (zzl & 240) >> 4;
                                    i3 = zzl & 15;
                                    i4 = i9;
                                }
                                if (zzfbVar.zzl() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int zzl2 = zzfbVar.zzl();
                                byte[] bArr2 = new byte[16];
                                zzfbVar.zzC(bArr2, 0, 16);
                                if (z4 && zzl2 == 0) {
                                    int zzl3 = zzfbVar.zzl();
                                    byte[] bArr3 = new byte[zzl3];
                                    zzfbVar.zzC(bArr3, 0, zzl3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                zzahwVar = new zzahw(z4, str, zzl2, bArr2, i4, i3, bArr);
                            } else {
                                i8 += zzf4;
                            }
                        } else {
                            num = num2;
                            zzahwVar = null;
                            break;
                        }
                    }
                    if (zzahwVar == null) {
                        z5 = false;
                    }
                    zzabq.zzb(z5, "tenc atom is mandatory");
                    int i10 = zzfk.zza;
                    create = Pair.create(num, zzahwVar);
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zzf;
        }
        return null;
    }

    private static zzby zzl(zzfb zzfbVar) {
        short zzz = zzfbVar.zzz();
        zzfbVar.zzH(2);
        String zzy = zzfbVar.zzy(zzz, zzfsi.zzc);
        int max = Math.max(zzy.lastIndexOf(43), zzy.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzfr(Float.parseFloat(zzy.substring(0, max)), Float.parseFloat(zzy.substring(max, zzy.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaha zzm(zzfb zzfbVar, int i) {
        long j;
        long j2;
        zzfbVar.zzG(i + 12);
        zzfbVar.zzH(1);
        zzg(zzfbVar);
        zzfbVar.zzH(2);
        int zzl = zzfbVar.zzl();
        if ((zzl & 128) != 0) {
            zzfbVar.zzH(2);
        }
        if ((zzl & 64) != 0) {
            zzfbVar.zzH(zzfbVar.zzl());
        }
        if ((zzl & 32) != 0) {
            zzfbVar.zzH(2);
        }
        zzfbVar.zzH(1);
        zzg(zzfbVar);
        String zzd = zzcb.zzd(zzfbVar.zzl());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzfbVar.zzH(4);
            long zzt = zzfbVar.zzt();
            long zzt2 = zzfbVar.zzt();
            zzfbVar.zzH(1);
            int zzg = zzg(zzfbVar);
            byte[] bArr = new byte[zzg];
            zzfbVar.zzC(bArr, 0, zzg);
            if (zzt2 <= 0) {
                j = -1;
            } else {
                j = zzt2;
            }
            if (zzt > 0) {
                j2 = zzt;
            } else {
                j2 = -1;
            }
            return new zzaha(zzd, bArr, j, j2);
        }
        return new zzaha(zzd, null, -1L, -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzo(com.google.android.gms.internal.ads.zzfb r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzad r33, com.google.android.gms.internal.ads.zzahc r34, int r35) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzo(com.google.android.gms.internal.ads.zzfb, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzahc, int):void");
    }

    private static boolean zzp(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        int max = Math.max(0, Math.min(4, i));
        int max2 = Math.max(0, Math.min(length - 4, i));
        if (jArr[0] > j2 || j2 >= jArr[max] || jArr[max2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }
}
