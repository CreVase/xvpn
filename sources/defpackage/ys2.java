package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ys2 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5383a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final gl2 f5384b;
    public volatile o31 c;

    public ys2(gl2 gl2Var) {
        this.f5384b = gl2Var;
    }

    public final o31 a() {
        this.f5384b.a();
        if (this.f5383a.compareAndSet(false, true)) {
            if (this.c == null) {
                String b2 = b();
                gl2 gl2Var = this.f5384b;
                gl2Var.a();
                gl2Var.b();
                this.c = new o31(((j31) gl2Var.c.q()).f2698a.compileStatement(b2));
            }
            return this.c;
        }
        String b3 = b();
        gl2 gl2Var2 = this.f5384b;
        gl2Var2.a();
        gl2Var2.b();
        return new o31(((j31) gl2Var2.c.q()).f2698a.compileStatement(b3));
    }

    public abstract String b();

    public final void c(o31 o31Var) {
        if (o31Var == this.c) {
            this.f5383a.set(false);
        }
    }
}
