package com.chartboost.sdk.impl;

import android.net.Uri;
import defpackage.d20;
import defpackage.i23;

/* loaded from: classes.dex */
public final class y {
    public static final String a(String str) {
        if (!(str.length() > 0)) {
            return "";
        }
        if (!i23.q1(str, "https://", false) && !i23.q1(str, "http://", false)) {
            str = "https://".concat(str);
        }
        Uri parse = Uri.parse(str);
        return parse == null ? "" : d20.K0(parse.getPathSegments(), "_", null, null, null, 62);
    }

    public static final h6 a(int i) {
        h6 h6Var;
        h6[] values = h6.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                h6Var = null;
                break;
            }
            h6Var = values[i2];
            if (h6Var.b() == i) {
                break;
            }
            i2++;
        }
        return h6Var == null ? h6.UNKNOWN : h6Var;
    }
}
