package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class fx0 extends nn {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public fx0() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:            if (r1 != false) goto L35;     */
    @Override // defpackage.zd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(defpackage.ce0 r10) {
        /*
            r9 = this;
            android.net.Uri r0 = r10.f617a
            long r1 = r10.f
            r9.f = r0
            r9.r()
            r3 = 1
            r4 = 2000(0x7d0, float:2.803E-42)
            r5 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            java.lang.String r7 = r0.getPath()     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            r7.getClass()     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            java.lang.String r8 = "r"
            r6.<init>(r7, r8)     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            r9.e = r6
            r6.seek(r1)     // Catch: java.io.IOException -> L49
            long r5 = r10.g     // Catch: java.io.IOException -> L49
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L30
            java.io.RandomAccessFile r0 = r9.e     // Catch: java.io.IOException -> L49
            long r5 = r0.length()     // Catch: java.io.IOException -> L49
            long r5 = r5 - r1
        L30:
            r9.g = r5     // Catch: java.io.IOException -> L49
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L40
            r9.h = r3
            r9.s(r10)
            long r0 = r9.g
            return r0
        L40:
            ex0 r10 = new ex0
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r10.<init>(r1, r1, r0)
            throw r10
        L49:
            r10 = move-exception
            ex0 r0 = new ex0
            r0.<init>(r10, r4)
            throw r0
        L50:
            r10 = move-exception
            ex0 r0 = new ex0
            r0.<init>(r10, r4)
            throw r0
        L57:
            r10 = move-exception
            ex0 r0 = new ex0
            r0.<init>(r10, r5)
            throw r0
        L5e:
            r10 = move-exception
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L8c
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L8c
            ex0 r0 = new ex0
            int r1 = defpackage.wi3.f5017a
            r2 = 21
            if (r1 < r2) goto L86
            java.lang.Throwable r1 = r10.getCause()
            boolean r1 = defpackage.cx0.a(r1)
            if (r1 == 0) goto L86
            goto L88
        L86:
            r5 = 2005(0x7d5, float:2.81E-42)
        L88:
            r0.<init>(r10, r5)
            throw r0
        L8c:
            ex0 r1 = new ex0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r2[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r2[r3] = r4
            r3 = 2
            java.lang.String r0 = r0.getFragment()
            r2[r3] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r0, r10, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx0.c(ce0):long");
    }

    @Override // defpackage.zd0
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new ex0(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                q();
            }
        }
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.f;
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = wi3.f5017a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                p(read);
            }
            return read;
        } catch (IOException e) {
            throw new ex0(e, 2000);
        }
    }
}
