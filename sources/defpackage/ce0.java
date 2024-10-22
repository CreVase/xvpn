package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ce0 {
    public static final /* synthetic */ int k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f617a;

    /* renamed from: b, reason: collision with root package name */
    public final long f618b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        iu0.a("goog.exo.datasource");
    }

    public ce0(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        boolean z;
        boolean z2;
        byte[] bArr2 = bArr;
        boolean z3 = true;
        if (j + j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.e(z2);
        if (j3 <= 0 && j3 != -1) {
            z3 = false;
        }
        cp3.e(z3);
        this.f617a = uri;
        this.f618b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f617a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return hx2.r(sb, this.i, "]");
    }
}
