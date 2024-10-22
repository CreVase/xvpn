package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ka0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2914b;
    public final /* synthetic */ na0 c;

    public ka0(na0 na0Var, long j, String str) {
        this.c = na0Var;
        this.f2913a = j;
        this.f2914b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        na0 na0Var = this.c;
        vb0 vb0Var = na0Var.n;
        if (vb0Var != null && vb0Var.e.get()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            na0Var.i.f5188b.d(this.f2914b, this.f2913a);
            return null;
        }
        return null;
    }
}
