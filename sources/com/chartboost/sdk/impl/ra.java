package com.chartboost.sdk.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import defpackage.nw3;

/* loaded from: classes.dex */
public abstract class ra extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public g7 f1113a;

    /* renamed from: b, reason: collision with root package name */
    public i2 f1114b;
    public h2 c;
    public RelativeLayout d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;

    public ra(Context context) {
        super(context);
        this.f1113a = null;
        this.f1114b = null;
        this.e = false;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public final void a(boolean z) {
        if (z) {
            this.f1113a = null;
        }
        a((Activity) getContext());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = i;
        this.i = i2;
    }

    public final void a(Activity activity) {
        int i;
        int i2;
        if (this.h == -1 || this.i == -1) {
            try {
                i = getWidth();
                i2 = getHeight();
                if (i == 0 || i2 == 0) {
                    View findViewById = activity.getWindow().findViewById(R.id.content);
                    if (findViewById == null) {
                        findViewById = activity.getWindow().getDecorView();
                    }
                    int width = findViewById.getWidth();
                    i2 = findViewById.getHeight();
                    i = width;
                }
            } catch (Exception unused) {
                i = 0;
                i2 = 0;
            }
            if (i == 0 || i2 == 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i3 = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
                i = i3;
            }
            this.h = i;
            this.i = i2;
        }
        a(this.h, this.i, activity);
    }

    public final void a(int i, int i2, Activity activity) {
        g7 g7Var;
        if (this.e) {
            return;
        }
        g7 a2 = CBUtility.a((Context) activity);
        if (this.f == i && this.g == i2 && (g7Var = this.f1113a) != null && g7Var == a2) {
            return;
        }
        this.e = true;
        try {
            post(new nw3(this, 11));
            this.f = i;
            this.g = i2;
            this.f1113a = a2;
        } catch (Exception e) {
            f6.a("test", "Exception raised while layouting Subviews", e);
        }
        this.e = false;
    }

    public void a() {
        i2 i2Var = this.f1114b;
        if (i2Var == null) {
            f6.a("ViewBase", "Webview is null on destroyWebview");
            return;
        }
        RelativeLayout relativeLayout = this.d;
        if (relativeLayout != null) {
            relativeLayout.removeView(i2Var);
            removeView(this.d);
        } else {
            f6.a("CommonWebViewBase", "webViewContainer is null destroyWebview");
        }
        this.f1114b.loadUrl("about:blank");
        this.f1114b.onPause();
        this.f1114b.removeAllViews();
        this.f1114b.destroy();
        this.f1114b = null;
        this.c = null;
        this.d = null;
        removeAllViews();
    }
}
