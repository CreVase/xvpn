package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s32 extends r13 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(r42 r42Var, byte[] bArr) {
        int i = r42Var.c;
        int i2 = r42Var.f4099b;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        r42Var.d(0, bArr2, bArr.length);
        r42Var.G(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.r13
    public final long b(r42 r42Var) {
        byte[] bArr = r42Var.f4098a;
        byte b2 = 0;
        byte b3 = bArr[0];
        if (bArr.length > 1) {
            b2 = bArr[1];
        }
        return (this.i * m20.p0(b3, b2)) / 1000000;
    }

    @Override // defpackage.r13
    public final boolean c(r42 r42Var, long j, uy0 uy0Var) {
        if (e(r42Var, o)) {
            byte[] copyOf = Arrays.copyOf(r42Var.f4098a, r42Var.c);
            int i = copyOf[9] & 255;
            ArrayList O = m20.O(copyOf);
            if (((y01) uy0Var.f4757b) != null) {
                return true;
            }
            x01 x01Var = new x01();
            x01Var.k = "audio/opus";
            x01Var.x = i;
            x01Var.y = 48000;
            x01Var.m = O;
            uy0Var.f4757b = new y01(x01Var);
            return true;
        }
        if (e(r42Var, p)) {
            cp3.o((y01) uy0Var.f4757b);
            if (this.n) {
                return true;
            }
            this.n = true;
            r42Var.H(8);
            Metadata a2 = sn3.a(hb1.m((String[]) sn3.b(r42Var, false, false).d));
            if (a2 == null) {
                return true;
            }
            y01 y01Var = (y01) uy0Var.f4757b;
            y01Var.getClass();
            x01 x01Var2 = new x01(y01Var);
            Metadata metadata = ((y01) uy0Var.f4757b).j;
            if (metadata != null) {
                a2 = a2.a(metadata.f1467a);
            }
            x01Var2.i = a2;
            uy0Var.f4757b = new y01(x01Var2);
            return true;
        }
        cp3.o((y01) uy0Var.f4757b);
        return false;
    }

    @Override // defpackage.r13
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
