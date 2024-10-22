package defpackage;

/* loaded from: classes2.dex */
public final class lg1 extends wg1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3121b;

    public lg1(Object obj, boolean z) {
        this.f3120a = z;
        this.f3121b = obj.toString();
    }

    @Override // defpackage.wg1
    public final String c() {
        return this.f3121b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m20.L(gi2.a(lg1.class), gi2.a(obj.getClass()))) {
            return false;
        }
        lg1 lg1Var = (lg1) obj;
        if (this.f3120a == lg1Var.f3120a && m20.L(this.f3121b, lg1Var.f3121b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f3120a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.f3121b.hashCode() + (i * 31);
    }

    @Override // defpackage.wg1
    public final String toString() {
        String str = this.f3121b;
        if (this.f3120a) {
            StringBuilder sb = new StringBuilder();
            a23.a(sb, str);
            return sb.toString();
        }
        return str;
    }
}
