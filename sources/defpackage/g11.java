package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class g11 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f2189b;

    public /* synthetic */ g11(Fragment fragment, int i) {
        this.f2188a = i;
        this.f2189b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2188a;
        Fragment fragment = this.f2189b;
        switch (i) {
            case 0:
                fragment.startPostponedEnterTransition();
                return;
            default:
                fragment.callStartTransitionListener(false);
                return;
        }
    }
}
