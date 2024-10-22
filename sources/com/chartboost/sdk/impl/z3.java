package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public final class z3 {
    public static final String a(Exception exc) {
        String message;
        if (exc == null || (message = exc.getMessage()) == null) {
            return "Unknown error";
        }
        return message;
    }
}
