package com.chartboost.sdk.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.c6;
import com.chartboost.sdk.impl.f;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ew3;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ng0;
import defpackage.ui1;
import defpackage.v31;
import defpackage.ym;

/* loaded from: classes.dex */
public final class Interstitial implements Ad {
    private final ui1 api$delegate;
    private final InterstitialCallback callback;
    private final String location;
    private final Handler mainThreadHandler;
    private final Mediation mediation;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c6 invoke() {
            return f.b(Interstitial.this.mediation);
        }
    }

    public Interstitial(String str, InterstitialCallback interstitialCallback, Mediation mediation) {
        this.location = str;
        this.callback = interstitialCallback;
        this.mediation = mediation;
        this.api$delegate = new k43(new a());
        this.mainThreadHandler = ew3.H0(Looper.getMainLooper());
    }

    private final c6 getApi() {
        return (c6) this.api$delegate.getValue();
    }

    private final void postSessionNotStartedInMainThread(boolean z) {
        try {
            this.mainThreadHandler.post(new ym(z, this, 1));
        } catch (Exception e) {
            Log.e("Chartboost", "Interstitial ad cannot post session not started callback " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postSessionNotStartedInMainThread$lambda$0(boolean z, Interstitial interstitial) {
        if (z) {
            interstitial.callback.onAdLoaded(new CacheEvent(null, interstitial), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            interstitial.callback.onAdShown(new ShowEvent(null, interstitial), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
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
            getApi().b(this, this.callback);
        }
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

    public /* synthetic */ Interstitial(String str, InterstitialCallback interstitialCallback, Mediation mediation, int i, ng0 ng0Var) {
        this(str, interstitialCallback, (i & 4) != 0 ? null : mediation);
    }
}
