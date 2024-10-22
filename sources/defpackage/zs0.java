package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class zs0 extends InputStream implements DataInput {
    public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f5539a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f5540b;
    public int c;
    public byte[] d;

    public zs0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.f5539a;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(p71.k("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += skip;
        }
        this.c += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f5539a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.c++;
        return this.f5539a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.c++;
        return this.f5539a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.c++;
        int read = this.f5539a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.c += 2;
        return this.f5539a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.c += i2;
        this.f5539a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.c += 4;
        DataInputStream dataInputStream = this.f5539a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f5540b;
            if (byteOrder == e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f5540b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.c += 8;
        DataInputStream dataInputStream = this.f5539a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f5540b;
            if (byteOrder == e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f5540b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.c += 2;
        DataInputStream dataInputStream = this.f5539a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f5540b;
            if (byteOrder == e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f5540b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.c += 2;
        return this.f5539a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.c++;
        return this.f5539a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.c += 2;
        DataInputStream dataInputStream = this.f5539a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f5540b;
            if (byteOrder == e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f5540b);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public zs0(BufferedInputStream bufferedInputStream) {
        this(bufferedInputStream, ByteOrder.BIG_ENDIAN);
    }

    public zs0(InputStream inputStream, ByteOrder byteOrder) {
        this.f5540b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f5539a = dataInputStream;
        dataInputStream.mark(0);
        this.c = 0;
        this.f5540b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f5539a.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.c += bArr.length;
        this.f5539a.readFully(bArr);
    }
}
