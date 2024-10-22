package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class YF extends K8 {
    public final /* synthetic */ C6I A00;
    public final /* synthetic */ C6J A01;
    public final /* synthetic */ C6Q A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public YF(C6Q c6q, ArrayList arrayList, C6J c6j, C6I c6i, ArrayList arrayList2) {
        this.A02 = c6q;
        this.A03 = arrayList;
        this.A01 = c6j;
        this.A00 = c6i;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        AtomicBoolean A0D;
        C7S c7s;
        Handler handler;
        C7S c7s2;
        long j;
        long j2;
        long j3;
        long j4;
        A0D = C6Q.A0D(this.A03);
        c7s = this.A02.A04;
        if (c7s instanceof YA) {
            c7s2 = this.A02.A04;
            YA ya = (YA) c7s2;
            if (this.A01.A00 == -1) {
                if (A0D.get()) {
                    C0S A0E = ya.A0E();
                    j4 = this.A02.A00;
                    A0E.A44(LM.A01(j4));
                } else {
                    C0S A0E2 = ya.A0E();
                    j3 = this.A02.A00;
                    A0E2.A42(LM.A01(j3));
                }
            } else if (A0D.get()) {
                C0S A0E3 = ya.A0E();
                j2 = this.A02.A00;
                A0E3.A45(LM.A01(j2), this.A01.A00);
            } else {
                C0S A0E4 = ya.A0E();
                j = this.A02.A00;
                A0E4.A43(LM.A01(j), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new YG(this, A0D));
        C6Q.A0D(this.A04);
    }
}
