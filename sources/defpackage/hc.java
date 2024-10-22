package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class hc implements u22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f2397a;

    public hc(ic icVar) {
        this.f2397a = icVar;
    }

    @Override // defpackage.u22
    public final void a(Context context) {
        ic icVar = this.f2397a;
        sc delegate = icVar.getDelegate();
        delegate.f();
        delegate.i(icVar.getSavedStateRegistry().a("androidx:appcompat"));
    }
}
