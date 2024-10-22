package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0971bD implements AnonymousClass03<Bitmap> {
    public static byte[] A06;
    public static String[] A07 = {"O8BWLXPdzHA", "6sEzkrKiC7tSlAyzako7Jr1QeLTjq7r7", "buIAODYM5Oo034kKCIV4I7ZzRqvLqiIh", "ENOGp8Grp5cb6hByXNSQMpF2JyONyocp", "tnh", "2Zn0DxkDz4CuR43sN", "3j1ga9q4MlHQ2cRzMN", "NuleDR7CXAFlpWhCDunnHJWIhrQ2pSEs"};
    public final int A00;
    public final int A01;
    public final String A02 = C0971bD.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            if (A07[7].charAt(0) == 'p') {
                throw new RuntimeException();
            }
            A07[6] = "rTtdlTA5qc3UePbll3p";
            copyOfRange[i4] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A07[4].length() != 3) {
            throw new RuntimeException();
        }
        A07[6] = "j2OKbozXXbIBudrsn6AX9zPsXXh";
        A06 = new byte[]{1, 91, 66, 95, 7, 44, 49, 40, 36, 53, 101, 44, 54, 101, 43, 48, 41, 41, 124, 65, 90, 92, 73, 77, 80, 86, 87, 25, 93, 76, 75, 80, 87, 94, 25, 95, 80, 85, 92, 25, 90, 86, 84, 73, 75, 92, 74, 74, 80, 86, 87};
    }

    static {
        A02();
    }

    public C0971bD(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static AnonymousClass02<Bitmap> A00(Throwable th) {
        return new AnonymousClass02<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 39);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            C0M.A07(byteArrayOutputStream);
            C0M.A07(fileOutputStream);
            C0M.A07(fileInputStream);
            C0M.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    public final AnonymousClass02<Bitmap> A3I(File file, C0L c0l) {
        if (!this.A04) {
            return new AnonymousClass02<>(true, null);
        }
        try {
            Bitmap A03 = C0M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new AnonymousClass02<>(true, A03);
            }
            c0l.A9G(new C0965b7(A01(4, 14, 77)));
            return A00(null);
        } catch (Throwable th) {
            if (A07[6].length() == 26) {
                Throwable t = new RuntimeException();
                throw t;
            }
            String[] strArr = A07;
            strArr[2] = "Rre6UfQ4j0qmCPYEhTx2DnaeM5gEursB";
            strArr[1] = "Gg2NoIsyPtMRdLQD2TdVPdh2XNeZHi6S";
            file.delete();
            c0l.A9G(th);
            return A00(th);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    public final void A4R(File file, C0L c0l) throws C0965b7 {
        if (this.A03) {
            try {
                Bitmap bitmap = C0M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C0965b7(A01(4, 14, 77));
                }
            } catch (C0965b7 e) {
                c0l.A9R(e);
                throw e;
            } catch (Throwable th) {
                c0l.A9R(th);
                Throwable t = new C0965b7(A01(18, 33, 49), th);
                throw t;
            }
        }
    }
}
