package com.chartboost.sdk.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.f;
import com.chartboost.sdk.impl.m8;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ew3;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ng0;
import defpackage.ui1;
import defpackage.v31;
import defpackage.ym;

/* loaded from: classes.dex */
public final class Rewarded implements Ad {
    private final ui1 api$delegate;
    private final RewardedCallback callback;
    private final String location;
    private final Handler mainThreadHandler;
    private final Mediation mediation;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a */
        public final m8 invoke() {
            return f.c(Rewarded.this.mediation);
        }
    }

    public Rewarded(String str, RewardedCallback rewardedCallback, Mediation mediation) {
        this.location = str;
        this.callback = rewardedCallback;
        this.mediation = mediation;
        this.api$delegate = new k43(new a());
        this.mainThreadHandler = ew3.H0(Looper.getMainLooper());
    }

    public static /* synthetic */ void a(boolean z, Rewarded rewarded) {
        postSessionNotStartedInMainThread$lambda$0(z, rewarded);
    }

    private final m8 getApi() {
        return (m8) this.api$delegate.getValue();
    }

    private final void postSessionNotStartedInMainThread(boolean z) {
        try {
            this.mainThreadHandler.post(new ym(z, this, 2));
        } catch (Exception e) {
            Log.e("Chartboost", "Interstitial ad cannot post session not started callback " + e);
        }
    }

    public static final void postSessionNotStartedInMainThread$lambda$0(boolean z, Rewarded rewarded) {
        if (z) {
            rewarded.callback.onAdLoaded(new CacheEvent(null, rewarded), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            rewarded.callback.onAdShown(new ShowEvent(null, rewarded), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
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

    public /* synthetic */ Rewarded(String str, RewardedCallback rewardedCallback, Mediation mediation, int i, ng0 ng0Var) {
        this(str, rewardedCallback, (i & 4) != 0 ? null : mediation);
    }
}
