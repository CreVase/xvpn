package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class y80 implements mp2 {

    /* renamed from: a, reason: collision with root package name */
    public final mp2 f5291a;

    /* renamed from: b, reason: collision with root package name */
    public final mh1 f5292b;
    public final String c;

    public y80(op2 op2Var, mh1 mh1Var) {
        this.f5291a = op2Var;
        this.f5292b = mh1Var;
        this.c = op2Var.f3713a + '<' + ((j00) mh1Var).b() + '>';
    }

    @Override // defpackage.mp2
    public final String a() {
        return this.c;
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return this.f5291a.c();
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        return this.f5291a.d(str);
    }

    @Override // defpackage.mp2
    public final int e() {
        return this.f5291a.e();
    }

    public final boolean equals(Object obj) {
        y80 y80Var;
        if (obj instanceof y80) {
            y80Var = (y80) obj;
        } else {
            y80Var = null;
        }
        if (y80Var == null || !m20.L(this.f5291a, y80Var.f5291a) || !m20.L(y80Var.f5292b, this.f5292b)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        return this.f5291a.f(i);
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        return this.f5291a.g(i);
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return this.f5291a.getAnnotations();
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return this.f5291a.getKind();
    }

    @Override // defpackage.mp2
    public final mp2 h(int i) {
        return this.f5291a.h(i);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.f5292b.hashCode() * 31);
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        return this.f5291a.i(i);
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return this.f5291a.isInline();
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f5292b + ", original: " + this.f5291a + ')';
    }
}
