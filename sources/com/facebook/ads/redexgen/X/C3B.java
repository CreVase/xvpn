package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3B extends AbstractC0322Dl implements Handler.Callback {
    public static String[] A0D = {"gjDhtLri4FaGEAWjRmzGOIMLbPPteIUr", "gp3Mr1PqMY6rayIsxO9yJntmkSBHR7UD", "5ZPDaEp5A16UYvNfALSoSfbuhC4Pwik1", "wt", "uAQVQjgSUgDp2O8dWeXQS6qYbl", "Gm3ZCOzsQkh90YHushfajnERb16f", "RaSLUB1F0sju8CZYqMhotlzh76Y2FLCY", "Ujo7akDRrtwDl4IVTi3qcCtKoi2"};
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC0773Vc A03;
    public BO A04;
    public BN A05;
    public BN A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C9X A0A;
    public final FY A0B;
    public final FZ A0C;

    public C3B(FZ fz, Looper looper) {
        this(fz, looper, FY.A00);
    }

    public C3B(FZ fz, Looper looper, FY fy) {
        super(3);
        this.A0C = (FZ) HI.A01(fz);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = fy;
        this.A0A = new C9X();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6u()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6t(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        BN bn = this.A06;
        if (bn != null) {
            bn.A08();
            this.A06 = null;
        }
        BN bn2 = this.A05;
        if (bn2 != null) {
            bn2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AEO();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4W(this.A02);
    }

    private void A05(List<FV> list) {
        this.A0C.AB0(list);
    }

    private void A06(List<FV> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A15(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
        } else {
            A02();
            this.A03.flush();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A17(Format[] formatArr, long j) throws C9K {
        Format format = formatArr[0];
        this.A02 = format;
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4W(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A8q() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A90() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:            if (r7 == Long.MAX_VALUE) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:            if (r10.A00 != 2) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:            A04();     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:            A02();        r10.A08 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:            if (r7 == Long.MAX_VALUE) goto L32;     */
    @Override // com.facebook.ads.redexgen.X.XS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEb(long r11, long r13) throws com.facebook.ads.redexgen.X.C9K {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3B.AEb(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02459s
    public final int AFt(Format format) {
        if (this.A0B.AFu(format)) {
            return AbstractC0322Dl.A0x(null, format.A0H) ? 4 : 2;
        }
        if (C0413Ha.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A05((List) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
