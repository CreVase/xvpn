package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ct1 {

    /* renamed from: a, reason: collision with root package name */
    public String f1671a;

    /* renamed from: b, reason: collision with root package name */
    public int f1672b;
    public int c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public final Serializable g;

    public ct1(Class cls, Class[] clsArr) {
        this.f1671a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f1672b = 0;
        this.c = 0;
        this.g = new HashSet();
        hashSet.add(rd2.a(cls));
        for (Class cls2 : clsArr) {
            if (cls2 != null) {
                ((Set) this.d).add(rd2.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
    }

    public static bt1 a(ct1 ct1Var) {
        return new bt1(ct1Var);
    }

    public final void b(kk0 kk0Var) {
        if (!((Set) this.d).contains(kk0Var.f2960a)) {
            ((Set) this.e).add(kk0Var);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final h30 c() {
        boolean z;
        if (((v30) this.f) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new h30(this.f1671a, new HashSet((Set) this.d), new HashSet((Set) this.e), this.f1672b, this.c, (v30) this.f, (Set) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void d(int i) {
        boolean z;
        if (this.f1672b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1672b = i;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public ct1(rd2 rd2Var, rd2[] rd2VarArr) {
        this.f1671a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f1672b = 0;
        this.c = 0;
        this.g = new HashSet();
        hashSet.add(rd2Var);
        for (rd2 rd2Var2 : rd2VarArr) {
            if (rd2Var2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll((Set) this.d, rd2VarArr);
    }

    public ct1(bt1 bt1Var) {
        this.d = bt1Var.f524a;
        this.f1671a = bt1Var.f525b;
        this.e = bt1Var.c;
        this.f1672b = bt1Var.d;
        this.c = bt1Var.e;
        this.f = bt1Var.f;
        this.g = bt1Var.g;
    }
}
