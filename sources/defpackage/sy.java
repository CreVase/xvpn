package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sy extends z33 implements l41 {
    public final /* synthetic */ File e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(File file, c90 c90Var) {
        super(2, c90Var);
        this.e = file;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new sy(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((sy) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        File file = this.e;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ru0 ru0Var = new ru0();
                        ru0Var.write(read2);
                        byte[] bArr2 = new byte[8192];
                        for (int read3 = fileInputStream.read(bArr2); read3 >= 0; read3 = fileInputStream.read(bArr2)) {
                            ru0Var.write(bArr2, 0, read3);
                        }
                        int size = ru0Var.size() + i;
                        if (size >= 0) {
                            byte[] a2 = ru0Var.a();
                            bArr = Arrays.copyOf(bArr, size);
                            System.arraycopy(a2, 0, bArr, i, ru0Var.size() - 0);
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                tf3.y(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tf3.y(fileInputStream, th);
                throw th2;
            }
        }
    }
}
