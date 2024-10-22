package defpackage;

import com.google.protobuf.g;

/* loaded from: classes2.dex */
public final class aj1 extends bj1 {
    private final yv1 defaultInstance;

    public aj1(yv1 yv1Var, xu0 xu0Var, g gVar) {
        super(xu0Var, gVar);
        this.defaultInstance = yv1Var;
    }

    @Override // defpackage.bj1
    public boolean containsDefaultInstance() {
        if (!super.containsDefaultInstance() && this.value != this.defaultInstance) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bj1
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public yv1 getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // defpackage.bj1
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
