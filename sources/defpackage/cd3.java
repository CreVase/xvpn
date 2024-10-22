package defpackage;

import android.content.DialogInterface;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* loaded from: classes2.dex */
public final /* synthetic */ class cd3 implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f616b;

    public /* synthetic */ cd3(Object obj, int i) {
        this.f615a = i;
        this.f616b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f615a;
        Object obj = this.f616b;
        switch (i) {
            case 0:
                v31 v31Var = (v31) obj;
                if (v31Var != null) {
                    v31Var.invoke();
                    return;
                }
                return;
            case 1:
                yc2.b((xc2) obj);
                return;
            default:
                NativeAdPresenter.a((NativeAdPresenter) obj, dialogInterface);
                return;
        }
    }
}
