package defpackage;

/* loaded from: classes.dex */
public abstract class i1 {
    protected int memoizedHashCode = 0;

    public abstract int a();

    public final int b(mn2 mn2Var) {
        m51 m51Var = (m51) this;
        int i = m51Var.memoizedSerializedSize;
        if (i == -1) {
            int serializedSize = mn2Var.getSerializedSize(this);
            m51Var.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }
        return i;
    }

    public abstract void c(v10 v10Var);
}
