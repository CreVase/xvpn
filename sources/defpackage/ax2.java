package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class ax2 {
    public static ax2 e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f359a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f360b = new Handler(Looper.getMainLooper(), new yw2(this));
    public zw2 c;
    public zw2 d;

    public static ax2 b() {
        if (e == null) {
            e = new ax2();
        }
        return e;
    }

    public final boolean a(zw2 zw2Var, int i) {
        vo voVar = (vo) zw2Var.f5563a.get();
        if (voVar == null) {
            return false;
        }
        this.f360b.removeCallbacksAndMessages(zw2Var);
        Handler handler = yo.x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, voVar.f4869a));
        return true;
    }

    public final boolean c(vo voVar) {
        boolean z;
        zw2 zw2Var = this.c;
        if (zw2Var == null) {
            return false;
        }
        if (voVar != null && zw2Var.f5563a.get() == voVar) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final void d(vo voVar) {
        synchronized (this.f359a) {
            if (c(voVar)) {
                zw2 zw2Var = this.c;
                if (!zw2Var.c) {
                    zw2Var.c = true;
                    this.f360b.removeCallbacksAndMessages(zw2Var);
                }
            }
        }
    }

    public final void e(vo voVar) {
        synchronized (this.f359a) {
            if (c(voVar)) {
                zw2 zw2Var = this.c;
                if (zw2Var.c) {
                    zw2Var.c = false;
                    f(zw2Var);
                }
            }
        }
    }

    public final void f(zw2 zw2Var) {
        int i = zw2Var.f5564b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            } else {
                i = 2750;
            }
        }
        Handler handler = this.f360b;
        handler.removeCallbacksAndMessages(zw2Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, zw2Var), i);
    }

    public final void g() {
        zw2 zw2Var = this.d;
        if (zw2Var != null) {
            this.c = zw2Var;
            this.d = null;
            vo voVar = (vo) zw2Var.f5563a.get();
            if (voVar != null) {
                Handler handler = yo.x;
                handler.sendMessage(handler.obtainMessage(0, voVar.f4869a));
            } else {
                this.c = null;
            }
        }
    }
}
