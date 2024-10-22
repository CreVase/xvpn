package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bw extends pb3 {
    public static final b43 A;
    public static final b43 B;
    public static final b43 C;
    public static final String[] x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b43 y;
    public static final b43 z;

    static {
        new xv();
        y = new b43("topLeft", 1, PointF.class);
        z = new b43("bottomRight", 2, PointF.class);
        A = new b43("bottomRight", 3, PointF.class);
        B = new b43("topLeft", 4, PointF.class);
        C = new b43("position", 5, PointF.class);
    }

    public final void H(wb3 wb3Var) {
        WeakHashMap weakHashMap = ll3.f3151a;
        View view = wb3Var.f4979b;
        if (xk3.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = wb3Var.f4978a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // defpackage.pb3
    public final void d(wb3 wb3Var) {
        H(wb3Var);
    }

    @Override // defpackage.pb3
    public final void g(wb3 wb3Var) {
        H(wb3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pb3
    public final Animator k(ViewGroup viewGroup, wb3 wb3Var, wb3 wb3Var2) {
        int i;
        bw bwVar;
        ObjectAnimator ofObject;
        if (wb3Var != null && wb3Var2 != null) {
            HashMap hashMap = wb3Var.f4978a;
            HashMap hashMap2 = wb3Var2.f4978a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i2 = rect.left;
                int i3 = rect2.left;
                int i4 = rect.top;
                int i5 = rect2.top;
                int i6 = rect.right;
                int i7 = rect2.right;
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = i6 - i2;
                int i11 = i8 - i4;
                int i12 = i7 - i3;
                int i13 = i9 - i5;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i10 != 0 && i11 != 0) || (i12 != 0 && i13 != 0)) {
                    if (i2 == i3 && i4 == i5) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    if (i6 != i7 || i8 != i9) {
                        i++;
                    }
                } else {
                    i = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i++;
                }
                int i14 = i;
                if (i14 > 0) {
                    View view = wb3Var2.f4979b;
                    an3.a(view, i2, i4, i6, i8);
                    if (i14 == 2) {
                        if (i10 == i12 && i11 == i13) {
                            bwVar = this;
                            bwVar.t.getClass();
                            ofObject = ObjectAnimator.ofObject(view, C, (TypeConverter) null, mp0.k(i2, i4, i3, i5));
                        } else {
                            bwVar = this;
                            aw awVar = new aw(view);
                            bwVar.t.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(awVar, y, (TypeConverter) null, mp0.k(i2, i4, i3, i5));
                            bwVar.t.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(awVar, z, (TypeConverter) null, mp0.k(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new yv(awVar));
                            ofObject = animatorSet;
                        }
                    } else {
                        bwVar = this;
                        if (i2 == i3 && i4 == i5) {
                            bwVar.t.getClass();
                            ofObject = ObjectAnimator.ofObject(view, A, (TypeConverter) null, mp0.k(i6, i8, i7, i9));
                        } else {
                            bwVar.t.getClass();
                            ofObject = ObjectAnimator.ofObject(view, B, (TypeConverter) null, mp0.k(i2, i4, i3, i5));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        m20.e1(viewGroup4, true);
                        bwVar.a(new zv(viewGroup4));
                    }
                    return ofObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.pb3
    public final String[] p() {
        return x;
    }
}
