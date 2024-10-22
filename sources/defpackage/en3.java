package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public class en3 extends dn3 {
    public static boolean j = true;

    @Override // defpackage.s71
    public void o(View view, int i, int i2, int i3, int i4) {
        if (j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
