package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pn3 extends r13 {
    public on3 n;
    public int o;
    public boolean p;
    public rn3 q;
    public f30 r;

    @Override // defpackage.r13
    public final void a(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        rn3 rn3Var = this.q;
        if (rn3Var != null) {
            i = rn3Var.e;
        }
        this.o = i;
    }

    @Override // defpackage.r13
    public final long b(r42 r42Var) {
        int i;
        int i2 = 0;
        byte b2 = r42Var.f4098a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        on3 on3Var = this.n;
        cp3.o(on3Var);
        boolean z = on3Var.d[(b2 >> 1) & (255 >>> (8 - on3Var.e))].f4027a;
        rn3 rn3Var = on3Var.f3702a;
        if (!z) {
            i = rn3Var.e;
        } else {
            i = rn3Var.f;
        }
        if (this.p) {
            i2 = (this.o + i) / 4;
        }
        long j = i2;
        byte[] bArr = r42Var.f4098a;
        int length = bArr.length;
        int i3 = r42Var.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            r42Var.E(copyOf.length, copyOf);
        } else {
            r42Var.F(i3);
        }
        byte[] bArr2 = r42Var.f4098a;
        int i4 = r42Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Exception] */
    @Override // defpackage.r13
    public final boolean c(r42 r42Var, long j, uy0 uy0Var) {
        int i;
        int i2;
        rn3 rn3Var;
        int i3;
        rn3 rn3Var2;
        byte[] bArr;
        rn3 rn3Var3;
        int i4;
        int i5;
        if (this.n != null) {
            ((y01) uy0Var.f4757b).getClass();
            return false;
        }
        rn3 rn3Var4 = this.q;
        int i6 = 4;
        on3 on3Var = null;
        if (rn3Var4 == null) {
            sn3.c(1, r42Var, false);
            r42Var.m();
            int v = r42Var.v();
            int m = r42Var.m();
            int i7 = r42Var.i();
            if (i7 <= 0) {
                i4 = -1;
            } else {
                i4 = i7;
            }
            int i8 = r42Var.i();
            if (i8 <= 0) {
                i5 = -1;
            } else {
                i5 = i8;
            }
            r42Var.i();
            int v2 = r42Var.v();
            int pow = (int) Math.pow(2.0d, v2 & 15);
            int pow2 = (int) Math.pow(2.0d, (v2 & 240) >> 4);
            r42Var.v();
            this.q = new rn3(v, m, i4, i5, pow, pow2, Arrays.copyOf(r42Var.f4098a, r42Var.c));
        } else {
            f30 f30Var = this.r;
            if (f30Var == null) {
                this.r = sn3.b(r42Var, true, true);
            } else {
                int i9 = r42Var.c;
                byte[] bArr2 = new byte[i9];
                System.arraycopy(r42Var.f4098a, 0, bArr2, 0, i9);
                int i10 = 5;
                sn3.c(5, r42Var, false);
                int v3 = r42Var.v() + 1;
                nn3 nn3Var = new nn3(r42Var.f4098a, 0, (Object) null);
                nn3Var.r(r42Var.f4099b * 8);
                int i11 = 0;
                while (i11 < v3) {
                    if (nn3Var.i(24) == 5653314) {
                        int i12 = nn3Var.i(16);
                        int i13 = nn3Var.i(24);
                        long[] jArr = new long[i13];
                        long j2 = 0;
                        if (!nn3Var.h()) {
                            boolean h = nn3Var.h();
                            int i14 = 0;
                            while (i14 < i13) {
                                if (h) {
                                    if (nn3Var.h()) {
                                        rn3Var3 = rn3Var4;
                                        jArr[i14] = nn3Var.i(i10) + 1;
                                    } else {
                                        rn3Var3 = rn3Var4;
                                        jArr[i14] = 0;
                                    }
                                } else {
                                    rn3Var3 = rn3Var4;
                                    jArr[i14] = nn3Var.i(i10) + 1;
                                }
                                i14++;
                                rn3Var4 = rn3Var3;
                                i6 = 4;
                            }
                            rn3Var2 = rn3Var4;
                            bArr = bArr2;
                        } else {
                            rn3Var2 = rn3Var4;
                            int i15 = nn3Var.i(i10) + 1;
                            int i16 = 0;
                            while (i16 < i13) {
                                int i17 = 0;
                                for (int i18 = i13 - i16; i18 > 0; i18 >>>= 1) {
                                    i17++;
                                }
                                int i19 = nn3Var.i(i17);
                                int i20 = 0;
                                while (i20 < i19 && i16 < i13) {
                                    jArr[i16] = i15;
                                    i16++;
                                    i20++;
                                    bArr2 = bArr2;
                                }
                                i15++;
                                bArr2 = bArr2;
                            }
                            bArr = bArr2;
                            i6 = 4;
                        }
                        int i21 = nn3Var.i(i6);
                        if (i21 <= 2) {
                            if (i21 == 1 || i21 == 2) {
                                nn3Var.r(32);
                                nn3Var.r(32);
                                int i22 = nn3Var.i(i6) + 1;
                                nn3Var.r(1);
                                if (i21 == 1) {
                                    if (i12 != 0) {
                                        j2 = (long) Math.floor(Math.pow(i13, 1.0d / i12));
                                    }
                                } else {
                                    j2 = i13 * i12;
                                }
                                nn3Var.r((int) (i22 * j2));
                            }
                            i11++;
                            bArr2 = bArr;
                            rn3Var4 = rn3Var2;
                            i6 = 4;
                            on3Var = null;
                            i10 = 5;
                        } else {
                            throw u42.a("lookup type greater than 2 not decodable: " + i21, null);
                        }
                    } else {
                        throw u42.a("expected code book to start with [0x56, 0x43, 0x42] at " + nn3Var.g(), on3Var);
                    }
                }
                rn3 rn3Var5 = rn3Var4;
                byte[] bArr3 = bArr2;
                int i23 = 6;
                int i24 = nn3Var.i(6) + 1;
                for (int i25 = 0; i25 < i24; i25++) {
                    if (nn3Var.i(16) != 0) {
                        throw u42.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i26 = 1;
                int i27 = nn3Var.i(6) + 1;
                int i28 = 0;
                while (true) {
                    int i29 = 3;
                    if (i28 < i27) {
                        int i30 = nn3Var.i(16);
                        if (i30 != 0) {
                            if (i30 == i26) {
                                int i31 = nn3Var.i(5);
                                int[] iArr = new int[i31];
                                int i32 = -1;
                                for (int i33 = 0; i33 < i31; i33++) {
                                    int i34 = nn3Var.i(4);
                                    iArr[i33] = i34;
                                    if (i34 > i32) {
                                        i32 = i34;
                                    }
                                }
                                int i35 = i32 + 1;
                                int[] iArr2 = new int[i35];
                                int i36 = 0;
                                while (i36 < i35) {
                                    iArr2[i36] = nn3Var.i(i29) + 1;
                                    int i37 = nn3Var.i(2);
                                    int i38 = 8;
                                    if (i37 > 0) {
                                        nn3Var.r(8);
                                    }
                                    int i39 = 0;
                                    for (int i40 = 1; i39 < (i40 << i37); i40 = 1) {
                                        nn3Var.r(i38);
                                        i39++;
                                        i38 = 8;
                                    }
                                    i36++;
                                    i29 = 3;
                                }
                                nn3Var.r(2);
                                int i41 = nn3Var.i(4);
                                int i42 = 0;
                                int i43 = 0;
                                for (int i44 = 0; i44 < i31; i44++) {
                                    i42 += iArr2[iArr[i44]];
                                    while (i43 < i42) {
                                        nn3Var.r(i41);
                                        i43++;
                                    }
                                }
                            } else {
                                throw u42.a("floor type greater than 1 not decodable: " + i30, null);
                            }
                        } else {
                            int i45 = 8;
                            nn3Var.r(8);
                            nn3Var.r(16);
                            nn3Var.r(16);
                            nn3Var.r(6);
                            nn3Var.r(8);
                            int i46 = nn3Var.i(4) + 1;
                            int i47 = 0;
                            while (i47 < i46) {
                                nn3Var.r(i45);
                                i47++;
                                i45 = 8;
                            }
                        }
                        i28++;
                        i23 = 6;
                        i26 = 1;
                    } else {
                        int i48 = 1;
                        int i49 = nn3Var.i(i23) + 1;
                        int i50 = 0;
                        while (i50 < i49) {
                            if (nn3Var.i(16) <= 2) {
                                nn3Var.r(24);
                                nn3Var.r(24);
                                nn3Var.r(24);
                                int i51 = nn3Var.i(i23) + i48;
                                int i52 = 8;
                                nn3Var.r(8);
                                int[] iArr3 = new int[i51];
                                for (int i53 = 0; i53 < i51; i53++) {
                                    int i54 = nn3Var.i(3);
                                    if (nn3Var.h()) {
                                        i3 = nn3Var.i(5);
                                    } else {
                                        i3 = 0;
                                    }
                                    iArr3[i53] = (i3 * 8) + i54;
                                }
                                int i55 = 0;
                                while (i55 < i51) {
                                    int i56 = 0;
                                    while (i56 < i52) {
                                        if ((iArr3[i55] & (1 << i56)) != 0) {
                                            nn3Var.r(i52);
                                        }
                                        i56++;
                                        i52 = 8;
                                    }
                                    i55++;
                                    i52 = 8;
                                }
                                i50++;
                                i23 = 6;
                                i48 = 1;
                            } else {
                                throw u42.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int i57 = nn3Var.i(i23) + 1;
                        int i58 = 0;
                        while (i58 < i57) {
                            int i59 = nn3Var.i(16);
                            if (i59 != 0) {
                                sn1.c("VorbisUtil", "mapping type other than 0 not supported: " + i59);
                                rn3Var = rn3Var5;
                            } else {
                                if (nn3Var.h()) {
                                    i = 1;
                                    i2 = nn3Var.i(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                boolean h2 = nn3Var.h();
                                rn3Var = rn3Var5;
                                int i60 = rn3Var.f4186a;
                                if (h2) {
                                    int i61 = nn3Var.i(8) + i;
                                    for (int i62 = 0; i62 < i61; i62++) {
                                        int i63 = i60 - 1;
                                        int i64 = 0;
                                        for (int i65 = i63; i65 > 0; i65 >>>= 1) {
                                            i64++;
                                        }
                                        nn3Var.r(i64);
                                        int i66 = 0;
                                        while (i63 > 0) {
                                            i66++;
                                            i63 >>>= 1;
                                        }
                                        nn3Var.r(i66);
                                    }
                                }
                                if (nn3Var.i(2) == 0) {
                                    if (i2 > 1) {
                                        for (int i67 = 0; i67 < i60; i67++) {
                                            nn3Var.r(4);
                                        }
                                    }
                                    for (int i68 = 0; i68 < i2; i68++) {
                                        nn3Var.r(8);
                                        nn3Var.r(8);
                                        nn3Var.r(8);
                                    }
                                } else {
                                    throw u42.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                            i58++;
                            rn3Var5 = rn3Var;
                        }
                        rn3 rn3Var6 = rn3Var5;
                        int i69 = nn3Var.i(6) + 1;
                        qn3[] qn3VarArr = new qn3[i69];
                        for (int i70 = 0; i70 < i69; i70++) {
                            boolean h3 = nn3Var.h();
                            nn3Var.i(16);
                            nn3Var.i(16);
                            nn3Var.i(8);
                            qn3VarArr[i70] = new qn3(h3);
                        }
                        if (nn3Var.h()) {
                            int i71 = 0;
                            for (int i72 = i69 - 1; i72 > 0; i72 >>>= 1) {
                                i71++;
                            }
                            on3Var = new on3(rn3Var6, f30Var, bArr3, qn3VarArr, i71);
                        } else {
                            throw u42.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        this.n = on3Var;
        if (on3Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        rn3 rn3Var7 = on3Var.f3702a;
        arrayList.add(rn3Var7.g);
        arrayList.add(on3Var.c);
        Metadata a2 = sn3.a(hb1.m((String[]) on3Var.f3703b.d));
        x01 x01Var = new x01();
        x01Var.k = "audio/vorbis";
        x01Var.f = rn3Var7.d;
        x01Var.g = rn3Var7.c;
        x01Var.x = rn3Var7.f4186a;
        x01Var.y = rn3Var7.f4187b;
        x01Var.m = arrayList;
        x01Var.i = a2;
        uy0Var.f4757b = new y01(x01Var);
        return true;
    }

    @Override // defpackage.r13
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
