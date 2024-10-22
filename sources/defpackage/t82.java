package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class t82 implements bk1 {
    public static final t82 i = new t82();

    /* renamed from: a, reason: collision with root package name */
    public int f4464a;

    /* renamed from: b, reason: collision with root package name */
    public int f4465b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final ck1 f = new ck1(this);
    public final nw3 g = new nw3(this, 8);
    public final s82 h = new s82(this);

    public final void a() {
        int i2 = this.f4465b + 1;
        this.f4465b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.e(tj1.ON_RESUME);
                this.c = false;
            } else {
                this.e.removeCallbacks(this.g);
            }
        }
    }

    @Override // defpackage.bk1
    public final vj1 getLifecycle() {
        return this.f;
    }
}
