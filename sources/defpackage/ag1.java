package defpackage;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ag1 implements kr0 {
    public static final yf1 f;
    public static final yf1 g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f80a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f81b;
    public final xf1 c;
    public boolean d;
    public static final xf1 e = new xf1(0);
    public static final zf1 h = new zf1();

    /* JADX WARN: Type inference failed for: r0v1, types: [yf1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [yf1] */
    static {
        final int i = 0;
        f = new fj3() { // from class: yf1
            @Override // defpackage.jr0
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((gj3) obj2).b((String) obj);
                        return;
                    default:
                        ((gj3) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i2 = 1;
        g = new fj3() { // from class: yf1
            @Override // defpackage.jr0
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((gj3) obj2).b((String) obj);
                        return;
                    default:
                        ((gj3) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public ag1() {
        HashMap hashMap = new HashMap();
        this.f80a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f81b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final kr0 a(Class cls, u12 u12Var) {
        this.f80a.put(cls, u12Var);
        this.f81b.remove(cls);
        return this;
    }
}
