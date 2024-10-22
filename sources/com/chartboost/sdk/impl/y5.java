package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.o9;

/* loaded from: classes.dex */
public class y5 extends o9 {
    public y5(String str, String str2, String str3, String str4, Mediation mediation) {
        super(str, str2, str3, str4, mediation);
        a(o9.a.INFO);
        if ("cache_finish_success".equals(str) || "cache_finish_failure".equals(str) || "show_finish_success".equals(str) || "show_finish_failure".equals(str)) {
            a(true);
        }
    }

    public y5(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }
}
