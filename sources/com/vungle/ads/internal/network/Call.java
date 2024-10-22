package com.vungle.ads.internal.network;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface Call<T> {
    void cancel();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();
}
