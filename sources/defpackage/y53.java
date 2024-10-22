package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class y53 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5276b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    public final int g;

    public y53(int i, String str, String str2, String str3, boolean z, int i2) {
        this.f5275a = str;
        this.f5276b = str2;
        this.d = z;
        this.e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            } else {
                i3 = 2;
            }
        }
        this.c = i3;
        this.f = str3;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y53.class != obj.getClass()) {
            return false;
        }
        y53 y53Var = (y53) obj;
        if (this.e != y53Var.e || !this.f5275a.equals(y53Var.f5275a) || this.d != y53Var.d) {
            return false;
        }
        String str = this.f;
        int i = this.g;
        int i2 = y53Var.g;
        String str2 = y53Var.f;
        if (i == 1 && i2 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i == 2 && i2 == 1 && str2 != null && !str2.equals(str)) {
            return false;
        }
        if ((i == 0 || i != i2 || (str == null ? str2 == null : str.equals(str2))) && this.c == y53Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f5275a.hashCode() * 31) + this.c) * 31;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f5275a);
        sb.append("', type='");
        sb.append(this.f5276b);
        sb.append("', affinity='");
        sb.append(this.c);
        sb.append("', notNull=");
        sb.append(this.d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.e);
        sb.append(", defaultValue='");
        return hx2.s(sb, this.f, "'}");
    }
}
