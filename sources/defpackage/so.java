package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class so implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        int i2 = 0;
        int i3 = 1;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            yo yoVar = (yo) message.obj;
            int i4 = message.arg1;
            AccessibilityManager accessibilityManager = yoVar.s;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                xo xoVar = yoVar.i;
                if (xoVar.getVisibility() == 0) {
                    if (xoVar.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(yoVar.d);
                        ofFloat.addUpdateListener(new oo(yoVar, i2));
                        ofFloat.setDuration(yoVar.f5367b);
                        ofFloat.addListener(new no(yoVar, i4, i2));
                        ofFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height = xoVar.getHeight();
                        ViewGroup.LayoutParams layoutParams = xoVar.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height);
                        valueAnimator.setInterpolator(yoVar.e);
                        valueAnimator.setDuration(yoVar.c);
                        valueAnimator.addListener(new no(yoVar, i4, i3));
                        valueAnimator.addUpdateListener(new ro(yoVar));
                        valueAnimator.start();
                    }
                    return true;
                }
            }
            yoVar.b();
            return true;
        }
        yo yoVar2 = (yo) message.obj;
        xo xoVar2 = yoVar2.i;
        if (xoVar2.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = xoVar2.getLayoutParams();
            if (layoutParams2 instanceof k90) {
                k90 k90Var = (k90) layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                uo uoVar = baseTransientBottomBar$Behavior.j;
                uoVar.getClass();
                uoVar.f4707a = yoVar2.t;
                baseTransientBottomBar$Behavior.f1527b = new ja1(yoVar2, 27);
                k90Var.b(baseTransientBottomBar$Behavior);
                k90Var.g = 80;
            }
            xoVar2.k = true;
            yoVar2.g.addView(xoVar2);
            xoVar2.k = false;
            yoVar2.e();
            xoVar2.setVisibility(4);
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        if (xk3.c(xoVar2)) {
            yoVar2.d();
        } else {
            yoVar2.r = true;
        }
        return true;
    }
}
