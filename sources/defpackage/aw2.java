package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class aw2 implements am1 {

    /* renamed from: a, reason: collision with root package name */
    public final ce0 f353a;

    /* renamed from: b, reason: collision with root package name */
    public final j13 f354b;
    public byte[] c;

    public aw2(zd0 zd0Var, ce0 ce0Var) {
        xl1.f5178a.getAndIncrement();
        this.f353a = ce0Var;
        this.f354b = new j13(zd0Var);
    }

    @Override // defpackage.am1
    public final void E() {
    }

    @Override // defpackage.am1
    public final void y() {
        j13 j13Var = this.f354b;
        j13Var.f2688b = 0L;
        try {
            j13Var.c(this.f353a);
            int i = 0;
            while (i != -1) {
                int i2 = (int) j13Var.f2688b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                } else if (i2 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i = j13Var.read(bArr2, i2, bArr2.length - i2);
            }
        } finally {
            m20.V(j13Var);
        }
    }
}
