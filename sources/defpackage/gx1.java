package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class gx1 extends Handler {
    public gx1() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        fx1 fx1Var = (fx1) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                fx1Var.f2170a.getClass();
                return;
            }
            return;
        }
        rg rgVar = fx1Var.f2170a;
        Object obj = fx1Var.f2171b[0];
        if (rgVar.d.get()) {
            countDownLatch = rgVar.f;
            try {
                rgVar.h.dispatchOnCancelled(rgVar, obj);
                countDownLatch.countDown();
            } finally {
            }
        } else {
            countDownLatch = rgVar.f;
            try {
                rgVar.h.dispatchOnLoadComplete(rgVar, obj);
            } finally {
            }
        }
        rgVar.c = 3;
    }
}
