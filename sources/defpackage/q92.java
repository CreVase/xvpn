package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class q92 implements am1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3972a;

    /* renamed from: b, reason: collision with root package name */
    public final j13 f3973b;
    public final y33 c;
    public final fv0 d;
    public final u93 e;
    public volatile boolean g;
    public long i;
    public ce0 j;
    public qm2 k;
    public boolean l;
    public final /* synthetic */ u92 m;
    public final lm2 f = new lm2(0);
    public boolean h = true;

    public q92(u92 u92Var, Uri uri, zd0 zd0Var, y33 y33Var, fv0 fv0Var, u93 u93Var) {
        this.m = u92Var;
        this.f3972a = uri;
        this.f3973b = new j13(zd0Var);
        this.c = y33Var;
        this.d = fv0Var;
        this.e = u93Var;
        xl1.f5178a.getAndIncrement();
        this.j = a(0L);
    }

    @Override // defpackage.am1
    public final void E() {
        this.g = true;
    }

    public final ce0 a(long j) {
        Collections.emptyMap();
        String str = this.m.i;
        Map map = u92.M;
        Uri uri = this.f3972a;
        cp3.p(uri, "The uri must be set.");
        return new ce0(uri, 0L, 1, null, map, j, -1L, str, 6, null);
    }

    @Override // defpackage.am1
    public final void y() {
        zd0 zd0Var;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.g) {
            try {
                long j = this.f.f3157a;
                ce0 a2 = a(j);
                this.j = a2;
                long c = this.f3973b.c(a2);
                if (c != -1) {
                    c += j;
                    u92 u92Var = this.m;
                    u92Var.p.post(new p92(u92Var, 2));
                }
                long j2 = c;
                this.m.r = IcyHeaders.a(this.f3973b.k());
                j13 j13Var = this.f3973b;
                IcyHeaders icyHeaders = this.m.r;
                if (icyHeaders != null && (i = icyHeaders.f) != -1) {
                    zd0Var = new ea1(j13Var, i, this);
                    u92 u92Var2 = this.m;
                    u92Var2.getClass();
                    qm2 A = u92Var2.A(new s92(0, true));
                    this.k = A;
                    A.e(u92.N);
                } else {
                    zd0Var = j13Var;
                }
                long j3 = j;
                this.c.z(zd0Var, this.f3972a, this.f3973b.k(), j, j2, this.d);
                if (this.m.r != null) {
                    Object obj = this.c.c;
                    if (((dv0) obj) instanceof lx1) {
                        ((lx1) ((dv0) obj)).q = true;
                    }
                }
                if (this.h) {
                    y33 y33Var = this.c;
                    long j4 = this.i;
                    dv0 dv0Var = (dv0) y33Var.c;
                    dv0Var.getClass();
                    dv0Var.e(j3, j4);
                    this.h = false;
                }
                while (true) {
                    long j5 = j3;
                    while (i2 == 0 && !this.g) {
                        try {
                            this.e.c();
                            y33 y33Var2 = this.c;
                            lm2 lm2Var = this.f;
                            dv0 dv0Var2 = (dv0) y33Var2.c;
                            dv0Var2.getClass();
                            ev0 ev0Var = (ev0) y33Var2.d;
                            ev0Var.getClass();
                            i2 = dv0Var2.f(ev0Var, lm2Var);
                            j3 = this.c.u();
                            if (j3 > this.m.j + j5) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.e.e();
                    u92 u92Var3 = this.m;
                    u92Var3.p.post(u92Var3.o);
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.c.u() != -1) {
                    this.f.f3157a = this.c.u();
                }
                m20.V(this.f3973b);
            } catch (Throwable th) {
                if (i2 != 1 && this.c.u() != -1) {
                    this.f.f3157a = this.c.u();
                }
                m20.V(this.f3973b);
                throw th;
            }
        }
    }
}
