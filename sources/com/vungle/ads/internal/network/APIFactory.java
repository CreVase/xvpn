package com.vungle.ads.internal.network;

import okhttp3.Call;

/* loaded from: classes2.dex */
public final class APIFactory {
    private final Call.Factory okHttpClient;

    public APIFactory(Call.Factory factory) {
        this.okHttpClient = factory;
    }

    public final VungleApi createAPI(String str) {
        return new VungleApiImpl(str, this.okHttpClient);
    }
}
