package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class l21 extends in3 {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3053b;

    public l21(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(Fragment fragment, ViewGroup viewGroup, int i) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        if (i != 1) {
            this.f3053b = viewGroup;
            return;
        }
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.f3053b = viewGroup;
    }
}
