package com.security.xvpn.z35kb.ui.components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.RectProgressBar;
import defpackage.cr1;
import defpackage.d83;
import defpackage.ew3;
import defpackage.io0;
import defpackage.pt3;
import defpackage.s50;
import defpackage.tf3;
import defpackage.v73;
import defpackage.w42;
import defpackage.w73;
import defpackage.zf3;

/* loaded from: classes2.dex */
public final class ConnectingStatusView extends LinearLayout implements w73, pt3 {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public Button f1617a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1618b;
    public TextView c;
    public ValueAnimator d;
    public RectProgressBar e;

    public ConnectingStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(1);
        setBackgroundColor(v73.j(1000003));
        setFitsSystemWindows(true);
        LayoutInflater.from(context).inflate(R.layout.layout_main_connecting, (ViewGroup) this, true);
        ((TextView) findViewById(R.id.tv_flag_1)).setTextColor(v73.y());
        this.f1617a = (Button) findViewById(R.id.btnCancel);
        this.f1618b = (ImageView) findViewById(R.id.ivConnectingLocation);
        this.c = (TextView) findViewById(R.id.tvConnectingLocation);
        this.e = (RectProgressBar) findViewById(R.id.progressBar);
        this.f1617a.setTextColor(v73.y());
        Button button = this.f1617a;
        float f2 = tf3.F;
        button.setBackground(v73.b(1000003, 20 * f2, f2 * 1));
        this.c.setTextColor(v73.y());
        ValueAnimator ofInt = ValueAnimator.ofInt(this.e.getMeasuredHeight(), 927);
        this.d = ofInt;
        ofInt.setInterpolator(new w42(0.2f, 0.58f, 0.44f, 0.98f));
        this.d.setDuration(15000L);
        this.d.addUpdateListener(new io0(this, 4));
        this.f1617a.setOnClickListener(new cr1(this, 27));
    }

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        Drawable A;
        if (i == 65281) {
            ImageView imageView = this.f1618b;
            ImageView imageView2 = (ImageView) ((ViewGroup) getParent()).findViewById(R.id.ivSelectedLocation);
            if (imageView2 == null || (A = imageView2.getDrawable()) == null) {
                A = zf3.A(R.drawable.icon_server_fastest);
            }
            imageView.setImageDrawable(A);
            this.c.setText(ew3.J(ew3.S0()));
            if (!this.d.isRunning()) {
                this.d.setIntValues(this.e.getMeasuredHeight(), 927);
                this.d.start();
                return;
            }
            return;
        }
        post(new s50(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public final ValueAnimator getAnimator() {
        return this.d;
    }

    public final Button getBtnCancel() {
        return this.f1617a;
    }

    public final ImageView getIvServerIcon() {
        return this.f1618b;
    }

    public final RectProgressBar getProgressBar() {
        return this.e;
    }

    public final TextView getTvServerLocation() {
        return this.c;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d83.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d83.d(this);
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        setBackgroundColor(v73.j(1000003));
        this.c.setTextColor(v73.y());
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        this.d = valueAnimator;
    }

    public final void setBtnCancel(Button button) {
        this.f1617a = button;
    }

    public final void setIvServerIcon(ImageView imageView) {
        this.f1618b = imageView;
    }

    public final void setProgressBar(RectProgressBar rectProgressBar) {
        this.e = rectProgressBar;
    }

    public final void setTvServerLocation(TextView textView) {
        this.c = textView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
