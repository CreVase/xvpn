package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class zv extends qb3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5554a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5555b;

    public zv(ViewGroup viewGroup) {
        this.f5555b = viewGroup;
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void a() {
        m20.e1(this.f5555b, false);
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        if (!this.f5554a) {
            m20.e1(this.f5555b, false);
        }
        pb3Var.v(this);
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void c() {
        m20.e1(this.f5555b, false);
        this.f5554a = true;
    }

    @Override // defpackage.qb3, defpackage.ob3
    public final void e() {
        m20.e1(this.f5555b, true);
    }
}
