package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i52 implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i52 f2539a = new i52();

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.zd0
    public final void close() {
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
    }

    @Override // defpackage.zd0
    public final Map k() {
        return Collections.emptyMap();
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return null;
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
