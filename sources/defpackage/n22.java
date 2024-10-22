package defpackage;

import androidx.activity.b;

/* loaded from: classes.dex */
public final class n22 implements tu {

    /* renamed from: a, reason: collision with root package name */
    public final g22 f3390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3391b;

    public n22(b bVar, g22 g22Var) {
        this.f3391b = bVar;
        this.f3390a = g22Var;
    }

    @Override // defpackage.tu
    public final void cancel() {
        b bVar = this.f3391b;
        gg ggVar = bVar.f131b;
        g22 g22Var = this.f3390a;
        ggVar.remove(g22Var);
        if (m20.L(bVar.c, g22Var)) {
            g22Var.getClass();
            bVar.c = null;
        }
        g22Var.f2194b.remove(this);
        v31 v31Var = g22Var.c;
        if (v31Var != null) {
            v31Var.invoke();
        }
        g22Var.c = null;
    }
}
