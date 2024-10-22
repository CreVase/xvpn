package defpackage;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* loaded from: classes.dex */
public final class gp0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdListener f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f2297b;

    public gp0(AdListener adListener, Ad ad) {
        this.f2296a = adListener;
        this.f2297b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2296a.onError(this.f2297b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
    }
}
