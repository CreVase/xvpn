package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class fs {
    public abstract void write(byte b2) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i, int i2) throws IOException;
}
