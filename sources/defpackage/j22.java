package defpackage;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class j22 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2694b;

    public /* synthetic */ j22(Object obj, int i) {
        this.f2693a = i;
        this.f2694b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f2693a) {
            case 0:
                ((v31) this.f2694b).invoke();
                return;
            default:
                ((Runnable) this.f2694b).run();
                return;
        }
    }
}
