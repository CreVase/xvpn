package defpackage;

import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.impl.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class ov3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerCallback f3738b;
    public final /* synthetic */ Banner c;

    public /* synthetic */ ov3(BannerCallback bannerCallback, Banner banner, int i) {
        this.f3737a = i;
        this.f3738b = bannerCallback;
        this.c = banner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3737a;
        Banner banner = this.c;
        BannerCallback bannerCallback = this.f3738b;
        switch (i) {
            case 0:
                g1.c(bannerCallback, banner);
                return;
            case 1:
                g1.d(bannerCallback, banner);
                return;
            case 2:
                g1.e(bannerCallback, banner);
                return;
            case 3:
                g1.a(bannerCallback, banner);
                return;
            default:
                g1.b(bannerCallback, banner);
                return;
        }
    }
}
