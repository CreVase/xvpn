package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class vk2 extends t32 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final t32 f4851a;

    public vk2(t32 t32Var) {
        t32Var.getClass();
        this.f4851a = t32Var;
    }

    @Override // defpackage.t32
    public final t32 a() {
        return this.f4851a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4851a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vk2) {
            return this.f4851a.equals(((vk2) obj).f4851a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f4851a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4851a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
