package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mw0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3364a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3365b;

    public mw0(String str, Map map) {
        this.f3364a = str;
        this.f3365b = map;
    }

    public static uy0 a(String str) {
        return new uy0(str, 25);
    }

    public static mw0 b(String str) {
        return new mw0(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        if (this.f3364a.equals(mw0Var.f3364a) && this.f3365b.equals(mw0Var.f3365b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3365b.hashCode() + (this.f3364a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f3364a + ", properties=" + this.f3365b.values() + "}";
    }
}
