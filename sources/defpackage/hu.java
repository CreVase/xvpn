package defpackage;

/* loaded from: classes.dex */
public final class hu {

    /* renamed from: a, reason: collision with root package name */
    public Object f2485a;

    /* renamed from: b, reason: collision with root package name */
    public ju f2486b;
    public xj2 c = new xj2();
    public boolean d;

    public final void finalize() {
        xj2 xj2Var;
        ju juVar = this.f2486b;
        if (juVar != null && !juVar.isDone()) {
            juVar.f2829b.i(new s1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2485a, 1));
        }
        if (!this.d && (xj2Var = this.c) != null) {
            xj2Var.h(null);
        }
    }
}
