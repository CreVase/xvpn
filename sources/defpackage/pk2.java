package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class pk2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3863a;

    public pk2(Throwable th) {
        this.f3863a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pk2) {
            if (m20.L(this.f3863a, ((pk2) obj).f3863a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3863a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3863a + ')';
    }
}
