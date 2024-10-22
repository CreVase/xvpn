package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ka2 {
    public static final ka2 c = new ka2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2918b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final kp1 f2917a = new kp1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [bw1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [bw1] */
    public final mn2 a(Class cls) {
        boolean z;
        aw1 o;
        aw1 aw1Var;
        Class cls2;
        Charset charset = yd1.f5317a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2918b;
            mn2 mn2Var = (mn2) concurrentHashMap.get(cls);
            if (mn2Var == null) {
                kp1 kp1Var = this.f2917a;
                kp1Var.getClass();
                Class cls3 = sn2.f4380a;
                if (!m51.class.isAssignableFrom(cls) && (cls2 = sn2.f4380a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                uv1 messageInfoFor = kp1Var.f2993a.messageInfoFor(cls);
                og2 og2Var = (og2) messageInfoFor;
                boolean z2 = true;
                if ((og2Var.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    boolean isAssignableFrom = m51.class.isAssignableFrom(cls);
                    i1 i1Var = og2Var.f3658a;
                    if (isAssignableFrom) {
                        aw1Var = new bw1(sn2.d, cv0.f1681a, i1Var);
                    } else {
                        ih3 ih3Var = sn2.f4381b;
                        av0 av0Var = cv0.f1682b;
                        if (av0Var != null) {
                            aw1Var = new bw1(ih3Var, av0Var, i1Var);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    o = aw1Var;
                } else if (m51.class.isAssignableFrom(cls)) {
                    if (og2Var.d() != 1) {
                        z2 = false;
                    }
                    if (z2) {
                        o = aw1.o(messageInfoFor, b02.f379b, wk1.f5030b, sn2.d, cv0.f1681a, cq1.f1654b);
                    } else {
                        o = aw1.o(messageInfoFor, b02.f379b, wk1.f5030b, sn2.d, null, cq1.f1654b);
                    }
                } else {
                    if (og2Var.d() != 1) {
                        z2 = false;
                    }
                    if (z2) {
                        zz1 zz1Var = b02.f378a;
                        sk1 sk1Var = wk1.f5029a;
                        ih3 ih3Var2 = sn2.f4381b;
                        av0 av0Var2 = cv0.f1682b;
                        if (av0Var2 != null) {
                            o = aw1.o(messageInfoFor, zz1Var, sk1Var, ih3Var2, av0Var2, cq1.f1653a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        o = aw1.o(messageInfoFor, b02.f378a, wk1.f5029a, sn2.c, null, cq1.f1653a);
                    }
                }
                mn2 mn2Var2 = (mn2) concurrentHashMap.putIfAbsent(cls, o);
                if (mn2Var2 != null) {
                    return mn2Var2;
                }
                return o;
            }
            return mn2Var;
        }
        throw new NullPointerException("messageType");
    }
}
