package defpackage;

import android.app.Application;

/* loaded from: classes2.dex */
public class bp extends eb implements y12 {
    public transient z92 d;

    public bp(Application application) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y12
    public final void a(x12 x12Var) {
        synchronized (this) {
            if (this.d == null) {
                this.d = new z92();
            }
        }
        this.d.a((z12) x12Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y12
    public final void b(x12 x12Var) {
        synchronized (this) {
            z92 z92Var = this.d;
            if (z92Var == null) {
                return;
            }
            z92Var.f((z12) x12Var);
        }
    }

    public final void i(int i) {
        synchronized (this) {
            z92 z92Var = this.d;
            if (z92Var == null) {
                return;
            }
            z92Var.c(20, this);
        }
    }
}
