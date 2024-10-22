package com.chartboost.sdk.impl;

import android.util.Log;
import com.chartboost.sdk.LoggingLevel;

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static final f6 f819a = new f6();

    /* renamed from: b, reason: collision with root package name */
    public static LoggingLevel f820b = LoggingLevel.INTEGRATION;

    public static final void a(String str, String str2) {
        LoggingLevel loggingLevel = LoggingLevel.NONE;
    }

    public static final void b(String str, String str2) {
        if (f820b == LoggingLevel.ALL) {
            Log.e(str, str2);
        }
    }

    public static final void c(String str, String str2) {
        if (f820b == LoggingLevel.ALL) {
            Log.i(str, str2);
        }
    }

    public static final void d(String str, String str2) {
        LoggingLevel loggingLevel = LoggingLevel.NONE;
    }

    public static final void e(String str, String str2) {
        LoggingLevel loggingLevel = LoggingLevel.NONE;
    }

    public static final void a(String str, String str2, Throwable th) {
        if (f820b == LoggingLevel.ALL) {
            Log.e(str, str2, th);
        }
    }
}
