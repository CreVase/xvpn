package defpackage;

/* loaded from: classes2.dex */
public final class hp1 implements vv1 {
    private vv1[] factories;

    public hp1(vv1... vv1VarArr) {
        this.factories = vv1VarArr;
    }

    @Override // defpackage.vv1
    public boolean isSupported(Class<?> cls) {
        for (vv1 vv1Var : this.factories) {
            if (vv1Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vv1
    public tv1 messageInfoFor(Class<?> cls) {
        for (vv1 vv1Var : this.factories) {
            if (vv1Var.isSupported(cls)) {
                return vv1Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
