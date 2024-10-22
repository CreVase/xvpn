package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class f91 extends ae0 {
    public final int c;

    public f91() {
        super(2008);
        this.c = 1;
    }

    public static f91 a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zf3.m0(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new d91(iOException);
        }
        return new f91(iOException, i2, i);
    }

    public f91(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f91(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r2, r3)
            r1.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f91.<init>(java.io.IOException, int, int):void");
    }

    public f91(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.c = 1;
    }
}
