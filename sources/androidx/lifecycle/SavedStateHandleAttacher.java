package androidx.lifecycle;

import defpackage.bk1;
import defpackage.tj1;
import defpackage.um2;
import defpackage.zj1;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final um2 f258a;

    public SavedStateHandleAttacher(um2 um2Var) {
        this.f258a = um2Var;
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        boolean z;
        if (tj1Var == tj1.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bk1Var.getLifecycle().b(this);
            this.f258a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + tj1Var).toString());
        }
    }
}
