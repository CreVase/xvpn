package com.bumptech.glide.load;

import defpackage.na1;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f689a;

    ImageHeaderParser$ImageType(boolean z) {
        this.f689a = z;
    }

    public boolean hasAlpha() {
        return this.f689a;
    }

    public boolean isWebp() {
        int i = na1.f3423a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }
}
