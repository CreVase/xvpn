package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class lz extends du3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f3208b;
    public final int c;
    public final int d;
    public final int e;
    public int f;
    public String g;
    public AppCompatTextView h;

    public lz(Context context) {
        super(context, null, 0);
        this.f3208b = 1;
        this.c = 2;
        int K = tf3.K(10);
        this.d = K;
        this.e = tf3.K(16);
        this.g = "";
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        layoutParams2 = layoutParams2 == null ? new FrameLayout.LayoutParams(-2, -2) : layoutParams2;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.setMarginStart(Math.max(-1, layoutParams2.leftMargin));
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.setMarginEnd(Math.max(-1, layoutParams2.rightMargin));
        Math.max(-1, layoutParams2.bottomMargin);
        layoutParams2.topMargin = K;
        layoutParams2.bottomMargin = K;
        layoutParams2.gravity = 17;
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setMaxWidth(cz.m);
        addView(appCompatTextView);
        this.h = appCompatTextView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public final String getText() {
        return this.g;
    }

    public final AppCompatTextView getTextView() {
        return this.h;
    }

    public final int getType() {
        return this.f;
    }

    public final int getTypeRate() {
        return this.f3208b;
    }

    public final int getTypeTimeline() {
        return this.c;
    }

    public final int getTypeWaiting() {
        return 0;
    }

    public final void setText(String str) {
        this.g = str;
        this.h.setText(str);
    }

    public final void setTextView(AppCompatTextView appCompatTextView) {
        this.h = appCompatTextView;
    }

    public final void setType(int i) {
        this.f = i;
        AppCompatTextView appCompatTextView = this.h;
        int i2 = this.d;
        if (i == 0) {
            int i3 = this.e;
            appCompatTextView.setPadding(i3, i2, i3, i2);
            appCompatTextView.setTextColor(-14339774);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(7 * tf3.F);
            gradientDrawable.setColor(-1380880);
            appCompatTextView.setBackground(gradientDrawable);
            appCompatTextView.setTypeface(n01.d());
            appCompatTextView.getPaint().setUnderlineText(false);
            return;
        }
        if (i == this.f3208b) {
            appCompatTextView.setBackground(null);
            appCompatTextView.setPadding(0, i2, 0, i2);
            appCompatTextView.setTypeface(n01.a());
            appCompatTextView.getPaint().setUnderlineText(true);
            appCompatTextView.setTextColor(-6710887);
            return;
        }
        if (i == this.c) {
            appCompatTextView.setBackground(null);
            appCompatTextView.setPadding(0, 0, 0, 0);
            appCompatTextView.setTypeface(n01.d());
            appCompatTextView.setTextSize(12.0f);
            appCompatTextView.getPaint().setUnderlineText(false);
            appCompatTextView.setTextColor(-7758426);
        }
    }
}
