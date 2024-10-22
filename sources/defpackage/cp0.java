package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class cp0 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1644a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1645b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public cp0(List list) {
        this.f1644a = 0;
        this.f = list;
        this.g = new xa3[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.qp0
    public final void a(r42 r42Var) {
        boolean z;
        boolean z2;
        switch (this.f1644a) {
            case 0:
                if (this.f1645b) {
                    if (this.d == 2) {
                        if (r42Var.c - r42Var.f4099b == 0) {
                            z2 = false;
                        } else {
                            if (r42Var.v() != 32) {
                                this.f1645b = false;
                            }
                            this.d--;
                            z2 = this.f1645b;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (r42Var.c - r42Var.f4099b == 0) {
                            z = false;
                        } else {
                            if (r42Var.v() != 0) {
                                this.f1645b = false;
                            }
                            this.d--;
                            z = this.f1645b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = r42Var.f4099b;
                    int i2 = r42Var.c - i;
                    for (xa3 xa3Var : (xa3[]) this.g) {
                        r42Var.G(i);
                        xa3Var.b(i2, r42Var);
                    }
                    this.e += i2;
                    return;
                }
                return;
            default:
                cp3.o((xa3) this.g);
                if (this.f1645b) {
                    int i3 = r42Var.c - r42Var.f4099b;
                    int i4 = this.e;
                    if (i4 < 10) {
                        int min = Math.min(i3, 10 - i4);
                        byte[] bArr = r42Var.f4098a;
                        int i5 = r42Var.f4099b;
                        r42 r42Var2 = (r42) this.f;
                        System.arraycopy(bArr, i5, r42Var2.f4098a, this.e, min);
                        if (this.e + min == 10) {
                            r42Var2.G(0);
                            if (73 == r42Var2.v() && 68 == r42Var2.v() && 51 == r42Var2.v()) {
                                r42Var2.H(3);
                                this.d = r42Var2.u() + 10;
                            } else {
                                sn1.f();
                                this.f1645b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(i3, this.d - this.e);
                    ((xa3) this.g).b(min2, r42Var);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.qp0
    public final void c() {
        switch (this.f1644a) {
            case 0:
                this.f1645b = false;
                this.c = -9223372036854775807L;
                return;
            default:
                this.f1645b = false;
                this.c = -9223372036854775807L;
                return;
        }
    }

    @Override // defpackage.qp0
    public final void d() {
        int i;
        switch (this.f1644a) {
            case 0:
                if (this.f1645b) {
                    if (this.c != -9223372036854775807L) {
                        for (xa3 xa3Var : (xa3[]) this.g) {
                            xa3Var.a(this.c, 1, this.e, 0, null);
                        }
                    }
                    this.f1645b = false;
                    return;
                }
                return;
            default:
                cp3.o((xa3) this.g);
                if (this.f1645b && (i = this.d) != 0 && this.e == i) {
                    long j = this.c;
                    if (j != -9223372036854775807L) {
                        ((xa3) this.g).a(j, 1, i, 0, null);
                    }
                    this.f1645b = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        switch (this.f1644a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f1645b = true;
                    if (j != -9223372036854775807L) {
                        this.c = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.f1645b = true;
                    if (j != -9223372036854775807L) {
                        this.c = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        switch (this.f1644a) {
            case 0:
                for (int i = 0; i < ((xa3[]) this.g).length; i++) {
                    pc3 pc3Var = (pc3) ((List) this.f).get(i);
                    qc3Var.a();
                    qc3Var.b();
                    xa3 l = fv0Var.l(qc3Var.d, 3);
                    x01 x01Var = new x01();
                    qc3Var.b();
                    x01Var.f5098a = qc3Var.e;
                    x01Var.k = "application/dvbsubs";
                    x01Var.m = Collections.singletonList(pc3Var.f3824b);
                    x01Var.c = pc3Var.f3823a;
                    l.e(new y01(x01Var));
                    ((xa3[]) this.g)[i] = l;
                }
                return;
            default:
                qc3Var.a();
                qc3Var.b();
                xa3 l2 = fv0Var.l(qc3Var.d, 5);
                this.g = l2;
                x01 x01Var2 = new x01();
                qc3Var.b();
                x01Var2.f5098a = qc3Var.e;
                x01Var2.k = "application/id3";
                l2.e(new y01(x01Var2));
                return;
        }
    }

    public cp0() {
        this.f1644a = 1;
        this.f = new r42(10);
        this.c = -9223372036854775807L;
    }
}
