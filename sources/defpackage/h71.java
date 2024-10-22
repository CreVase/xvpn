package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class h71 extends yo1 implements vj0 {
    private volatile h71 _immediate;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2377b;
    public final String c;
    public final boolean d;
    public final h71 e;

    public h71(Handler handler, String str, boolean z) {
        this.f2377b = handler;
        this.c = str;
        this.d = z;
        this._immediate = z ? this : null;
        h71 h71Var = this._immediate;
        if (h71Var == null) {
            h71Var = new h71(handler, str, true);
            this._immediate = h71Var;
        }
        this.e = h71Var;
    }

    @Override // defpackage.v90
    public final void K(t90 t90Var, Runnable runnable) {
        if (!this.f2377b.post(runnable)) {
            M(t90Var, runnable);
        }
    }

    @Override // defpackage.v90
    public final boolean L() {
        if (this.d && m20.L(Looper.myLooper(), this.f2377b.getLooper())) {
            return false;
        }
        return true;
    }

    public final void M(t90 t90Var, Runnable runnable) {
        zf3.h(t90Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        vl0.c.K(t90Var, runnable);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h71) && ((h71) obj).f2377b == this.f2377b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2377b);
    }

    @Override // defpackage.v90
    public final String toString() {
        h71 h71Var;
        String str;
        qi0 qi0Var = vl0.f4854a;
        yo1 yo1Var = zo1.f5522a;
        if (this == yo1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                h71Var = ((h71) yo1Var).e;
            } catch (UnsupportedOperationException unused) {
                h71Var = null;
            }
            if (this == h71Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.c;
            if (str2 == null) {
                str2 = this.f2377b.toString();
            }
            if (this.d) {
                return p71.l(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // defpackage.vj0
    public final void w(long j, vu vuVar) {
        y4 y4Var = new y4(vuVar, this, 24);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f2377b.postDelayed(y4Var, j)) {
            vuVar.u(new q90(18, this, y4Var));
        } else {
            M(vuVar.e, y4Var);
        }
    }

    public h71(Handler handler) {
        this(handler, null, false);
    }
}
