package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class ag extends tf3 {
    public static volatile ag L;
    public static final zf M = new zf(1);
    public final aj0 K = new aj0();

    public static ag C0() {
        if (L != null) {
            return L;
        }
        synchronized (ag.class) {
            if (L == null) {
                L = new ag();
            }
        }
        return L;
    }

    public final void D0(Runnable runnable) {
        aj0 aj0Var = this.K;
        if (aj0Var.M == null) {
            synchronized (aj0Var.K) {
                if (aj0Var.M == null) {
                    aj0Var.M = aj0.C0(Looper.getMainLooper());
                }
            }
        }
        aj0Var.M.post(runnable);
    }
}
