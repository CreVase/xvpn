package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class fq3 extends WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final sc1 f2136a;

    /* renamed from: b, reason: collision with root package name */
    public List f2137b;
    public ArrayList c;
    public final HashMap d;

    public fq3(sc1 sc1Var) {
        super(0);
        this.d = new HashMap();
        this.f2136a = sc1Var;
    }

    public final iq3 a(WindowInsetsAnimation windowInsetsAnimation) {
        iq3 iq3Var = (iq3) this.d.get(windowInsetsAnimation);
        if (iq3Var == null) {
            iq3 iq3Var2 = new iq3(windowInsetsAnimation);
            this.d.put(windowInsetsAnimation, iq3Var2);
            return iq3Var2;
        }
        return iq3Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        sc1 sc1Var = this.f2136a;
        a(windowInsetsAnimation);
        sc1Var.f4314b.setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        sc1 sc1Var = this.f2136a;
        a(windowInsetsAnimation);
        View view = sc1Var.f4314b;
        int[] iArr = sc1Var.e;
        view.getLocationOnScreen(iArr);
        sc1Var.c = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.f2137b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation i = eq3.i(list.get(size));
                iq3 a2 = a(i);
                fraction = i.getFraction();
                a2.f2634a.d(fraction);
                this.c.add(a2);
            } else {
                sc1 sc1Var = this.f2136a;
                wq3 h = wq3.h(null, windowInsets);
                sc1Var.a(h, this.f2137b);
                return h.g();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        sc1 sc1Var = this.f2136a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        rc1 c = rc1.c(lowerBound);
        upperBound = bounds.getUpperBound();
        rc1 c2 = rc1.c(upperBound);
        View view = sc1Var.f4314b;
        int[] iArr = sc1Var.e;
        view.getLocationOnScreen(iArr);
        int i = sc1Var.c - iArr[1];
        sc1Var.d = i;
        view.setTranslationY(i);
        eq3.l();
        return eq3.g(c.d(), c2.d());
    }
}
