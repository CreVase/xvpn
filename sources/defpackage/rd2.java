package defpackage;

/* loaded from: classes2.dex */
public final class rd2 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4136a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4137b;

    public rd2(Class cls, Class cls2) {
        this.f4136a = cls;
        this.f4137b = cls2;
    }

    public static rd2 a(Class cls) {
        return new rd2(qd2.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rd2.class != obj.getClass()) {
            return false;
        }
        rd2 rd2Var = (rd2) obj;
        if (!this.f4137b.equals(rd2Var.f4137b)) {
            return false;
        }
        return this.f4136a.equals(rd2Var.f4136a);
    }

    public final int hashCode() {
        return this.f4136a.hashCode() + (this.f4137b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f4137b;
        Class cls2 = this.f4136a;
        if (cls2 == qd2.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
