package defpackage;

import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;

/* loaded from: classes.dex */
public class xq3 extends s71 {
    public final Window g;
    public final v51 h;

    public xq3(Window window, v51 v51Var) {
        super(3);
        this.g = window;
        this.h = v51Var;
    }

    @Override // defpackage.s71
    public final void l() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((mp0) this.h.f4780b).n();
                        }
                    } else {
                        s(2);
                    }
                } else {
                    s(4);
                }
            }
        }
    }

    @Override // defpackage.s71
    public final void p() {
        t(2048);
        s(v.DEFAULT_BUFFER_SIZE);
    }

    @Override // defpackage.s71
    public final void r(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((mp0) this.h.f4780b).q();
                        }
                    } else {
                        t(2);
                    }
                } else {
                    t(4);
                    this.g.clearFlags(UserVerificationMethods.USER_VERIFY_ALL);
                }
            }
        }
    }

    public final void s(int i) {
        View decorView = this.g.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void t(int i) {
        View decorView = this.g.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
