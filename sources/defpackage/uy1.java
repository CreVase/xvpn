package defpackage;

import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAd$adPlayCallback$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class uy1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAd f4759b;

    public /* synthetic */ uy1(NativeAd nativeAd, int i) {
        this.f4758a = i;
        this.f4759b = nativeAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4758a;
        NativeAd nativeAd = this.f4759b;
        switch (i) {
            case 0:
                NativeAd$adPlayCallback$1.m36onAdClick$lambda3(nativeAd);
                return;
            case 1:
                NativeAd$adPlayCallback$1.m40onAdStart$lambda0(nativeAd);
                return;
            case 2:
                NativeAd$adPlayCallback$1.m39onAdLeftApplication$lambda4(nativeAd);
                return;
            case 3:
                NativeAd$adPlayCallback$1.m37onAdEnd$lambda2(nativeAd);
                return;
            default:
                NativeAd$adPlayCallback$1.m38onAdImpression$lambda1(nativeAd);
                return;
        }
    }
}
