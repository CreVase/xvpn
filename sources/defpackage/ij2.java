package defpackage;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ij2 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2608b = 0;

    /* renamed from: a, reason: collision with root package name */
    public s82 f2609a;

    public final void a(tj1 tj1Var) {
        if (Build.VERSION.SDK_INT < 29) {
            mp0.j(getActivity(), tj1Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(tj1.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(tj1.ON_DESTROY);
        this.f2609a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(tj1.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        s82 s82Var = this.f2609a;
        if (s82Var != null) {
            s82Var.f4292a.a();
        }
        a(tj1.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        s82 s82Var = this.f2609a;
        if (s82Var != null) {
            t82 t82Var = s82Var.f4292a;
            int i = t82Var.f4464a + 1;
            t82Var.f4464a = i;
            if (i == 1 && t82Var.d) {
                t82Var.f.e(tj1.ON_START);
                t82Var.d = false;
            }
        }
        a(tj1.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(tj1.ON_STOP);
    }
}
