package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class vg1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final vg1 f4830a = new vg1();

    /* renamed from: b, reason: collision with root package name */
    public static final ug1 f4831b = ug1.f4666b;

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        pd0.h(qe0Var);
        b23 b23Var = b23.f390a;
        return new tg1((Map) new m71(b23.f390a, hg1.f2417a, 1).deserialize(qe0Var));
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f4831b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        pd0.i(ir0Var);
        b23 b23Var = b23.f390a;
        new m71(b23.f390a, hg1.f2417a, 1).serialize(ir0Var, (tg1) obj);
    }
}
