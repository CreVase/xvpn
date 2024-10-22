package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.NativeAd;
import com.vungle.ads.internal.ui.view.MediaView;

/* loaded from: classes.dex */
public final class yn3 implements VungleInitializer.VungleInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5365b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ VungleRtbNativeAd f;

    public yn3(VungleRtbNativeAd vungleRtbNativeAd, Context context, String str, int i, String str2, String str3) {
        this.f = vungleRtbNativeAd;
        this.f5364a = context;
        this.f5365b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.f.f1452b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        String str = this.f5365b;
        Context context = this.f5364a;
        NativeAd nativeAd = new NativeAd(context, str);
        VungleRtbNativeAd vungleRtbNativeAd = this.f;
        vungleRtbNativeAd.d = nativeAd;
        vungleRtbNativeAd.d.setAdOptionsPosition(this.c);
        vungleRtbNativeAd.d.setAdListener(vungleRtbNativeAd);
        vungleRtbNativeAd.e = new MediaView(context);
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            vungleRtbNativeAd.d.getAdConfig().setWatermark(str2);
        }
        vungleRtbNativeAd.d.load(this.e);
    }
}
