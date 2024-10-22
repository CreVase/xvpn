package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class z53 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5431b;
    public final String c;
    public final List d;
    public final List e;

    public z53(String str, String str2, String str3, List list, List list2) {
        this.f5430a = str;
        this.f5431b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z53.class != obj.getClass()) {
            return false;
        }
        z53 z53Var = (z53) obj;
        if (!this.f5430a.equals(z53Var.f5430a) || !this.f5431b.equals(z53Var.f5431b) || !this.c.equals(z53Var.c) || !this.d.equals(z53Var.d)) {
            return false;
        }
        return this.e.equals(z53Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p71.h(this.c, p71.h(this.f5431b, this.f5430a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f5430a + "', onDelete='" + this.f5431b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
