package defpackage;

import androidx.lifecycle.b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rl3 implements a22, z12 {

    /* renamed from: a, reason: collision with root package name */
    public final ro3 f4175a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f4176b = null;

    public rl3(tl3 tl3Var, int i, ReferenceQueue referenceQueue) {
        this.f4175a = new ro3(tl3Var, i, this, referenceQueue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a22
    public final void F(Object obj) {
        ro3 ro3Var = this.f4175a;
        tl3 tl3Var = (tl3) ro3Var.get();
        if (tl3Var == null) {
            ro3Var.a();
        }
        if (tl3Var != null) {
            if (tl3Var.l(ro3Var.f4194b, 0, ro3Var.c)) {
                tl3Var.m();
            }
        }
    }

    @Override // defpackage.z12
    public final void a(Object obj) {
        ((b) obj).h(this);
    }

    @Override // defpackage.z12
    public final void b(Object obj) {
        bk1 bk1Var;
        b bVar = (b) obj;
        WeakReference weakReference = this.f4176b;
        if (weakReference == null) {
            bk1Var = null;
        } else {
            bk1Var = (bk1) weakReference.get();
        }
        if (bk1Var != null) {
            bVar.d(bk1Var, this);
        }
    }
}
