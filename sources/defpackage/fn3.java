package defpackage;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class fn3 extends en3 {
    public static boolean k = true;

    @Override // defpackage.s71
    public void q(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.q(view, i);
        } else if (k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
