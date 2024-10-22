package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class bc implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f441b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bc(int i, Object obj, Object obj2) {
        this.f440a = i;
        this.f441b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f440a;
        Object obj = this.c;
        Object obj2 = this.f441b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                fr1 fr1Var = (fr1) obj;
                int i2 = AppBarLayout.y;
                appBarLayout.getClass();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fr1Var.setAlpha(floatValue);
                Iterator it = appBarLayout.r.iterator();
                while (it.hasNext()) {
                    p71.C(it.next());
                    ColorStateList colorStateList = fr1Var.f2139a.c;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(floatValue).getDefaultColor();
                        throw null;
                    }
                }
                return;
            case 1:
                AppBarLayout appBarLayout2 = (AppBarLayout) obj2;
                int i3 = AppBarLayout.y;
                appBarLayout2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((fr1) obj).i(floatValue2);
                Drawable drawable = appBarLayout2.v;
                if (drawable instanceof fr1) {
                    ((fr1) drawable).i(floatValue2);
                }
                Iterator it2 = appBarLayout2.r.iterator();
                if (!it2.hasNext()) {
                    return;
                }
                p71.C(it2.next());
                throw null;
            default:
                ((View) ((xp3) ((v51) obj2).f4780b).d.getParent()).invalidate();
                return;
        }
    }
}
