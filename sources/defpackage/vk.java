package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class vk extends wa0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4847a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4848b;

    public vk(String str, byte[] bArr) {
        this.f4847a = str;
        this.f4848b = bArr;
    }

    public final boolean equals(Object obj) {
        vk vkVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        if (this.f4847a.equals(((vk) wa0Var).f4847a)) {
            if (wa0Var instanceof vk) {
                vkVar = (vk) wa0Var;
            } else {
                vkVar = (vk) wa0Var;
            }
            if (Arrays.equals(this.f4848b, vkVar.f4848b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4847a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4848b);
    }

    public final String toString() {
        return "File{filename=" + this.f4847a + ", contents=" + Arrays.toString(this.f4848b) + "}";
    }
}
