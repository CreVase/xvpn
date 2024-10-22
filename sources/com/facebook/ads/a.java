package com.facebook.ads;

import android.content.res.Configuration;
import com.facebook.ads.internal.api.AdViewParentApi;

/* loaded from: classes.dex */
public final class a implements AdViewParentApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdView f1358a;

    public a(AdView adView) {
        this.f1358a = adView;
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.widget.RelativeLayout*/.onConfigurationChanged(configuration);
    }
}
