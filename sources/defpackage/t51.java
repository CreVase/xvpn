package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t51 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4451a;

    public t51(List list) {
        this.f4451a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t51)) {
            return false;
        }
        List list = this.f4451a;
        t51 t51Var = (t51) obj;
        if (list.size() != t51Var.f4451a.size()) {
            return false;
        }
        return m20.L(new HashSet(list), new HashSet(t51Var.f4451a));
    }

    public final int hashCode() {
        return Objects.hash(this.f4451a);
    }

    public final String toString() {
        return "Topics=" + this.f4451a;
    }
}
