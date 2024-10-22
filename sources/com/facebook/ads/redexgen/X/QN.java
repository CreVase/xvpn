package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class QN {
    public static QN A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0335Dy A00;
    public H2 A01;
    public File A02;
    public boolean A03;
    public final Y9 A06;
    public final InterfaceC0328Dr A07;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<QL> A05 = new SparseArray<>();
    public final Runnable A08 = new QK(this);

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C0786Vp.A03};
    }

    public QN(Y9 y9, C0335Dy c0335Dy) {
        JM jm = new JM(this);
        this.A07 = jm;
        this.A06 = y9;
        if (c0335Dy != null) {
            this.A00 = c0335Dy;
            c0335Dy.A0Q(jm);
        }
        A01().A0P();
    }

    private synchronized C0335Dy A01() {
        if (this.A00 == null) {
            C0335Dy c0335Dy = new C0335Dy(new E3(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00 = c0335Dy;
            c0335Dy.A0Q(this.A07);
        }
        return this.A00;
    }

    private C2P A02() {
        return new C2P(A07(78, 3, 89), null);
    }

    private final synchronized H2 A03() {
        if (this.A01 == null) {
            this.A01 = new C0767Uw(new File(A06(), A07(64, 14, 16)), new C0264Am(IP.A0P(this.A06)));
        }
        return this.A01;
    }

    public static C0770Uz A04(VG vg, H2 h2) {
        return new C0770Uz(h2, vg, new VC(), null, 2, null);
    }

    public static synchronized QN A05(Y9 y9) {
        QN qn;
        synchronized (QN.class) {
            if (A09 == null) {
                A09 = new QN(y9, null);
            }
            qn = A09;
        }
        return qn;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static String A08(Y9 y9, Uri uri) {
        try {
            if (!IP.A1U(y9)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            y9.A07().A9M(A07(81, 5, 14), C01997x.A0u, new C02007y(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        for (C0334Dx c0334Dx : A01().A0S()) {
            int taskId = c0334Dx.A02;
            QL ql = this.A05.get(taskId);
            if (ql != null) {
                int i = c0334Dx.A01;
                if (i == 2 || c0334Dx.A03 > ql.A00) {
                    String str = A07(15, 19, 61) + i + A07(0, 8, 18) + c0334Dx.A03;
                    ql.A01.AB7(ql.A02);
                    this.A05.remove(taskId);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, 111) + i;
                    ql.A01.ABJ(c0334Dx.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 25) + taskId + A07(8, 7, 52) + c0334Dx.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final C0770Uz A0F(Context context) {
        return A04(new VG(context, (InterfaceC0411Gy<? super InterfaceC0391Gc>) null, A02()), A03());
    }

    public final void A0G(Uri uri, QM qm, long j) {
        String A08 = A08(this.A06, uri);
        if (A08 == null) {
            A08 = uri.toString();
        }
        boolean A0H = A0H(A08);
        this.A05.put(A01().A0O(new C0786Vp(uri, false, null, A08)), new QL(qm, j, A0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A6B(str, 0L, 1L) > 0;
    }
}
