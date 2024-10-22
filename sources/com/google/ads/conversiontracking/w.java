package com.google.ads.conversiontracking;

import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1416a;

    static {
        int[] iArr = new int[g.d.values().length];
        f1416a = iArr;
        try {
            iArr[g.d.DOUBLECLICK_CONVERSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1416a[g.d.IAP_CONVERSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1416a[g.d.GOOGLE_CONVERSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
