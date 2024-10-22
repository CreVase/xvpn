package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class m6 {
    public HttpsURLConnection a(v1<?> v1Var) throws IOException {
        return (HttpsURLConnection) new URL(v1Var.e()).openConnection();
    }
}
