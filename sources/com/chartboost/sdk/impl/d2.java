package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import defpackage.ng0;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f749a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public final SSLSocketFactory a() {
            SSLContext sSLContext;
            if (Build.VERSION.SDK_INT >= 29) {
                sSLContext = SSLContext.getInstance("TLSv1.3");
            } else {
                sSLContext = SSLContext.getInstance("TLSv1.2");
            }
            if (NetworkHelper.a()) {
                sSLContext.init(null, new X509TrustManager[]{p8.c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            return sSLContext.getSocketFactory();
        }

        public a() {
        }
    }

    public static final SSLSocketFactory a() {
        return f749a.a();
    }
}
