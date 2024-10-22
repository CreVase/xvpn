package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.ui.components.ConnectingStatusView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class x8 implements kb2, pt3 {

    /* renamed from: a, reason: collision with root package name */
    public static final x8 f5127a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5128b;
    public static final HashMap c;
    public static WeakReference d;
    public static final Handler e;
    public static ji1 f;
    public static final AtomicBoolean g;
    public static v31 h;

    static {
        x8 x8Var = new x8();
        f5127a = x8Var;
        f5128b = new HashMap();
        c = new HashMap();
        d = new WeakReference(null);
        e = new Handler(Looper.getMainLooper());
        g = new AtomicBoolean(false);
        pe0.f3833a = x8Var;
        rt3.e().a(x8Var);
    }

    public static final void a(ViewGroup viewGroup) {
        d = new WeakReference(viewGroup);
        HashMap hashMap = f5128b;
        synchronized (hashMap) {
            Iterator it = d20.Q0(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                kn knVar = (kn) f5128b.get((String) it.next());
                if (knVar != null) {
                    knVar.c = d;
                }
            }
        }
    }

    public static void e() {
        if (!c.isEmpty()) {
            e.post(new d9(2));
        } else {
            ew3.b0(new d9(3));
        }
    }

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    public final boolean b(String str, String str2, String str3, String str4) {
        boolean z;
        ic G;
        ConnectingStatusView connectingStatusView;
        pe0.a("muusxwhpjx play ", str + " " + str2 + " " + str4);
        if (zf3.G() instanceof SplashActivity) {
            f = new v8(1, str, str2, str3, str4);
            g.set(true);
            v31 v31Var = h;
            if (v31Var != null) {
                v31Var.invoke();
            }
            return true;
        }
        String str5 = str + str2 + str3 + str4;
        kn knVar = (kn) f5128b.get(str5);
        Object[] objArr = new Object[1];
        if (knVar == null) {
            z = true;
        } else {
            z = false;
        }
        objArr[0] = str5 + " " + z;
        pe0.a("muusxwhpjx play ", objArr);
        if (knVar == null) {
            return false;
        }
        if (m20.L(str, "AdBanner")) {
            c.put(str4, knVar);
        }
        if (m20.L(str3, "StartConnect") && (G = zf3.G()) != null && (connectingStatusView = (ConnectingStatusView) G.findViewById(R.id.layoutConnecting)) != null) {
            connectingStatusView.post(new s50(connectingStatusView, 1));
        }
        return ((Boolean) zf3.f0(vl0.c, new jn(knVar, null))).booleanValue();
    }

    @Override // defpackage.pt3
    public final void c(int i) {
    }

    public final void d() {
        if (zf3.G() instanceof SplashActivity) {
            f = e.h;
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new d9(4), 100L);
        }
    }
}
