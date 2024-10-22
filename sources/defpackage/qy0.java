package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qy0 implements dv0 {
    public fv0 e;
    public xa3 f;
    public Metadata h;
    public vy0 i;
    public int j;
    public int k;
    public py0 l;
    public int m;
    public long n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4072a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final r42 f4073b = new r42(new byte[32768], 0);
    public final boolean c = false;
    public final lm2 d = new lm2(0);
    public int g = 0;

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        Metadata I = new ja1(22).I(ev0Var, ia1.x);
        if (I != null) {
            int length = I.f1467a.length;
        }
        r42 r42Var = new r42(4);
        ((ih0) ev0Var).e(r42Var.f4098a, 0, 4, false);
        if (r42Var.w() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.g = 0;
        } else {
            py0 py0Var = this.l;
            if (py0Var != null) {
                py0Var.c(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.n = j3;
        this.m = 0;
        this.f4073b.D(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
    @Override // defpackage.dv0
    public final int f(ev0 ev0Var, lm2 lm2Var) {
        ef0 ef0Var;
        boolean z;
        vy0 vy0Var;
        Metadata metadata;
        lo2 ty0Var;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.g;
        Object obj = null;
        boolean z5 = true;
        ?? r5 = 0;
        if (i != 0) {
            int i2 = 2;
            byte[] bArr = this.f4072a;
            if (i != 1) {
                int i3 = 3;
                int i4 = 4;
                if (i != 2) {
                    int i5 = 7;
                    if (i != 3) {
                        long j2 = 0;
                        if (i != 4) {
                            if (i == 5) {
                                this.f.getClass();
                                this.i.getClass();
                                py0 py0Var = this.l;
                                if (py0Var != null) {
                                    if (py0Var.c != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        return py0Var.a(ev0Var, lm2Var);
                                    }
                                }
                                if (this.n == -1) {
                                    vy0 vy0Var2 = this.i;
                                    ev0Var.l();
                                    ev0Var.g(1);
                                    byte[] bArr2 = new byte[1];
                                    ev0Var.b(0, bArr2, 1);
                                    if ((bArr2[0] & 1) == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    ev0Var.g(2);
                                    if (!z3) {
                                        i5 = 6;
                                    }
                                    r42 r42Var = new r42(i5);
                                    byte[] bArr3 = r42Var.f4098a;
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        int h = ev0Var.h(0 + i6, bArr3, i5 - i6);
                                        if (h == -1) {
                                            break;
                                        }
                                        i6 += h;
                                    }
                                    r42Var.F(i6);
                                    ev0Var.l();
                                    try {
                                        j2 = r42Var.B();
                                        if (!z3) {
                                            j2 *= vy0Var2.f4913b;
                                        }
                                    } catch (NumberFormatException unused) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        this.n = j2;
                                        return 0;
                                    }
                                    throw u42.a(null, null);
                                }
                                r42 r42Var2 = this.f4073b;
                                int i7 = r42Var2.c;
                                if (i7 < 32768) {
                                    int read = ev0Var.read(r42Var2.f4098a, i7, 32768 - i7);
                                    if (read != -1) {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        r42Var2.F(i7 + read);
                                    } else if (r42Var2.c - r42Var2.f4099b == 0) {
                                        long j3 = this.n * 1000000;
                                        vy0 vy0Var3 = this.i;
                                        int i8 = wi3.f5017a;
                                        this.f.a(j3 / vy0Var3.e, 1, this.m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z5 = false;
                                }
                                int i9 = r42Var2.f4099b;
                                int i10 = this.m;
                                int i11 = this.j;
                                if (i10 < i11) {
                                    r42Var2.H(Math.min(i11 - i10, r42Var2.c - i9));
                                }
                                this.i.getClass();
                                int i12 = r42Var2.f4099b;
                                while (true) {
                                    int i13 = r42Var2.c - 16;
                                    lm2 lm2Var2 = this.d;
                                    if (i12 <= i13) {
                                        r42Var2.G(i12);
                                        if (ya0.K(r42Var2, this.i, this.k, lm2Var2)) {
                                            r42Var2.G(i12);
                                            j = lm2Var2.f3157a;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        if (z5) {
                                            while (true) {
                                                int i14 = r42Var2.c;
                                                if (i12 <= i14 - this.j) {
                                                    r42Var2.G(i12);
                                                    try {
                                                        z2 = ya0.K(r42Var2, this.i, this.k, lm2Var2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z2 = false;
                                                    }
                                                    if (r42Var2.f4099b > r42Var2.c) {
                                                        z2 = false;
                                                    }
                                                    if (z2) {
                                                        r42Var2.G(i12);
                                                        j = lm2Var2.f3157a;
                                                        break;
                                                    }
                                                    i12++;
                                                } else {
                                                    r42Var2.G(i14);
                                                    break;
                                                }
                                            }
                                        } else {
                                            r42Var2.G(i12);
                                        }
                                        j = -1;
                                    }
                                }
                                int i15 = r42Var2.f4099b - i9;
                                r42Var2.G(i9);
                                this.f.b(i15, r42Var2);
                                int i16 = this.m + i15;
                                this.m = i16;
                                if (j != -1) {
                                    long j4 = this.n * 1000000;
                                    vy0 vy0Var4 = this.i;
                                    int i17 = wi3.f5017a;
                                    this.f.a(j4 / vy0Var4.e, 1, i16, 0, null);
                                    this.m = 0;
                                    this.n = j;
                                }
                                int i18 = r42Var2.c;
                                int i19 = r42Var2.f4099b;
                                int i20 = i18 - i19;
                                if (i20 >= 16) {
                                    return 0;
                                }
                                byte[] bArr4 = r42Var2.f4098a;
                                System.arraycopy(bArr4, i19, bArr4, 0, i20);
                                r42Var2.G(0);
                                r42Var2.F(i20);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ev0Var.l();
                        r42 r42Var3 = new r42(2);
                        ev0Var.b(0, r42Var3.f4098a, 2);
                        int A = r42Var3.A();
                        if ((A >> 2) == 16382) {
                            ev0Var.l();
                            this.k = A;
                            fv0 fv0Var = this.e;
                            int i21 = wi3.f5017a;
                            long position = ev0Var.getPosition();
                            long j5 = ev0Var.j();
                            this.i.getClass();
                            vy0 vy0Var5 = this.i;
                            if (vy0Var5.k != null) {
                                ty0Var = new ty0(vy0Var5, position, 0);
                            } else if (j5 != -1 && vy0Var5.j > 0) {
                                py0 py0Var2 = new py0(vy0Var5, this.k, position, j5);
                                this.l = py0Var2;
                                ty0Var = py0Var2.f1817a;
                            } else {
                                ty0Var = new ty0(vy0Var5.b());
                            }
                            fv0Var.m(ty0Var);
                            this.g = 5;
                            return 0;
                        }
                        ev0Var.l();
                        throw u42.a("First frame does not start with sync code.", null);
                    }
                    vy0 vy0Var6 = this.i;
                    boolean z6 = false;
                    while (!z6) {
                        ev0Var.l();
                        nn3 nn3Var = new nn3(new byte[i4], i2, obj);
                        ev0Var.b(r5, nn3Var.d, i4);
                        boolean h2 = nn3Var.h();
                        int i22 = nn3Var.i(i5);
                        int i23 = nn3Var.i(24) + i4;
                        if (i22 == 0) {
                            byte[] bArr5 = new byte[38];
                            ev0Var.readFully(bArr5, r5, 38);
                            vy0Var6 = new vy0(bArr5, i4);
                            z = h2;
                        } else if (vy0Var6 != null) {
                            if (i22 == i3) {
                                r42 r42Var4 = new r42(i23);
                                ev0Var.readFully(r42Var4.f4098a, r5, i23);
                                z = h2;
                                vy0Var6 = new vy0(vy0Var6.f4912a, vy0Var6.f4913b, vy0Var6.c, vy0Var6.d, vy0Var6.e, vy0Var6.g, vy0Var6.h, vy0Var6.j, pe0.P(r42Var4), vy0Var6.l);
                            } else {
                                z = h2;
                                Metadata metadata2 = vy0Var6.l;
                                if (i22 == i4) {
                                    r42 r42Var5 = new r42(i23);
                                    ev0Var.readFully(r42Var5.f4098a, r5, i23);
                                    r42Var5.H(i4);
                                    Metadata a2 = sn3.a(Arrays.asList((String[]) sn3.b(r42Var5, r5, r5).d));
                                    if (metadata2 == null) {
                                        metadata = a2;
                                    } else {
                                        if (a2 != null) {
                                            metadata2 = metadata2.a(a2.f1467a);
                                        }
                                        metadata = metadata2;
                                    }
                                    vy0Var = new vy0(vy0Var6.f4912a, vy0Var6.f4913b, vy0Var6.c, vy0Var6.d, vy0Var6.e, vy0Var6.g, vy0Var6.h, vy0Var6.j, vy0Var6.k, metadata);
                                } else if (i22 == 6) {
                                    r42 r42Var6 = new r42(i23);
                                    ev0Var.readFully(r42Var6.f4098a, 0, i23);
                                    r42Var6.H(i4);
                                    Metadata metadata3 = new Metadata(hb1.q(PictureFrame.a(r42Var6)));
                                    if (metadata2 != null) {
                                        metadata3 = metadata2.a(metadata3.f1467a);
                                    }
                                    vy0Var = new vy0(vy0Var6.f4912a, vy0Var6.f4913b, vy0Var6.c, vy0Var6.d, vy0Var6.e, vy0Var6.g, vy0Var6.h, vy0Var6.j, vy0Var6.k, metadata3);
                                } else {
                                    ev0Var.m(i23);
                                }
                                vy0Var6 = vy0Var;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i24 = wi3.f5017a;
                        this.i = vy0Var6;
                        z6 = z;
                        obj = null;
                        r5 = 0;
                        i2 = 2;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                    }
                    this.i.getClass();
                    this.j = Math.max(this.i.c, 6);
                    xa3 xa3Var = this.f;
                    int i25 = wi3.f5017a;
                    xa3Var.e(this.i.c(bArr, this.h));
                    this.g = 4;
                    return 0;
                }
                r42 r42Var7 = new r42(4);
                ev0Var.readFully(r42Var7.f4098a, 0, 4);
                if (r42Var7.w() == 1716281667) {
                    this.g = 3;
                    return 0;
                }
                throw u42.a("Failed to read FLAC stream marker.", null);
            }
            ev0Var.b(0, bArr, bArr.length);
            ev0Var.l();
            this.g = 2;
            return 0;
        }
        boolean z7 = !this.c;
        ev0Var.l();
        long f = ev0Var.f();
        if (z7) {
            ef0Var = null;
        } else {
            ef0Var = ia1.x;
        }
        Metadata I = new ja1(22).I(ev0Var, ef0Var);
        if (I == null || I.f1467a.length == 0) {
            I = null;
        }
        ev0Var.m((int) (ev0Var.f() - f));
        this.h = I;
        this.g = 1;
        return 0;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.e = fv0Var;
        this.f = fv0Var.l(0, 1);
        fv0Var.j();
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
