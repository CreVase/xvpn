package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class qg2 extends nn {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public qg2(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:            if (r3.matches("\\d+") != false) goto L84;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    @Override // defpackage.zd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(defpackage.ce0 r17) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg2.c(ce0):long");
    }

    @Override // defpackage.zd0
    public final void close() {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new pg2(null, e, 2000);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        q();
                    }
                }
            } catch (Throwable th) {
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            q();
                        }
                        throw th;
                    } finally {
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            q();
                        }
                    }
                } catch (IOException e2) {
                    throw new pg2(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new pg2(null, e3, 2000);
        }
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.g;
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new pg2(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = wi3.f5017a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new pg2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        p(read);
        return read;
    }
}
