package defpackage;

import com.google.protobuf.v;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class yd2 implements Closeable {
    public static final Logger g = Logger.getLogger(yd2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f5319a;

    /* renamed from: b, reason: collision with root package name */
    public int f5320b;
    public int c;
    public vd2 d;
    public vd2 e;
    public final byte[] f;

    public yd2(File file) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {v.DEFAULT_BUFFER_SIZE, 0, 0, 0};
                int i = 0;
                int i2 = 0;
                for (int i3 = 4; i < i3; i3 = 4) {
                    int i4 = iArr[i];
                    bArr2[i2] = (byte) (i4 >> 24);
                    bArr2[i2 + 1] = (byte) (i4 >> 16);
                    bArr2[i2 + 2] = (byte) (i4 >> 8);
                    bArr2[i2 + 3] = (byte) i4;
                    i2 += 4;
                    i++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f5319a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int L = L(0, bArr);
        this.f5320b = L;
        if (L <= randomAccessFile2.length()) {
            this.c = L(4, bArr);
            int L2 = L(8, bArr);
            int L3 = L(12, bArr);
            this.d = K(L2);
            this.e = K(L3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f5320b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int L(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final vd2 K(int i) {
        if (i == 0) {
            return vd2.c;
        }
        RandomAccessFile randomAccessFile = this.f5319a;
        randomAccessFile.seek(i);
        return new vd2(i, randomAccessFile.readInt());
    }

    public final synchronized void M() {
        if (!x()) {
            if (this.c == 1) {
                c();
            } else {
                vd2 vd2Var = this.d;
                int Q = Q(vd2Var.f4820a + 4 + vd2Var.f4821b);
                N(Q, 0, 4, this.f);
                int L = L(0, this.f);
                R(this.f5320b, this.c - 1, Q, this.e.f4820a);
                this.c--;
                this.d = new vd2(Q, L);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void N(int i, int i2, int i3, byte[] bArr) {
        int Q = Q(i);
        int i4 = Q + i3;
        int i5 = this.f5320b;
        RandomAccessFile randomAccessFile = this.f5319a;
        if (i4 <= i5) {
            randomAccessFile.seek(Q);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - Q;
        randomAccessFile.seek(Q);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void O(int i, int i2, byte[] bArr) {
        int Q = Q(i);
        int i3 = Q + i2;
        int i4 = this.f5320b;
        RandomAccessFile randomAccessFile = this.f5319a;
        if (i3 <= i4) {
            randomAccessFile.seek(Q);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - Q;
        randomAccessFile.seek(Q);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i5, i2 - i5);
    }

    public final int P() {
        if (this.c == 0) {
            return 16;
        }
        vd2 vd2Var = this.e;
        int i = vd2Var.f4820a;
        int i2 = this.d.f4820a;
        if (i >= i2) {
            return (i - i2) + 4 + vd2Var.f4821b + 16;
        }
        return (((i + 4) + vd2Var.f4821b) + this.f5320b) - i2;
    }

    public final int Q(int i) {
        int i2 = this.f5320b;
        if (i >= i2) {
            return (i + 16) - i2;
        }
        return i;
    }

    public final void R(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 < 4) {
                int i7 = iArr[i5];
                bArr[i6] = (byte) (i7 >> 24);
                bArr[i6 + 1] = (byte) (i7 >> 16);
                bArr[i6 + 2] = (byte) (i7 >> 8);
                bArr[i6 + 3] = (byte) i7;
                i6 += 4;
                i5++;
            } else {
                RandomAccessFile randomAccessFile = this.f5319a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    public final void a(byte[] bArr) {
        int Q;
        int i;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    d(length);
                    boolean x = x();
                    if (x) {
                        Q = 16;
                    } else {
                        vd2 vd2Var = this.e;
                        Q = Q(vd2Var.f4820a + 4 + vd2Var.f4821b);
                    }
                    vd2 vd2Var2 = new vd2(Q, length);
                    byte[] bArr2 = this.f;
                    bArr2[0] = (byte) (length >> 24);
                    bArr2[1] = (byte) (length >> 16);
                    bArr2[2] = (byte) (length >> 8);
                    bArr2[3] = (byte) length;
                    O(Q, 4, bArr2);
                    O(Q + 4, length, bArr);
                    if (x) {
                        i = Q;
                    } else {
                        i = this.d.f4820a;
                    }
                    R(this.f5320b, this.c + 1, i, Q);
                    this.e = vd2Var2;
                    this.c++;
                    if (x) {
                        this.d = vd2Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void c() {
        R(v.DEFAULT_BUFFER_SIZE, 0, 0, 0);
        this.c = 0;
        vd2 vd2Var = vd2.c;
        this.d = vd2Var;
        this.e = vd2Var;
        if (this.f5320b > 4096) {
            RandomAccessFile randomAccessFile = this.f5319a;
            randomAccessFile.setLength(v.DEFAULT_BUFFER_SIZE);
            randomAccessFile.getChannel().force(true);
        }
        this.f5320b = v.DEFAULT_BUFFER_SIZE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5319a.close();
    }

    public final void d(int i) {
        int i2 = i + 4;
        int P = this.f5320b - P();
        if (P >= i2) {
            return;
        }
        int i3 = this.f5320b;
        do {
            P += i3;
            i3 <<= 1;
        } while (P < i2);
        RandomAccessFile randomAccessFile = this.f5319a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        vd2 vd2Var = this.e;
        int Q = Q(vd2Var.f4820a + 4 + vd2Var.f4821b);
        if (Q < this.d.f4820a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f5320b);
            long j = Q - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.e.f4820a;
        int i5 = this.d.f4820a;
        if (i4 < i5) {
            int i6 = (this.f5320b + i4) - 16;
            R(i3, this.c, i5, i6);
            this.e = new vd2(i6, this.e.f4821b);
        } else {
            R(i3, this.c, i5, i4);
        }
        this.f5320b = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(yd2.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f5320b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            w(new ob2(this, sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized void w(xd2 xd2Var) {
        int i = this.d.f4820a;
        for (int i2 = 0; i2 < this.c; i2++) {
            vd2 K = K(i);
            xd2Var.c(new wd2(this, K), K.f4821b);
            i = Q(K.f4820a + 4 + K.f4821b);
        }
    }

    public final synchronized boolean x() {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
