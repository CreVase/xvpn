package com.chartboost.sdk.impl;

import android.content.Context;

/* loaded from: classes.dex */
public interface ka {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(ka kaVar, String str, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    str = null;
                }
                if ((i2 & 2) != 0) {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    z = false;
                }
                kaVar.a(str, i, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
        }
    }

    int a(y9 y9Var);

    void a(Context context);

    void a(String str, int i, boolean z);

    void a(String str, String str2, boolean z, f0 f0Var);

    boolean a(String str);

    y9 b(String str);
}
