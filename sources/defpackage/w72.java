package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class w72 implements mp2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4956a;

    /* renamed from: b, reason: collision with root package name */
    public final t72 f4957b;

    public w72(String str, t72 t72Var) {
        this.f4956a = str;
        this.f4957b = t72Var;
    }

    @Override // defpackage.mp2
    public final String a() {
        return this.f4956a;
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.mp2
    public final int e() {
        return 0;
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return cr0.f1659a;
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return this.f4957b;
    }

    @Override // defpackage.mp2
    public final mp2 h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f4956a + ')';
    }
}
