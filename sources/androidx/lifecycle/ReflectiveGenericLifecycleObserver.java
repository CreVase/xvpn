package androidx.lifecycle;

import defpackage.bk1;
import defpackage.p00;
import defpackage.r00;
import defpackage.tj1;
import defpackage.zj1;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f254a;

    /* renamed from: b, reason: collision with root package name */
    public final p00 f255b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f254a = obj;
        this.f255b = r00.c.b(obj.getClass());
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        HashMap hashMap = this.f255b.f3758a;
        List list = (List) hashMap.get(tj1Var);
        Object obj = this.f254a;
        p00.a(list, bk1Var, tj1Var, obj);
        p00.a((List) hashMap.get(tj1.ON_ANY), bk1Var, tj1Var, obj);
    }
}
