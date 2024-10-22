package defpackage;

/* loaded from: classes2.dex */
public final class io3 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jo3 f2630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io3(jo3 jo3Var, io3 io3Var) {
        super(jo3Var.f2804a, io3Var);
        this.f2630a = jo3Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(this.f2630a.f2805b);
        return this;
    }
}
