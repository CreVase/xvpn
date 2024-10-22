package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3D extends AbstractC0322Dl implements Handler.Callback {
    public static String[] A0B = {"0qSWVCRp", "8n", "TBzABSyg8R7UC4ujRNxCq", "jQt0eIY", "v3jD5iBy36", "AYhXU50alurSLkI0yvRIZkZn8z1ow4xX", "qUGfoy2tLuPBRFk8hkXJpZQuwVi5LQ1p", "rA70SaLYISjIKcft86AFQfJkzoYA33nr"};
    public int A00;
    public int A01;
    public DE A02;
    public boolean A03;
    public final Handler A04;
    public final C9X A05;
    public final DG A06;
    public final D1 A07;
    public final DH A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public C3D(DH dh, Looper looper) {
        this(dh, looper, DG.A00);
    }

    public C3D(DH dh, Looper looper, DG dg) {
        super(4);
        this.A08 = (DH) HI.A01(dh);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (DG) HI.A01(dg);
        this.A05 = new C9X();
        this.A07 = new D1();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(0, metadata);
            String[] strArr = A0B;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "HjLXVjnhMu7EB58lvrXa8leW0c4xSFXO";
            strArr2[6] = "qIzVCSliCuvFWhZzcfJ3ccTrGvRVj8IV";
            obtainMessage.sendToTarget();
            return;
        }
        A02(metadata);
    }

    private void A02(Metadata metadata) {
        this.A08.AC8(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A12() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A15(long j, boolean z) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A17(Format[] formatArr, long j) throws C9K {
        this.A02 = this.A06.A4V(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A8q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A90() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void AEb(long j, long j2) throws C9K {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A10(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else {
                    boolean A03 = this.A07.A03();
                    String[] strArr = A0B;
                    if (strArr[3].length() == strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0B[7] = "LGLHrgLhu9uRK5PVWOv1cuvTksuxgVhV";
                    if (!A03) {
                        this.A07.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                        try {
                            int index = (this.A01 + this.A00) % 5;
                            this.A0A[index] = this.A02.A4x(this.A07);
                            this.A09[index] = ((XE) this.A07).A00;
                            this.A00++;
                        } catch (DF e) {
                            throw C9K.A01(e, A0y());
                        }
                    }
                }
            }
        }
        int i = this.A00;
        if (A0B[1].length() == 1) {
            throw new RuntimeException();
        }
        A0B[1] = "3VtXKAcUijLRyWZ1CGRxfS";
        if (i > 0) {
            long[] jArr = this.A09;
            int i2 = this.A01;
            if (jArr[i2] <= j) {
                A01(this.A0A[i2]);
                Metadata[] metadataArr = this.A0A;
                int i3 = this.A01;
                metadataArr[i3] = null;
                this.A01 = (i3 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02459s
    public final int AFt(Format format) {
        if (this.A06.AFu(format)) {
            return AbstractC0322Dl.A0x(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A02((Metadata) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
