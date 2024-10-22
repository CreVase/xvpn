package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0984bX {
    public static String[] A0C = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};
    public InterfaceC0988bb A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC0683Rp A05;
    public final InterfaceC0995bi A06;
    public final C0986bZ A07;
    public final InterfaceC0385Fw A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<View> A0B;

    public C0984bX(InterfaceC0995bi interfaceC0995bi, InterfaceC0683Rp interfaceC0683Rp, InterfaceC0385Fw interfaceC0385Fw, C0986bZ c0986bZ, Handler handler) {
        this(interfaceC0995bi, interfaceC0683Rp, interfaceC0385Fw, c0986bZ, handler, 100);
    }

    public C0984bX(InterfaceC0995bi interfaceC0995bi, InterfaceC0683Rp interfaceC0683Rp, InterfaceC0385Fw interfaceC0385Fw, C0986bZ c0986bZ, Handler handler, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC0995bi;
        this.A05 = interfaceC0683Rp;
        this.A08 = interfaceC0385Fw;
        this.A07 = c0986bZ;
        this.A04 = handler;
        this.A09 = new RunnableC0985bY(this, i);
    }

    private void A03(long j) {
        if (this.A0B.isEmpty()) {
            this.A06.A8E(this.A0A);
            this.A08.A3x(j, this.A0A);
            this.A08.A5U();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j) {
        this.A06.A8E(this.A0A);
        this.A08.A3x(j, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<View> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    C0993bg A00 = this.A07.A00(next);
                    Iterator<Rect> it2 = this.A0A.iterator();
                    while (it2.hasNext()) {
                        if (C0977bQ.A00(next, this.A03, this.A02, it2.next()) && A00 != C0993bg.A08) {
                            InterfaceC0385Fw interfaceC0385Fw = this.A08;
                            Rect containerRect = this.A03;
                            Rect rect = this.A02;
                            if (A0C[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0C[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            interfaceC0385Fw.A3R(A00, containerRect, rect);
                        }
                    }
                } else {
                    this.A08.A5U();
                    InterfaceC0988bb interfaceC0988bb = this.A00;
                    if (interfaceC0988bb != null) {
                        interfaceC0988bb.ACr();
                    }
                    this.A0B.clear();
                    String[] strArr = A0C;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0C;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A07() {
        InterfaceC0988bb interfaceC0988bb = this.A00;
        if (interfaceC0988bb != null) {
            interfaceC0988bb.ACr();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A03(this.A05.AAE());
        }
        this.A01 = false;
        if (A0C[0].charAt(21) != 'h') {
            throw new RuntimeException();
        }
        A0C[0] = "Da2exFZBguRvp8OTbNDxEhbqIKaEOHIs";
    }

    public final void A08() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A09(InterfaceC0990bd interfaceC0990bd) {
        this.A08.AFW(interfaceC0990bd);
    }

    public final void A0A(InterfaceC0988bb interfaceC0988bb) {
        this.A00 = interfaceC0988bb;
    }
}
