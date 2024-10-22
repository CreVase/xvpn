package com.google.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.AdSize f1369a;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2);
    public static final AdSize BANNER = new AdSize(320, 50);
    public static final AdSize IAB_MRECT = new AdSize(300, 250);
    public static final AdSize IAB_BANNER = new AdSize(468, 60);
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90);
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600);

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.f1369a = adSize;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdSize)) {
            return false;
        }
        return this.f1369a.equals(((AdSize) obj).f1369a);
    }

    public AdSize findBestSize(AdSize... adSizeArr) {
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        float f = 0.0f;
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (r6 * r7) / (width * height);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }

    public int getHeight() {
        return this.f1369a.getHeight();
    }

    public int getHeightInPixels(Context context) {
        return this.f1369a.getHeightInPixels(context);
    }

    public int getWidth() {
        return this.f1369a.getWidth();
    }

    public int getWidthInPixels(Context context) {
        return this.f1369a.getWidthInPixels(context);
    }

    public int hashCode() {
        return this.f1369a.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f1369a.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.f1369a.isFullWidth();
    }

    public boolean isSizeAppropriate(int i, int i2) {
        float width = getWidth();
        float f = i;
        float f2 = width * 1.25f;
        int height = getHeight();
        if (f <= f2 && f >= width * 0.8f) {
            float f3 = i2;
            float f4 = height;
            if (f3 <= 1.25f * f4 && f3 >= f4 * 0.8f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return this.f1369a.toString();
    }

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }
}
