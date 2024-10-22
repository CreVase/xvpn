package defpackage;

import a.wcyybbcujkCs;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.security.xvpn.z35kb.quickconn.WidgetProvider;
import com.vungle.ads.VungleError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class rt3 {
    public static rt3 m;
    public ia0 f;
    public Toast l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4213a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int f4214b = 65286;
    public int c = 65286;
    public boolean d = false;
    public boolean e = false;
    public String g = "";
    public final k9 h = new k9(this, Looper.getMainLooper(), 3);
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public boolean k = false;

    public rt3() {
        k50 k50Var = k50.f2888a;
        c(k50Var);
        a(k50Var);
    }

    public static void b(Object obj, ArrayList arrayList) {
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((WeakReference) arrayList.get(size)).get();
            if (obj2 == null) {
                arrayList.remove(size);
            } else if (obj2 == obj) {
                z = true;
            }
        }
        if (!z) {
            arrayList.add(new WeakReference(obj));
        }
    }

    public static synchronized rt3 e() {
        rt3 rt3Var;
        synchronized (rt3.class) {
            if (m == null) {
                rt3 rt3Var2 = new rt3();
                m = rt3Var2;
                rt3Var2.d = ew3.X();
            }
            rt3Var = m;
        }
        return rt3Var;
    }

    public static void k(Object obj, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((WeakReference) arrayList.get(size)).get();
            if (obj2 == null || obj2 == obj) {
                arrayList.remove(size);
            }
        }
    }

    public final void a(pt3 pt3Var) {
        synchronized (this.f4213a) {
            b(pt3Var, this.i);
        }
        pt3Var.c(this.f4214b);
        if (!this.g.isEmpty()) {
            pt3Var.C(this.g);
        }
    }

    public final void c(qt3 qt3Var) {
        synchronized (this.f4213a) {
            b(qt3Var, this.j);
        }
        qt3Var.i(this.e, this.d);
    }

    public final void d() {
        if (this.f == null) {
            this.f = new ia0(this);
        }
        wcyybbcujkCs.h = this.f;
    }

    public final void f(String str) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            k9 k9Var = this.h;
            k9Var.sendMessage(Message.obtain(k9Var, VungleError.CONFIGURATION_ERROR, str));
            return;
        }
        this.g = str;
        synchronized (this.f4213a) {
            Boolean bool = Boolean.FALSE;
            int size = this.i.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                pt3 pt3Var = (pt3) ((WeakReference) this.i.get(size)).get();
                if (pt3Var != null) {
                    if (pt3Var instanceof dn) {
                        bool = Boolean.TRUE;
                    }
                    pt3Var.C(str);
                } else {
                    this.i.remove(size);
                }
            }
            if (!bool.booleanValue() && !TextUtils.isEmpty(str) && bw3.a(str, "AccountV5AuthFailed") && ew3.o()) {
                ew3.b0(new d9(10));
            }
        }
    }

    public final void g(int i) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            k9 k9Var = this.h;
            k9Var.sendMessage(Message.obtain(k9Var, 10002, i, 0));
            return;
        }
        this.c = this.f4214b;
        this.f4214b = i;
        synchronized (this.f4213a) {
            int size = this.i.size();
            while (true) {
                size--;
                if (size >= 0) {
                    pt3 pt3Var = (pt3) ((WeakReference) this.i.get(size)).get();
                    if (pt3Var != null) {
                        pt3Var.c(i);
                    } else {
                        this.i.remove(size);
                    }
                }
            }
        }
        int i2 = WidgetProvider.f;
        try {
            Intent intent = new Intent("BROADCAST_ACTION_VPN_STATE");
            intent.setPackage(zf3.f5472a.getPackageName());
            zf3.f5472a.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:            if (r6.equals("Connecting") == false) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toLowerCase()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 1
            java.lang.String r4 = r0.substring(r2, r3)
            java.lang.String r4 = r4.toUpperCase()
            r1.append(r4)
            java.lang.String r0 = r0.substring(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "X-VPN is "
            java.lang.String r0 = defpackage.hx2.p(r1, r0)
            android.content.Context r1 = defpackage.zf3.f5472a
            com.security.xvpn.z35kb.XApplication r1 = (com.security.xvpn.z35kb.XApplication) r1
            boolean r1 = r1.c()
            r4 = 3
            if (r1 != 0) goto L3c
            to1 r1 = new to1
            r1.<init>(r4, r5, r0)
            k9 r0 = r5.h
            r0.post(r1)
        L3c:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1375914554: goto L6e;
                case 115735883: goto L63;
                case 786899515: goto L58;
                case 1217813208: goto L4f;
                case 1424757481: goto L44;
                default: goto L43;
            }
        L43:
            goto L79
        L44:
            java.lang.String r0 = "Connected"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4d
            goto L79
        L4d:
            r4 = 4
            goto L7a
        L4f:
            java.lang.String r0 = "Connecting"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L7a
            goto L79
        L58:
            java.lang.String r0 = "DisConnected"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L61
            goto L79
        L61:
            r4 = 2
            goto L7a
        L63:
            java.lang.String r0 = "Reconnecting"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6c
            goto L79
        L6c:
            r4 = 1
            goto L7a
        L6e:
            java.lang.String r0 = "DisConnecting"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L77
            goto L79
        L77:
            r4 = 0
            goto L7a
        L79:
            r4 = -1
        L7a:
            switch(r4) {
                case 0: goto Ld4;
                case 1: goto Lbd;
                case 2: goto Lb4;
                case 3: goto L9d;
                case 4: goto L7e;
                default: goto L7d;
            }
        L7d:
            goto Lda
        L7e:
            java.lang.System.currentTimeMillis()
            java.lang.String r6 = defpackage.ew3.S0()
            boolean r6 = defpackage.ew3.e(r6)
            if (r6 == 0) goto L96
            boolean r6 = defpackage.ew3.X()
            if (r6 != 0) goto L96
            r5.k = r3
            defpackage.ew3.S0()
        L96:
            r6 = 65282(0xff02, float:9.148E-41)
            r5.g(r6)
            goto Lda
        L9d:
            boolean r6 = r5.k
            if (r6 == 0) goto Lad
            java.lang.String r6 = defpackage.ew3.S0()
            boolean r6 = defpackage.ew3.e(r6)
            if (r6 != 0) goto Lad
            r5.k = r2
        Lad:
            r6 = 65281(0xff01, float:9.1478E-41)
            r5.g(r6)
            goto Lda
        Lb4:
            r5.k = r2
            r6 = 65286(0xff06, float:9.1485E-41)
            r5.g(r6)
            goto Lda
        Lbd:
            boolean r6 = r5.k
            if (r6 == 0) goto Lcd
            java.lang.String r6 = defpackage.ew3.S0()
            boolean r6 = defpackage.ew3.e(r6)
            if (r6 != 0) goto Lcd
            r5.k = r2
        Lcd:
            r6 = 65283(0xff03, float:9.1481E-41)
            r5.g(r6)
            goto Lda
        Ld4:
            r6 = 65285(0xff05, float:9.1484E-41)
            r5.g(r6)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt3.h(java.lang.String):void");
    }

    public final void i(boolean z, boolean z2) {
        boolean z3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            k9 k9Var = this.h;
            k9Var.sendMessage(Message.obtain(k9Var, 10004, z ? 1 : 0, z2 ? 1 : 0));
            return;
        }
        this.d = z2;
        this.e = z;
        synchronized (this.f4213a) {
            int size = this.j.size();
            while (true) {
                size--;
                if (size >= 0) {
                    qt3 qt3Var = (qt3) ((WeakReference) this.j.get(size)).get();
                    if (qt3Var != null) {
                        qt3Var.i(z, z2);
                    } else {
                        this.j.remove(size);
                    }
                }
            }
        }
    }

    public final void j(pt3 pt3Var) {
        synchronized (this.f4213a) {
            k(pt3Var, this.i);
        }
    }

    public final void l(qt3 qt3Var) {
        synchronized (this.f4213a) {
            k(qt3Var, this.j);
        }
    }

    public final void m() {
        h(pe0.b());
        i(ew3.o(), ew3.X());
    }
}
