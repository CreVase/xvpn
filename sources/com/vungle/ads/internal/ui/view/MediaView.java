package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    public MediaView(Context context) {
        super(context);
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            imageView3 = null;
        }
        imageView3.setAdjustViewBounds(true);
        ImageView imageView4 = this.imageView;
        if (imageView4 != null) {
            imageView2 = imageView4;
        }
        addView(imageView2);
        requestLayout();
    }

    public final void destroy() {
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(null);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            imageView3 = null;
        }
        if (imageView3.getParent() != null) {
            ImageView imageView4 = this.imageView;
            if (imageView4 == null) {
                imageView4 = null;
            }
            ViewGroup viewGroup = (ViewGroup) imageView4.getParent();
            ImageView imageView5 = this.imageView;
            if (imageView5 != null) {
                imageView2 = imageView5;
            }
            viewGroup.removeView(imageView2);
        }
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            return null;
        }
        return imageView;
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
