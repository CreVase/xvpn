package androidx.fragment.app;

import android.os.Bundle;
import defpackage.k11;
import defpackage.pe0;

/* loaded from: classes.dex */
public final class g extends k11 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f226a;

    public g(Fragment fragment) {
        this.f226a = fragment;
    }

    @Override // defpackage.k11
    public final void a() {
        Bundle bundle;
        Fragment fragment = this.f226a;
        fragment.mSavedStateRegistryController.a();
        pe0.p(fragment);
        Bundle bundle2 = fragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        fragment.mSavedStateRegistryController.b(bundle);
    }
}
