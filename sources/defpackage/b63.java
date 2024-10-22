package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class b63 {

    /* renamed from: a, reason: collision with root package name */
    public final String f414a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415b;
    public final List c;

    public b63(List list, String str, boolean z) {
        this.f414a = str;
        this.f415b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b63.class != obj.getClass()) {
            return false;
        }
        b63 b63Var = (b63) obj;
        if (this.f415b != b63Var.f415b || !this.c.equals(b63Var.c)) {
            return false;
        }
        String str = this.f414a;
        boolean startsWith = str.startsWith("index_");
        String str2 = b63Var.f414a;
        if (startsWith) {
            return str2.startsWith("index_");
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f414a;
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + (((hashCode * 31) + (this.f415b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f414a + "', unique=" + this.f415b + ", columns=" + this.c + '}';
    }
}
