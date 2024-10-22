package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class if3 implements vh1 {

    /* renamed from: a, reason: collision with root package name */
    public final nh1 f2582a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2583b;
    public final int c = 0;

    public if3(j00 j00Var, List list) {
        this.f2582a = j00Var;
        this.f2583b = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof if3) {
            if3 if3Var = (if3) obj;
            if (m20.L(this.f2582a, if3Var.f2582a)) {
                if (m20.L(this.f2583b, if3Var.f2583b) && m20.L(null, null) && this.c == if3Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2583b.hashCode() + (this.f2582a.hashCode() * 31)) * 31) + this.c;
    }

    public final String toString() {
        mh1 mh1Var;
        String name;
        String K0;
        StringBuilder sb = new StringBuilder();
        nh1 nh1Var = this.f2582a;
        Class cls = null;
        if (nh1Var instanceof mh1) {
            mh1Var = (mh1) nh1Var;
        } else {
            mh1Var = null;
        }
        if (mh1Var != null) {
            cls = fl.D(mh1Var);
        }
        int i = this.c;
        if (cls == null) {
            name = nh1Var.toString();
        } else if ((i & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (m20.L(cls, boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (m20.L(cls, char[].class)) {
                name = "kotlin.CharArray";
            } else if (m20.L(cls, byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (m20.L(cls, short[].class)) {
                name = "kotlin.ShortArray";
            } else if (m20.L(cls, int[].class)) {
                name = "kotlin.IntArray";
            } else if (m20.L(cls, float[].class)) {
                name = "kotlin.FloatArray";
            } else if (m20.L(cls, long[].class)) {
                name = "kotlin.LongArray";
            } else if (m20.L(cls, double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else {
            name = cls.getName();
        }
        List list = this.f2583b;
        String str = "";
        if (list.isEmpty()) {
            K0 = "";
        } else {
            K0 = d20.K0(list, ", ", "<", ">", new fv2(this, 25), 24);
        }
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        if (z) {
            str = "?";
        }
        sb.append(name + K0 + str);
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
