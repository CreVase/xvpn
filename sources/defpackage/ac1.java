package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ac1 implements Iterable, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54b;

    public ac1(ik0 ik0Var) {
        this.f54b = ik0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f53a;
        Object obj = this.f54b;
        switch (i) {
            case 0:
                return new bc1((Iterator) ((v31) obj).invoke());
            default:
                return ((fp2) obj).iterator();
        }
    }

    public ac1(yy2 yy2Var) {
        this.f54b = yy2Var;
    }
}
