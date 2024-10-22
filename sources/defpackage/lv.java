package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class lv extends rv {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final r42 g = new r42();
    public final ArrayList l = new ArrayList();
    public kv m = new kv(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public lv(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.h = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        sn1.f();
                        this.j = 0;
                        this.i = 0;
                    } else {
                        this.j = 1;
                        this.i = 1;
                    }
                } else {
                    this.j = 0;
                    this.i = 1;
                }
            } else {
                this.j = 1;
                this.i = 0;
            }
        } else {
            this.j = 0;
            this.i = 0;
        }
        k(0);
        j();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // defpackage.rv
    public final sv e() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new sv(0, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:150:0x0230. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[SYNTHETIC] */
    @Override // defpackage.rv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.pv r15) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv.f(pv):void");
    }

    @Override // defpackage.rv, defpackage.re0
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        k(0);
        this.q = 4;
        this.m.h = 4;
        j();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // defpackage.rv, defpackage.re0
    /* renamed from: g */
    public final b33 b() {
        boolean z2;
        b33 b33Var;
        b33 b2 = super.b();
        if (b2 != null) {
            return b2;
        }
        long j = this.k;
        if (j != -9223372036854775807L) {
            long j2 = this.x;
            if (j2 != -9223372036854775807L && this.e - j2 >= j) {
                z2 = true;
                if (!z2 && (b33Var = (b33) this.f4217b.pollFirst()) != null) {
                    this.n = Collections.emptyList();
                    this.x = -9223372036854775807L;
                    b33Var.j(this.e, e(), Long.MAX_VALUE);
                    return b33Var;
                }
            }
        }
        z2 = false;
        return !z2 ? null : null;
    }

    @Override // defpackage.rv
    public final boolean h() {
        if (this.n != this.o) {
            return true;
        }
        return false;
    }

    public final List i() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            hc0 c = ((kv) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            hc0 hc0Var = (hc0) arrayList2.get(i3);
            if (hc0Var != null) {
                if (hc0Var.i != i) {
                    hc0Var = ((kv) arrayList.get(i3)).c(i);
                    hc0Var.getClass();
                }
                arrayList3.add(hc0Var);
            }
        }
        return arrayList3;
    }

    public final void j() {
        kv kvVar = this.m;
        kvVar.g = this.p;
        kvVar.f3018a.clear();
        kvVar.f3019b.clear();
        kvVar.c.setLength(0);
        kvVar.d = 15;
        kvVar.e = 0;
        kvVar.f = 0;
        ArrayList arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    public final void k(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.l;
                if (i3 < arrayList.size()) {
                    ((kv) arrayList.get(i3)).g = i;
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.n = Collections.emptyList();
            }
        }
    }

    @Override // defpackage.rv, defpackage.re0
    public final void release() {
    }
}
