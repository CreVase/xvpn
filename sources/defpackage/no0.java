package defpackage;

import com.google.protobuf.v;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class no0 implements xa3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3502a = new byte[v.DEFAULT_BUFFER_SIZE];

    @Override // defpackage.xa3
    public final void a(long j, int i, int i2, int i3, wa3 wa3Var) {
    }

    @Override // defpackage.xa3
    public final void b(int i, r42 r42Var) {
        r42Var.H(i);
    }

    @Override // defpackage.xa3
    public final void c(int i, r42 r42Var) {
        r42Var.H(i);
    }

    @Override // defpackage.xa3
    public final int d(wd0 wd0Var, int i, boolean z) {
        return f(wd0Var, i, z);
    }

    @Override // defpackage.xa3
    public final void e(y01 y01Var) {
    }

    public final int f(wd0 wd0Var, int i, boolean z) {
        byte[] bArr = this.f3502a;
        int read = wd0Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }
}
