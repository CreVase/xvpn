package defpackage;

import android.os.Build;
import android.view.View;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;

/* loaded from: classes.dex */
public final class su2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su2(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public final void a(Throwable th) {
        ch3 ch3Var;
        int i = this.f;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((x31) obj3).invoke(th);
                wq2 wq2Var = (wq2) obj2;
                ((jw) wq2Var.c).g(th);
                do {
                    Object b2 = ((jw) wq2Var.c).b();
                    if (b2 instanceof pw) {
                        b2 = null;
                    }
                    if (b2 == null) {
                        ch3Var = null;
                    } else {
                        ((l41) obj).invoke(b2, th);
                        ch3Var = ch3.f636a;
                    }
                } while (ch3Var != null);
                return;
            case 1:
            default:
                t90 t90Var = (t90) obj;
                j11 s = t9.s((x31) obj3, obj2, null);
                if (s != null) {
                    zf3.H(t90Var, s);
                    return;
                }
                return;
            case 2:
                if (obj3 == qr.l) {
                    return;
                }
                x31 x31Var = ((or) obj2).f3716b;
                p71.C(obj);
                throw null;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((Throwable) obj);
                return ch3Var;
            case 1:
                int intValue = ((Number) obj).intValue();
                View[] viewArr = (View[]) this.g;
                int length = viewArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i < length) {
                        View view = viewArr[i];
                        int i3 = i2 + 1;
                        View view2 = viewArr[i2];
                        if (intValue != i2) {
                            z = false;
                        }
                        view2.setSelected(z);
                        i++;
                        i2 = i3;
                    } else {
                        p71.x(((String[]) this.h)[intValue], 60);
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    sc.q(-1);
                                } else {
                                    sc.q(3);
                                    int i4 = ((AdvancedFeaturesActivity) this.i).getApplicationContext().getResources().getConfiguration().uiMode & 48;
                                    if (i4 != 16) {
                                        if (i4 == 32) {
                                            d83.b(2, true);
                                        }
                                    } else {
                                        d83.b(1, true);
                                    }
                                }
                            } else {
                                d83.b(1, true);
                                sc.q(1);
                            }
                        } else {
                            d83.b(2, true);
                            sc.q(2);
                        }
                        return ch3Var;
                    }
                }
            case 2:
                a((Throwable) obj);
                return ch3Var;
            default:
                a((Throwable) obj);
                return ch3Var;
        }
    }
}
