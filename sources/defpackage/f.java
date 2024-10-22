package defpackage;

import android.view.View;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.R;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ AboutActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AboutActivity aboutActivity, int i) {
        super(1);
        this.f = i;
        this.g = aboutActivity;
    }

    public final void a(d dVar) {
        int i = this.f;
        int i2 = 0;
        AboutActivity aboutActivity = this.g;
        switch (i) {
            case 1:
                dVar.f1710a = pd0.y(R.string.NetworkAnalysis);
                dVar.f1711b = new f(aboutActivity, i2);
                return;
            case 2:
            case 3:
            case 5:
            default:
                dVar.f1710a = pd0.y(R.string.Licenses);
                dVar.f1711b = new j(dVar, aboutActivity);
                return;
            case 4:
                dVar.f1710a = pd0.y(R.string.TestConsole);
                dVar.f1711b = new f(aboutActivity, 3);
                return;
            case 6:
                dVar.f1710a = pd0.y(R.string.AdsSettings);
                dVar.f1711b = new f(aboutActivity, 5);
                return;
            case 7:
                dVar.f1710a = pd0.y(R.string.TermsOfService);
                dVar.f1711b = new j(aboutActivity, dVar, i2);
                return;
            case 8:
                dVar.f1710a = pd0.y(R.string.PrivacyPolicy);
                dVar.f1711b = new j(aboutActivity, dVar, 1);
                return;
        }
    }

    public final void b(View view) {
        int i = this.f;
        final AboutActivity aboutActivity = this.g;
        switch (i) {
            case 0:
                t9.u0(aboutActivity, y62.j);
                return;
            case 3:
                t9.u0(aboutActivity, new f(aboutActivity, 2));
                return;
            default:
                if (!ew3.X()) {
                    zzc.zza(aboutActivity).zzc().zze(aboutActivity, new n60() { // from class: i
                        @Override // defpackage.n60
                        public final void a(w01 w01Var) {
                            if (w01Var != null) {
                                AboutActivity aboutActivity2 = AboutActivity.this;
                                String str = aboutActivity2.f3190a;
                                String.format("%s: %s", Arrays.copyOf(new Object[]{Integer.valueOf(w01Var.f4922a), w01Var.f4923b}, 2));
                                t9.u0(aboutActivity2, y62.k);
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                b((View) obj);
                return ch3Var;
            case 1:
                a((d) obj);
                return ch3Var;
            case 2:
                p9 p9Var = (p9) obj;
                p9Var.f3799b = pd0.y(R.string.TestConsoleConfirm);
                p9Var.h = pd0.y(R.string.Cancel);
                p9.b(p9Var, pd0.y(R.string.Continue), new yy2(this.g, 3), 2);
                return ch3Var;
            case 3:
                b((View) obj);
                return ch3Var;
            case 4:
                a((d) obj);
                return ch3Var;
            case 5:
                b((View) obj);
                return ch3Var;
            case 6:
                a((d) obj);
                return ch3Var;
            case 7:
                a((d) obj);
                return ch3Var;
            case 8:
                a((d) obj);
                return ch3Var;
            default:
                a((d) obj);
                return ch3Var;
        }
    }
}
