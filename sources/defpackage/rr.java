package defpackage;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface rr extends dw2, WritableByteChannel {
    rr B(int i, byte[] bArr, int i2);

    rr G(long j);

    lr b();

    rr f();

    @Override // defpackage.dw2, java.io.Flushable
    void flush();

    rr g(int i);

    rr h(int i);

    rr k(int i);

    long l(mx2 mx2Var);

    rr m();

    rr p(String str);

    rr r(at atVar);

    rr t(long j);

    rr z(byte[] bArr);
}
