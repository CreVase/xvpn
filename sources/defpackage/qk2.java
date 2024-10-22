package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class qk2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4012a;

    public static final Throwable a(Object obj) {
        if (obj instanceof pk2) {
            return ((pk2) obj).f3863a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qk2)) {
            return false;
        }
        if (!m20.L(this.f4012a, ((qk2) obj).f4012a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f4012a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4012a;
        if (obj instanceof pk2) {
            return ((pk2) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
