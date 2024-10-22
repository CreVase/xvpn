package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes.dex */
public class AdCompanionView extends AdComponentFrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public AdCompanionViewApi f1359a;

    public AdCompanionView(Context context) {
        super(context);
        initializeSelf(context);
    }

    public AdCompanionViewApi getAdCompanionViewApi() {
        return this.f1359a;
    }

    public final void initializeSelf(Context context) {
        AdCompanionViewApi createAdCompanionViewApi = DynamicLoaderFactory.makeLoader(context).createAdCompanionViewApi();
        this.f1359a = createAdCompanionViewApi;
        attachAdComponentViewApi(createAdCompanionViewApi);
        this.f1359a.initialize(this);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }
}
