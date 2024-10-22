package defpackage;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: classes2.dex */
public final class r8 implements InterstitialAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s8 f4115a;

    public r8(s8 s8Var) {
        this.f4115a = s8Var;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        this.f4115a.b();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        String errorMessage;
        boolean z = false;
        if (adError != null && adError.getErrorCode() == 9001) {
            z = true;
        }
        String str = "";
        s8 s8Var = this.f4115a;
        if (z) {
            ep2 ep2Var = s8Var.f;
            if (ep2Var != null) {
                String errorMessage2 = adError.getErrorMessage();
                if (errorMessage2 != null) {
                    str = errorMessage2;
                }
                s8Var.c(ep2Var, str);
                return;
            }
            return;
        }
        if (adError != null && (errorMessage = adError.getErrorMessage()) != null) {
            str = errorMessage;
        }
        s8Var.a(str);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        s8 s8Var = this.f4115a;
        ep2 ep2Var = s8Var.f;
        if (ep2Var != null) {
            s8Var.d(ep2Var);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
