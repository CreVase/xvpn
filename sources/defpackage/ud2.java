package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class ud2 extends FrameLayout implements f83 {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a83 f4652a;

    /* renamed from: b, reason: collision with root package name */
    public tt3 f4653b;
    public final RectF c;
    public final eu3 d;
    public Paint e;

    public ud2(Context context, a83 a83Var) {
        super(context);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        this.f4652a = a83Var;
        this.c = new RectF();
        Paint paint = new Paint();
        paint.setColor(-1644824);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.e = paint;
        setWillNotDraw(false);
        eu3 eu3Var = new eu3(getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(pd0.y(R.string.QuestionnaireDesc));
        appCompatTextView.setTextSize(16.0f);
        int i = 10;
        int K = tf3.K(10);
        int K2 = tf3.K(20);
        int K3 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
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
        appCompatTextView2.setText(pd0.y(R.string.QuestionnaireDescP2));
        appCompatTextView2.setTextSize(16.0f);
        int K4 = tf3.K(10);
        int K5 = tf3.K(20);
        int K6 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams4 = appCompatTextView2.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams4;
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
        fl.n(this, appCompatTextView2, 1000013);
        eu3Var.addView(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.QuestionnaireButton));
        bx3.i(valueOf, (String) i23.o1(pd0.y(R.string.QuestionnaireButton), new String[]{"\n"}).get(1), new q81(1));
        appCompatTextView3.setTypeface(n01.a());
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setClickable(true);
        appCompatTextView3.setBackground(appCompatTextView3.getResources().getDrawable(R.drawable.bg_button_questionnaire));
        int K7 = tf3.K(80);
        int K8 = tf3.K(17);
        int K9 = tf3.K(10);
        int K10 = tf3.K(10);
        int K11 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams5 = appCompatTextView3.getLayoutParams();
        LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        layoutParams6 = layoutParams6 == null ? new LinearLayout.LayoutParams(-1, K7) : layoutParams6;
        layoutParams6.width = -1;
        layoutParams6.height = K7;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(K9, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(K8, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(K10, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(K11, layoutParams6.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams6);
        appCompatTextView3.setOnClickListener(new ww2(i, context, this));
        appCompatTextView3.setText(valueOf);
        appCompatTextView3.setMinHeight(tf3.J(63.0f));
        eu3Var.addView(appCompatTextView3);
        if (eu3Var.getAttachToParent()) {
            addView(eu3Var);
        }
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((cz.h * 2) + cz.f, -2);
        layoutParams7.leftMargin = cz.d + cz.f1702a;
        layoutParams7.bottomMargin = cz.f1703b * 2;
        eu3Var.setLayoutParams(layoutParams7);
        this.d = eu3Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        fl.j(this, this);
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
        return this.e;
    }

    public final tt3 getData() {
        return this.f4653b;
    }

    public final View getPanel() {
        return this.d;
    }

    @Override // defpackage.f83
    public a83 getThemeListeners() {
        return this.f4652a;
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

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.c;
        float f2 = cz.i;
        canvas.drawRoundRect(rectF, f2, f2, tf3.E(v73.e()));
        super.onDraw(canvas);
        canvas.translate(cz.c, 0.0f);
        cz.q.draw(canvas);
        float f3 = cz.f1702a / 2.0f;
        canvas.drawCircle(f3, f3, f3, this.e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.c;
        eu3 eu3Var = this.d;
        rectF.set(new Rect(eu3Var.getLeft(), eu3Var.getTop(), eu3Var.getRight(), eu3Var.getBottom()));
        rectF.offset(cz.c, 0.0f);
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
        this.e = paint;
    }

    public final void setData(tt3 tt3Var) {
        this.f4653b = tt3Var;
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
