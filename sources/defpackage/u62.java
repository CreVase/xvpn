package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class u62 implements t62, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f4629a;

    public u62(List list) {
        this.f4629a = list;
    }

    @Override // defpackage.t62
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f4629a;
            if (i < list.size()) {
                if (!((t62) list.get(i)).apply(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u62) {
            return this.f4629a.equals(((u62) obj).f4629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4629a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f4629a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
