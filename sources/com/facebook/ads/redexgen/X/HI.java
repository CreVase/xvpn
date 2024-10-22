package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: assets/audience_network.dex */
public final class HI {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @EnsuresNonNull({"#1"})
    public static <T> T A01(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static int A00(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    public static String A02(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static void A03(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A05(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A06(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
