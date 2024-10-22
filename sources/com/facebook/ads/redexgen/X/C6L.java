package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6L implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C6Q A01;

    public C6L(C6Q c6q, C6M c6m) {
        this.A01 = c6q;
        new Handler(Looper.getMainLooper()).post(new YD(this, c6q, c6m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6M c6m) {
        C7S c7s;
        C7S c7s2;
        long currentTimeMillis = System.currentTimeMillis();
        c7s = this.A01.A04;
        QN A05 = QN.A05(c7s.A01());
        Uri A00 = C0490Kc.A00(c6m.A08);
        long j = c6m.A00;
        if (j == -1) {
            c7s2 = this.A01.A04;
            j = IP.A0O(c7s2);
        }
        A05.A0G(A00, new YC(this, c6m, j, currentTimeMillis), j);
    }
}
