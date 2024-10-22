package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class lh {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3124a = wi3.x("OpusHead");

    public static ih a(int i, r42 r42Var) {
        long j;
        r42Var.G(i + 8 + 4);
        r42Var.H(1);
        b(r42Var);
        r42Var.H(2);
        int v = r42Var.v();
        if ((v & 128) != 0) {
            r42Var.H(2);
        }
        if ((v & 64) != 0) {
            r42Var.H(r42Var.v());
        }
        if ((v & 32) != 0) {
            r42Var.H(2);
        }
        r42Var.H(1);
        b(r42Var);
        String c = vw1.c(r42Var.v());
        if (!"audio/mpeg".equals(c) && !"audio/vnd.dts".equals(c) && !"audio/vnd.dts.hd".equals(c)) {
            r42Var.H(4);
            long w = r42Var.w();
            long w2 = r42Var.w();
            r42Var.H(1);
            int b2 = b(r42Var);
            byte[] bArr = new byte[b2];
            r42Var.d(0, bArr, b2);
            long j2 = -1;
            if (w2 > 0) {
                j = w2;
            } else {
                j = -1;
            }
            if (w > 0) {
                j2 = w;
            }
            return new ih(c, bArr, j, j2);
        }
        return new ih(c, null, -1L, -1L);
    }

    public static int b(r42 r42Var) {
        int v = r42Var.v();
        int i = v & 127;
        while ((v & 128) == 128) {
            v = r42Var.v();
            i = (i << 7) | (v & 127);
        }
        return i;
    }

    public static Pair c(int i, int i2, r42 r42Var) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        sa3 sa3Var;
        Pair create;
        int i3;
        int i4;
        boolean z4;
        byte[] bArr;
        int i5 = r42Var.f4099b;
        while (i5 - i < i2) {
            r42Var.G(i5);
            int f = r42Var.f();
            boolean z5 = true;
            if (f > 0) {
                z = true;
            } else {
                z = false;
            }
            m20.S("childAtomSize must be positive", z);
            if (r42Var.f() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < f) {
                    r42Var.G(i6);
                    int f2 = r42Var.f();
                    int f3 = r42Var.f();
                    if (f3 == 1718775137) {
                        num2 = Integer.valueOf(r42Var.f());
                    } else if (f3 == 1935894637) {
                        r42Var.H(4);
                        str = r42Var.s(4);
                    } else if (f3 == 1935894633) {
                        i7 = i6;
                        i8 = f2;
                    }
                    i6 += f2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m20.S("frma atom is mandatory", z2);
                    if (i7 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    m20.S("schi atom is mandatory", z3);
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 < i8) {
                            r42Var.G(i9);
                            int f4 = r42Var.f();
                            if (r42Var.f() == 1952804451) {
                                int f5 = (r42Var.f() >> 24) & 255;
                                r42Var.H(1);
                                if (f5 == 0) {
                                    r42Var.H(1);
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    int v = r42Var.v();
                                    int i10 = (v & 240) >> 4;
                                    i3 = v & 15;
                                    i4 = i10;
                                }
                                if (r42Var.v() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int v2 = r42Var.v();
                                byte[] bArr2 = new byte[16];
                                r42Var.d(0, bArr2, 16);
                                if (z4 && v2 == 0) {
                                    int v3 = r42Var.v();
                                    byte[] bArr3 = new byte[v3];
                                    r42Var.d(0, bArr3, v3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                sa3Var = new sa3(z4, str, v2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += f4;
                            }
                        } else {
                            num = num2;
                            sa3Var = null;
                            break;
                        }
                    }
                    if (sa3Var == null) {
                        z5 = false;
                    }
                    m20.S("tenc atom is mandatory", z5);
                    int i11 = wi3.f5017a;
                    create = Pair.create(num, sa3Var);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nd1 d(defpackage.r42 r42, int r43, int r44, java.lang.String r45, com.google.android.exoplayer2.drm.DrmInitData r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh.d(r42, int, int, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData, boolean):nd1");
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0825 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(defpackage.fh r47, defpackage.d51 r48, long r49, com.google.android.exoplayer2.drm.DrmInitData r51, boolean r52, boolean r53, defpackage.h41 r54) {
        /*
            Method dump skipped, instructions count: 2095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh.e(fh, d51, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, h41):java.util.ArrayList");
    }
}
