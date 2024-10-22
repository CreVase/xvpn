package defpackage;

import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.purchase.PurchaseActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t23 {
    public static t23 e;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4444b = new Object();
    public final Object c = {SplashActivity.class, PurchaseActivity.class, GuideToPurchaseActivity.class};

    /* renamed from: a, reason: collision with root package name */
    public int f4443a = -1;
    public final Serializable d = new ArrayList();

    public static synchronized t23 a() {
        t23 t23Var;
        synchronized (t23.class) {
            if (e == null) {
                e = new t23();
            }
            t23Var = e;
        }
        return t23Var;
    }

    public final void b(ContextWrapper contextWrapper, int i) {
        Class cls;
        synchronized (this.f4444b) {
            if (((ArrayList) this.d).isEmpty()) {
                this.f4443a = i;
                if (XApplication.c) {
                    cls = HomeActivity.class;
                } else {
                    cls = MainActivity.class;
                }
                Intent intent = new Intent(contextWrapper, (Class<?>) cls);
                if (ew3.n0()) {
                    intent.setComponent(new ComponentName(contextWrapper, (Class<?>) SplashActivity.class));
                }
                intent.setFlags(270532608);
                intent.addCategory("android.intent.category.LAUNCHER");
                contextWrapper.startActivity(intent);
                return;
            }
            if (((ArrayList) this.d).size() <= 1) {
                s23 s23Var = (s23) ((WeakReference) ((ArrayList) this.d).get(0)).get();
                if (s23Var != null) {
                    ((lt3) s23Var).Q(i);
                } else {
                    this.f4443a = i;
                }
                return;
            }
            throw new IllegalArgumentException("subscribeListeners.size > 1");
        }
    }
}
