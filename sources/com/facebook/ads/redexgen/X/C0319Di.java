package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Di */
/* loaded from: assets/audience_network.dex */
public final class C0319Di implements XT, InterfaceC02399m, InterfaceC02379k {
    public static byte[] A0O;
    public static String[] A0P = {"lFtWnCG46R5C0jFE4zUJTczpshBUtUUT", "lFOjdTcG38zZaGgojgc5eL5kqXnhZEZM", "wiGcXWoorOPZSjIllCfsaL8Ty45qvpEz", "HHU7rub9nESY9ymWNpU", "JQeT3oVWTWkCraIQT5Bxb1arMPILFYIY", "gEu", "Qio0MMI", "OwWxnbSWAOR1YegRtIWYLQC56lcDaoDA"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public AB A08;
    public C0272Au A09;
    public C0272Au A0A;
    public EY A0B;
    public List<FV> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final XT A0F;
    public final XR A0G;
    public final XP A0H;
    public final CopyOnWriteArraySet<AR> A0I;
    public final CopyOnWriteArraySet<DH> A0J;
    public final CopyOnWriteArraySet<FZ> A0K;
    public final CopyOnWriteArraySet<IL> A0L;
    public final CopyOnWriteArraySet<IC> A0M;
    public final XS[] A0N;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{126, -108, -104, -101, -105, -112, 112, -93, -102, 123, -105, -116, -92, -112, -99, -101, -67, -70, -82, -87, -85, -83, -100, -83, -64, -68, -67, -70, -83, -108, -79, -69, -68, -83, -74, -83, -70, 104, -87, -76, -70, -83, -87, -84, -63, 104, -67, -74, -69, -83, -68, 104, -73, -70, 104, -70, -83, -72, -76, -87, -85, -83, -84, 118};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0319Di(InterfaceC02479u interfaceC02479u, GR gr, C9Z c9z, BK<X6> bk) {
        this(interfaceC02479u, gr, c9z, bk, new A0());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0319Di(InterfaceC02479u interfaceC02479u, GR gr, C9Z c9z, BK<X6> bk, A0 a0) {
        this(interfaceC02479u, gr, c9z, bk, a0, HL.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0319Di(InterfaceC02479u interfaceC02479u, GR gr, C9Z c9z, BK<X6> bk, A0 a0, HL hl) {
        XR xr = new XR(this);
        this.A0G = xr;
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<IL> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.A0L = copyOnWriteArraySet;
        CopyOnWriteArraySet<AR> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.A0I = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A0E = handler;
        XS[] A4h = interfaceC02479u.A4h(handler, xr, xr, xr, xr, bk);
        this.A0N = A4h;
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = AB.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        C0321Dk A02 = A02(A4h, gr, c9z, hl);
        this.A0F = A02;
        XP A00 = a0.A00(A02, hl);
        this.A0H = A00;
        A3M(A00);
        copyOnWriteArraySet.add(A00);
        copyOnWriteArraySet2.add(A00);
        A0I(A00);
        if (bk instanceof XA) {
            ((XA) bk).A04(handler, A00);
        }
    }

    private final C0321Dk A02(XS[] xsArr, GR gr, C9Z c9z, HL hl) {
        return new C0321Dk(xsArr, gr, c9z, hl);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 0), A07(15, 49, 29));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        String[] strArr = A0P;
        if (strArr[6].length() != strArr[5].length()) {
            String[] strArr2 = A0P;
            strArr2[1] = "ra3xydJ7kWhmMtg1TaM66w1JFa1gUTH7";
            strArr2[7] = "B2AnWPBfK4McGvg4VvevfKURx5PgHrL6";
            if (surfaceHolder != null) {
                XR xr = this.A0G;
                if (A0P[3].length() != 30) {
                    A0P[2] = "TkNVmSJ94eiWQtufXtm52Md27gR86DeI";
                    surfaceHolder.removeCallback(xr);
                    this.A04 = null;
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public void A0G(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (XS xs : this.A0N) {
            if (xs.A83() == 2) {
                arrayList.add(this.A0F.A4b(xs).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C02439q) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z;
    }

    private final void A0I(DH dh) {
        this.A0J.add(dh);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AFp(false);
    }

    public final void A0N(float f) {
        this.A00 = f;
        for (XS xs : this.A0N) {
            if (xs.A83() == 1) {
                this.A0F.A4b(xs).A06(2).A07(Float.valueOf(f)).A05();
            }
        }
    }

    public final void A0O(Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(EY ey) {
        ADv(ey, true, true);
    }

    public final void A0Q(IC ic) {
        this.A0M.add(ic);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void A3M(InterfaceC02359i interfaceC02359i) {
        this.A0F.A3M(interfaceC02359i);
    }

    @Override // com.facebook.ads.redexgen.X.XT
    public final C02439q A4b(InterfaceC02429p interfaceC02429p) {
        return this.A0F.A4b(interfaceC02429p);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A66() {
        return this.A0F.A66();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A67() {
        return this.A0F.A67();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A6S() {
        return this.A0F.A6S();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A6U() {
        return this.A0F.A6U();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A6V() {
        return this.A0F.A6V();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A6X() {
        return this.A0F.A6X();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final AbstractC02519z A6Z() {
        return this.A0F.A6Z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A6a() {
        return this.A0F.A6a();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A6j() {
        return this.A0F.A6j();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final boolean A7Y() {
        return this.A0F.A7Y();
    }

    @Override // com.facebook.ads.redexgen.X.XT
    public final void ADv(EY ey, boolean z, boolean z2) {
        EY ey2 = this.A0B;
        if (ey2 != ey) {
            if (ey2 != null) {
                ey2.AEX(this.A0H);
                String[] strArr = A0P;
                if (strArr[4].charAt(10) == strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0P;
                strArr2[1] = "neQjHr0c3Z22xWgcFsXV6yKpgIjCxRiM";
                strArr2[7] = "AZ8qNXqb66h1W9gn2ceQeQQ6zfm9Ofoh";
                this.A0H.A07();
            }
            Handler handler = this.A0E;
            if (A0P[3].length() == 30) {
                throw new RuntimeException();
            }
            A0P[2] = "hi3Z2rNIRXiwDW9NFTlP7K1BOJYRm9rY";
            ey.A3K(handler, this.A0H);
            this.A0B = ey;
        }
        this.A0F.ADv(ey, z, z2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AEO() {
        this.A0F.AEO();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        EY ey = this.A0B;
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[1] = "3XPFavn3G5vCuxghg4tFItjGBt49wsdt";
        strArr2[7] = "vQrNoD9lPBn1b9gsSKOopZ1BvxRWCtpJ";
        if (ey != null) {
            ey.AEX(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AEy(long j) {
        this.A0H.A06();
        this.A0F.AEy(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AEz() {
        this.A0H.A06();
        this.A0F.AEz();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AFO(boolean z) {
        this.A0F.AFO(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AFp(boolean z) {
        this.A0F.AFp(z);
        EY ey = this.A0B;
        if (ey != null) {
            ey.AEX(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
    }
}
