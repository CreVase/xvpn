package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import defpackage.du3;
import defpackage.ke1;
import defpackage.n01;
import defpackage.o93;
import defpackage.tf3;
import defpackage.v73;

/* loaded from: classes2.dex */
public final class Toolbar extends du3 implements ke1 {
    public static final /* synthetic */ int j = 0;

    /* renamed from: b, reason: collision with root package name */
    public TextView f1640b;
    public ImageView c;
    public ImageView d;
    public final int e;
    public CharSequence f;
    public boolean g;
    public boolean h;
    public final Paint i;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // defpackage.ke1
    public final void a() {
        int i;
        TextView textView = this.f1640b;
        if (textView != null) {
            textView.setTextColor(v73.j(1000023));
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            if (!this.h && !v73.l()) {
                i = R.drawable.icon_nav_back;
            } else {
                i = R.drawable.icon_nav_back_white;
            }
            imageView.setImageResource(i);
        }
        setBackgroundColor(v73.j(1000022));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g) {
            Paint paint = this.i;
            paint.setColor(v73.j(1000025));
            if (canvas != null) {
                canvas.drawLine(0.0f, getHeight() - (paint.getStrokeWidth() / 2.0f), getWidth(), getHeight() - (paint.getStrokeWidth() / 2.0f), paint);
            }
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ImageView getBtnBack() {
        return this.c;
    }

    public final ImageView getBtnClose() {
        return this.d;
    }

    public final boolean getLightIcon() {
        return this.h;
    }

    public final Paint getPaint() {
        return this.i;
    }

    public final boolean getShowBackBtn() {
        ImageView imageView = this.c;
        if (imageView == null || !imageView.isShown()) {
            return false;
        }
        return true;
    }

    public final boolean getShowCloseBtn() {
        ImageView imageView = this.c;
        if (imageView == null || !imageView.isShown()) {
            return false;
        }
        return true;
    }

    public final boolean getShowShadow() {
        return this.g;
    }

    public final CharSequence getTitle() {
        return this.f;
    }

    public final int getToolbarHeight() {
        return this.e;
    }

    public final TextView getTvTitle() {
        return this.f1640b;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
        return windowInsets;
    }

    public final void setBtnBack(ImageView imageView) {
        this.c = imageView;
    }

    public final void setBtnClose(ImageView imageView) {
        this.d = imageView;
    }

    public final void setLightIcon(boolean z) {
        this.h = z;
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.icon_nav_back_white);
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.icon_nav_cancel_light);
        }
    }

    public final void setShowBackBtn(boolean z) {
        int i;
        if (z) {
            ImageView imageView = this.c;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                FrameLayout.LayoutParams layoutParams = null;
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
                appCompatImageView.setId(-1);
                appCompatImageView.setId(R.id.btnBack);
                if (!this.h && !v73.l()) {
                    i = R.drawable.icon_nav_back;
                } else {
                    i = R.drawable.icon_nav_back_white;
                }
                appCompatImageView.setImageResource(i);
                int D = tf3.D(10);
                appCompatImageView.setPadding(D, D, D, D);
                ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                }
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                }
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.gravity = Math.max(-1, layoutParams.gravity);
                layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
                layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
                layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
                layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
                layoutParams.gravity = 3;
                int i2 = this.e;
                layoutParams.width = i2;
                layoutParams.height = i2;
                layoutParams.leftMargin = tf3.D(5);
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setOnClickListener(new o93(appCompatImageView, 1));
                addView(appCompatImageView);
                imageView2 = appCompatImageView;
            }
            this.c = imageView2;
            tf3.v0(imageView2);
            return;
        }
        ImageView imageView3 = this.c;
        if (imageView3 != null) {
            tf3.V(imageView3);
        }
    }

    public final void setShowCloseBtn(boolean z) {
        int i;
        if (z) {
            ImageView imageView = this.d;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                FrameLayout.LayoutParams layoutParams = null;
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
                appCompatImageView.setId(-1);
                appCompatImageView.setId(R.id.btnClose);
                if (this.h) {
                    i = R.drawable.icon_nav_cancel_light;
                } else {
                    i = R.drawable.icon_nav_cancel;
                }
                appCompatImageView.setImageResource(i);
                int D = tf3.D(10);
                appCompatImageView.setPadding(D, D, D, D);
                ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                }
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                }
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.gravity = Math.max(-1, layoutParams.gravity);
                layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
                layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
                layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
                layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
                layoutParams.gravity = 5;
                int i2 = this.e;
                layoutParams.width = i2;
                layoutParams.height = i2;
                layoutParams.leftMargin = tf3.D(5);
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setOnClickListener(new o93(appCompatImageView, 0));
                addView(appCompatImageView);
                imageView2 = appCompatImageView;
            }
            this.d = imageView2;
            tf3.v0(imageView2);
            return;
        }
        ImageView imageView3 = this.d;
        if (imageView3 != null) {
            tf3.V(imageView3);
        }
    }

    public final void setShowShadow(boolean z) {
        this.g = z;
        setWillNotDraw(!z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f = charSequence;
        TextView textView = this.f1640b;
        if (textView == null) {
            FrameLayout.LayoutParams layoutParams = null;
            textView = new AppCompatTextView(getContext(), null);
            textView.setId(-1);
            textView.setText("");
            tf3.A0(textView);
            textView.setTypeface(n01.a());
            textView.setTextColor(v73.j(1000023));
            textView.setTextSize(19.0f);
            textView.setGravity(17);
            int i = this.e;
            textView.setPadding(i, 0, i, 0);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = Math.max(-1, layoutParams.gravity);
            layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
            layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
            layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
            layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
            layoutParams.height = i;
            layoutParams.gravity = 17;
            textView.setLayoutParams(layoutParams);
            addView(textView);
        }
        this.f1640b = textView;
        textView.setText(this.f);
    }

    public final void setTvTitle(TextView textView) {
        this.f1640b = textView;
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.e = tf3.D(44);
        setId(R.id.toolbar);
        setWillNotDraw(false);
        setBackgroundColor(v73.j(1000022));
        this.f = "";
        this.g = true;
        Paint paint = new Paint(5);
        paint.setColor(-1644825);
        paint.setStrokeWidth(Math.max(1.0f, tf3.F * 0.5f));
        this.i = paint;
    }
}
