package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;

/* loaded from: classes.dex */
public final class j2 extends g2 {
    public final String R;
    public final f9 S;
    public String T;

    public j2(Context context, String str, h6 h6Var, String str2, r4 r4Var, z1 z1Var, s9 s9Var, e2 e2Var, Mediation mediation, String str3, v6 v6Var, c0 c0Var, f9 f9Var, wa waVar) {
        super(context, str, h6Var, str2, s9Var, r4Var, z1Var, e2Var, mediation, str3, v6Var, c0Var, waVar);
        this.R = str3;
        this.S = f9Var;
        this.T = "UNKNOWN";
    }

    @Override // com.chartboost.sdk.impl.g2
    public void D() {
    }

    @Override // com.chartboost.sdk.impl.g2
    public ra c(Context context) {
        try {
            return new ua(context, this.R, k(), this.S, w(), this.n);
        } catch (Exception e) {
            b("Can't instantiate WebViewBase: " + e);
            return null;
        }
    }
}
