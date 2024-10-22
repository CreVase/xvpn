package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;

/* loaded from: classes.dex */
public final class rz1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4243a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4244b;
    public final boolean c;
    public final boolean d;

    public rz1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4243a = z;
        this.f4244b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz1)) {
            return false;
        }
        rz1 rz1Var = (rz1) obj;
        if (this.f4243a == rz1Var.f4243a && this.f4244b == rz1Var.f4244b && this.c == rz1Var.c && this.d == rz1Var.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z = this.f4244b;
        ?? r1 = this.f4243a;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (this.d) {
            return i2 + v.DEFAULT_BUFFER_SIZE;
        }
        return i2;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f4243a), Boolean.valueOf(this.f4244b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
