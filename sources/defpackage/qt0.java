package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qt0 implements sl1, rl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bu0 f4055a;

    public /* synthetic */ qt0(bu0 bu0Var) {
        this.f4055a = bu0Var;
    }

    @Override // defpackage.sl1
    public final void a(Object obj, wy0 wy0Var) {
        bu0 bu0Var = this.f4055a;
        bu0Var.getClass();
        ((v52) obj).onEvents(bu0Var.f, new u52(wy0Var));
    }

    @Override // defpackage.rl1
    public final void invoke(Object obj) {
        ((v52) obj).onAvailableCommandsChanged(this.f4055a.I);
    }
}
