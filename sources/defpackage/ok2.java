package defpackage;

/* loaded from: classes2.dex */
public abstract class ok2 extends nk2 implements w41 {
    public final int e;

    public ok2(int i, c90 c90Var) {
        super(c90Var);
        this.e = i;
    }

    @Override // defpackage.w41
    public final int getArity() {
        return this.e;
    }

    @Override // defpackage.mn
    public final String toString() {
        if (getCompletion() == null) {
            gi2.f2259a.getClass();
            return hi2.a(this);
        }
        return super.toString();
    }
}
