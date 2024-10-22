package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class tf1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final tf1 f4493a = new tf1();

    /* renamed from: b, reason: collision with root package name */
    public static final sf1 f4494b = sf1.f4332b;

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        pd0.h(qe0Var);
        return new rf1((List) new ig(hg1.f2417a, 0).deserialize(qe0Var));
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f4494b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        rf1 rf1Var = (rf1) obj;
        pd0.i(ir0Var);
        hg1 hg1Var = hg1.f2417a;
        eg egVar = new eg(hg1Var.getDescriptor(), 1);
        int size = rf1Var.size();
        g40 q = ir0Var.q(egVar);
        Iterator<E> it = rf1Var.iterator();
        for (int i = 0; i < size; i++) {
            q.p(egVar, i, hg1Var, it.next());
        }
        q.a(egVar);
    }
}
