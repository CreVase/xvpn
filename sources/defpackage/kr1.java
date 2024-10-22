package defpackage;

import android.util.SparseArray;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class kr1 implements dv0 {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0 = wi3.x("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID g0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map h0;
    public long A;
    public long B;
    public q9 C;
    public q9 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* renamed from: a, reason: collision with root package name */
    public final dh0 f3002a;
    public boolean a0;

    /* renamed from: b, reason: collision with root package name */
    public final ij3 f3003b;
    public fv0 b0;
    public final SparseArray c;
    public final boolean d;
    public final r42 e;
    public final r42 f;
    public final r42 g;
    public final r42 h;
    public final r42 i;
    public final r42 j;
    public final r42 k;
    public final r42 l;
    public final r42 m;
    public final r42 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public jr1 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        HashMap hashMap = new HashMap();
        p71.s(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", SubsamplingScaleImageView.ORIENTATION_180, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public kr1() {
        dh0 dh0Var = new dh0();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f3002a = dh0Var;
        dh0Var.d = new v51(this);
        this.d = true;
        this.f3003b = new ij3();
        this.c = new SparseArray();
        this.g = new r42(4);
        this.h = new r42(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new r42(4);
        this.e = new r42(py1.f3937a);
        this.f = new r42(4);
        this.j = new r42();
        this.k = new r42();
        this.l = new r42(8);
        this.m = new r42();
        this.n = new r42();
        this.L = new int[1];
    }

    public static byte[] h(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return wi3.x(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    public final void a(int i) {
        if (this.C != null && this.D != null) {
            return;
        }
        throw u42.a("Element " + i + " must be in a Cues", null);
    }

    public final void b(int i) {
        if (this.u != null) {
            return;
        }
        throw u42.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf A[EDGE_INSN: B:50:0x00cf->B:49:0x00cf BREAK  A[LOOP:0: B:42:0x00be->B:46:0x00cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.jr1 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr1.c(jr1, long, int, int, int):void");
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        q9 q9Var = new q9(5);
        ih0 ih0Var = (ih0) ev0Var;
        long j = ih0Var.c;
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j != -1 && j <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = j;
        }
        int i = (int) j2;
        ih0Var.e(((r42) q9Var.f3970b).f4098a, 0, 4, false);
        q9Var.f3969a = 4;
        for (long w = ((r42) q9Var.f3970b).w(); w != 440786851; w = ((w << 8) & (-256)) | (((r42) q9Var.f3970b).f4098a[0] & 255)) {
            int i2 = q9Var.f3969a + 1;
            q9Var.f3969a = i2;
            if (i2 == i) {
                return false;
            }
            ih0Var.e(((r42) q9Var.f3970b).f4098a, 0, 1, false);
        }
        long p = q9Var.p(ih0Var);
        long j3 = q9Var.f3969a;
        if (p == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + p >= j) {
            return false;
        }
        while (true) {
            long j4 = q9Var.f3969a;
            long j5 = j3 + p;
            if (j4 < j5) {
                if (q9Var.p(ih0Var) == Long.MIN_VALUE) {
                    return false;
                }
                long p2 = q9Var.p(ih0Var);
                if (p2 < 0 || p2 > 2147483647L) {
                    return false;
                }
                if (p2 != 0) {
                    int i3 = (int) p2;
                    ih0Var.n(i3, false);
                    q9Var.f3969a += i3;
                }
            } else {
                if (j4 != j5) {
                    return false;
                }
                return true;
            }
        }
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        dh0 dh0Var = this.f3002a;
        dh0Var.e = 0;
        dh0Var.f1779b.clear();
        ij3 ij3Var = dh0Var.c;
        ij3Var.f2611b = 0;
        ij3Var.c = 0;
        ij3 ij3Var2 = this.f3003b;
        ij3Var2.f2611b = 0;
        ij3Var2.c = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                lc3 lc3Var = ((jr1) sparseArray.valueAt(i)).T;
                if (lc3Var != null) {
                    lc3Var.f3104b = false;
                    lc3Var.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0945, code lost:            r5 = true;        r3 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0946, code lost:            if (r5 == false) goto L501;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0948, code lost:            r6 = r36.getPosition();     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x094e, code lost:            if (r35.y == false) goto L455;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0950, code lost:            r35.A = r6;        r37.f3157a = r35.z;        r35.y = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0969, code lost:            r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x096c, code lost:            if (r4 == false) goto L502;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x096e, code lost:            return 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0474, code lost:            throw defpackage.u42.a("EBML lacing sample size out of range.", null);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x095b, code lost:            if (r35.v == false) goto L461;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x095d, code lost:            r3 = r35.A;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0963, code lost:            if (r3 == (-1)) goto L461;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0965, code lost:            r37.f3157a = r3;        r35.A = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x096b, code lost:            r4 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0738, code lost:            throw defpackage.u42.a("DocTypeReadVersion " + r10 + " not supported", null);     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0984, code lost:            if (r5 != false) goto L477;     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0986, code lost:            r3 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0987, code lost:            r1 = r35.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x098d, code lost:            if (r3 >= r1.size()) goto L525;     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x098f, code lost:            r1 = (defpackage.jr1) r1.valueAt(r3);        r1.X.getClass();        r2 = r1.T;     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x099c, code lost:            if (r2 == null) goto L527;     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x099e, code lost:            r2.a(r1.X, r1.j);     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x09a5, code lost:            r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x09a8, code lost:            return -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x09aa, code lost:            return 0;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v133 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v86 */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r36, defpackage.lm2 r37) {
        /*
            Method dump skipped, instructions count: 3024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr1.f(ev0, lm2):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07b5, code lost:            if (r2.o() == r3.getLeastSignificantBits()) goto L485;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x04f5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07cd  */
    /* JADX WARN: Type inference failed for: r0v19, types: [jr1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v90 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r24) {
        /*
            Method dump skipped, instructions count: 3164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr1.g(int):void");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.b0 = fv0Var;
    }

    public final void j(ev0 ev0Var, int i) {
        r42 r42Var = this.g;
        if (r42Var.c >= i) {
            return;
        }
        byte[] bArr = r42Var.f4098a;
        if (bArr.length < i) {
            r42Var.a(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = r42Var.f4098a;
        int i2 = r42Var.c;
        ev0Var.readFully(bArr2, i2, i - i2);
        r42Var.F(i);
    }

    public final void k() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.D(0);
    }

    public final long l(long j) {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return wi3.G(j, j2, 1000L);
        }
        throw u42.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int m(ev0 ev0Var, jr1 jr1Var, int i, boolean z) {
        int d;
        int d2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        if ("S_TEXT/UTF8".equals(jr1Var.f2816b)) {
            n(ev0Var, c0, i);
            int i3 = this.T;
            k();
            return i3;
        }
        if ("S_TEXT/ASS".equals(jr1Var.f2816b)) {
            n(ev0Var, e0, i);
            int i4 = this.T;
            k();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(jr1Var.f2816b)) {
            n(ev0Var, f0, i);
            int i5 = this.T;
            k();
            return i5;
        }
        xa3 xa3Var = jr1Var.X;
        boolean z5 = this.V;
        r42 r42Var = this.j;
        boolean z6 = true;
        if (!z5) {
            boolean z7 = jr1Var.h;
            r42 r42Var2 = this.g;
            if (z7) {
                this.O &= -1073741825;
                int i6 = 128;
                if (!this.W) {
                    ev0Var.readFully(r42Var2.f4098a, 0, 1);
                    this.S++;
                    byte b2 = r42Var2.f4098a[0];
                    if ((b2 & 128) != 128) {
                        this.Z = b2;
                        this.W = true;
                    } else {
                        throw u42.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b3 = this.Z;
                if ((b3 & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if ((b3 & 2) == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.O |= 1073741824;
                    if (!this.a0) {
                        r42 r42Var3 = this.l;
                        ev0Var.readFully(r42Var3.f4098a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        byte[] bArr = r42Var2.f4098a;
                        if (!z4) {
                            i6 = 0;
                        }
                        bArr[0] = (byte) (i6 | 8);
                        r42Var2.G(0);
                        xa3Var.c(1, r42Var2);
                        this.T++;
                        r42Var3.G(0);
                        xa3Var.c(8, r42Var3);
                        this.T += 8;
                    }
                    if (z4) {
                        if (!this.X) {
                            ev0Var.readFully(r42Var2.f4098a, 0, 1);
                            this.S++;
                            r42Var2.G(0);
                            this.Y = r42Var2.v();
                            this.X = true;
                        }
                        int i7 = this.Y * 4;
                        r42Var2.D(i7);
                        ev0Var.readFully(r42Var2.f4098a, 0, i7);
                        this.S += i7;
                        short s = (short) ((this.Y / 2) + 1);
                        int i8 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.o = ByteBuffer.allocate(i8);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i9 >= i2) {
                                break;
                            }
                            int y = r42Var2.y();
                            if (i9 % 2 == 0) {
                                this.o.putShort((short) (y - i10));
                            } else {
                                this.o.putInt(y - i10);
                            }
                            i9++;
                            i10 = y;
                        }
                        int i11 = (i - this.S) - i10;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i11);
                        } else {
                            this.o.putShort((short) i11);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        r42 r42Var4 = this.m;
                        r42Var4.E(i8, array);
                        xa3Var.c(i8, r42Var4);
                        this.T += i8;
                    }
                }
            } else {
                byte[] bArr2 = jr1Var.i;
                if (bArr2 != null) {
                    r42Var.E(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(jr1Var.f2816b)) {
                z2 = z;
            } else if (jr1Var.f > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.O |= 268435456;
                this.n.D(0);
                int i12 = (r42Var.c + i) - this.S;
                r42Var2.D(4);
                byte[] bArr3 = r42Var2.f4098a;
                bArr3[0] = (byte) ((i12 >> 24) & 255);
                bArr3[1] = (byte) ((i12 >> 16) & 255);
                bArr3[2] = (byte) ((i12 >> 8) & 255);
                bArr3[3] = (byte) (i12 & 255);
                xa3Var.c(4, r42Var2);
                this.T += 4;
            }
            this.V = true;
        }
        int i13 = i + r42Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(jr1Var.f2816b) && !"V_MPEGH/ISO/HEVC".equals(jr1Var.f2816b)) {
            if (jr1Var.T != null) {
                if (r42Var.c != 0) {
                    z6 = false;
                }
                cp3.m(z6);
                jr1Var.T.c(ev0Var);
            }
            while (true) {
                int i14 = this.S;
                if (i14 >= i13) {
                    break;
                }
                int i15 = i13 - i14;
                int i16 = r42Var.c - r42Var.f4099b;
                if (i16 > 0) {
                    d2 = Math.min(i15, i16);
                    xa3Var.b(d2, r42Var);
                } else {
                    d2 = xa3Var.d(ev0Var, i15, false);
                }
                this.S += d2;
                this.T += d2;
            }
        } else {
            r42 r42Var5 = this.f;
            byte[] bArr4 = r42Var5.f4098a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i17 = jr1Var.Y;
            int i18 = 4 - i17;
            while (this.S < i13) {
                int i19 = this.U;
                if (i19 == 0) {
                    int min = Math.min(i17, r42Var.c - r42Var.f4099b);
                    ev0Var.readFully(bArr4, i18 + min, i17 - min);
                    if (min > 0) {
                        r42Var.d(i18, bArr4, min);
                    }
                    this.S += i17;
                    r42Var5.G(0);
                    this.U = r42Var5.y();
                    r42 r42Var6 = this.e;
                    r42Var6.G(0);
                    xa3Var.b(4, r42Var6);
                    this.T += 4;
                } else {
                    int i20 = r42Var.c - r42Var.f4099b;
                    if (i20 > 0) {
                        d = Math.min(i19, i20);
                        xa3Var.b(d, r42Var);
                    } else {
                        d = xa3Var.d(ev0Var, i19, false);
                    }
                    this.S += d;
                    this.T += d;
                    this.U -= d;
                }
            }
        }
        if ("A_VORBIS".equals(jr1Var.f2816b)) {
            r42 r42Var7 = this.h;
            r42Var7.G(0);
            xa3Var.b(4, r42Var7);
            this.T += 4;
        }
        int i21 = this.T;
        k();
        return i21;
    }

    public final void n(ev0 ev0Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        r42 r42Var = this.k;
        byte[] bArr2 = r42Var.f4098a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            r42Var.E(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ev0Var.readFully(r42Var.f4098a, bArr.length, i);
        r42Var.G(0);
        r42Var.F(length);
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
