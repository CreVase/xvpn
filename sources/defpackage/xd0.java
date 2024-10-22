package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class xd0 extends nn {
    public ce0 e;
    public byte[] f;
    public int g;
    public int h;

    public xd0() {
        super(false);
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        r();
        this.e = ce0Var;
        Uri uri = ce0Var.f617a;
        String scheme = uri.getScheme();
        cp3.f("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = wi3.f5017a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new u42(hx2.p("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.f = wi3.x(URLDecoder.decode(str, ex.f2014a.name()));
            }
            byte[] bArr = this.f;
            long length = bArr.length;
            long j = ce0Var.f;
            if (j <= length) {
                int i2 = (int) j;
                this.g = i2;
                int length2 = bArr.length - i2;
                this.h = length2;
                long j2 = ce0Var.g;
                if (j2 != -1) {
                    this.h = (int) Math.min(length2, j2);
                }
                s(ce0Var);
                if (j2 == -1) {
                    return this.h;
                }
                return j2;
            }
            this.f = null;
            throw new ae0(2008);
        }
        throw new u42("Unexpected URI format: " + uri, null, true, 0);
    }

    @Override // defpackage.zd0
    public final void close() {
        if (this.f != null) {
            this.f = null;
            q();
        }
        this.e = null;
    }

    @Override // defpackage.zd0
    public final Uri o() {
        ce0 ce0Var = this.e;
        if (ce0Var != null) {
            return ce0Var.f617a;
        }
        return null;
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = wi3.f5017a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        p(min);
        return min;
    }
}
