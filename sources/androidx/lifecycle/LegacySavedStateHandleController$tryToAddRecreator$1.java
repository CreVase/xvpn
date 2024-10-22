package androidx.lifecycle;

import defpackage.bk1;
import defpackage.tj1;
import defpackage.vj1;
import defpackage.zj1;
import defpackage.zm2;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vj1 f250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zm2 f251b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(vj1 vj1Var, zm2 zm2Var) {
        this.f250a = vj1Var;
        this.f251b = zm2Var;
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        if (tj1Var == tj1.ON_START) {
            this.f250a.b(this);
            this.f251b.d();
        }
    }
}
