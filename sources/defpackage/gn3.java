package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class gn3 extends fn3 {
    @Override // defpackage.en3, defpackage.s71
    public final void o(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.fn3, defpackage.s71
    public final void q(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.cn3
    public final float s(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.cn3
    public final void t(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.dn3
    public final void u(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.dn3
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
