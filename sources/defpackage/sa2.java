package defpackage;

import android.content.res.ColorStateList;
import android.util.StateSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.h;

/* loaded from: classes2.dex */
public final class sa2 extends h implements f83, ke1 {
    public static final /* synthetic */ int w = 0;
    public final te1 u;
    public final f83 v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sa2(defpackage.te1 r5, defpackage.f83 r6) {
        /*
            r4 = this;
            android.widget.LinearLayout r0 = r5.f4489a
            r4.<init>(r0)
            r4.u = r5
            r4.v = r6
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r1 = 2
            int[][] r1 = new int[r1]
            int[] r2 = defpackage.ew3.p
            r3 = 0
            r1[r3] = r2
            r2 = 1
            int[] r3 = android.util.StateSet.WILD_CARD
            r1[r2] = r3
            r2 = 1000038(0xf4266, float:1.401352E-39)
            int r2 = defpackage.v73.j(r2)
            r3 = -13982994(0xffffffffff2aa2ee, float:-2.2681474E38)
            int[] r2 = new int[]{r3, r2}
            r6.<init>(r1, r2)
            android.widget.TextView r1 = r5.d
            r1.setTextColor(r6)
            android.widget.TextView r1 = r5.c
            r1.setTextColor(r6)
            android.widget.TextView r5 = r5.f4490b
            r6 = 1000134(0xf42c6, float:1.401486E-39)
            defpackage.fl.n(r4, r5, r6)
            android.graphics.drawable.StateListDrawable r5 = defpackage.v73.o()
            r0.setBackground(r5)
            defpackage.fl.k(r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.<init>(te1, f83):void");
    }

    @Override // defpackage.ke1
    public final void a() {
        ColorStateList colorStateList = new ColorStateList(new int[][]{ew3.p, StateSet.WILD_CARD}, new int[]{-13982994, v73.j(1000038)});
        te1 te1Var = this.u;
        te1Var.d.setTextColor(colorStateList);
        te1Var.c.setTextColor(colorStateList);
        te1Var.f4490b.setTextColor(v73.j(1000134));
        te1Var.f4489a.setBackground(v73.o());
    }

    @Override // defpackage.f83
    public final void addThemeInvalidateListener(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final void bindInvalidate(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final a83 getThemeListeners() {
        return this.v.getThemeListeners();
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        getThemeListeners().b(z);
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }
}
