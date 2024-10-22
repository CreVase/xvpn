package com.chartboost.sdk.ads;

/* loaded from: classes.dex */
public interface Ad {
    void cache();

    void cache(String str);

    void clearCache();

    String getLocation();

    boolean isCached();

    void show();
}
