package defpackage;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MRAIDPresenter f3707b;

    public /* synthetic */ oo1(MRAIDPresenter mRAIDPresenter, int i) {
        this.f3706a = i;
        this.f3707b = mRAIDPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3706a;
        MRAIDPresenter mRAIDPresenter = this.f3707b;
        switch (i) {
            case 0:
                MRAIDPresenter.c(mRAIDPresenter);
                return;
            case 1:
                MRAIDPresenter.e(mRAIDPresenter);
                return;
            case 2:
                MRAIDPresenter.d(mRAIDPresenter);
                return;
            case 3:
                MRAIDPresenter.a(mRAIDPresenter);
                return;
            default:
                MRAIDPresenter.f(mRAIDPresenter);
                return;
        }
    }
}
