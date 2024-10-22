package defpackage;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.livechat.ImageShowActivity;
import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class ew implements x31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2005b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ew(int i, Object obj, Object obj2) {
        this.f2004a = i;
        this.f2005b = obj;
        this.c = obj2;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f2004a;
        Object obj2 = this.c;
        Object obj3 = this.f2005b;
        switch (i) {
            case 0:
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) obj3;
                p9 p9Var = (p9) obj;
                int i2 = ChangePasswordActivity.q;
                changePasswordActivity.getClass();
                p9Var.f3798a = pd0.y(R.string.PasswordChangedFailed);
                p9Var.f3799b = (String) obj2;
                p9Var.d = pd0.y(R.string.OK);
                p9Var.f = new gw(changePasswordActivity, 2);
                return ch3Var;
            default:
                final xa1 xa1Var = (xa1) obj3;
                final File file = (File) obj2;
                p9 p9Var2 = (p9) obj;
                xa1Var.getClass();
                p9Var2.f3798a = pd0.y(R.string.DownloadFailed);
                p9Var2.f3799b = pd0.y(R.string.DownloadFailedAlert);
                p9Var2.d = pd0.y(R.string.Retry);
                p9Var2.h = pd0.y(R.string.Cancel);
                p9Var2.f = new v31() { // from class: wa1
                    @Override // defpackage.v31
                    public final Object invoke() {
                        ImageShowActivity imageShowActivity = xa1.this.f5134b;
                        qm1 qm1Var = imageShowActivity.c;
                        if (qm1Var == null || !qm1Var.isShowing()) {
                            qm1 qm1Var2 = new qm1(imageShowActivity);
                            imageShowActivity.c = qm1Var2;
                            qm1Var2.setCancelable(true);
                            imageShowActivity.c.show();
                        }
                        ((SubsamplingScaleImageView) imageShowActivity.f1603a.c).setImage(ImageSource.uri(file.getAbsolutePath()));
                        return ch3.f636a;
                    }
                };
                return ch3Var;
        }
    }
}
