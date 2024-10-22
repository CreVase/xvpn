package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class hv1 extends hl1 implements ru1 {
    public static final Method E;
    public ru1 D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public hv1(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // defpackage.hl1
    public final go0 a(Context context, boolean z) {
        gv1 gv1Var = new gv1(context, z);
        gv1Var.setHoverListener(this);
        return gv1Var;
    }

    @Override // defpackage.ru1
    public final void d(ju1 ju1Var, MenuItem menuItem) {
        ru1 ru1Var = this.D;
        if (ru1Var != null) {
            ru1Var.d(ju1Var, menuItem);
        }
    }

    @Override // defpackage.ru1
    public final void k(ju1 ju1Var, su1 su1Var) {
        ru1 ru1Var = this.D;
        if (ru1Var != null) {
            ru1Var.k(ju1Var, su1Var);
        }
    }
}
