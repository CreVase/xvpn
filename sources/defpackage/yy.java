package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class yy extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy(String str, int i) {
        super(1);
        this.f = i;
        this.g = str;
    }

    public final void a(p9 p9Var) {
        int i;
        int i2 = this.f;
        int i3 = 0;
        String str = this.g;
        switch (i2) {
            case 0:
                p9Var.f3798a = pd0.y(R.string.Notice);
                p9Var.f3799b = pd0.y(R.string.DeleteChooseMessageConfirm);
                String y = pd0.y(R.string.Delete);
                Context z = zf3.z();
                if (z != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Resources resources = z.getResources();
                        if (resources != null) {
                            i = resources.getColor(R.color.DeleteConfirmText, z.getTheme());
                        }
                    } else {
                        Resources resources2 = z.getResources();
                        if (resources2 != null) {
                            i = resources2.getColor(R.color.DeleteConfirmText);
                        }
                    }
                    p9.b(p9Var, bx3.f(y, i, 0, 5), new xy(str, i3), 2);
                    p9Var.h = pd0.y(R.string.Cancel);
                    return;
                }
                i = -16777216;
                p9.b(p9Var, bx3.f(y, i, 0, 5), new xy(str, i3), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 1:
                p9Var.f3798a = pd0.y(R.string.Error);
                p9Var.f3799b = str;
                p9Var.d = pd0.y(R.string.Okay);
                return;
            default:
                p9Var.f3798a = pd0.y(R.string.Notice);
                SpannableString valueOf = SpannableString.valueOf(pd0.z(R.string.FeaturesUnsupported, str));
                bx3.i(valueOf, valueOf.toString(), new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER));
                bx3.i(valueOf, str, new ForegroundColorSpan(-10041401));
                p9Var.f3799b = valueOf;
                p9Var.c = new LinkMovementMethod();
                p9.b(p9Var, pd0.y(R.string.Okay), null, 6);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        String str = this.g;
        switch (i) {
            case 0:
                a((p9) obj);
                return ch3Var;
            case 1:
                a((p9) obj);
                return ch3Var;
            case 2:
                a((p9) obj);
                return ch3Var;
            case 3:
                uq uqVar = (uq) obj;
                uqVar.q = str;
                AppCompatTextView appCompatTextView = uqVar.i;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(str);
                }
                uqVar.o = d42.x;
                return ch3Var;
            default:
                return p71.l(str, (String) obj);
        }
    }
}
