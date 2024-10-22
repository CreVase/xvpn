package com.chartboost.sdk.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class kc {
    public static void a() {
        if (!r6.a()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(xa xaVar) {
        if (xaVar.i()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(xa xaVar) {
        if (xaVar.n()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    public static void d(xa xaVar) {
        if (!xaVar.n()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void e(xa xaVar) {
        if (!xaVar.l()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void f(xa xaVar) {
        if (!xaVar.m()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void g(xa xaVar) {
        if (xaVar.k().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void h(xa xaVar) {
        if (xaVar.k().d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void a(j7 j7Var, i3 i3Var, t5 t5Var) {
        if (j7Var == j7.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (i3Var == i3.DEFINED_BY_JAVASCRIPT && j7Var == j7.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (t5Var == t5.DEFINED_BY_JAVASCRIPT && j7Var == j7.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void a(xa xaVar) {
        d(xaVar);
        b(xaVar);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
