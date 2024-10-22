package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.h;

/* loaded from: classes2.dex */
public final class fd2 extends h implements ke1 {
    public static final /* synthetic */ int v = 0;
    public final w30 u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fd2(defpackage.w30 r5, defpackage.jd2 r6, defpackage.f83 r7) {
        /*
            r4 = this;
            android.view.ViewGroup r0 = r5.e
            r1 = r0
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r4.<init>(r1)
            r4.u = r5
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            android.graphics.drawable.StateListDrawable r2 = defpackage.v73.o()
            r0.setBackground(r2)
            android.widget.TextView r5 = r5.f4933b
            r0 = 1
            r5.setSelected(r0)
            r0 = 9
            float r0 = (float) r0
            float r2 = defpackage.tf3.F
            float r0 = r0 * r2
            r2 = 0
            r3 = 1000118(0xf42b6, float:1.401464E-39)
            android.graphics.drawable.RippleDrawable r0 = defpackage.v73.t(r0, r2, r3)
            r5.setBackground(r0)
            ww2 r0 = new ww2
            r2 = 12
            r0.<init>(r2, r6, r4)
            r1.setOnClickListener(r0)
            if (r7 == 0) goto L40
            r7.q(r4)
            r6 = 1000121(0xf42b9, float:1.401468E-39)
            r7.j(r5, r6)
        L40:
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd2.<init>(w30, jd2, f83):void");
    }

    @Override // defpackage.ke1
    public final void a() {
        w30 w30Var = this.u;
        w30Var.c.setTextColor(v73.j(1000149));
        ((TextView) w30Var.d).setTextColor(v73.j(1000149));
        ((ConstraintLayout) w30Var.e).invalidate();
    }
}
