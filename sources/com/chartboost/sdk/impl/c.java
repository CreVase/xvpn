package com.chartboost.sdk.impl;

import android.os.Handler;
import android.os.Looper;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.q;
import defpackage.av3;
import defpackage.bv3;
import defpackage.ch3;
import defpackage.cq0;
import defpackage.j11;
import defpackage.zu3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f735a;

    public c(Handler handler) {
        this.f735a = handler;
    }

    public final void a(String str, ShowError showError, Ad ad, AdCallback adCallback) {
        a().post(new zu3(ad, adCallback, str, showError, this, 1));
    }

    public final void b(String str, Ad ad, AdCallback adCallback) {
        a().post(new av3(ad, adCallback, str, this, 1));
    }

    public final void c(String str, Ad ad, AdCallback adCallback) {
        a().post(new av3(ad, adCallback, str, this, 0));
    }

    public static final void a(Ad ad, AdCallback adCallback, String str, ShowError showError, c cVar) {
        ch3 ch3Var = null;
        if (ad != null) {
            ch3 ch3Var2 = ch3.f636a;
            if (adCallback != null) {
                adCallback.onAdShown(new ShowEvent(str, ad), showError);
                ch3Var = ch3Var2;
            }
            if (ch3Var == null) {
                f6.c("AdApi", "Callback missing for " + cVar.a(ad) + " on onAdShown");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Ad is missing on onAdShown");
        }
    }

    public static final void b(Ad ad, AdCallback adCallback, String str, c cVar) {
        ch3 ch3Var = null;
        if (ad != null) {
            ch3 ch3Var2 = ch3.f636a;
            if (adCallback != null) {
                adCallback.onAdRequestedToShow(new ShowEvent(str, ad));
                ch3Var = ch3Var2;
            }
            if (ch3Var == null) {
                f6.c("AdApi", "Callback missing for " + cVar.a(ad) + " on onAdRequestedToShow");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Ad is missing on onAdRequestedToShow");
        }
    }

    public final void a(String str, Ad ad, AdCallback adCallback, int i) {
        a().post(new bv3(adCallback, ad, str, i));
    }

    public static final void a(AdCallback adCallback, Ad ad, String str, int i) {
        ch3 ch3Var = null;
        if (adCallback != null) {
            boolean z = adCallback instanceof RewardedCallback;
            ch3 ch3Var2 = ch3.f636a;
            if (z) {
                if (ad != null) {
                    ((RewardedCallback) adCallback).onRewardEarned(new RewardEvent(str, ad, i));
                    ch3Var = ch3Var2;
                }
                if (ch3Var == null) {
                    f6.c("AdApi", "Ad is missing on didEarnReward");
                }
            } else {
                f6.c("AdApi", "Invalid ad type to send a reward");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Missing callback on sendRewardCallbackOnMainThread");
        }
    }

    public final void a(String str, Ad ad, AdCallback adCallback) {
        a().post(new cq0(4, adCallback, ad, str));
    }

    public static final void a(AdCallback adCallback, Ad ad, String str) {
        ch3 ch3Var = null;
        if (adCallback != null) {
            boolean z = adCallback instanceof DismissibleAdCallback;
            ch3 ch3Var2 = ch3.f636a;
            if (z) {
                if (ad != null) {
                    ((DismissibleAdCallback) adCallback).onAdDismiss(new DismissEvent(str, ad));
                    ch3Var = ch3Var2;
                }
                if (ch3Var == null) {
                    f6.c("AdApi", "Ad is missing on onAdDismiss");
                }
            } else {
                f6.c("AdApi", "Invalid ad type to send onAdDismiss");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Missing callback on sendDismissCallbackOnMainThread");
        }
    }

    public static final void a(Ad ad, AdCallback adCallback, String str, c cVar) {
        ch3 ch3Var = null;
        if (ad != null) {
            ch3 ch3Var2 = ch3.f636a;
            if (adCallback != null) {
                adCallback.onImpressionRecorded(new ImpressionEvent(str, ad));
                ch3Var = ch3Var2;
            }
            if (ch3Var == null) {
                f6.c("AdApi", "Callback missing for " + cVar.a(ad) + " on onImpressionRecorded");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Ad is missing on onImpressionRecorded");
        }
    }

    public final void a(String str, CacheError cacheError, Ad ad, AdCallback adCallback) {
        a().post(new zu3(ad, adCallback, str, cacheError, this, 2));
    }

    public static final void a(Ad ad, AdCallback adCallback, String str, CacheError cacheError, c cVar) {
        ch3 ch3Var = null;
        if (ad != null) {
            ch3 ch3Var2 = ch3.f636a;
            if (adCallback != null) {
                adCallback.onAdLoaded(new CacheEvent(str, ad), cacheError);
                ch3Var = ch3Var2;
            }
            if (ch3Var == null) {
                f6.c("AdApi", "Callback missing for " + cVar.a(ad) + " on onAdLoaded");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Ad is missing on onAdLoaded");
        }
    }

    public final void a(String str, ClickError clickError, Ad ad, AdCallback adCallback) {
        a().post(new zu3(ad, adCallback, str, clickError, this, 0));
    }

    public static final void a(Ad ad, AdCallback adCallback, String str, ClickError clickError, c cVar) {
        ch3 ch3Var = null;
        if (ad != null) {
            ch3 ch3Var2 = ch3.f636a;
            if (adCallback != null) {
                adCallback.onAdClicked(new ClickEvent(str, ad), clickError);
                ch3Var = ch3Var2;
            }
            if (ch3Var == null) {
                f6.c("AdApi", "Callback missing for " + cVar.a(ad) + " on onAdClicked");
            }
            ch3Var = ch3Var2;
        }
        if (ch3Var == null) {
            f6.c("AdApi", "Ad is missing on onAdClicked");
        }
    }

    public final String a(Ad ad) {
        if (ad instanceof Interstitial) {
            return q.b.g.b();
        }
        if (ad instanceof Rewarded) {
            return q.c.g.b();
        }
        if (ad instanceof Banner) {
            return q.a.g.b();
        }
        throw new j11(null);
    }

    public final Handler a() {
        Handler handler = this.f735a;
        if (handler != null) {
            return handler;
        }
        f6.c("AdApi", "Missing handler on AdApiCallbackSender. Create new handler.");
        return new Handler(Looper.getMainLooper());
    }
}
