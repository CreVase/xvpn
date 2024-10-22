package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class vs1 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f4888a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4889b;
    public final kb1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final hb1 g;
    public final byte[] h;

    public vs1(us1 us1Var) {
        boolean z;
        byte[] bArr;
        boolean z2 = us1Var.f;
        Uri uri = us1Var.f4726b;
        if (z2 && uri == null) {
            z = false;
        } else {
            z = true;
        }
        cp3.m(z);
        UUID uuid = us1Var.f4725a;
        uuid.getClass();
        this.f4888a = uuid;
        this.f4889b = uri;
        this.c = us1Var.c;
        this.d = us1Var.d;
        this.f = z2;
        this.e = us1Var.e;
        this.g = us1Var.g;
        byte[] bArr2 = us1Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1Var = (vs1) obj;
        if (this.f4888a.equals(vs1Var.f4888a) && wi3.a(this.f4889b, vs1Var.f4889b) && wi3.a(this.c, vs1Var.c) && this.d == vs1Var.d && this.f == vs1Var.f && this.e == vs1Var.e && this.g.equals(vs1Var.g) && Arrays.equals(this.h, vs1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f4888a.hashCode() * 31;
        Uri uri = this.f4889b;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + i) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
