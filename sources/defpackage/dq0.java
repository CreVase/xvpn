package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class dq0 extends m20 {
    public final /* synthetic */ m20 k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public dq0(m20 m20Var, ThreadPoolExecutor threadPoolExecutor) {
        this.k = m20Var;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.m20
    public final void H0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.H0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.m20
    public final void I0(wq2 wq2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.I0(wq2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
