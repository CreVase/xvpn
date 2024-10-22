package defpackage;

import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;

/* loaded from: classes2.dex */
public final class p8 implements BannerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f3795a;

    public p8(q8 q8Var) {
        this.f3795a = q8Var;
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public final void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public final void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        q8 q8Var = this.f3795a;
        if (cacheError == null) {
            q8Var.b();
        } else {
            q8Var.e = null;
            q8Var.a(cacheError.getCode().toString());
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public final void onAdRequestedToShow(ShowEvent showEvent) {
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public final void onAdShown(ShowEvent showEvent, ShowError showError) {
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public final void onImpressionRecorded(ImpressionEvent impressionEvent) {
    }
}
