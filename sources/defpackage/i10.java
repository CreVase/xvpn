package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class i10 implements Closeable, aa0 {

    /* renamed from: a, reason: collision with root package name */
    public final t90 f2514a;

    public i10(t90 t90Var) {
        this.f2514a = t90Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zf3.h(this.f2514a, null);
    }

    @Override // defpackage.aa0
    public final t90 w() {
        return this.f2514a;
    }
}
