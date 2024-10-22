package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class B7 {
    public final CopyOnWriteArrayList<B6> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<B6> it = this.A00.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            B8 listener = next.A01;
            next.A00.post(new B2(this, listener));
        }
    }

    public final void A01() {
        Iterator<B6> it = this.A00.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            B8 listener = next.A01;
            next.A00.post(new B5(this, listener));
        }
    }

    public final void A02() {
        Iterator<B6> it = this.A00.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            B8 listener = next.A01;
            next.A00.post(new B4(this, listener));
        }
    }

    public final void A03(Handler handler, B8 b8) {
        HI.A03((handler == null || b8 == null) ? false : true);
        this.A00.add(new B6(handler, b8));
    }

    public final void A04(Exception exc) {
        Iterator<B6> it = this.A00.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            B8 listener = next.A01;
            next.A00.post(new B3(this, listener, exc));
        }
    }
}
