package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class uf0 implements pa {

    /* renamed from: a, reason: collision with root package name */
    public final f10 f4659a;

    /* renamed from: b, reason: collision with root package name */
    public final y83 f4660b;
    public final z83 c;
    public final tf0 d;
    public final SparseArray e;
    public pk0 f;
    public x52 g;
    public z43 h;

    public uf0(f10 f10Var) {
        f10Var.getClass();
        this.f4659a = f10Var;
        int i = wi3.f5017a;
        Looper myLooper = Looper.myLooper();
        this.f = new pk0(myLooper == null ? Looper.getMainLooper() : myLooper, f10Var, new qb0(7));
        y83 y83Var = new y83();
        this.f4660b = y83Var;
        this.c = new z83();
        this.d = new tf0(y83Var);
        this.e = new SparseArray();
    }

    @Override // defpackage.vn0
    public final void a(int i, rt1 rt1Var, Exception exc) {
        wa l = l(i, rt1Var);
        o(l, UserVerificationMethods.USER_VERIFY_ALL, new lf0(l, exc, 3));
    }

    @Override // defpackage.wt1
    public final void b(int i, rt1 rt1Var, et1 et1Var) {
        wa l = l(i, rt1Var);
        o(l, 1004, new ti0(10, l, et1Var));
    }

    public final wa c() {
        return g(this.d.d);
    }

    @Override // defpackage.vn0
    public final void d(int i, rt1 rt1Var, int i2) {
        wa l = l(i, rt1Var);
        o(l, 1022, new kf0(l, i2, 3));
    }

    @Override // defpackage.wt1
    public final void e(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        wa l = l(i, rt1Var);
        o(l, 1000, new sf0(l, xl1Var, et1Var, 1));
    }

    @Override // defpackage.wt1
    public final void f(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        wa l = l(i, rt1Var);
        o(l, 1002, new sf0(l, xl1Var, et1Var, 0));
    }

    public final wa g(rt1 rt1Var) {
        a93 a93Var;
        boolean z;
        this.g.getClass();
        if (rt1Var == null) {
            a93Var = null;
        } else {
            a93Var = (a93) this.d.c.get(rt1Var);
        }
        if (rt1Var != null && a93Var != null) {
            return j(a93Var, a93Var.h(rt1Var.f3536a, this.f4660b).c, rt1Var);
        }
        int g = ((bu0) this.g).g();
        a93 k = ((bu0) this.g).k();
        if (g < k.p()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            k = a93.f42a;
        }
        return j(k, g, null);
    }

    @Override // defpackage.wt1
    public final void h(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        wa l = l(i, rt1Var);
        o(l, 1001, new sf0(l, xl1Var, et1Var, 2));
    }

    @Override // defpackage.wt1
    public final void i(int i, rt1 rt1Var, final xl1 xl1Var, final et1 et1Var, final IOException iOException, final boolean z) {
        final wa l = l(i, rt1Var);
        o(l, 1003, new rl1(l, xl1Var, et1Var, iOException, z) { // from class: gf0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ et1 f2245a;

            {
                this.f2245a = et1Var;
            }

            @Override // defpackage.rl1
            public final void invoke(Object obj) {
                jt1 jt1Var = (jt1) ((xa) obj);
                jt1Var.getClass();
                jt1Var.v = this.f2245a.f1992a;
            }
        });
    }

    public final wa j(a93 a93Var, int i, rt1 rt1Var) {
        rt1 rt1Var2;
        boolean z;
        long K;
        if (a93Var.q()) {
            rt1Var2 = null;
        } else {
            rt1Var2 = rt1Var;
        }
        ((t43) this.f4659a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = false;
        if (a93Var.equals(((bu0) this.g).k()) && i == ((bu0) this.g).g()) {
            z = true;
        } else {
            z = false;
        }
        if (rt1Var2 != null && rt1Var2.a()) {
            if (z && ((bu0) this.g).e() == rt1Var2.f3537b && ((bu0) this.g).f() == rt1Var2.c) {
                z2 = true;
            }
            if (z2) {
                K = ((bu0) this.g).i();
            }
            K = 0;
        } else if (z) {
            K = ((bu0) this.g).d();
        } else {
            if (!a93Var.q()) {
                K = wi3.K(a93Var.n(i, this.c).m);
            }
            K = 0;
        }
        rt1 rt1Var3 = this.d.d;
        a93 k = ((bu0) this.g).k();
        int g = ((bu0) this.g).g();
        long i2 = ((bu0) this.g).i();
        bu0 bu0Var = (bu0) this.g;
        bu0Var.C();
        return new wa(elapsedRealtime, a93Var, i, rt1Var2, K, k, g, rt1Var3, i2, wi3.K(bu0Var.a0.q));
    }

    @Override // defpackage.vn0
    public final void k(int i, rt1 rt1Var) {
        wa l = l(i, rt1Var);
        o(l, 1025, new hf0(l, 5));
    }

    public final wa l(int i, rt1 rt1Var) {
        this.g.getClass();
        boolean z = false;
        if (rt1Var != null) {
            if (((a93) this.d.c.get(rt1Var)) != null) {
                z = true;
            }
            if (z) {
                return g(rt1Var);
            }
            return j(a93.f42a, i, rt1Var);
        }
        a93 k = ((bu0) this.g).k();
        if (i < k.p()) {
            z = true;
        }
        if (!z) {
            k = a93.f42a;
        }
        return j(k, i, null);
    }

    @Override // defpackage.vn0
    public final void m(int i, rt1 rt1Var) {
        wa l = l(i, rt1Var);
        o(l, 1026, new hf0(l, 4));
    }

    public final wa n() {
        return g(this.d.f);
    }

    public final void o(wa waVar, int i, rl1 rl1Var) {
        this.e.put(i, waVar);
        this.f.l(i, rl1Var);
    }

    @Override // defpackage.v52
    public final void onAvailableCommandsChanged(t52 t52Var) {
        wa c = c();
        o(c, 13, new ti0(11, c, t52Var));
    }

    @Override // defpackage.v52
    public final void onCues(List list) {
        wa c = c();
        o(c, 27, new ti0(14, c, list));
    }

    @Override // defpackage.v52
    public final void onDeviceInfoChanged(tk0 tk0Var) {
        wa c = c();
        o(c, 29, new ti0(6, c, tk0Var));
    }

    @Override // defpackage.v52
    public final void onDeviceVolumeChanged(int i, boolean z) {
        wa c = c();
        o(c, 30, new qf0(i, c, z));
    }

    @Override // defpackage.v52
    public final void onEvents(x52 x52Var, u52 u52Var) {
    }

    @Override // defpackage.v52
    public final void onIsLoadingChanged(boolean z) {
        wa c = c();
        o(c, 3, new qb0(1, c, z));
    }

    @Override // defpackage.v52
    public final void onIsPlayingChanged(boolean z) {
        wa c = c();
        o(c, 7, new qb0(0, c, z));
    }

    @Override // defpackage.v52
    public final void onLoadingChanged(boolean z) {
    }

    @Override // defpackage.v52
    public final void onMediaItemTransition(dt1 dt1Var, int i) {
        wa c = c();
        o(c, 1, new bi3(c, dt1Var, i));
    }

    @Override // defpackage.v52
    public final void onMediaMetadataChanged(gt1 gt1Var) {
        wa c = c();
        o(c, 14, new ti0(7, c, gt1Var));
    }

    @Override // defpackage.v52
    public final void onMetadata(Metadata metadata) {
        wa c = c();
        o(c, 28, new ti0(5, c, metadata));
    }

    @Override // defpackage.v52
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        wa c = c();
        o(c, 5, new qf0(c, z, i, 2));
    }

    @Override // defpackage.v52
    public final void onPlaybackParametersChanged(q52 q52Var) {
        wa c = c();
        o(c, 12, new ti0(13, c, q52Var));
    }

    @Override // defpackage.v52
    public final void onPlaybackStateChanged(int i) {
        wa c = c();
        o(c, 4, new kf0(c, i, 0));
    }

    @Override // defpackage.v52
    public final void onPlaybackSuppressionReasonChanged(int i) {
        wa c = c();
        o(c, 6, new kf0(c, i, 1));
    }

    @Override // defpackage.v52
    public final void onPlayerError(o52 o52Var) {
        wa c;
        nt1 nt1Var;
        jt0 jt0Var = (jt0) o52Var;
        if ((jt0Var instanceof jt0) && (nt1Var = jt0Var.m) != null) {
            c = g(new rt1(nt1Var));
        } else {
            c = c();
        }
        o(c, 10, new of0(c, jt0Var, 1));
    }

    @Override // defpackage.v52
    public final void onPlayerErrorChanged(o52 o52Var) {
        wa c;
        nt1 nt1Var;
        jt0 jt0Var = (jt0) o52Var;
        if ((jt0Var instanceof jt0) && (nt1Var = jt0Var.m) != null) {
            c = g(new rt1(nt1Var));
        } else {
            c = c();
        }
        o(c, 10, new of0(c, jt0Var, 0));
    }

    @Override // defpackage.v52
    public final void onPlayerStateChanged(boolean z, int i) {
        wa c = c();
        o(c, -1, new qf0(c, z, i, 1));
    }

    @Override // defpackage.v52
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // defpackage.v52
    public final void onRenderedFirstFrame() {
    }

    @Override // defpackage.v52
    public final void onSeekProcessed() {
        wa c = c();
        o(c, -1, new hf0(c, 0));
    }

    @Override // defpackage.v52
    public final void onSkipSilenceEnabledChanged(boolean z) {
        wa n = n();
        o(n, 23, new qb0(2, n, z));
    }

    @Override // defpackage.v52
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final wa n = n();
        o(n, 24, new rl1(n, i, i2) { // from class: ff0
            @Override // defpackage.rl1
            public final void invoke(Object obj) {
                ((xa) obj).getClass();
            }
        });
    }

    @Override // defpackage.v52
    public final void onTimelineChanged(a93 a93Var, int i) {
        x52 x52Var = this.g;
        x52Var.getClass();
        tf0 tf0Var = this.d;
        tf0Var.d = tf0.b(x52Var, tf0Var.f4492b, tf0Var.e, tf0Var.f4491a);
        tf0Var.d(((bu0) x52Var).k());
        wa c = c();
        o(c, 0, new kf0(c, i, 2));
    }

    @Override // defpackage.v52
    public final void onTracksChanged(gb3 gb3Var) {
        wa c = c();
        o(c, 2, new ti0(9, c, gb3Var));
    }

    @Override // defpackage.v52
    public final void onVideoSizeChanged(lk3 lk3Var) {
        wa n = n();
        o(n, 25, new ti0(15, n, lk3Var));
    }

    @Override // defpackage.v52
    public final void onVolumeChanged(float f) {
        wa n = n();
        o(n, 22, new df0(n, f));
    }

    @Override // defpackage.vn0
    public final void p(int i, rt1 rt1Var) {
        wa l = l(i, rt1Var);
        o(l, 1023, new hf0(l, 3));
    }

    @Override // defpackage.vn0
    public final void q(int i, rt1 rt1Var) {
        wa l = l(i, rt1Var);
        o(l, 1027, new hf0(l, 1));
    }

    @Override // defpackage.vn0
    public final /* synthetic */ void r() {
    }

    public final void s(x52 x52Var, Looper looper) {
        boolean z;
        if (this.g != null && !this.d.f4492b.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        cp3.m(z);
        x52Var.getClass();
        this.g = x52Var;
        this.h = ((t43) this.f4659a).a(looper, null);
        pk0 pk0Var = this.f;
        ti0 ti0Var = new ti0(8, this, x52Var);
        this.f = new pk0((CopyOnWriteArraySet) pk0Var.f, looper, (f10) pk0Var.c, ti0Var);
    }

    @Override // defpackage.v52
    public final void onPositionDiscontinuity(final w52 w52Var, final w52 w52Var2, final int i) {
        x52 x52Var = this.g;
        x52Var.getClass();
        tf0 tf0Var = this.d;
        tf0Var.d = tf0.b(x52Var, tf0Var.f4492b, tf0Var.e, tf0Var.f4491a);
        final wa c = c();
        o(c, 11, new rl1(i, w52Var, w52Var2, c) { // from class: if0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f2581a;

            @Override // defpackage.rl1
            public final void invoke(Object obj) {
                xa xaVar = (xa) obj;
                xaVar.getClass();
                jt1 jt1Var = (jt1) xaVar;
                int i2 = this.f2581a;
                if (i2 == 1) {
                    jt1Var.u = true;
                }
                jt1Var.k = i2;
            }
        });
    }

    @Override // defpackage.v52
    public final void onCues(ic0 ic0Var) {
        wa c = c();
        o(c, 27, new ti0(12, c, ic0Var));
    }
}
