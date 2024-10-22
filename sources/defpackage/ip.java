package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class ip extends c70 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(Context context, g63 g63Var, int i) {
        super((jp) eb3.y(context, g63Var).f1907a);
        this.e = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    } else {
                        super((n13) eb3.y(context, g63Var).d);
                        return;
                    }
                }
                super((tz1) eb3.y(context, g63Var).c);
                return;
            }
            super((tz1) eb3.y(context, g63Var).c);
            return;
        }
        super((kp) eb3.y(context, g63Var).f1908b);
    }

    @Override // defpackage.c70
    public final boolean a(rs3 rs3Var) {
        switch (this.e) {
            case 0:
                return rs3Var.j.f4634b;
            case 1:
                return rs3Var.j.d;
            case 2:
                if (rs3Var.j.f4633a != uz1.CONNECTED) {
                    return false;
                }
                return true;
            case 3:
                uz1 uz1Var = rs3Var.j.f4633a;
                if (uz1Var != uz1.UNMETERED && (Build.VERSION.SDK_INT < 30 || uz1Var != uz1.TEMPORARILY_UNMETERED)) {
                    return false;
                }
                return true;
            default:
                return rs3Var.j.e;
        }
    }

    @Override // defpackage.c70
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.e) {
            case 0:
                return f((Boolean) obj);
            case 1:
                return f((Boolean) obj);
            case 2:
                return e((rz1) obj);
            case 3:
                return e((rz1) obj);
            default:
                return f((Boolean) obj);
        }
    }

    public final boolean e(rz1 rz1Var) {
        switch (this.e) {
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!rz1Var.f4243a || !rz1Var.f4244b) {
                        return true;
                    }
                    return false;
                }
                return true ^ rz1Var.f4243a;
            default:
                if (!rz1Var.f4243a || rz1Var.c) {
                    return true;
                }
                return false;
        }
    }

    public final boolean f(Boolean bool) {
        boolean booleanValue;
        switch (this.e) {
            case 0:
                booleanValue = bool.booleanValue();
                break;
            case 1:
                booleanValue = bool.booleanValue();
                break;
            default:
                booleanValue = bool.booleanValue();
                break;
        }
        return !booleanValue;
    }
}
