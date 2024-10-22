package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.VpnService;
import android.util.Pair;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.quickconn.QuickConnActionReciver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class vk0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4850b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vk0(Object obj, int i, Object obj2, int i2) {
        this.f4849a = i2;
        this.d = obj;
        this.f4850b = i;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent;
        int i = this.f4849a;
        Object obj = this.c;
        int i2 = this.f4850b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((wk0) obj2).f5028b.f(i2, obj);
                return;
            case 1:
                ((d92) obj2).f(i2, obj);
                return;
            case 2:
                Pair pair = (Pair) obj;
                ((uf0) ((fu1) ((x50) obj2).c).h).d(((Integer) pair.first).intValue(), (rt1) pair.second, i2);
                return;
            case 3:
                un0 un0Var = (un0) obj2;
                vn0 vn0Var = (vn0) obj;
                int i3 = un0Var.f4702a;
                vn0Var.r();
                vn0Var.d(i3, un0Var.f4703b, i2);
                return;
            case 4:
                rl1 rl1Var = (rl1) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    tl1 tl1Var = (tl1) it.next();
                    if (!tl1Var.d) {
                        if (i2 != -1) {
                            tl1Var.f4527b.b(i2);
                        }
                        tl1Var.c = true;
                        rl1Var.invoke(tl1Var.f4526a);
                    }
                }
                return;
            default:
                QuickConnActionReciver quickConnActionReciver = (QuickConnActionReciver) obj2;
                Context context = (Context) obj;
                int i4 = QuickConnActionReciver.f1609a;
                XApplication.d();
                ya0.h = true;
                if (!ew3.X()) {
                    quickConnActionReciver.getClass();
                    x31 x31Var = o12.f3580a;
                    d5.r(context);
                    t23.a().b(new ContextWrapper(context), i2);
                    return;
                }
                try {
                    intent = VpnService.prepare(context);
                } catch (Throwable unused) {
                    intent = null;
                }
                if (intent != null) {
                    x31 x31Var2 = o12.f3580a;
                    d5.r(context);
                    t23.a().b(new ContextWrapper(context), 1000000);
                    return;
                } else {
                    if (rt3.e().f4214b == 65286 || rt3.e().f4214b == 65285) {
                        ew3.S();
                    }
                    m20.R();
                    ew3.L0("UiTapToggleConnect", pe0.b());
                    pe0.e();
                    return;
                }
        }
    }

    public /* synthetic */ vk0(Object obj, Object obj2, int i, int i2) {
        this.f4849a = i2;
        this.d = obj;
        this.c = obj2;
        this.f4850b = i;
    }
}
