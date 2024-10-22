package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7S extends ContextWrapper {
    public final C7U A00;
    public final AtomicReference<String> A01;

    public C7S(Context context, C7U c7u) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c7u;
    }

    public final C6U A00() {
        return this.A00.A6G();
    }

    public final Y9 A01() {
        return this.A00.A7j(this);
    }

    public final C7T A02() {
        return this.A00.A65(this);
    }

    public final C7V A03() {
        return this.A00.A6o(this);
    }

    public final C7X A04() {
        return this.A00.A7i(this);
    }

    public final C7Y A05() {
        return this.A00.A7y();
    }

    public final C7j A06() {
        return this.A00.A6d(this);
    }

    public final InterfaceC01987w A07() {
        return this.A00.A6e(this);
    }

    public final C8N A08() {
        return this.A00.A7q();
    }

    public final InterfaceC0444If A09() {
        return this.A00.A5q(A01());
    }

    public final InterfaceC0456Ir A0A() {
        return this.A00.A7k(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}
