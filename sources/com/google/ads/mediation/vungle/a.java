package com.google.ads.mediation.vungle;

import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes.dex */
public final class a implements VungleInitializer.VungleInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f1444a;

    public a(InitializationCompleteCallback initializationCompleteCallback) {
        this.f1444a = initializationCompleteCallback;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.f1444a.onInitializationFailed(adError.toString());
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        this.f1444a.onInitializationSucceeded();
    }
}
