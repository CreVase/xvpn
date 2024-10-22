package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class x60 implements fp2 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5120a;

    public x60(yl3 yl3Var) {
        this.f5120a = new AtomicReference(yl3Var);
    }

    @Override // defpackage.fp2
    public final Iterator iterator() {
        fp2 fp2Var = (fp2) this.f5120a.getAndSet(null);
        if (fp2Var != null) {
            return fp2Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
