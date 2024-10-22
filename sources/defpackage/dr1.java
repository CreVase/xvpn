package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* loaded from: classes2.dex */
public final class dr1 extends wd {
    public static final int g = qf2.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dr1(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.he2.radioButtonStyle
            int r4 = defpackage.dr1.g
            android.content.Context r8 = defpackage.ir1.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.bg2.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.y73.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.bg2.MaterialRadioButton_buttonTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L29
            android.content.res.ColorStateList r8 = defpackage.m20.j0(r8, r9, r0)
            defpackage.k40.c(r7, r8)
        L29:
            int r8 = defpackage.bg2.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr1.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int x = zf3.x(this, he2.colorControlActivated);
            int x2 = zf3.x(this, he2.colorOnSurface);
            int x3 = zf3.x(this, he2.colorSurface);
            this.e = new ColorStateList(h, new int[]{zf3.U(1.0f, x3, x), zf3.U(0.54f, x3, x2), zf3.U(0.38f, x3, x2), zf3.U(0.38f, x3, x2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && k40.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            k40.c(this, getMaterialThemeColorsTintList());
        } else {
            k40.c(this, null);
        }
    }
}
