package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class j80 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f2720a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j80.class == obj.getClass()) {
            return this.f2720a.equals(((j80) obj).f2720a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2720a.hashCode();
    }
}
