package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z23 implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public final w23 f5418a;

    /* renamed from: b, reason: collision with root package name */
    public final c02 f5419b = new c02(21);
    public final r42 c = new r42();
    public final y01 d;
    public final ArrayList e;
    public final ArrayList f;
    public fv0 g;
    public xa3 h;
    public int i;
    public int j;
    public long k;

    public z23(w23 w23Var, y01 y01Var) {
        this.f5418a = w23Var;
        x01 x01Var = new x01(y01Var);
        x01Var.k = "text/x-exoplayer-cues";
        x01Var.h = y01Var.l;
        this.d = new y01(x01Var);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.j = 0;
        this.k = -9223372036854775807L;
    }

    public final void a() {
        boolean z;
        int d;
        cp3.o(this.h);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size == arrayList2.size()) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        long j = this.k;
        if (j == -9223372036854775807L) {
            d = 0;
        } else {
            d = wi3.d(arrayList, Long.valueOf(j), true);
        }
        while (d < arrayList2.size()) {
            r42 r42Var = (r42) arrayList2.get(d);
            r42Var.G(0);
            int length = r42Var.f4098a.length;
            this.h.b(length, r42Var);
            this.h.a(((Long) arrayList.get(d)).longValue(), 1, length, 0, null);
            d++;
        }
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        boolean z;
        int i = this.j;
        if (i != 0 && i != 5) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        this.k = j2;
        if (this.j == 2) {
            this.j = 1;
        }
        if (this.j == 4) {
            this.j = 3;
        }
    }

    @Override // defpackage.dv0
    public final int f(ev0 ev0Var, lm2 lm2Var) {
        boolean z;
        boolean z2;
        int i;
        int i2 = this.j;
        boolean z3 = true;
        if (i2 != 0 && i2 != 5) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        int i3 = this.j;
        int i4 = UserVerificationMethods.USER_VERIFY_ALL;
        r42 r42Var = this.c;
        if (i3 == 1) {
            if (ev0Var.j() != -1) {
                i = cp3.q(ev0Var.j());
            } else {
                i = UserVerificationMethods.USER_VERIFY_ALL;
            }
            r42Var.D(i);
            this.i = 0;
            this.j = 2;
        }
        if (this.j == 2) {
            int length = r42Var.f4098a.length;
            int i5 = this.i;
            if (length == i5) {
                r42Var.a(i5 + UserVerificationMethods.USER_VERIFY_ALL);
            }
            byte[] bArr = r42Var.f4098a;
            int i6 = this.i;
            int read = ev0Var.read(bArr, i6, bArr.length - i6);
            if (read != -1) {
                this.i += read;
            }
            long j = ev0Var.j();
            if ((j != -1 && this.i == j) || read == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                w23 w23Var = this.f5418a;
                try {
                    a33 a33Var = (a33) w23Var.c();
                    while (a33Var == null) {
                        Thread.sleep(5L);
                        a33Var = (a33) w23Var.c();
                    }
                    a33Var.k(this.i);
                    a33Var.d.put(r42Var.f4098a, 0, this.i);
                    a33Var.d.limit(this.i);
                    w23Var.d(a33Var);
                    b33 b33Var = (b33) w23Var.b();
                    while (b33Var == null) {
                        Thread.sleep(5L);
                        b33Var = (b33) w23Var.b();
                    }
                    for (int i7 = 0; i7 < b33Var.d(); i7++) {
                        List c = b33Var.c(b33Var.b(i7));
                        this.f5419b.getClass();
                        byte[] g = c02.g(c);
                        this.e.add(Long.valueOf(b33Var.b(i7)));
                        this.f.add(new r42(g));
                    }
                    b33Var.i();
                    a();
                    this.j = 4;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                } catch (x23 e) {
                    throw u42.a("SubtitleDecoder failed.", e);
                }
            }
        }
        if (this.j == 3) {
            if (ev0Var.j() != -1) {
                i4 = cp3.q(ev0Var.j());
            }
            if (ev0Var.i(i4) != -1) {
                z3 = false;
            }
            if (z3) {
                a();
                this.j = 4;
            }
        }
        if (this.j != 4) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        this.g = fv0Var;
        this.h = fv0Var.l(0, 3);
        this.g.j();
        this.g.m(new xb1(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.h.e(this.d);
        this.j = 1;
    }

    @Override // defpackage.dv0
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.f5418a.release();
        this.j = 5;
    }
}
