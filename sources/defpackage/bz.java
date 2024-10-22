package defpackage;

import a.bx;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class bz extends FrameLayout implements me0, f83, ke1 {

    /* renamed from: a, reason: collision with root package name */
    public final a83 f554a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f555b;
    public Paint c;
    public final eu3 d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public boolean i;
    public boolean j;
    public tt3 k;

    public bz(Context context, a83 a83Var) {
        super(context);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        this.f554a = a83Var;
        this.f555b = new RectF();
        new RectF();
        Paint paint = new Paint();
        paint.setColor(-1644824);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.c = paint;
        setWillNotDraw(false);
        eu3 eu3Var = new eu3(getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(pd0.y(R.string.ChatBsvNetworkTest));
        appCompatTextView.setTextSize(16.0f);
        appCompatTextView.setTypeface(n01.c());
        int K = tf3.K(20);
        int K2 = tf3.K(20);
        int K3 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams = null;
        }
        layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(K2, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(K, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(K3, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams);
        fl.n(this, appCompatTextView, 1000013);
        eu3Var.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setText("");
        appCompatTextView2.setTextSize(11.0f);
        appCompatTextView2.setTypeface(n01.b());
        int K4 = tf3.K(4);
        int K5 = tf3.K(20);
        int K6 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView2.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams2 = null;
        }
        layoutParams2 = layoutParams2 == null ? new LinearLayout.LayoutParams(-1, -2) : layoutParams2;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(K5, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K4, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(K6, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams2);
        fl.n(this, appCompatTextView2, 1000014);
        eu3Var.addView(appCompatTextView2);
        this.e = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setText(pd0.y(R.string.ChatBsvNetworkTestTips));
        appCompatTextView3.setTypeface(n01.b());
        int K7 = tf3.K(10);
        int K8 = tf3.K(20);
        int K9 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView3.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams8;
        } else {
            layoutParams3 = null;
        }
        layoutParams3 = layoutParams3 == null ? new LinearLayout.LayoutParams(-1, -2) : layoutParams3;
        layoutParams3.width = -1;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(K8, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K7, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(K9, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams3);
        fl.n(this, appCompatTextView3, 1000013);
        eu3Var.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setMaxLines(1);
        appCompatTextView4.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView4.setTextSize(11.0f);
        appCompatTextView4.setTextColor(-16725347);
        appCompatTextView4.setText("");
        tf3.V(appCompatTextView4);
        int K10 = tf3.K(8);
        int K11 = tf3.K(20);
        int K12 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams9 = appCompatTextView4.getLayoutParams();
        if (layoutParams9 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams9;
        } else {
            layoutParams4 = null;
        }
        layoutParams4 = layoutParams4 == null ? new LinearLayout.LayoutParams(-1, -2) : layoutParams4;
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(K11, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K10, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(K12, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams4);
        eu3Var.addView(appCompatTextView4);
        this.f = appCompatTextView4;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setText(pd0.y(R.string.LiveChatRunTest));
        appCompatTextView5.setGravity(17);
        appCompatTextView5.setTypeface(n01.c());
        appCompatTextView5.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{-1, -13421773}));
        appCompatTextView5.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(2 * tf3.F);
        gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed, android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{-3487030, -4868683, v73.j(1000081), v73.j(1000081), v73.j(1000080)}));
        appCompatTextView5.setBackground(gradientDrawable);
        int K13 = tf3.K(35);
        int K14 = tf3.K(10);
        int K15 = tf3.K(20);
        int K16 = tf3.K(20);
        int K17 = tf3.K(16);
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView5.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams10;
        } else {
            layoutParams5 = null;
        }
        layoutParams5 = layoutParams5 == null ? new LinearLayout.LayoutParams(-1, K13) : layoutParams5;
        layoutParams5.width = -1;
        layoutParams5.height = K13;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(K15, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(K14, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(K16, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(K17, layoutParams5.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams5);
        appCompatTextView5.setOnClickListener(new az(0, this, appCompatTextView5, context));
        eu3Var.addView(appCompatTextView5);
        this.g = appCompatTextView5;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView6.setId(-1);
        appCompatTextView6.setText("");
        tf3.A0(appCompatTextView6);
        appCompatTextView6.setCompoundDrawablesRelativeWithIntrinsicBounds(zf3.A(R.drawable.ic_chat_bsv_done), (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatTextView6.setText(pd0.y(R.string.TestStatusDonw));
        appCompatTextView6.setTypeface(n01.c());
        appCompatTextView6.setGravity(16);
        appCompatTextView6.setTextSize(16.0f);
        appCompatTextView6.setPaddingRelative(tf3.K(20), appCompatTextView6.getPaddingTop(), appCompatTextView6.getPaddingEnd(), appCompatTextView6.getPaddingBottom());
        appCompatTextView6.setCompoundDrawablePadding(tf3.K(10));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(ColorStateList.valueOf(v73.j(1000078)));
        float f = cz.i;
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        appCompatTextView6.setBackground(gradientDrawable2);
        int K18 = tf3.K(44);
        int K19 = tf3.K(16);
        ViewGroup.LayoutParams layoutParams11 = appCompatTextView6.getLayoutParams();
        LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams11 : null;
        layoutParams12 = layoutParams12 == null ? new LinearLayout.LayoutParams(-1, K18) : layoutParams12;
        layoutParams12.width = -1;
        layoutParams12.height = K18;
        layoutParams12.weight = Math.max(-1.0f, layoutParams12.weight);
        layoutParams12.gravity = Math.max(-1, layoutParams12.gravity);
        layoutParams12.leftMargin = Math.max(-1, layoutParams12.leftMargin);
        layoutParams12.topMargin = Math.max(K19, layoutParams12.topMargin);
        layoutParams12.rightMargin = Math.max(-1, layoutParams12.rightMargin);
        layoutParams12.bottomMargin = Math.max(-1, layoutParams12.bottomMargin);
        appCompatTextView6.setLayoutParams(layoutParams12);
        fl.n(this, appCompatTextView6, 1000013);
        tf3.V(appCompatTextView6);
        eu3Var.addView(appCompatTextView6);
        this.h = appCompatTextView6;
        if (eu3Var.getAttachToParent()) {
            addView(eu3Var);
        }
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((cz.h * 2) + cz.f, -2);
        layoutParams13.leftMargin = cz.d + cz.f1702a;
        layoutParams13.bottomMargin = cz.f1703b * 2;
        layoutParams13.gravity = 3;
        eu3Var.setLayoutParams(layoutParams13);
        this.d = eu3Var;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        fl.j(this, this);
    }

    @Override // defpackage.me0
    public final void B(String str) {
        String str2;
        if (ew3.c(str)) {
            String str3 = "";
            cz.M = "";
            tt3 tt3Var = this.k;
            if (tt3Var != null && (str2 = tt3Var.f4577a) != null) {
                str3 = str2;
            }
            p71.x(str3, 52);
            tt3 tt3Var2 = this.k;
            if (tt3Var2 != null) {
                setData(tt3Var2);
            }
            k13.c.g(42);
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setText("• " + str);
        }
    }

    @Override // defpackage.ke1
    public final void a() {
        TextView textView = this.g;
        if (textView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(2 * tf3.F);
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed, android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{-3487030, -4868683, v73.j(1000081), v73.j(1000081), v73.j(1000080)}));
            textView.setBackground(gradientDrawable);
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(ColorStateList.valueOf(v73.j(1000078)));
            float f = cz.i;
            gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
            textView2.setBackground(gradientDrawable2);
        }
    }

    @Override // defpackage.f83
    public final void addThemeInvalidateListener(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final void bindInvalidate(View view) {
        fl.j(view, this);
    }

    public final Paint getBorderPaint() {
        return this.c;
    }

    public final LinearLayout getBscPanel() {
        return this.d;
    }

    public final TextView getBtnStartTest() {
        return this.g;
    }

    public final tt3 getData() {
        return this.k;
    }

    @Override // defpackage.f83
    public a83 getThemeListeners() {
        return this.f554a;
    }

    public final TextView getTvBsvCmd() {
        return this.e;
    }

    public final TextView getTvBsvLog() {
        return this.f;
    }

    public final TextView getTvTestDone() {
        return this.h;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tt3 tt3Var = this.k;
        if (tt3Var != null) {
            setData(tt3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ne0.b(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f555b;
        float f = cz.i;
        canvas.drawRoundRect(rectF, f, f, tf3.E(v73.e()));
        super.onDraw(canvas);
        canvas.translate(cz.c, 0.0f);
        cz.q.draw(canvas);
        float f2 = cz.f1702a / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.c);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.f555b;
        eu3 eu3Var = this.d;
        rectF.set(new Rect(eu3Var.getLeft(), eu3Var.getTop(), eu3Var.getRight(), eu3Var.getBottom()));
        rectF.offset(cz.c, 0.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        getThemeListeners().b(z);
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    public final void setBorderPaint(Paint paint) {
        this.c = paint;
    }

    public final void setBtnStartTest(TextView textView) {
        this.g = textView;
    }

    public final void setData(tt3 tt3Var) {
        boolean z;
        String str;
        this.k = tt3Var;
        int length = tt3Var.c.length();
        if (length > 10) {
            length = 10;
        }
        TextView textView = this.e;
        if (textView != null) {
            String str2 = tt3Var.c;
            if (str2 != null) {
                str = str2.substring(0, length);
            } else {
                str = null;
            }
            textView.setText(str + "...");
        }
        bx j = hx2.j(tt3Var.f4577a, 51);
        boolean q = j.q();
        j.h();
        this.i = q;
        this.j = m20.L(cz.M, tt3Var.f4577a);
        if (this.i) {
            tf3.V(this.f);
            tf3.V(this.g);
            tf3.v0(this.h);
            return;
        }
        tf3.V(this.h);
        tf3.v0(this.g);
        if (cz.M.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tf3.V(this.f);
            TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
            TextView textView3 = this.g;
            if (textView3 != null) {
                textView3.setText(pd0.y(R.string.LiveChatRunTest));
                return;
            }
            return;
        }
        if (m20.L(cz.M, tt3Var.f4577a)) {
            ne0.a(this);
            tf3.v0(this.f);
            TextView textView4 = this.g;
            if (textView4 != null) {
                textView4.setEnabled(true);
            }
            TextView textView5 = this.g;
            if (textView5 != null) {
                textView5.setText(pd0.y(R.string.CheckTestProcess));
                return;
            }
            return;
        }
        tf3.V(this.f);
        TextView textView6 = this.g;
        if (textView6 != null) {
            textView6.setEnabled(false);
        }
        TextView textView7 = this.g;
        if (textView7 != null) {
            textView7.setText(pd0.y(R.string.LiveChatRunTest));
        }
    }

    public final void setTestDone(boolean z) {
        this.i = z;
    }

    public final void setTestRunning(boolean z) {
        this.j = z;
    }

    public final void setTvBsvCmd(TextView textView) {
        this.e = textView;
    }

    public final void setTvBsvLog(TextView textView) {
        this.f = textView;
    }

    public final void setTvTestDone(TextView textView) {
        this.h = textView;
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }
}
