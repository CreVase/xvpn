package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o00 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3572a;

    /* renamed from: b, reason: collision with root package name */
    public final l41 f3573b;
    public final Object c;

    public o00(gv2 gv2Var, int i) {
        this.f3572a = i;
        if (i != 1) {
            this.f3573b = gv2Var;
            this.c = new n00(1);
        } else {
            this.f3573b = gv2Var;
            this.c = new ConcurrentHashMap();
        }
    }

    public final Object a(mh1 mh1Var, ArrayList arrayList) {
        Object pk2Var;
        qk2 qk2Var;
        Object putIfAbsent;
        Object obj;
        Object pk2Var2;
        int i = this.f3572a;
        l41 l41Var = this.f3573b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                obj = ((n00) obj2).get(fl.D(mh1Var));
                ConcurrentHashMap concurrentHashMap = ((p42) obj).f3780a;
                Object obj3 = concurrentHashMap.get(arrayList);
                if (obj3 == null) {
                    try {
                        pk2Var2 = (uh1) l41Var.invoke(mh1Var, arrayList);
                    } catch (Throwable th) {
                        pk2Var2 = new pk2(th);
                    }
                    obj3 = new qk2(pk2Var2);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, obj3);
                    if (putIfAbsent2 != null) {
                        obj3 = putIfAbsent2;
                    }
                }
                qk2Var = (qk2) obj3;
                break;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) obj2;
                Class D = fl.D(mh1Var);
                Object obj4 = concurrentHashMap2.get(D);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(D, (obj4 = new p42()))) != null) {
                    obj4 = putIfAbsent;
                }
                ConcurrentHashMap concurrentHashMap3 = ((p42) obj4).f3780a;
                Object obj5 = concurrentHashMap3.get(arrayList);
                if (obj5 == null) {
                    try {
                        pk2Var = (uh1) l41Var.invoke(mh1Var, arrayList);
                    } catch (Throwable th2) {
                        pk2Var = new pk2(th2);
                    }
                    obj5 = new qk2(pk2Var);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList, obj5);
                    if (putIfAbsent3 != null) {
                        obj5 = putIfAbsent3;
                    }
                }
                qk2Var = (qk2) obj5;
                break;
        }
        return qk2Var.f4012a;
    }
}
