package com.vungle.ads.internal.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.webkit.WebSettings;
import defpackage.ng0;
import defpackage.y70;

/* loaded from: classes2.dex */
public final class WebViewUtil {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "WebViewUtil";
    private final Context context;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public WebViewUtil(Context context) {
        this.context = context;
    }

    public final void getUserAgent(y70 y70Var) {
        try {
            y70Var.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e) {
            if (e instanceof AndroidRuntimeException) {
                Log.e(TAG, "WebView could be missing here");
            }
            y70Var.accept(null);
        }
    }
}
