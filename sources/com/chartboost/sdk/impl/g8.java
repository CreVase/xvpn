package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public final class g8 {
    public static final int a(float f) {
        if (f == 0.0f) {
            return 0;
        }
        double d = f;
        if (d < 0.25d) {
            return 1;
        }
        if (d < 0.5d) {
            return 2;
        }
        if (d < 0.75d) {
            return 3;
        }
        return f < 1.0f ? 4 : 5;
    }
}
