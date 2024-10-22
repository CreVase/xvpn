package defpackage;

/* loaded from: classes2.dex */
public abstract class w implements r90 {
    private final s90 key;

    public w(s90 s90Var) {
        this.key = s90Var;
    }

    @Override // defpackage.t90
    public <R> R fold(R r, l41 l41Var) {
        return (R) l41Var.invoke(r, this);
    }

    @Override // defpackage.t90
    public <E extends r90> E get(s90 s90Var) {
        if (m20.L(getKey(), s90Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.r90
    public s90 getKey() {
        return this.key;
    }

    @Override // defpackage.t90
    public t90 minusKey(s90 s90Var) {
        if (m20.L(getKey(), s90Var)) {
            return zq0.f5530a;
        }
        return this;
    }

    @Override // defpackage.t90
    public t90 plus(t90 t90Var) {
        return fl.V(this, t90Var);
    }
}
