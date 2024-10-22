package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes.dex */
public final class ep0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f1969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f1970b;

    public ep0(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.f1969a = initListener;
        this.f1970b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.f1970b);
        this.f1969a.onInitialized(createErrorInitResult);
    }
}
