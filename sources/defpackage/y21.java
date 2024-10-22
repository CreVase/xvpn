package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y21 extends qb3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5260b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ z21 g;

    public y21(z21 z21Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.g = z21Var;
        this.f5259a = obj;
        this.f5260b = arrayList;
        this.e = obj2;
        this.f = arrayList2;
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        pb3Var.v(this);
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void d() {
        z21 z21Var = this.g;
        Object obj = this.f5259a;
        if (obj != null) {
            z21Var.s(obj, this.f5260b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            z21Var.s(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            z21Var.s(obj3, this.f, null);
        }
    }
}
