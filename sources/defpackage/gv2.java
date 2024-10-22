package defpackage;

import a.bx;
import a.du;
import android.app.PendingIntent;
import android.content.Context;
import android.widget.CompoundButton;
import com.security.xvpn.z35kb.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class gv2 extends ji1 implements l41 {
    public static final gv2 g = new gv2(0);
    public static final gv2 h = new gv2(1);
    public static final gv2 i = new gv2(2);
    public static final gv2 j = new gv2(3);
    public static final gv2 k = new gv2(4);
    public static final gv2 l = new gv2(5);
    public static final gv2 m = new gv2(6);
    public static final gv2 n = new gv2(7);
    public static final gv2 o = new gv2(8);
    public static final gv2 p = new gv2(9);
    public static final gv2 q = new gv2(10);
    public static final gv2 r = new gv2(11);
    public static final gv2 s = new gv2(12);
    public static final gv2 t = new gv2(13);
    public static final gv2 u = new gv2(14);
    public static final gv2 v = new gv2(15);
    public static final gv2 w = new gv2(16);
    public static final gv2 x = new gv2(17);
    public static final gv2 y = new gv2(18);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv2(int i2) {
        super(2);
        this.f = i2;
    }

    public final t90 a(r90 r90Var, t90 t90Var) {
        i20 i20Var;
        switch (this.f) {
            case 10:
                t90 minusKey = t90Var.minusKey(r90Var.getKey());
                zq0 zq0Var = zq0.f5530a;
                if (minusKey != zq0Var) {
                    d5 d5Var = d5.f1730b;
                    e90 e90Var = (e90) minusKey.get(d5Var);
                    if (e90Var == null) {
                        i20Var = new i20(r90Var, minusKey);
                    } else {
                        t90 minusKey2 = minusKey.minusKey(d5Var);
                        if (minusKey2 == zq0Var) {
                            return new i20(e90Var, r90Var);
                        }
                        i20Var = new i20(e90Var, new i20(r90Var, minusKey2));
                    }
                    return i20Var;
                }
                return r90Var;
            default:
                return t90Var.plus(r90Var);
        }
    }

    public final uh1 b(mh1 mh1Var, List list) {
        d5 d5Var = ew3.u;
        switch (this.f) {
            case 17:
                return pd0.G(mh1Var, list, pd0.L(d5Var, list, true));
            default:
                uh1 G = pd0.G(mh1Var, list, pd0.L(d5Var, list, true));
                if (G != null) {
                    return t9.K(G);
                }
                return null;
        }
    }

    public final void c(f43 f43Var, CompoundButton compoundButton) {
        switch (this.f) {
            case 1:
                f43Var.f2040a.c = 0;
                return;
            case 2:
                return;
            default:
                f43Var.f2040a.c = 0;
                return;
        }
    }

    public final void d(CompoundButton compoundButton, boolean z) {
        switch (this.f) {
            case 3:
                bx bxVar = new bx();
                bxVar.v(z);
                du.d(357, bxVar);
                bxVar.h();
                return;
            case 4:
                bx bxVar2 = new bx();
                bxVar2.v(z);
                du.d(575, bxVar2);
                bxVar2.h();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        Object U;
        int i2;
        ch3 ch3Var = ch3.f636a;
        x31 x31Var = null;
        boolean z = false;
        switch (this.f) {
            case 0:
                dv2 dv2Var = (dv2) obj;
                Throwable th = (Throwable) obj2;
                if (dv2Var instanceof cv2) {
                    cv2 cv2Var = (cv2) dv2Var;
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    a30 a30Var = (a30) cv2Var.f1686b;
                    a30Var.getClass();
                    d30 d30Var = new d30(false, th);
                    do {
                        U = a30Var.U(a30Var.F(), d30Var);
                        if (U != fl.g && U != fl.h) {
                        }
                    } while (U == fl.i);
                }
                return ch3Var;
            case 1:
                c((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 2:
                c((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 3:
                d((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                return ch3Var;
            case 4:
                d((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                return ch3Var;
            case 5:
                d((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                return ch3Var;
            case 6:
                d((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                return ch3Var;
            case 7:
                c((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 8:
                Context context = (Context) obj2;
                if (((Boolean) obj).booleanValue()) {
                    i2 = R.string.Connect;
                } else {
                    i2 = R.string.Disconnect;
                }
                String y2 = pd0.y(i2);
                x31 x31Var2 = o12.f3581b;
                if (x31Var2 != null) {
                    x31Var = x31Var2;
                }
                return new m02(R.drawable.navigation_empty_icon, y2, (PendingIntent) x31Var.invoke(context));
            case 9:
                String str = (String) obj;
                r90 r90Var = (r90) obj2;
                if (str.length() == 0) {
                    z = true;
                }
                if (z) {
                    return r90Var.toString();
                }
                return str + ", " + r90Var;
            case 10:
                return a((r90) obj2, (t90) obj);
            case 11:
                return a((r90) obj2, (t90) obj);
            case 12:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 13:
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 14:
                return obj;
            case 15:
                p71.C(obj);
                return null;
            case 16:
                return (p83) obj;
            case 17:
                return b((mh1) obj, (List) obj2);
            default:
                return b((mh1) obj, (List) obj2);
        }
    }
}
