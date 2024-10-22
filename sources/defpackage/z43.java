package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z43 implements j71 {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f5425b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5426a;

    public z43(Handler handler) {
        this.f5426a = handler;
    }

    public static y43 b() {
        y43 y43Var;
        ArrayList arrayList = f5425b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                y43Var = new y43();
            } else {
                y43Var = (y43) arrayList.remove(arrayList.size() - 1);
            }
        }
        return y43Var;
    }

    public final y43 a(int i, Object obj) {
        y43 b2 = b();
        b2.f5269a = this.f5426a.obtainMessage(i, obj);
        return b2;
    }

    public final boolean c(Runnable runnable) {
        return this.f5426a.post(runnable);
    }

    public final boolean d(int i) {
        return this.f5426a.sendEmptyMessage(i);
    }
}
