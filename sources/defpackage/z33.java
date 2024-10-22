package defpackage;

/* loaded from: classes2.dex */
public abstract class z33 extends d90 implements w41 {
    private final int arity;

    public z33(int i, c90 c90Var) {
        super(c90Var);
        this.arity = i;
    }

    @Override // defpackage.w41
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.mn
    public String toString() {
        if (getCompletion() == null) {
            gi2.f2259a.getClass();
            return hi2.a(this);
        }
        return super.toString();
    }
}
