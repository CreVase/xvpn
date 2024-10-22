package androidx.lifecycle;

import defpackage.ai0;
import defpackage.ak1;
import defpackage.bk1;
import defpackage.e51;
import defpackage.ek1;
import defpackage.tj1;
import defpackage.uj1;
import defpackage.zj1;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public uj1 f261a;

    /* renamed from: b, reason: collision with root package name */
    public final zj1 f262b;

    public a(ak1 ak1Var, uj1 uj1Var) {
        zj1 reflectiveGenericLifecycleObserver;
        HashMap hashMap = ek1.f1947a;
        boolean z = ak1Var instanceof zj1;
        boolean z2 = ak1Var instanceof ai0;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((ai0) ak1Var, (zj1) ak1Var);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((ai0) ak1Var, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (zj1) ak1Var;
        } else {
            Class<?> cls = ak1Var.getClass();
            if (ek1.b(cls) == 2) {
                List list = (List) ek1.f1948b.get(cls);
                if (list.size() != 1) {
                    int size = list.size();
                    e51[] e51VarArr = new e51[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(e51VarArr);
                    } else {
                        ek1.a((Constructor) list.get(0), ak1Var);
                        throw null;
                    }
                } else {
                    ek1.a((Constructor) list.get(0), ak1Var);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(ak1Var);
            }
        }
        this.f262b = reflectiveGenericLifecycleObserver;
        this.f261a = uj1Var;
    }

    public final void a(bk1 bk1Var, tj1 tj1Var) {
        uj1 a2 = tj1Var.a();
        uj1 uj1Var = this.f261a;
        if (a2.compareTo(uj1Var) < 0) {
            uj1Var = a2;
        }
        this.f261a = uj1Var;
        this.f262b.e(bk1Var, tj1Var);
        this.f261a = a2;
    }
}
