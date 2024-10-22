package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;

/* loaded from: classes.dex */
public abstract class k21 {

    /* renamed from: a, reason: collision with root package name */
    public static final j21 f2874a = j21.f2692a;

    public static j21 a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return f2874a;
    }

    public static void b(in3 in3Var) {
        if (p.I(3)) {
            in3Var.f2627a.getClass();
        }
    }
}
