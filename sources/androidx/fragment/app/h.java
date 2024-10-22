package androidx.fragment.app;

import android.view.View;
import defpackage.hx2;
import defpackage.p11;

/* loaded from: classes.dex */
public final class h extends p11 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f227a;

    public h(Fragment fragment) {
        this.f227a = fragment;
    }

    @Override // defpackage.p11
    public final View b(int i) {
        Fragment fragment = this.f227a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(hx2.o("Fragment ", fragment, " does not have a view"));
    }

    @Override // defpackage.p11
    public final boolean c() {
        if (this.f227a.mView != null) {
            return true;
        }
        return false;
    }
}
