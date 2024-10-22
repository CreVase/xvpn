package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class V0 implements InterfaceC0391Gc {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0391Gc A07;
    public H6 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0391Gc A0D;
    public final InterfaceC0391Gc A0E;
    public final InterfaceC0391Gc A0F;
    public final H2 A0G;
    public final H4 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, 120, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public V0(H2 h2, InterfaceC0391Gc interfaceC0391Gc, InterfaceC0391Gc interfaceC0391Gc2, InterfaceC0389Ga interfaceC0389Ga, int i, H4 h4) {
        this.A0G = h2;
        this.A0D = interfaceC0391Gc2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC0391Gc;
        if (interfaceC0389Ga != null) {
            this.A0E = new V3(interfaceC0391Gc, interfaceC0389Ga);
        } else {
            this.A0E = null;
        }
        this.A0H = h4;
    }

    private int A00(C0395Gg c0395Gg) {
        if (this.A0K) {
            boolean z = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c0395Gg.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(H2 h2, String str, Uri uri) {
        HC contentMetadata = h2.A6R(str);
        Uri A01 = HD.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        InterfaceC0391Gc interfaceC0391Gc = this.A07;
        if (interfaceC0391Gc == null) {
            return;
        }
        try {
            interfaceC0391Gc.close();
            this.A07 = null;
            this.A0A = false;
            H6 h6 = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (h6 != null) {
                this.A0G.AES(h6);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            H6 h62 = this.A08;
            if (h62 != null) {
                this.A0G.AES(h62);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A6A();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AFD(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof H0)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z) throws IOException {
        H6 AFk;
        long j;
        C0395Gg c0395Gg;
        InterfaceC0391Gc nextDataSource;
        long j2;
        if (this.A0B) {
            AFk = null;
        } else if (this.A0I) {
            try {
                AFk = this.A0G.AFk(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AFk = this.A0G.AFl(this.A09, this.A03);
        }
        if (AFk == null) {
            nextDataSource = this.A0F;
            c0395Gg = new C0395Gg(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AFk.A05) {
            Uri fromFile = Uri.fromFile(AFk.A03);
            long filePosition = this.A03 - AFk.A02;
            long length = AFk.A01 - filePosition;
            long j3 = this.A01;
            if (j3 != -1) {
                length = Math.min(length, j3);
            }
            c0395Gg = new C0395Gg(fromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AFk.A02()) {
                j = this.A01;
            } else {
                j = AFk.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    j = Math.min(j, length2);
                }
            }
            c0395Gg = new C0395Gg(this.A06, this.A03, j, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AES(AFk);
                AFk = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j2 = this.A03 + 102400;
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.A02 = j2;
        if (z) {
            HI.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (AFk.A01()) {
                    this.A0G.AES(AFk);
                }
                throw th;
            }
        }
        if (AFk != null && AFk.A01()) {
            this.A08 = AFk;
        }
        this.A07 = nextDataSource;
        this.A0A = c0395Gg.A02 == -1;
        long ADb = nextDataSource.ADb(c0395Gg);
        HE he = new HE();
        if (this.A0A) {
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (ADb != -1) {
                this.A01 = ADb;
                HD.A05(he, this.A03 + ADb);
            }
        }
        if (A0B()) {
            Uri A85 = this.A07.A85();
            this.A05 = A85;
            if (true ^ this.A06.equals(A85)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    HD.A06(he, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    HD.A06(he, uri);
                }
            } else {
                HD.A04(he);
            }
        }
        if (A0C()) {
            this.A0G.A3W(this.A09, he);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r1 = r1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.facebook.ads.redexgen.X.C0392Gd
            if (r0 == 0) goto Lf
            r0 = r1
            com.facebook.ads.redexgen.X.Gd r0 = (com.facebook.ads.redexgen.X.C0392Gd) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.V0.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws IOException {
        try {
            this.A09 = H8.A02(c0395Gg);
            Uri uri = c0395Gg.A04;
            this.A06 = uri;
            this.A05 = A01(this.A0G, this.A09, uri);
            this.A00 = c0395Gg.A00;
            this.A03 = c0395Gg.A03;
            this.A0B = A00(c0395Gg) != -1;
            if (c0395Gg.A02 != -1 || this.A0B) {
                this.A01 = c0395Gg.A02;
            } else {
                long A6Q = this.A0G.A6Q(this.A09);
                this.A01 = A6Q;
                if (A6Q != -1) {
                    long j = A6Q - c0395Gg.A03;
                    this.A01 = j;
                    if (j <= 0) {
                        throw new C0392Gd(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i, i2);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                long j = this.A01;
                if (j != -1) {
                    this.A01 = j - read;
                }
            } else if (this.A0A) {
                A05();
            } else {
                long j2 = this.A01;
                if (j2 <= 0) {
                    if (j2 == -1) {
                    }
                }
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A && A0D(e)) {
                A05();
                return -1;
            }
            A07(e);
            throw e;
        }
    }
}
