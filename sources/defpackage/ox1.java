package defpackage;

import com.google.protobuf.v;

/* loaded from: classes.dex */
public final class ox1 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final r42 f3747a;

    /* renamed from: b, reason: collision with root package name */
    public final d2 f3748b;
    public final String c;
    public xa3 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public ox1(String str) {
        r42 r42Var = new r42(4);
        this.f3747a = r42Var;
        r42Var.f4098a[0] = -1;
        this.f3748b = new d2();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.qp0
    public final void a(r42 r42Var) {
        boolean z;
        boolean z2;
        cp3.o(this.d);
        while (true) {
            int i = r42Var.c;
            int i2 = r42Var.f4099b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f;
                r42 r42Var2 = this.f3747a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            int min = Math.min(i3, this.k - this.g);
                            this.d.b(min, r42Var);
                            int i5 = this.g + min;
                            this.g = i5;
                            int i6 = this.k;
                            if (i5 >= i6) {
                                long j = this.l;
                                if (j != -9223372036854775807L) {
                                    this.d.a(j, 1, i6, 0, null);
                                    this.l += this.j;
                                }
                                this.g = 0;
                                this.f = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i3, 4 - this.g);
                        r42Var.d(this.g, r42Var2.f4098a, min2);
                        int i7 = this.g + min2;
                        this.g = i7;
                        if (i7 >= 4) {
                            r42Var2.G(0);
                            int f = r42Var2.f();
                            d2 d2Var = this.f3748b;
                            if (!d2Var.a(f)) {
                                this.g = 0;
                                this.f = 1;
                            } else {
                                this.k = d2Var.c;
                                if (!this.h) {
                                    int i8 = d2Var.d;
                                    this.j = (d2Var.g * 1000000) / i8;
                                    x01 x01Var = new x01();
                                    x01Var.f5098a = this.e;
                                    x01Var.k = (String) d2Var.f1719b;
                                    x01Var.l = v.DEFAULT_BUFFER_SIZE;
                                    x01Var.x = d2Var.e;
                                    x01Var.y = i8;
                                    x01Var.c = this.c;
                                    this.d.e(new y01(x01Var));
                                    this.h = true;
                                }
                                r42Var2.G(0);
                                this.d.b(4, r42Var2);
                                this.f = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = r42Var.f4098a;
                    while (true) {
                        if (i2 < i) {
                            byte b2 = bArr[i2];
                            if ((b2 & 255) == 255) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.i && (b2 & 224) == 224) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.i = z;
                            if (z2) {
                                r42Var.G(i2 + 1);
                                this.i = false;
                                r42Var2.f4098a[1] = bArr[i2];
                                this.g = 2;
                                this.f = 1;
                                break;
                            }
                            i2++;
                        } else {
                            r42Var.G(i);
                            break;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.qp0
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.e = qc3Var.e;
        qc3Var.b();
        this.d = fv0Var.l(qc3Var.d, 1);
    }
}
