package defpackage;

import android.text.Editable;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.RatingBar;

/* loaded from: classes2.dex */
public final /* synthetic */ class hz implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jz f2504b;

    public /* synthetic */ hz(jz jzVar, int i) {
        this.f2503a = i;
        this.f2504b = jzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        String str;
        Editable text;
        int i2 = this.f2503a;
        jz jzVar = this.f2504b;
        switch (i2) {
            case 0:
                RatingBar ratingBar = jzVar.f2861b;
                if (ratingBar != null) {
                    i = ratingBar.getProgress();
                } else {
                    i = 0;
                }
                if (i == 0) {
                    RatingBar ratingBar2 = jzVar.f2861b;
                    if (ratingBar2 != null) {
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10 * tf3.F, 0.0f, 0.0f);
                        translateAnimation.setInterpolator(new CycleInterpolator(3.0f));
                        translateAnimation.setDuration(500L);
                        ratingBar2.startAnimation(translateAnimation);
                        return;
                    }
                    return;
                }
                EditText editText = jzVar.c;
                if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                vt3 vt3Var = jzVar.h;
                if (vt3Var == null) {
                    vt3Var = new vt3();
                }
                jzVar.setRateInfo(vt3Var);
                vt3 vt3Var2 = jzVar.h;
                if (vt3Var2 != null) {
                    vt3Var2.f4897b = i;
                    vt3Var2.c = str;
                }
                ew3.b0(new iz(jzVar, 0));
                return;
            default:
                jzVar.a();
                return;
        }
    }
}
