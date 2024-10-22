package com.vungle.ads;

/* loaded from: classes2.dex */
public enum BannerAdSize {
    VUNGLE_MREC("mrec", 300, 250),
    BANNER("banner", 320, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    private final int height;
    private final String sizeName;
    private final int width;

    BannerAdSize(String str, int i, int i2) {
        this.sizeName = str;
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final int getWidth() {
        return this.width;
    }
}
