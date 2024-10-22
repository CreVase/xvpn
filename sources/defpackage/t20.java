package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class t20 extends t32 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f4442a;

    public t20(Comparator comparator) {
        comparator.getClass();
        this.f4442a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4442a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t20) {
            return this.f4442a.equals(((t20) obj).f4442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4442a.hashCode();
    }

    public final String toString() {
        return this.f4442a.toString();
    }
}
