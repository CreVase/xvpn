package defpackage;

import android.util.SparseArray;
import com.google.protobuf.v;

/* loaded from: classes.dex */
public final class jb2 implements dv0 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public py0 i;
    public fv0 j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final f93 f2740a = new f93(0);
    public final r42 c = new r42(v.DEFAULT_BUFFER_SIZE);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f2741b = new SparseArray();
    public final hb2 d = new hb2();

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        byte[] bArr = new byte[14];
        ih0 ih0Var = (ih0) ev0Var;
        ih0Var.e(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ih0Var.n(bArr[13] & 7, false);
        ih0Var.e(bArr, 0, 3, false);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        boolean z;
        f93 f93Var = this.f2740a;
        boolean z2 = true;
        if (f93Var.d() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long c = f93Var.c();
            if (c == -9223372036854775807L || c == 0 || c == j2) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            f93Var.e(j2);
        }
        py0 py0Var = this.i;
        if (py0Var != null) {
            py0Var.c(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f2741b;
            if (i < sparseArray.size()) {
                ib2 ib2Var = (ib2) sparseArray.valueAt(i);
                ib2Var.f = false;
                ib2Var.f2562a.c();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r19, defpackage.lm2 r20) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb2.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.j = fv0Var;
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
