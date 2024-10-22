package defpackage;

import com.chartboost.sdk.impl.t9;

/* loaded from: classes.dex */
public final /* synthetic */ class lw3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v31 f3199b;

    public /* synthetic */ lw3(v31 v31Var, int i) {
        this.f3198a = i;
        this.f3199b = v31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3198a;
        v31 v31Var = this.f3199b;
        switch (i) {
            case 0:
                t9.b(v31Var);
                return;
            default:
                t9.c(v31Var);
                return;
        }
    }
}
