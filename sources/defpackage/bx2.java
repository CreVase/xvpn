package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class bx2 extends rh2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f546a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k42 f547b;

    public bx2(k42 k42Var) {
        this.f547b = k42Var;
    }

    @Override // defpackage.rh2
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f546a) {
            this.f546a = false;
            this.f547b.f();
        }
    }

    @Override // defpackage.rh2
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.f546a = true;
        }
    }
}
