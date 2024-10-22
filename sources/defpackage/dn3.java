package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class dn3 extends cn3 {
    public static boolean h = true;
    public static boolean i = true;

    public void u(View view, Matrix matrix) {
        if (h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
