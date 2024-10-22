package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hr0 {

    /* renamed from: a, reason: collision with root package name */
    public final lr0 f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2474b;

    public hr0(lr0 lr0Var, byte[] bArr) {
        if (lr0Var != null) {
            if (bArr != null) {
                this.f2473a = lr0Var;
                this.f2474b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr0)) {
            return false;
        }
        hr0 hr0Var = (hr0) obj;
        if (!this.f2473a.equals(hr0Var.f2473a)) {
            return false;
        }
        return Arrays.equals(this.f2474b, hr0Var.f2474b);
    }

    public final int hashCode() {
        return ((this.f2473a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2474b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f2473a + ", bytes=[...]}";
    }
}
