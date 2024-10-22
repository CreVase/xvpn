package com.security.xvpn.z35kb.browser;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import defpackage.ai0;
import defpackage.bk1;
import defpackage.bx3;
import defpackage.d83;
import defpackage.ep1;
import defpackage.ew3;
import defpackage.h53;
import defpackage.pe0;
import defpackage.v73;
import defpackage.w73;
import defpackage.x8;
import defpackage.x80;

/* loaded from: classes2.dex */
public class MainLayout extends NestedScrollView implements ai0, View.OnClickListener, w73 {
    public LinearLayout E;
    public final Context F;
    public LinearLayout G;
    public LinearLayout H;
    public ViewGroup.LayoutParams I;
    public FrameLayout J;
    public ep1 K;

    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = context;
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.I = layoutParams;
        addView(this.E, layoutParams);
        this.G = L(new int[]{5, 4, 8, 6}, new String[]{"Facebook", "X", "Instagram", "Tiktok"}, new int[]{R.drawable.icon_browser_facebook, R.drawable.icon_browser_x, R.drawable.icon_browser_ins, R.drawable.icon_browser_tiktok});
        this.H = L(new int[]{1, 7, 2, 3}, new String[]{"Youtube", "Snapchat", "Amazon", "Reddit"}, new int[]{R.drawable.icon_browser_youtube, R.drawable.icon_browser_snapchat, R.drawable.icon_browser_amazon, R.drawable.icon_browser_reddit});
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        float f = 30;
        layoutParams2.topMargin = (int) (bx3.z(context) * f);
        this.E.addView(this.G, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = (int) (bx3.z(context) * f);
        layoutParams3.bottomMargin = (int) (bx3.z(context) * f);
        this.E.addView(this.H, layoutParams3);
        if (ew3.W()) {
            this.E.addView(LayoutInflater.from(context).inflate(R.layout.layout_ad_browser_banner, (ViewGroup) null), this.I);
            this.J = (FrameLayout) findViewById(R.id.item_ad_min_root_admob_wrapper);
        }
        setNestedScrollingEnabled(false);
    }

    public final void K(String str) {
        ((h53) this.K).f2370a.c.b(3, str);
    }

    public final LinearLayout L(int[] iArr, String[] strArr, int[] iArr2) {
        Context context = this.F;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        for (int i = 0; i < iArr.length; i++) {
            TextView textView = new TextView(context);
            textView.setId(iArr[i]);
            textView.setText(strArr[i]);
            textView.setTextSize(12.0f);
            textView.setGravity(17);
            textView.setTextColor(v73.z());
            textView.setOnClickListener(this);
            Drawable drawable = x80.getDrawable(context, iArr2[i]);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                textView.setCompoundDrawables(null, drawable, null, null);
            }
            textView.setCompoundDrawablePadding(bx3.t(context, 2));
            textView.setClickable(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            linearLayout.addView(textView, layoutParams);
        }
        return linearLayout;
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ai0
    public final void n(bk1 bk1Var) {
        if (getVisibility() != 0 || XApplication.c) {
            return;
        }
        if (ew3.X()) {
            FrameLayout frameLayout = this.J;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                this.E.removeView(this.J);
                return;
            }
            return;
        }
        if (this.J != null && ew3.W()) {
            x8.a(this.J);
            x8.e();
        } else {
            FrameLayout frameLayout2 = this.J;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d83.a(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case 1:
                pe0.a("ID_YOUTOBE", new Object[0]);
                K("https://www.youtube.com/");
                return;
            case 2:
                pe0.a("ID_AMAZON", new Object[0]);
                K("https://www.amazon.com/");
                return;
            case 3:
                pe0.a("ID_REDDIT", new Object[0]);
                K("https://www.reddit.com/");
                return;
            case 4:
                pe0.a("ID_TWITTER", new Object[0]);
                K("https://mobile.twitter.com/");
                return;
            case 5:
                pe0.a("ID_FACEBOOK", new Object[0]);
                K("https://m.facebook.com/");
                return;
            case 6:
                pe0.a("ID_TIKTOK", new Object[0]);
                K("https://www.tiktok.com/");
                return;
            case 7:
                pe0.a("ID_SNAPCHAT", new Object[0]);
                K("https://www.snapchat.com/");
                return;
            case 8:
                pe0.a("ID_INS", new Object[0]);
                K("https://www.instagram.com/");
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ai0
    public final void onDestroy(bk1 bk1Var) {
        try {
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d83.d(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(v73.j(1000058));
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void onStart(bk1 bk1Var) {
    }

    @Override // defpackage.ai0
    public final void onStop(bk1 bk1Var) {
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        invalidate();
        for (int i = 0; i < this.G.getChildCount(); i++) {
            ((TextView) this.G.getChildAt(i)).setTextColor(v73.z());
        }
        for (int i2 = 0; i2 < this.H.getChildCount(); i2++) {
            ((TextView) this.H.getChildAt(i2)).setTextColor(v73.z());
        }
    }

    public void setCallback(ep1 ep1Var) {
        this.K = ep1Var;
    }
}
