package defpackage;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class fm0 implements Provider {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Provider f2115a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2116b = c;

    public fm0(mv0 mv0Var) {
        this.f2115a = mv0Var;
    }

    public static Provider a(mv0 mv0Var) {
        if (mv0Var instanceof fm0) {
            return mv0Var;
        }
        return new fm0(mv0Var);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean z;
        Object obj = this.f2116b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f2116b;
                if (obj == obj2) {
                    obj = this.f2115a.get();
                    Object obj3 = this.f2116b;
                    if (obj3 != obj2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f2116b = obj;
                    this.f2115a = null;
                }
            }
        }
        return obj;
    }
}
