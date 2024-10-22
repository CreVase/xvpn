package defpackage;

import a.du;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.google.android.gms.internal.consent_sdk.zzl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class e extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public static final e g = new e(0);
    public static final e h = new e(1);
    public static final e i = new e(2);
    public static final e j = new e(3);
    public static final e k = new e(4);
    public static final e l = new e(5);
    public static final e m = new e(6);
    public static final e n = new e(7);
    public static final e o = new e(8);
    public static final e p = new e(9);
    public static final e q = new e(10);
    public static final e r = new e(11);
    public static final e s = new e(12);
    public static final e t = new e(13);
    public static final e u = new e(14);
    public static final e v = new e(15);
    public static final e w = new e(16);
    public static final e x = new e(17);
    public static final e y = new e(18);
    public static final e z = new e(19);
    public static final e A = new e(20);
    public static final e B = new e(21);
    public static final e C = new e(22);
    public static final e D = new e(23);
    public static final e E = new e(24);
    public static final e F = new e(25);
    public static final e G = new e(26);
    public static final e H = new e(27);
    public static final e I = new e(28);
    public static final e J = new e(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2) {
        super(0);
        this.f = i2;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m98invoke() {
        int i2 = 2;
        int i3 = 1;
        switch (this.f) {
            case 0:
                yv3.f5398b = true;
                du.d(220, null);
                return;
            case 1:
                x8.f5127a.d();
                return;
            case 2:
            case 3:
            case 6:
            case 13:
            case 15:
            case 23:
            case 24:
            case 25:
            default:
                t9.a();
                return;
            case 4:
                du.d(26, null);
                return;
            case 5:
                du.d(27, null);
                return;
            case 7:
                GoogleIABHelper.g.getClass();
                pp ppVar = GoogleIABHelper.h;
                if (ppVar != null) {
                    pq0 pq0Var = new pq0(2);
                    pq0Var.f3897b = "subs";
                    ppVar.b(pq0Var.d(), new c02(0));
                    return;
                }
                return;
            case 8:
                GoogleIABHelper.g.m();
                pp ppVar2 = GoogleIABHelper.h;
                if (ppVar2 != null) {
                    pq0 pq0Var2 = new pq0(2);
                    pq0Var2.f3897b = "subs";
                    ppVar2.b(pq0Var2.d(), new c02(i3));
                    return;
                }
                return;
            case 9:
                GoogleIABHelper.g.getClass();
                pp ppVar3 = GoogleIABHelper.h;
                if (ppVar3 != null) {
                    pq0 pq0Var3 = new pq0(2);
                    pq0Var3.f3897b = "subs";
                    ppVar3.b(pq0Var3.d(), new c02(i2));
                    return;
                }
                return;
            case 10:
                GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
                googleIABHelper.m();
                googleIABHelper.d = 3842;
                googleIABHelper.j();
                return;
            case 11:
                du.d(389, null);
                return;
            case 12:
                du.d(388, null);
                return;
            case 14:
                t9.a();
                return;
            case 16:
                zf3.G();
                return;
            case 17:
                m20.f1(zf3.f5472a);
                return;
            case 18:
                yc2.c.g("");
                return;
            case 19:
                return;
            case 20:
                du.d(452, null);
                return;
            case 21:
                du.d(388, null);
                return;
            case 22:
                du.d(389, null);
                return;
            case 26:
                pe0.e();
                return;
            case 27:
            case 28:
                return;
        }
    }

    @Override // defpackage.v31
    public final Object invoke() {
        int i2;
        ch3 ch3Var = ch3.f636a;
        int i3 = this.f;
        boolean z2 = false;
        switch (i3) {
            case 0:
                m98invoke();
                return ch3Var;
            case 1:
                m98invoke();
                return ch3Var;
            case 2:
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(2000L);
                rotateAnimation.setRepeatCount(-1);
                return rotateAnimation;
            case 3:
                zzl zzlVar = l83.f;
                if (zzlVar != null && zzlVar.canRequestAds()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                m98invoke();
                return ch3Var;
            case 5:
                m98invoke();
                return ch3Var;
            case 6:
                return new HashMap();
            case 7:
                m98invoke();
                return ch3Var;
            case 8:
                m98invoke();
                return ch3Var;
            case 9:
                m98invoke();
                return ch3Var;
            case 10:
                m98invoke();
                return ch3Var;
            case 11:
                m98invoke();
                return ch3Var;
            case 12:
                m98invoke();
                return ch3Var;
            case 13:
                return new lg2();
            case 14:
                m98invoke();
                return ch3Var;
            case 15:
                return tf3.q(c81.e, d81.e, e81.e, f81.e);
            case 16:
                m98invoke();
                return ch3Var;
            case 17:
                m98invoke();
                return ch3Var;
            case 18:
                m98invoke();
                return ch3Var;
            case 19:
                m98invoke();
                return ch3Var;
            case 20:
                m98invoke();
                return ch3Var;
            case 21:
                m98invoke();
                return ch3Var;
            case 22:
                m98invoke();
                return ch3Var;
            case 23:
                switch (i3) {
                    case 23:
                        return new xt2();
                    default:
                        return new xt2();
                }
            case 24:
                switch (i3) {
                    case 23:
                        return new xt2();
                    default:
                        return new xt2();
                }
            case 25:
                StateListDrawable stateListDrawable = new StateListDrawable();
                int[] iArr = ew3.p;
                GradientDrawable gradientDrawable = new GradientDrawable();
                float f = 10;
                gradientDrawable.setCornerRadius(tf3.F * f);
                Context z3 = zf3.z();
                if (z3 != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Resources resources = z3.getResources();
                        if (resources != null) {
                            i2 = resources.getColor(R.color.tvBlue, z3.getTheme());
                        }
                    } else {
                        Resources resources2 = z3.getResources();
                        if (resources2 != null) {
                            i2 = resources2.getColor(R.color.tvBlue);
                        }
                    }
                    gradientDrawable.setColor(i2);
                    stateListDrawable.addState(iArr, gradientDrawable);
                    int[] iArr2 = StateSet.WILD_CARD;
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setCornerRadius(f * tf3.F);
                    gradientDrawable2.setStroke(tf3.K(1), -10066330);
                    stateListDrawable.addState(iArr2, gradientDrawable2);
                    return stateListDrawable;
                }
                i2 = -16777216;
                gradientDrawable.setColor(i2);
                stateListDrawable.addState(iArr, gradientDrawable);
                int[] iArr22 = StateSet.WILD_CARD;
                GradientDrawable gradientDrawable22 = new GradientDrawable();
                gradientDrawable22.setCornerRadius(f * tf3.F);
                gradientDrawable22.setStroke(tf3.K(1), -10066330);
                stateListDrawable.addState(iArr22, gradientDrawable22);
                return stateListDrawable;
            case 26:
                m98invoke();
                return ch3Var;
            case 27:
                m98invoke();
                return ch3Var;
            case 28:
                m98invoke();
                return ch3Var;
            default:
                m98invoke();
                return ch3Var;
        }
    }
}
