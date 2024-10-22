package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j33 implements g33, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2699a;

    public j33(Object obj) {
        this.f2699a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j33) {
            return zf3.p(this.f2699a, ((j33) obj).f2699a);
        }
        return false;
    }

    @Override // defpackage.g33
    public final Object get() {
        return this.f2699a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2699a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2699a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
