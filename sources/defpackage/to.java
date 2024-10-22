package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes2.dex */
public final class to implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo f4549b;

    public /* synthetic */ to(yo yoVar, int i) {
        this.f4548a = i;
        this.f4549b = yoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.f4548a;
        int i2 = 1;
        yo yoVar = this.f4549b;
        switch (i) {
            case 0:
                if (yoVar.i != null && (context = yoVar.h) != null) {
                    int i3 = zf3.h;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    xo xoVar = yoVar.i;
                    xoVar.getLocationOnScreen(iArr);
                    int height2 = (height - (xoVar.getHeight() + iArr[1])) + ((int) xoVar.getTranslationY());
                    int i4 = yoVar.p;
                    if (height2 >= i4) {
                        yoVar.q = i4;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = xoVar.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        uv0 uv0Var = yo.u;
                        return;
                    }
                    int i5 = yoVar.p;
                    yoVar.q = i5;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i5 - height2) + marginLayoutParams.bottomMargin;
                    xoVar.requestLayout();
                    return;
                }
                return;
            case 1:
                yoVar.b();
                return;
            default:
                xo xoVar2 = yoVar.i;
                if (xoVar2 != null) {
                    ViewParent parent = xoVar2.getParent();
                    int i6 = 0;
                    xo xoVar3 = yoVar.i;
                    if (parent != null) {
                        xoVar3.setVisibility(0);
                    }
                    if (xoVar3.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(yoVar.d);
                        ofFloat.addUpdateListener(new oo(yoVar, i6));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(yoVar.f);
                        ofFloat2.addUpdateListener(new oo(yoVar, i2));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(yoVar.f5366a);
                        animatorSet.addListener(new po(yoVar, i2));
                        animatorSet.start();
                        return;
                    }
                    int height3 = xoVar3.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = xoVar3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    xoVar3.setTranslationY(height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height3, 0);
                    valueAnimator.setInterpolator(yoVar.e);
                    valueAnimator.setDuration(yoVar.c);
                    valueAnimator.addListener(new po(yoVar, i6));
                    valueAnimator.addUpdateListener(new qo(yoVar, height3));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
