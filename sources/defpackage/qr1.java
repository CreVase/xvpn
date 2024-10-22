package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;

/* loaded from: classes.dex */
public abstract class qr1 {
    public static final pr1 a(Context context) {
        int i;
        lr1 lr1Var;
        int i2 = Build.VERSION.SDK_INT;
        s7 s7Var = s7.f4283a;
        if (i2 >= 30) {
            s7Var.a();
        }
        if (i2 >= 30) {
            i = s7Var.a();
        } else {
            i = 0;
        }
        if (i >= 5) {
            lr1Var = new lr1(context);
        } else {
            lr1Var = null;
        }
        if (lr1Var == null) {
            return null;
        }
        return new pr1(lr1Var);
    }

    public abstract ml1 b();

    public abstract ml1 c(Uri uri, InputEvent inputEvent);

    public abstract ml1 d(Uri uri);
}
