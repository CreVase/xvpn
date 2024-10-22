package defpackage;

/* loaded from: classes2.dex */
public final class ah3 implements r90, s90 {

    /* renamed from: a, reason: collision with root package name */
    public static final ah3 f90a = new ah3();

    @Override // defpackage.t90
    public final Object fold(Object obj, l41 l41Var) {
        return l41Var.invoke(obj, this);
    }

    @Override // defpackage.t90
    public final r90 get(s90 s90Var) {
        if (m20.L(this, s90Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.r90
    public final s90 getKey() {
        return this;
    }

    @Override // defpackage.t90
    public final t90 minusKey(s90 s90Var) {
        if (m20.L(this, s90Var)) {
            return zq0.f5530a;
        }
        return this;
    }

    @Override // defpackage.t90
    public final t90 plus(t90 t90Var) {
        return fl.V(this, t90Var);
    }
}
