package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lm {

    /* renamed from: a, reason: collision with root package name */
    public final String f3153a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3154b;
    public final y72 c;

    public lm(String str, byte[] bArr, y72 y72Var) {
        this.f3153a = str;
        this.f3154b = bArr;
        this.c = y72Var;
    }

    public static y33 a() {
        y33 y33Var = new y33(13);
        y33Var.H(y72.DEFAULT);
        return y33Var;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = this.f3153a;
        objArr[1] = this.c;
        byte[] bArr = this.f3154b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public final lm c(y72 y72Var) {
        y33 a2 = a();
        a2.G(this.f3153a);
        a2.H(y72Var);
        a2.c = this.f3154b;
        return a2.o();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lm)) {
            return false;
        }
        lm lmVar = (lm) obj;
        if (this.f3153a.equals(lmVar.f3153a) && Arrays.equals(this.f3154b, lmVar.f3154b) && this.c.equals(lmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3153a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3154b)) * 1000003) ^ this.c.hashCode();
    }
}
