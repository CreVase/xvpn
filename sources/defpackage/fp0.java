package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes.dex */
public final class fp0 implements AudienceNetworkAds.InitResult {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f2132a;

    public fp0(Throwable th) {
        this.f2132a = th;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        String createErrorMessage;
        createErrorMessage = DynamicLoaderFactory.createErrorMessage(this.f2132a);
        return createErrorMessage;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return false;
    }
}
