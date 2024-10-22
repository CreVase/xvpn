package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class dp2 extends to2 {
    public final AtomicReferenceArray e;

    public dp2(long j, dp2 dp2Var, int i) {
        super(j, dp2Var, i);
        this.e = new AtomicReferenceArray(cp2.f);
    }

    @Override // defpackage.to2
    public final int f() {
        return cp2.f;
    }

    @Override // defpackage.to2
    public final void g(int i, t90 t90Var) {
        this.e.set(i, cp2.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
