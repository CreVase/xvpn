package defpackage;

import androidx.fragment.app.Fragment;
import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* loaded from: classes.dex */
public final /* synthetic */ class si0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4349a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4350b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ si0(ux2 ux2Var, ux2 ux2Var2, boolean z, kg kgVar) {
        this.c = ux2Var;
        this.d = ux2Var2;
        this.f4350b = z;
        this.e = kgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4349a;
        boolean z = this.f4350b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Fragment fragment = ((ux2) obj2).c;
                Fragment fragment2 = ((ux2) obj).c;
                t21 t21Var = o21.f3586a;
                if (z) {
                    fragment2.getEnterTransitionCallback();
                    return;
                } else {
                    fragment.getEnterTransitionCallback();
                    return;
                }
            default:
                MRAIDPresenter.m85processCommand$lambda7((MRAIDPresenter) obj2, z, (String) obj, (String) this.e);
                return;
        }
    }

    public /* synthetic */ si0(MRAIDPresenter mRAIDPresenter, boolean z, String str, String str2) {
        this.c = mRAIDPresenter;
        this.f4350b = z;
        this.d = str;
        this.e = str2;
    }
}
