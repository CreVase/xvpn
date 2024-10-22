package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class j13 implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final zd0 f2687a;

    /* renamed from: b, reason: collision with root package name */
    public long f2688b;
    public Uri c;

    public j13(zd0 zd0Var) {
        zd0Var.getClass();
        this.f2687a = zd0Var;
        this.c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        this.c = ce0Var.f617a;
        Collections.emptyMap();
        long c = this.f2687a.c(ce0Var);
        Uri o = o();
        o.getClass();
        this.c = o;
        k();
        return c;
    }

    @Override // defpackage.zd0
    public final void close() {
        this.f2687a.close();
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
        hb3Var.getClass();
        this.f2687a.d(hb3Var);
    }

    @Override // defpackage.zd0
    public final Map k() {
        return this.f2687a.k();
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.f2687a.o();
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f2687a.read(bArr, i, i2);
        if (read != -1) {
            this.f2688b += read;
        }
        return read;
    }
}
