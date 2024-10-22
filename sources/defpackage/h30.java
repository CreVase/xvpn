package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h30 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2357a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2358b;
    public final Set c;
    public final int d;
    public final int e;
    public final v30 f;
    public final Set g;

    public h30(String str, Set set, Set set2, int i, int i2, v30 v30Var, Set set3) {
        this.f2357a = str;
        this.f2358b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = v30Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static ct1 a(rd2 rd2Var) {
        return new ct1(rd2Var, new rd2[0]);
    }

    public static ct1 b(Class cls) {
        return new ct1(cls, new Class[0]);
    }

    public static h30 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rd2.a(cls));
        for (Class cls2 : clsArr) {
            if (cls2 != null) {
                hashSet.add(rd2.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new h30(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new g30(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2358b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
