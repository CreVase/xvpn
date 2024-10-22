package com.vungle.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.NativeAd;
import com.vungle.ads.internal.util.ViewUtility;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class NativeAdOptionsView extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    public static final Companion Companion = new Companion(null);
    private ImageView icon;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public NativeAdOptionsView(Context context) {
        super(context);
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int dpToPixels = ViewUtility.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.icon;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    public final void destroy() {
        removeAllViews();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView == null) {
            return null;
        }
        return imageView;
    }

    public final void renderTo(FrameLayout frameLayout, @NativeAd.AdOptionsPosition int i) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        frameLayout.addView(this);
        int dpToPixels = ViewUtility.INSTANCE.dpToPixels(getContext(), 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        layoutParams.gravity = 8388661;
                    } else {
                        layoutParams.gravity = 8388693;
                    }
                } else {
                    layoutParams.gravity = 8388691;
                }
            } else {
                layoutParams.gravity = 8388661;
            }
        } else {
            layoutParams.gravity = 8388659;
        }
        setLayoutParams(layoutParams);
        frameLayout.requestLayout();
    }

    public NativeAdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public NativeAdOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
