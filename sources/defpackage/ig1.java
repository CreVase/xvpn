package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ig1 implements mp2 {

    /* renamed from: a, reason: collision with root package name */
    public final k43 f2587a;

    public ig1(m01 m01Var) {
        this.f2587a = new k43(m01Var);
    }

    @Override // defpackage.mp2
    public final String a() {
        return b().a();
    }

    public final mp2 b() {
        return (mp2) this.f2587a.getValue();
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        return b().d(str);
    }

    @Override // defpackage.mp2
    public final int e() {
        return b().e();
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        return b().f(i);
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        return b().g(i);
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return cr0.f1659a;
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return b().getKind();
    }

    @Override // defpackage.mp2
    public final mp2 h(int i) {
        return b().h(i);
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        return b().i(i);
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return false;
    }
}
