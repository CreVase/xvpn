package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.InterstitialAd;

/* loaded from: classes.dex */
public class MetaFactory {
    public InterstitialAd createInterstitialAd(Context context, String str) {
        return new InterstitialAd(context, str);
    }
}
