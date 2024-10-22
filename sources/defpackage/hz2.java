package defpackage;

import android.widget.CompoundButton;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;

/* loaded from: classes2.dex */
public final class hz2 extends ji1 implements l41 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SplitTunnelingActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hz2(SplitTunnelingActivity splitTunnelingActivity, int i) {
        super(2);
        this.f = i;
        this.g = splitTunnelingActivity;
    }

    public final void a(f43 f43Var, CompoundButton compoundButton) {
        int i = this.f;
        SplitTunnelingActivity splitTunnelingActivity = this.g;
        switch (i) {
            case 0:
                m20.C0(splitTunnelingActivity, 16);
                return;
            case 1:
                if (compoundButton.isChecked()) {
                    f43Var.a();
                    return;
                } else {
                    t9.u0(splitTunnelingActivity, new c9(f43Var, 2));
                    return;
                }
            case 2:
                t9.u0(splitTunnelingActivity, new c9(f43Var, 3));
                return;
            case 3:
            default:
                t9.u0(splitTunnelingActivity, new c9(f43Var, 5));
                return;
            case 4:
                m20.C0(splitTunnelingActivity, 16);
                return;
            case 5:
                if (compoundButton.isChecked()) {
                    f43Var.a();
                    return;
                } else {
                    t9.u0(splitTunnelingActivity, new c9(f43Var, 4));
                    return;
                }
        }
    }

    public final void b(CompoundButton compoundButton, boolean z) {
        int i = this.f;
        SplitTunnelingActivity splitTunnelingActivity = this.g;
        switch (i) {
            case 3:
                if (z && !ew3.X()) {
                    m20.C0(splitTunnelingActivity, 16);
                    compoundButton.setChecked(false);
                    return;
                }
                ew3.g("tm5pxn6s9d");
                ew3.f0(z);
                if (z) {
                    splitTunnelingActivity.Z().c.setChecked(ew3.C());
                }
                int i2 = SplitTunnelingActivity.m;
                splitTunnelingActivity.c0();
                return;
            default:
                if (z && !ew3.X()) {
                    m20.C0(splitTunnelingActivity, 16);
                    compoundButton.setChecked(false);
                    return;
                }
                ew3.g("tm5pxn6s9d");
                ew3.h0(z);
                if (z) {
                    splitTunnelingActivity.Z().d.setChecked(ew3.v());
                }
                int i3 = SplitTunnelingActivity.m;
                splitTunnelingActivity.c0();
                return;
        }
    }

    @Override // defpackage.l41
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 1:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 2:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 3:
                b((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                return ch3Var;
            case 4:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 5:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 6:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            default:
                b((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                return ch3Var;
        }
    }
}
