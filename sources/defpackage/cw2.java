package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class cw2 extends fo {
    public final ce0 h;
    public final yd0 i;
    public final y01 j;
    public final long k = -9223372036854775807L;
    public final d5 l;
    public final boolean m;
    public final av2 n;
    public final dt1 o;
    public hb3 p;

    public cw2(String str, bt1 bt1Var, yd0 yd0Var, d5 d5Var, boolean z, Object obj) {
        this.i = yd0Var;
        this.l = d5Var;
        this.m = z;
        qs1 qs1Var = new qs1();
        qs1Var.f4048b = Uri.EMPTY;
        String uri = bt1Var.f524a.toString();
        uri.getClass();
        qs1Var.f4047a = uri;
        qs1Var.h = hb1.l(hb1.q(bt1Var));
        qs1Var.i = obj;
        dt1 a2 = qs1Var.a();
        this.o = a2;
        x01 x01Var = new x01();
        x01Var.k = (String) m20.h0(bt1Var.f525b, "text/x-unknown");
        x01Var.c = bt1Var.c;
        x01Var.d = bt1Var.d;
        x01Var.e = bt1Var.e;
        x01Var.f5099b = bt1Var.f;
        String str2 = bt1Var.g;
        x01Var.f5098a = str2 == null ? str : str2;
        this.j = new y01(x01Var);
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = bt1Var.f524a;
        cp3.p(uri2, "The uri must be set.");
        this.h = new ce0(uri2, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.n = new av2(-9223372036854775807L, true, false, a2);
    }

    @Override // defpackage.fo
    public final lt1 a(rt1 rt1Var, cf0 cf0Var, long j) {
        return new bw2(this.h, this.i, this.p, this.j, this.k, this.l, new vt1(this.c.c, 0, rt1Var), this.m);
    }

    @Override // defpackage.fo
    public final dt1 g() {
        return this.o;
    }

    @Override // defpackage.fo
    public final void i() {
    }

    @Override // defpackage.fo
    public final void k(hb3 hb3Var) {
        this.p = hb3Var;
        l(this.n);
    }

    @Override // defpackage.fo
    public final void m(lt1 lt1Var) {
        fm1 fm1Var = ((bw2) lt1Var).i;
        zl1 zl1Var = fm1Var.f2118b;
        if (zl1Var != null) {
            zl1Var.a(true);
        }
        fm1Var.f2117a.shutdown();
    }

    @Override // defpackage.fo
    public final void o() {
    }
}
