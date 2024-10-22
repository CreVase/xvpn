package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ia1 extends t9 {
    public static final ef0 x = new ef0(3);
    public final ga1 w;

    public ia1(ga1 ga1Var) {
        this.w = ga1Var;
    }

    public static ApicFrame O0(int i, int i2, r42 r42Var) {
        int b1;
        String str;
        byte[] copyOfRange;
        int v = r42Var.v();
        Charset Y0 = Y0(v);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        r42Var.d(0, bArr, i3);
        if (i2 == 2) {
            String str2 = "image/" + zf3.m0(new String(bArr, 0, 3, ex.f2015b));
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            b1 = 2;
        } else {
            b1 = b1(0, bArr);
            String m0 = zf3.m0(new String(bArr, 0, b1, ex.f2015b));
            if (m0.indexOf(47) == -1) {
                str = "image/".concat(m0);
            } else {
                str = m0;
            }
        }
        int i4 = bArr[b1 + 1] & 255;
        int i5 = b1 + 2;
        int a1 = a1(i5, bArr, v);
        String str3 = new String(bArr, i5, a1 - i5, Y0);
        int X0 = X0(v) + a1;
        if (i3 <= X0) {
            copyOfRange = wi3.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, X0, i3);
        }
        return new ApicFrame(str, str3, i4, copyOfRange);
    }

    public static ChapterFrame P0(r42 r42Var, int i, int i2, boolean z, int i3, ga1 ga1Var) {
        long j;
        long j2;
        int i4 = r42Var.f4099b;
        int b1 = b1(i4, r42Var.f4098a);
        String str = new String(r42Var.f4098a, i4, b1 - i4, ex.f2015b);
        r42Var.G(b1 + 1);
        int f = r42Var.f();
        int f2 = r42Var.f();
        long w = r42Var.w();
        if (w == 4294967295L) {
            j = -1;
        } else {
            j = w;
        }
        long w2 = r42Var.w();
        if (w2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = w2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (r42Var.f4099b < i5) {
            Id3Frame S0 = S0(i2, r42Var, z, i3, ga1Var);
            if (S0 != null) {
                arrayList.add(S0);
            }
        }
        return new ChapterFrame(str, f, f2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame Q0(r42 r42Var, int i, int i2, boolean z, int i3, ga1 ga1Var) {
        boolean z2;
        boolean z3;
        int i4 = r42Var.f4099b;
        int b1 = b1(i4, r42Var.f4098a);
        String str = new String(r42Var.f4098a, i4, b1 - i4, ex.f2015b);
        r42Var.G(b1 + 1);
        int v = r42Var.v();
        if ((v & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((v & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int v2 = r42Var.v();
        String[] strArr = new String[v2];
        for (int i5 = 0; i5 < v2; i5++) {
            int i6 = r42Var.f4099b;
            int b12 = b1(i6, r42Var.f4098a);
            strArr[i5] = new String(r42Var.f4098a, i6, b12 - i6, ex.f2015b);
            r42Var.G(b12 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (r42Var.f4099b < i7) {
            Id3Frame S0 = S0(i2, r42Var, z, i3, ga1Var);
            if (S0 != null) {
                arrayList.add(S0);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame R0(int i, r42 r42Var) {
        if (i < 4) {
            return null;
        }
        int v = r42Var.v();
        Charset Y0 = Y0(v);
        byte[] bArr = new byte[3];
        r42Var.d(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        r42Var.d(0, bArr2, i2);
        int a1 = a1(0, bArr2, v);
        String str2 = new String(bArr2, 0, a1, Y0);
        int X0 = X0(v) + a1;
        return new CommentFrame(str, str2, V0(bArr2, X0, a1(X0, bArr2, v), Y0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x021a, code lost:            if (r13 == 67) goto L145;     */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame S0(int r18, defpackage.r42 r19, boolean r20, int r21, defpackage.ga1 r22) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.S0(int, r42, boolean, int, ga1):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame T0(int i, r42 r42Var) {
        byte[] copyOfRange;
        int v = r42Var.v();
        Charset Y0 = Y0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        r42Var.d(0, bArr, i2);
        int b1 = b1(0, bArr);
        String str = new String(bArr, 0, b1, ex.f2015b);
        int i3 = b1 + 1;
        int a1 = a1(i3, bArr, v);
        String V0 = V0(bArr, i3, a1, Y0);
        int X0 = X0(v) + a1;
        int a12 = a1(X0, bArr, v);
        String V02 = V0(bArr, X0, a12, Y0);
        int X02 = X0(v) + a12;
        if (i2 <= X02) {
            copyOfRange = wi3.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, X02, i2);
        }
        return new GeobFrame(str, V0, V02, copyOfRange);
    }

    public static MlltFrame U0(int i, r42 r42Var) {
        int A = r42Var.A();
        int x2 = r42Var.x();
        int x3 = r42Var.x();
        int v = r42Var.v();
        int v2 = r42Var.v();
        nn3 nn3Var = new nn3();
        nn3Var.n(r42Var.c, r42Var.f4098a);
        nn3Var.o(r42Var.f4099b * 8);
        int i2 = ((i - 10) * 8) / (v + v2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = nn3Var.i(v);
            int i5 = nn3Var.i(v2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new MlltFrame(A, x2, x3, iArr, iArr2);
    }

    public static String V0(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    public static ji2 W0(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return hb1.q("");
        }
        db1 db1Var = hb1.f2394b;
        m20.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int a1 = a1(i2, bArr, i);
        int i3 = 0;
        while (i2 < a1) {
            String str = new String(bArr, i2, a1 - i2, Y0(i));
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArr = Arrays.copyOf(objArr, pe0.q(objArr.length, i4));
            }
            objArr[i3] = str;
            int X0 = a1 + X0(i);
            i3 = i4;
            i2 = X0;
            a1 = a1(X0, bArr, i);
        }
        ji2 j = hb1.j(i3, objArr);
        if (j.isEmpty()) {
            return hb1.q("");
        }
        return j;
    }

    public static int X0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset Y0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ex.f2015b;
                }
                return ex.c;
            }
            return ex.d;
        }
        return ex.f;
    }

    public static String Z0(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int a1(int i, byte[] bArr, int i2) {
        int b1 = b1(i, bArr);
        if (i2 != 0 && i2 != 3) {
            while (b1 < bArr.length - 1) {
                if ((b1 - i) % 2 == 0 && bArr[b1 + 1] == 0) {
                    return b1;
                }
                b1 = b1(b1 + 1, bArr);
            }
            return bArr.length;
        }
        return b1;
    }

    public static int b1(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int c1(int i, r42 r42Var) {
        byte[] bArr = r42Var.f4098a;
        int i2 = r42Var.f4099b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:            if ((r10 & 1) != 0) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:            if ((r10 & 128) != 0) goto L43;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d1(defpackage.r42 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f4099b
        L6:
            int r3 = r1.c     // Catch: java.lang.Throwable -> Lad
            int r4 = r1.f4099b     // Catch: java.lang.Throwable -> Lad
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La9
            r3 = 0
            r6 = 3
            if (r0 < r6) goto L21
            int r7 = r18.f()     // Catch: java.lang.Throwable -> Lad
            long r8 = r18.w()     // Catch: java.lang.Throwable -> Lad
            int r10 = r18.A()     // Catch: java.lang.Throwable -> Lad
            goto L2b
        L21:
            int r7 = r18.x()     // Catch: java.lang.Throwable -> Lad
            int r8 = r18.x()     // Catch: java.lang.Throwable -> Lad
            long r8 = (long) r8
            r10 = 0
        L2b:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            r1.G(r2)
            return r4
        L39:
            r7 = 4
            if (r0 != r7) goto L6a
            if (r21 != 0) goto L6a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4a
            r1.G(r2)
            return r3
        L4a:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6a:
            if (r0 != r7) goto L78
            r6 = r10 & 64
            if (r6 == 0) goto L72
            r6 = 1
            goto L73
        L72:
            r6 = 0
        L73:
            r7 = r10 & 1
            if (r7 == 0) goto L87
            goto L88
        L78:
            if (r0 != r6) goto L86
            r6 = r10 & 32
            if (r6 == 0) goto L80
            r6 = 1
            goto L81
        L80:
            r6 = 0
        L81:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L88
        L86:
            r6 = 0
        L87:
            r4 = 0
        L88:
            if (r4 == 0) goto L8c
            int r6 = r6 + 4
        L8c:
            long r6 = (long) r6
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 >= 0) goto L95
            r1.G(r2)
            return r3
        L95:
            int r4 = r1.c     // Catch: java.lang.Throwable -> Lad
            int r6 = r1.f4099b     // Catch: java.lang.Throwable -> Lad
            int r4 = r4 - r6
            long r6 = (long) r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto La3
            r1.G(r2)
            return r3
        La3:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> Lad
            goto L6
        La9:
            r1.G(r2)
            return r4
        Lad:
            r0 = move-exception
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.d1(r42, int, int, boolean):boolean");
    }

    @Override // defpackage.t9
    public final Metadata B(lw1 lw1Var, ByteBuffer byteBuffer) {
        return N0(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.metadata.Metadata N0(int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.N0(int, byte[]):com.google.android.exoplayer2.metadata.Metadata");
    }
}
