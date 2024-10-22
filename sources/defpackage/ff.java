package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ff extends t9 {
    @Override // defpackage.t9
    public final Metadata B(lw1 lw1Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        nn3 nn3Var = new nn3(byteBuffer.array(), byteBuffer.limit());
        nn3Var.r(12);
        int f = (nn3Var.f() + nn3Var.i(12)) - 4;
        nn3Var.r(44);
        nn3Var.s(nn3Var.i(12));
        nn3Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (nn3Var.f() < f) {
            nn3Var.r(48);
            int i = nn3Var.i(8);
            nn3Var.r(4);
            int f2 = nn3Var.f() + nn3Var.i(12);
            String str = null;
            String str2 = null;
            while (nn3Var.f() < f2) {
                int i2 = nn3Var.i(8);
                int i3 = nn3Var.i(8);
                int f3 = nn3Var.f() + i3;
                if (i2 == 2) {
                    int i4 = nn3Var.i(16);
                    nn3Var.r(8);
                    if (i4 != 3) {
                    }
                    while (nn3Var.f() < f3) {
                        int i5 = nn3Var.i(8);
                        Charset charset = ex.f2014a;
                        byte[] bArr = new byte[i5];
                        nn3Var.k(bArr, i5);
                        str = new String(bArr, charset);
                        int i6 = nn3Var.i(8);
                        for (int i7 = 0; i7 < i6; i7++) {
                            nn3Var.s(nn3Var.i(8));
                        }
                    }
                } else if (i2 == 21) {
                    Charset charset2 = ex.f2014a;
                    byte[] bArr2 = new byte[i3];
                    nn3Var.k(bArr2, i3);
                    str2 = new String(bArr2, charset2);
                }
                nn3Var.o(f3 * 8);
            }
            nn3Var.o(f2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(i, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
