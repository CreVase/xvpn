package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gc3 {

    /* renamed from: a, reason: collision with root package name */
    public gc3 f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2235b = new ArrayList();
    public boolean c;
    public final Object d;

    public gc3(Object obj) {
        this.d = obj;
    }

    public final boolean a() {
        ArrayList arrayList = this.f2235b;
        if (arrayList != null && !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f2234a == null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gc3) {
            gc3 gc3Var = (gc3) obj;
            Object obj2 = gc3Var.d;
            Object obj3 = this.d;
            if (obj2 == obj3) {
                return true;
            }
            if (obj3 != null && obj3.equals(obj2) && b() == gc3Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.d;
        if (obj != null) {
            return obj.hashCode();
        }
        return super.hashCode();
    }
}
