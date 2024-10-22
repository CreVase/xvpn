package androidx.fragment.app;

import defpackage.tx2;
import defpackage.ux2;
import defpackage.xu;
import defpackage.ya0;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ux2 f222a;

    /* renamed from: b, reason: collision with root package name */
    public final xu f223b;

    public d(ux2 ux2Var, xu xuVar) {
        this.f222a = ux2Var;
        this.f223b = xuVar;
    }

    public final void a() {
        ux2 ux2Var = this.f222a;
        LinkedHashSet linkedHashSet = ux2Var.e;
        if (linkedHashSet.remove(this.f223b) && linkedHashSet.isEmpty()) {
            ux2Var.b();
        }
    }

    public final boolean b() {
        tx2 tx2Var;
        ux2 ux2Var = this.f222a;
        tx2 J = ya0.J(ux2Var.c.mView);
        tx2 tx2Var2 = ux2Var.f4753a;
        if (J != tx2Var2 && (J == (tx2Var = tx2.VISIBLE) || tx2Var2 == tx2Var)) {
            return false;
        }
        return true;
    }
}
