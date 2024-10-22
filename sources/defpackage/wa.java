package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    public final long f4968a;

    /* renamed from: b, reason: collision with root package name */
    public final a93 f4969b;
    public final int c;
    public final rt1 d;
    public final long e;
    public final a93 f;
    public final int g;
    public final rt1 h;
    public final long i;
    public final long j;

    public wa(long j, a93 a93Var, int i, rt1 rt1Var, long j2, a93 a93Var2, int i2, rt1 rt1Var2, long j3, long j4) {
        this.f4968a = j;
        this.f4969b = a93Var;
        this.c = i;
        this.d = rt1Var;
        this.e = j2;
        this.f = a93Var2;
        this.g = i2;
        this.h = rt1Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wa.class != obj.getClass()) {
            return false;
        }
        wa waVar = (wa) obj;
        if (this.f4968a == waVar.f4968a && this.c == waVar.c && this.e == waVar.e && this.g == waVar.g && this.i == waVar.i && this.j == waVar.j && zf3.p(this.f4969b, waVar.f4969b) && zf3.p(this.d, waVar.d) && zf3.p(this.f, waVar.f) && zf3.p(this.h, waVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4968a), this.f4969b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
