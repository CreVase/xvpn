package com.vungle.ads.internal.util;

import android.util.Log;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class Logger {
    public static final Companion Companion = new Companion(null);
    private static boolean enabled;

    public static final int d(String str, String str2) {
        return Companion.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return Companion.e(str, str2);
    }

    public static final int w(String str, String str2) {
        return Companion.w(str, str2);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final int d(String str, String str2) {
            if (Logger.enabled && str != null && str2 != null) {
                return Log.d(str, str2);
            }
            return -1;
        }

        public final int e(String str, String str2) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.e(str, str2);
        }

        public final void enable(boolean z) {
            Logger.enabled = z;
        }

        public final int w(String str, String str2) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.w(str, str2);
        }

        public final int e(String str, String str2, Throwable th) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.e(str, str2, th);
        }

        public final int w(String str, String str2, Throwable th) {
            boolean unused = Logger.enabled;
            return -1;
        }
    }

    public static final int e(String str, String str2, Throwable th) {
        return Companion.e(str, str2, th);
    }

    public static final int w(String str, String str2, Throwable th) {
        return Companion.w(str, str2, th);
    }
}
