package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class q51 extends rk2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q51(Fragment fragment, int i) {
        super(0, fragment, "Attempting to get retain instance for fragment " + fragment);
        if (i != 1) {
        } else {
            super(0, fragment, "Attempting to set retain instance for fragment " + fragment);
        }
    }

    public q51(Fragment fragment, Fragment fragment2, int i) {
        super(1, fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
    }
}
