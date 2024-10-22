package com.vungle.ads.internal.network.converters;

import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class EmptyResponseConverter implements Converter<ResponseBody, Void> {
    @Override // com.vungle.ads.internal.network.converters.Converter
    public Void convert(ResponseBody responseBody) {
        if (responseBody == null) {
            return null;
        }
        responseBody.close();
        return null;
    }
}
