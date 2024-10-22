package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.l;

/* loaded from: classes2.dex */
public final /* synthetic */ class hd2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd2 f2407b;

    public /* synthetic */ hd2(kd2 kd2Var, int i) {
        this.f2406a = i;
        this.f2407b = kd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window;
        View decorView;
        wq3 h;
        int i = this.f2406a;
        kd2 kd2Var = this.f2407b;
        switch (i) {
            case 0:
                int i2 = kd2.j;
                kd2Var.z().C.scrollTo(0, 0);
                return;
            default:
                int i3 = kd2.j;
                l activity = kd2Var.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (h = ll3.h(decorView)) != null) {
                    kd2Var.z().e.onApplyWindowInsets(h.g());
                    return;
                }
                return;
        }
    }
}
