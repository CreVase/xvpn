package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class qg extends nn {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public qg(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        int i;
        try {
            Uri uri = ce0Var.f617a;
            long j = ce0Var.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            r();
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(j) >= j) {
                long j2 = ce0Var.g;
                if (j2 != -1) {
                    this.h = j2;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                s(ce0Var);
                return this.h;
            }
            throw new pg(null, 2008);
        } catch (pg e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new pg(e2, i);
        }
    }

    @Override // defpackage.zd0
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new pg(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
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
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new pg(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        int i3 = wi3.f5017a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        p(read);
        return read;
    }
}
