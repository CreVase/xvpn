package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class ue3 extends du3 {

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f4656b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public gc3 f;
    public te3 g;
    public h h;

    public ue3(Context context) {
        super(context, null, 4, 0);
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        setFocusable(true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int K = tf3.K(10);
        setPadding(K, K, K, K);
        setBackgroundResource(R.drawable.tv_location_item_background);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        pe0.Q(appCompatImageView, zf3.y(R.color.tv_location_indicator));
        int K2 = tf3.K(14);
        int K3 = tf3.K(14);
        ViewGroup.LayoutParams layoutParams4 = appCompatImageView.getLayoutParams();
        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams4;
        } else {
            layoutParams = null;
        }
        layoutParams = layoutParams == null ? new FrameLayout.LayoutParams(K2, K3) : layoutParams;
        layoutParams.width = K2;
        layoutParams.height = K3;
        layoutParams.gravity = Math.max(16, layoutParams.gravity);
        layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setImageResource(R.drawable.tv_ic_location_collapse_indicator);
        addView(appCompatImageView);
        this.d = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext(), null);
        appCompatImageView2.setId(-1);
        int K4 = tf3.K(28);
        int K5 = tf3.K(28);
        int K6 = tf3.K(28);
        ViewGroup.LayoutParams layoutParams5 = appCompatImageView2.getLayoutParams();
        if (layoutParams5 instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams5;
        } else {
            layoutParams2 = null;
        }
        layoutParams2 = layoutParams2 == null ? new FrameLayout.LayoutParams(K4, K5) : layoutParams2;
        layoutParams2.width = K4;
        layoutParams2.height = K5;
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.setMarginStart(Math.max(K6, layoutParams2.leftMargin));
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.setMarginEnd(Math.max(-1, layoutParams2.rightMargin));
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatImageView2.setLayoutParams(layoutParams2);
        addView(appCompatImageView2);
        this.c = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setDuplicateParentStateEnabled(true);
        appCompatTextView.setTextColor(zf3.y(R.color.tv_location_name));
        int K7 = tf3.K(77);
        int K8 = tf3.K(17);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView.getLayoutParams();
        if (layoutParams6 instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams3 = null;
        }
        layoutParams3 = layoutParams3 == null ? new FrameLayout.LayoutParams(-1, -2) : layoutParams3;
        layoutParams3.width = -1;
        layoutParams3.height = -2;
        layoutParams3.gravity = Math.max(16, layoutParams3.gravity);
        layoutParams3.setMarginStart(Math.max(K7, layoutParams3.leftMargin));
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.setMarginEnd(Math.max(K8, layoutParams3.rightMargin));
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams3);
        addView(appCompatTextView);
        this.f4656b = appCompatTextView;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext(), null);
        appCompatImageView3.setId(-1);
        appCompatImageView3.setDuplicateParentStateEnabled(true);
        pe0.Q(appCompatImageView3, zf3.y(R.color.tv_location_favorite));
        int K9 = tf3.K(17);
        int K10 = tf3.K(17);
        ViewGroup.LayoutParams layoutParams7 = appCompatImageView3.getLayoutParams();
        FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
        layoutParams8 = layoutParams8 == null ? new FrameLayout.LayoutParams(K9, K10) : layoutParams8;
        layoutParams8.width = K9;
        layoutParams8.height = K10;
        layoutParams8.gravity = Math.max(8388629, layoutParams8.gravity);
        layoutParams8.setMarginStart(Math.max(-1, layoutParams8.leftMargin));
        layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
        layoutParams8.setMarginEnd(Math.max(-1, layoutParams8.rightMargin));
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        appCompatImageView3.setLayoutParams(layoutParams8);
        addView(appCompatImageView3);
        this.e = appCompatImageView3;
        setOnClickListener(new cr1(this, 21));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: se3
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ue3 ue3Var = ue3.this;
                te3 te3Var = ue3Var.g;
                if (te3Var != null) {
                    h hVar = ue3Var.h;
                    kn1 kn1Var = (kn1) te3Var;
                    if (ew3.X()) {
                        int e = hVar.e();
                        gc3 gc3Var = (gc3) kn1Var.d.get(e);
                        zp2 zp2Var = (zp2) gc3Var.d;
                        if (zp2Var.h) {
                            p71.x(zp2Var.a(), 469);
                        } else {
                            p71.x(zp2Var.a(), 468);
                        }
                        ((zp2) gc3Var.d).h = !r2.h;
                        kn1Var.i(e, new Object());
                        v31 v31Var = kn1Var.f;
                        if (v31Var != null) {
                            v31Var.invoke();
                        }
                    }
                }
                return true;
            }
        });
    }

    public final te3 getCallback() {
        return this.g;
    }

    public final h getHolder() {
        return this.h;
    }

    public final ImageView getIvIndicator() {
        return this.d;
    }

    public final ImageView getIvServerIcon() {
        return this.c;
    }

    public final ImageView getIvServerStatus() {
        return this.e;
    }

    public final gc3 getServerNode() {
        return this.f;
    }

    public final TextView getTvServerName() {
        return this.f4656b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        v31 v31Var;
        gc3 gc3Var = this.f;
        if (gc3Var != null && !gc3Var.a()) {
            if (i == 22 && !gc3Var.c) {
                te3 te3Var = this.g;
                if (te3Var != null) {
                    kn1 kn1Var = (kn1) te3Var;
                    int e = this.h.e();
                    int C = kn1Var.C((gc3) kn1Var.d.get(e), false, e);
                    kn1Var.i(e, new Object());
                    kn1Var.l(e + 1, C);
                }
                return true;
            }
            if (i == 21 && gc3Var.c) {
                te3 te3Var2 = this.g;
                if (te3Var2 != null) {
                    kn1 kn1Var2 = (kn1) te3Var2;
                    int e2 = this.h.e();
                    int B = kn1Var2.B((gc3) kn1Var2.d.get(e2));
                    kn1Var2.i(e2, new Object());
                    kn1Var2.f2091a.e(e2 + 1, B);
                }
                return true;
            }
        }
        if (i != 4 && i != 21) {
            return super.onKeyDown(i, keyEvent);
        }
        te3 te3Var3 = this.g;
        if (te3Var3 != null && (v31Var = ((kn1) te3Var3).g) != null) {
            v31Var.invoke();
        }
        return true;
    }

    public final void setCallback(te3 te3Var) {
        this.g = te3Var;
    }

    public final void setHolder(h hVar) {
        this.h = hVar;
    }

    public final void setServerNode(gc3 gc3Var) {
        zp2 zp2Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        this.f = gc3Var;
        if (gc3Var != null && (zp2Var = (zp2) gc3Var.d) != null) {
            AppCompatTextView appCompatTextView = this.f4656b;
            appCompatTextView.setText(zp2Var.c());
            AppCompatImageView appCompatImageView = this.c;
            appCompatImageView.setImageResource(zp2Var.b());
            int i3 = 0;
            if (zp2Var.k != 2 && !this.f.b()) {
                z = false;
            } else {
                z = true;
            }
            if (!z && zp2Var.k == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f = 0.0f;
            appCompatTextView.setTranslationX(0.0f);
            AppCompatImageView appCompatImageView2 = this.d;
            appCompatImageView2.setTranslationX(0.0f);
            if (z2) {
                appCompatImageView2.setTranslationX(35 * tf3.F);
            } else if (zp2Var.k > 3 && !this.f.b()) {
                appCompatImageView2.setTranslationX(55 * tf3.F);
                appCompatTextView.setTranslationX(20 * tf3.F);
            }
            if (this.f.c) {
                f = 90.0f;
            }
            appCompatImageView2.setRotation(f);
            if (zp2Var.k >= 3 && !this.f.b()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                i = 0;
            } else {
                i = 4;
            }
            appCompatImageView.setVisibility(i);
            if (!(!this.f.a())) {
                i3 = 4;
            }
            appCompatImageView2.setVisibility(i3);
            if (zp2Var.d()) {
                i2 = R.drawable.tv_ic_server_locked;
            } else if (zp2Var.h) {
                i2 = R.drawable.tv_ic_server_collect_focused;
            } else {
                i2 = R.drawable.tv_ic_server_collect_normal;
            }
            this.e.setImageResource(i2);
            setSelected(zp2Var.h);
        }
    }
}
