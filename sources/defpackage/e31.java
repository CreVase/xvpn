package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e31 implements dv0 {
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final y01 G;
    public boolean A;
    public fv0 B;
    public xa3[] C;
    public xa3[] D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public final int f1880a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1881b;
    public final SparseArray c;
    public final r42 d;
    public final r42 e;
    public final r42 f;
    public final byte[] g;
    public final r42 h;
    public final uy0 i;
    public final r42 j;
    public final ArrayDeque k;
    public final ArrayDeque l;
    public int m;
    public int n;
    public long o;
    public int p;
    public r42 q;
    public long r;
    public int s;
    public long t;
    public long u;
    public long v;
    public d31 w;
    public int x;
    public int y;
    public int z;

    static {
        x01 x01Var = new x01();
        x01Var.k = "application/x-emsg";
        G = x01Var.a();
    }

    public e31() {
        List emptyList = Collections.emptyList();
        this.f1880a = 0;
        this.f1881b = Collections.unmodifiableList(emptyList);
        this.i = new uy0(5);
        this.j = new r42(16);
        this.d = new r42(py1.f3937a);
        this.e = new r42(5);
        this.f = new r42();
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new r42(bArr);
        this.k = new ArrayDeque();
        this.l = new ArrayDeque();
        this.c = new SparseArray();
        this.u = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = fv0.a0;
        this.C = new xa3[0];
        this.D = new xa3[0];
    }

    public static DrmInitData a(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            gh ghVar = (gh) arrayList.get(i);
            if (ghVar.f3342b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = ghVar.c.f4098a;
                f30 Z = ya0.Z(bArr);
                if (Z == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) Z.c;
                }
                if (uuid == null) {
                    sn1.f();
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void b(r42 r42Var, int i, ta3 ta3Var) {
        boolean z;
        r42Var.G(i + 8);
        int f = r42Var.f() & 16777215;
        if ((f & 1) == 0) {
            if ((f & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int y = r42Var.y();
            if (y == 0) {
                Arrays.fill(ta3Var.l, 0, ta3Var.e, false);
                return;
            }
            if (y == ta3Var.e) {
                Arrays.fill(ta3Var.l, 0, y, z);
                int i2 = r42Var.c - r42Var.f4099b;
                r42 r42Var2 = ta3Var.n;
                r42Var2.D(i2);
                ta3Var.k = true;
                ta3Var.o = true;
                r42Var.d(0, r42Var2.f4098a, r42Var2.c);
                r42Var2.G(0);
                ta3Var.o = false;
                return;
            }
            StringBuilder o = p71.o("Senc sample count ", y, " is different from fragment sample count");
            o.append(ta3Var.e);
            throw u42.a(o.toString(), null);
        }
        throw u42.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0370, code lost:            if (r4 >= r13.e) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x07a8, code lost:            r1.m = 0;        r1.p = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x07af, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r47) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e31.c(long):void");
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        return m20.b1(ev0Var, true, false);
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((d31) sparseArray.valueAt(i)).d();
        }
        this.l.clear();
        this.s = 0;
        this.t = j2;
        this.k.clear();
        this.m = 0;
        this.p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d2, code lost:            if ((r9 & 31) != 6) goto L99;     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0789 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f3 A[SYNTHETIC] */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r29, defpackage.lm2 r30) {
        /*
            Method dump skipped, instructions count: 1946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e31.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        int i;
        this.B = fv0Var;
        int i2 = 0;
        this.m = 0;
        this.p = 0;
        xa3[] xa3VarArr = new xa3[2];
        this.C = xa3VarArr;
        int i3 = 100;
        if ((this.f1880a & 4) != 0) {
            xa3VarArr[0] = fv0Var.l(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        xa3[] xa3VarArr2 = (xa3[]) wi3.E(i, this.C);
        this.C = xa3VarArr2;
        for (xa3 xa3Var : xa3VarArr2) {
            xa3Var.e(G);
        }
        List list = this.f1881b;
        this.D = new xa3[list.size()];
        while (i2 < this.D.length) {
            xa3 l = this.B.l(i3, 3);
            l.e((y01) list.get(i2));
            this.D[i2] = l;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
