package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm2 {

    /* renamed from: a, reason: collision with root package name */
    public final cf0 f3315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3316b;
    public final r42 c;
    public ih d;
    public ih e;
    public ih f;
    public long g;

    public mm2(cf0 cf0Var) {
        this.f3315a = cf0Var;
        int i = cf0Var.f623b;
        this.f3316b = i;
        this.c = new r42(32);
        ih ihVar = new ih(0L, i);
        this.d = ihVar;
        this.e = ihVar;
        this.f = ihVar;
    }

    public static ih c(ih ihVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ihVar.f2593b) {
            ihVar = (ih) ihVar.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (ihVar.f2593b - j));
            Object obj = ihVar.c;
            byteBuffer.put(((ca) obj).f602a, ((int) (j - ihVar.f2592a)) + ((ca) obj).f603b, min);
            i -= min;
            j += min;
            if (j == ihVar.f2593b) {
                ihVar = (ih) ihVar.d;
            }
        }
        return ihVar;
    }

    public static ih d(ih ihVar, long j, byte[] bArr, int i) {
        while (j >= ihVar.f2593b) {
            ihVar = (ih) ihVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (ihVar.f2593b - j));
            Object obj = ihVar.c;
            System.arraycopy(((ca) obj).f602a, ((int) (j - ihVar.f2592a)) + ((ca) obj).f603b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == ihVar.f2593b) {
                ihVar = (ih) ihVar.d;
            }
        }
        return ihVar;
    }

    public static ih e(ih ihVar, ve0 ve0Var, nm2 nm2Var, r42 r42Var) {
        boolean z;
        if (ve0Var.g(1073741824)) {
            long j = nm2Var.f3489a;
            int i = 1;
            r42Var.D(1);
            ih d = d(ihVar, j, r42Var.f4098a, 1);
            long j2 = j + 1;
            byte b2 = r42Var.f4098a[0];
            if ((b2 & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b2 & Byte.MAX_VALUE;
            fc0 fc0Var = ve0Var.c;
            byte[] bArr = fc0Var.f2071a;
            if (bArr == null) {
                fc0Var.f2071a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ihVar = d(d, j2, fc0Var.f2071a, i2);
            long j3 = j2 + i2;
            if (z) {
                r42Var.D(2);
                ihVar = d(ihVar, j3, r42Var.f4098a, 2);
                j3 += 2;
                i = r42Var.A();
            }
            int[] iArr = fc0Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = fc0Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                r42Var.D(i3);
                ihVar = d(ihVar, j3, r42Var.f4098a, i3);
                j3 += i3;
                r42Var.G(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = r42Var.A();
                    iArr2[i4] = r42Var.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = nm2Var.f3490b - ((int) (j3 - nm2Var.f3489a));
            }
            wa3 wa3Var = (wa3) nm2Var.c;
            int i5 = wi3.f5017a;
            byte[] bArr2 = wa3Var.f4973b;
            byte[] bArr3 = fc0Var.f2071a;
            fc0Var.f = i;
            fc0Var.d = iArr;
            fc0Var.e = iArr2;
            fc0Var.f2072b = bArr2;
            fc0Var.f2071a = bArr3;
            int i6 = wa3Var.f4972a;
            fc0Var.c = i6;
            int i7 = wa3Var.c;
            fc0Var.g = i7;
            int i8 = wa3Var.d;
            fc0Var.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = fc0Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (wi3.f5017a >= 24) {
                ec0 ec0Var = fc0Var.j;
                ec0Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = ec0Var.f1912b;
                pattern.set(i7, i8);
                ec0Var.f1911a.setPattern(pattern);
            }
            long j4 = nm2Var.f3489a;
            int i9 = (int) (j3 - j4);
            nm2Var.f3489a = j4 + i9;
            nm2Var.f3490b -= i9;
        }
        if (ve0Var.g(268435456)) {
            r42Var.D(4);
            ih d2 = d(ihVar, nm2Var.f3489a, r42Var.f4098a, 4);
            int y = r42Var.y();
            nm2Var.f3489a += 4;
            nm2Var.f3490b -= 4;
            ve0Var.k(y);
            ih c = c(d2, nm2Var.f3489a, ve0Var.d, y);
            nm2Var.f3489a += y;
            int i10 = nm2Var.f3490b - y;
            nm2Var.f3490b = i10;
            ByteBuffer byteBuffer = ve0Var.g;
            if (byteBuffer != null && byteBuffer.capacity() >= i10) {
                ve0Var.g.clear();
            } else {
                ve0Var.g = ByteBuffer.allocate(i10);
            }
            return c(c, nm2Var.f3489a, ve0Var.g, nm2Var.f3490b);
        }
        ve0Var.k(nm2Var.f3490b);
        return c(ihVar, nm2Var.f3489a, ve0Var.d, nm2Var.f3490b);
    }

    public final void a(long j) {
        ih ihVar;
        if (j == -1) {
            return;
        }
        while (true) {
            ihVar = this.d;
            if (j < ihVar.f2593b) {
                break;
            }
            cf0 cf0Var = this.f3315a;
            ca caVar = (ca) ihVar.c;
            synchronized (cf0Var) {
                ca[] caVarArr = cf0Var.f;
                int i = cf0Var.e;
                cf0Var.e = i + 1;
                caVarArr[i] = caVar;
                cf0Var.d--;
                cf0Var.notifyAll();
            }
            ih ihVar2 = this.d;
            ihVar2.c = null;
            ih ihVar3 = (ih) ihVar2.d;
            ihVar2.d = null;
            this.d = ihVar3;
        }
        if (this.e.f2592a < ihVar.f2592a) {
            this.e = ihVar;
        }
    }

    public final int b(int i) {
        ca caVar;
        ih ihVar = this.f;
        if (((ca) ihVar.c) == null) {
            cf0 cf0Var = this.f3315a;
            synchronized (cf0Var) {
                int i2 = cf0Var.d + 1;
                cf0Var.d = i2;
                int i3 = cf0Var.e;
                if (i3 > 0) {
                    ca[] caVarArr = cf0Var.f;
                    int i4 = i3 - 1;
                    cf0Var.e = i4;
                    caVar = caVarArr[i4];
                    caVar.getClass();
                    cf0Var.f[cf0Var.e] = null;
                } else {
                    ca caVar2 = new ca(new byte[cf0Var.f623b], 0);
                    ca[] caVarArr2 = cf0Var.f;
                    if (i2 > caVarArr2.length) {
                        cf0Var.f = (ca[]) Arrays.copyOf(caVarArr2, caVarArr2.length * 2);
                    }
                    caVar = caVar2;
                }
            }
            ih ihVar2 = new ih(this.f.f2593b, this.f3316b);
            ihVar.c = caVar;
            ihVar.d = ihVar2;
        }
        return Math.min(i, (int) (this.f.f2593b - this.g));
    }
}
