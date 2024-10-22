package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class ji1 implements w41, Serializable {
    private final int arity;

    public ji1(int i) {
        this.arity = i;
    }

    @Override // defpackage.w41
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        gi2.f2259a.getClass();
        return hi2.a(this);
    }
}
