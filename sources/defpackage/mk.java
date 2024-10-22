package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class mk extends hp {

    /* renamed from: a, reason: collision with root package name */
    public final List f3309a;

    public mk(ArrayList arrayList) {
        this.f3309a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hp) {
            return this.f3309a.equals(((mk) ((hp) obj)).f3309a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3309a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3309a + "}";
    }
}
