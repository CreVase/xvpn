package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
public final class yw2 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ax2 f5400a;

    public yw2(ax2 ax2Var) {
        this.f5400a = ax2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        ax2 ax2Var = this.f5400a;
        zw2 zw2Var = (zw2) message.obj;
        synchronized (ax2Var.f359a) {
            if (ax2Var.c == zw2Var || ax2Var.d == zw2Var) {
                ax2Var.a(zw2Var, 2);
            }
        }
        return true;
    }
}
