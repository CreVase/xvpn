package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class np2 implements mp2, au {

    /* renamed from: a, reason: collision with root package name */
    public final mp2 f3511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3512b;
    public final Set c;

    public np2(mp2 mp2Var) {
        this.f3511a = mp2Var;
        this.f3512b = mp2Var.a() + '?';
        this.c = zf3.g(mp2Var);
    }

    @Override // defpackage.mp2
    public final String a() {
        return this.f3512b;
    }

    @Override // defpackage.au
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return true;
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        return this.f3511a.d(str);
    }

    @Override // defpackage.mp2
    public final int e() {
        return this.f3511a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np2)) {
            return false;
        }
        if (m20.L(this.f3511a, ((np2) obj).f3511a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        return this.f3511a.f(i);
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        return this.f3511a.g(i);
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return this.f3511a.getAnnotations();
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return this.f3511a.getKind();
    }

    @Override // defpackage.mp2
    public final mp2 h(int i) {
        return this.f3511a.h(i);
    }

    public final int hashCode() {
        return this.f3511a.hashCode() * 31;
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        return this.f3511a.i(i);
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return this.f3511a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3511a);
        sb.append('?');
        return sb.toString();
    }
}
