package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class yv3 {

    /* renamed from: a, reason: collision with root package name */
    public static xv3 f5397a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5398b = true;
    public static final ReentrantLock c = new ReentrantLock(true);
    public static final ArrayList d = new ArrayList();
    public static int e = -1;
    public static int f = -13421773;

    public static void a(Activity activity) {
        f5397a = new xv3(activity);
        d.add(new WeakReference(f5397a));
        f5397a.setId(520093697);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(f5397a, -1, -1);
    }
}
