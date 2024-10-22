package defpackage;

/* loaded from: classes.dex */
public final class ip1 implements wv1 {

    /* renamed from: a, reason: collision with root package name */
    public final wv1[] f2631a;

    public ip1(wv1... wv1VarArr) {
        this.f2631a = wv1VarArr;
    }

    @Override // defpackage.wv1
    public final boolean isSupported(Class cls) {
        for (wv1 wv1Var : this.f2631a) {
            if (wv1Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wv1
    public final uv1 messageInfoFor(Class cls) {
        for (wv1 wv1Var : this.f2631a) {
            if (wv1Var.isSupported(cls)) {
                return wv1Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
