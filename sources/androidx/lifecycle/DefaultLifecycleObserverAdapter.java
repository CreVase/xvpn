package androidx.lifecycle;

import defpackage.ai0;
import defpackage.bi0;
import defpackage.bk1;
import defpackage.tj1;
import defpackage.zj1;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final ai0 f248a;

    /* renamed from: b, reason: collision with root package name */
    public final zj1 f249b;

    public DefaultLifecycleObserverAdapter(ai0 ai0Var, zj1 zj1Var) {
        this.f248a = ai0Var;
        this.f249b = zj1Var;
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        int i = bi0.f469a[tj1Var.ordinal()];
        ai0 ai0Var = this.f248a;
        switch (i) {
            case 1:
                ai0Var.a();
                break;
            case 2:
                ai0Var.onStart(bk1Var);
                break;
            case 3:
                ai0Var.n(bk1Var);
                break;
            case 4:
                ai0Var.b();
                break;
            case 5:
                ai0Var.onStop(bk1Var);
                break;
            case 6:
                ai0Var.onDestroy(bk1Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        zj1 zj1Var = this.f249b;
        if (zj1Var != null) {
            zj1Var.e(bk1Var, tj1Var);
        }
    }
}
