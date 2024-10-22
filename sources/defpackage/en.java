package defpackage;

import com.vungle.ads.BaseAd;

/* loaded from: classes2.dex */
public final /* synthetic */ class en implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseAd f1963b;

    public /* synthetic */ en(BaseAd baseAd, int i) {
        this.f1962a = i;
        this.f1963b = baseAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1962a;
        BaseAd baseAd = this.f1963b;
        switch (i) {
            case 0:
                BaseAd.c(baseAd);
                return;
            default:
                BaseAd.a(baseAd);
                return;
        }
    }
}
