package com.vungle.ads;

import defpackage.ng0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdConfig {
    public static final int AUTO_ROTATE = 2;
    public static final Companion Companion = new Companion(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface Settings {
    }

    @Orientation
    public static /* synthetic */ void getAdOrientation$annotations() {
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i) {
        this.adOrientation = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z) {
        int i;
        if (z) {
            i = this.settings | 2;
        } else {
            i = this.settings & (-3);
        }
        this.settings = i;
    }

    public final void setWatermark(String str) {
        this.extras.put(WATERMARK, str);
    }
}
