package com.chartboost.sdk.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.f;
import com.chartboost.sdk.impl.g1;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ew3;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ng0;
import defpackage.ui1;
import defpackage.v31;
import defpackage.ym;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class Banner extends FrameLayout implements Ad {
    private final ui1 api$delegate;
    private final BannerCallback callback;
    private final String location;
    private final Handler mainThreadHandler;
    private final Mediation mediation;
    private final BannerSize size;

    /* loaded from: classes.dex */
    public enum BannerSize {
        STANDARD(320, 50),
        MEDIUM(300, 250),
        LEADERBOARD(728, 90);

        private final int height;
        private final int width;

        BannerSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g1 invoke() {
            return f.a(Banner.this.mediation);
        }
    }

    public /* synthetic */ Banner(Context context, String str, BannerSize bannerSize, BannerCallback bannerCallback, Mediation mediation, int i, ng0 ng0Var) {
        this(context, str, bannerSize, bannerCallback, (i & 16) != 0 ? null : mediation);
    }

    private final g1 getApi() {
        return (g1) this.api$delegate.getValue();
    }

    private final void postSessionNotStartedInMainThread(boolean z) {
        try {
            this.mainThreadHandler.post(new ym(z, this, 0));
        } catch (Exception e) {
            Log.e("Chartboost", "Interstitial ad cannot post session not started callback " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postSessionNotStartedInMainThread$lambda$0(boolean z, Banner banner) {
        if (z) {
            banner.callback.onAdLoaded(new CacheEvent(null, banner), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            banner.callback.onAdShown(new ShowEvent(null, banner), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache() {
        if (!Chartboost.isSdkStarted()) {
            postSessionNotStartedInMainThread(true);
        } else {
            getApi().a(this, this.callback);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void clearCache() {
        if (Chartboost.isSdkStarted()) {
            getApi().g(getLocation());
        }
    }

    public final void detach() {
        if (Chartboost.isSdkStarted()) {
            getApi().b();
        }
    }

    public final int getBannerHeight() {
        return this.size.getHeight();
    }

    public final int getBannerWidth() {
        return this.size.getWidth();
    }

    @Override // com.chartboost.sdk.ads.Ad
    public String getLocation() {
        return this.location;
    }

    @Override // com.chartboost.sdk.ads.Ad
    public boolean isCached() {
        if (Chartboost.isSdkStarted()) {
            return getApi().h(getLocation());
        }
        return false;
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void show() {
        if (!Chartboost.isSdkStarted()) {
            postSessionNotStartedInMainThread(false);
        } else {
            getApi().a(this);
            getApi().b(this, this.callback);
        }
    }

    public Banner(Context context, String str, BannerSize bannerSize, BannerCallback bannerCallback, Mediation mediation) {
        super(context);
        this.location = str;
        this.size = bannerSize;
        this.callback = bannerCallback;
        this.mediation = mediation;
        this.api$delegate = new k43(new a());
        this.mainThreadHandler = ew3.H0(Looper.getMainLooper());
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(String str) {
        if (!Chartboost.isSdkStarted()) {
            postSessionNotStartedInMainThread(true);
            return;
        }
        if (str != null) {
            if (!(str.length() == 0)) {
                getApi().a(this, this.callback, str);
                return;
            }
        }
        getApi().a("", CBError.CBImpressionError.INVALID_RESPONSE);
    }
}
