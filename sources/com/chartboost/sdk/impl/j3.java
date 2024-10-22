package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.o9;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class j3 extends o9 {
    public j3(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 16, null);
    }

    public /* synthetic */ j3(String str, String str2, String str3, String str4, Mediation mediation, int i, ng0 ng0Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : mediation);
    }

    public j3(String str, String str2, String str3, String str4, Mediation mediation) {
        super(str, str2, str3, str4, mediation);
        a(o9.a.CRITICAL);
    }
}
