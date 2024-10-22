package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class m00 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3211a;

    /* renamed from: b, reason: collision with root package name */
    public final x31 f3212b;
    public final Object c;

    public m00(int i, md3 md3Var) {
        this.f3211a = i;
        if (i != 1) {
            this.f3212b = md3Var;
            this.c = new l00(this);
        } else {
            this.f3212b = md3Var;
            this.c = new ConcurrentHashMap();
        }
    }

    public final uh1 a(mh1 mh1Var) {
        Object putIfAbsent;
        int i = this.f3211a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ot) x2.m((l00) obj, fl.D(mh1Var))).f3724a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
                Class D = fl.D(mh1Var);
                Object obj2 = concurrentHashMap.get(D);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(D, (obj2 = new ot((uh1) this.f3212b.invoke(mh1Var))))) != null) {
                    obj2 = putIfAbsent;
                }
                return ((ot) obj2).f3724a;
        }
    }
}
