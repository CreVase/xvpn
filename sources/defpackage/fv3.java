package defpackage;

import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.impl.c6;

/* loaded from: classes.dex */
public final /* synthetic */ class fv3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterstitialCallback f2161b;
    public final /* synthetic */ Interstitial c;

    public /* synthetic */ fv3(InterstitialCallback interstitialCallback, Interstitial interstitial, int i) {
        this.f2160a = i;
        this.f2161b = interstitialCallback;
        this.c = interstitial;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2160a;
        Interstitial interstitial = this.c;
        InterstitialCallback interstitialCallback = this.f2161b;
        switch (i) {
            case 0:
                c6.b(interstitialCallback, interstitial);
                return;
            case 1:
                c6.c(interstitialCallback, interstitial);
                return;
            default:
                c6.a(interstitialCallback, interstitial);
                return;
        }
    }
}
