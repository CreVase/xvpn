package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class nl extends wb0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final g10 f3480b;
    public final g10 c;
    public final String d;

    public nl(Context context, g10 g10Var, g10 g10Var2, String str) {
        if (context != null) {
            this.f3479a = context;
            if (g10Var != null) {
                this.f3480b = g10Var;
                if (g10Var2 != null) {
                    this.c = g10Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        if (this.f3479a.equals(((nl) wb0Var).f3479a)) {
            nl nlVar = (nl) wb0Var;
            if (this.f3480b.equals(nlVar.f3480b) && this.c.equals(nlVar.c) && this.d.equals(nlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3479a.hashCode() ^ 1000003) * 1000003) ^ this.f3480b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f3479a);
        sb.append(", wallClock=");
        sb.append(this.f3480b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return hx2.s(sb, this.d, "}");
    }
}
