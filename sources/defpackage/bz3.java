package defpackage;

/* loaded from: classes2.dex */
public final class bz3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f557a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f558b;

    public bz3(int i, boolean z) {
        this.f557a = i;
        this.f558b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bz3) {
            bz3 bz3Var = (bz3) obj;
            if (this.f557a == bz3Var.f557a && this.f558b == bz3Var.f558b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f557a ^ 1000003) * 1000003) ^ (true != this.f558b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f557a + ", allowAssetPackDeletion=" + this.f558b + "}";
    }
}
