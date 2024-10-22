package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes2.dex */
public abstract class i71 {
    private static volatile Choreographer choreographer;

    static {
        Object pk2Var;
        try {
            pk2Var = new h71(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            pk2Var = new pk2(th);
        }
        if (pk2Var instanceof pk2) {
            pk2Var = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
