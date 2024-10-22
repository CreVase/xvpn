package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q00 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3944a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3945b;

    public q00(int i, Method method) {
        this.f3944a = i;
        this.f3945b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        if (this.f3944a == q00Var.f3944a && this.f3945b.getName().equals(q00Var.f3945b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3945b.getName().hashCode() + (this.f3944a * 31);
    }
}
