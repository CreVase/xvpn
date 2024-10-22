package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface sr extends mx2, ReadableByteChannel {
    boolean A(long j, at atVar);

    int C(r32 r32Var);

    xg2 D();

    long E(lr lrVar);

    void F(long j);

    long H();

    kr I();

    void J(lr lrVar, long j);

    lr b();

    at e(long j);

    byte[] i();

    boolean j();

    long n();

    String o(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    String s(Charset charset);

    void skip(long j);

    at u();

    boolean v(long j);

    String y();
}
