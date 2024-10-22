package defpackage;

import a.bx;
import a.du;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class hr extends bx1 implements me0 {
    public AppCompatTextView i;

    public hr() {
        this.d = 2;
    }

    @Override // defpackage.me0
    public final void B(String str) {
        AppCompatTextView appCompatTextView = this.i;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.append(str + "\n");
    }

    @Override // defpackage.rn, androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        ne0.b(this);
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ne0.b(this);
    }

    @Override // defpackage.bx1, defpackage.rn
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ne0.a(this);
        bx bxVar = new bx();
        du.d(183, bxVar);
        bxVar.u();
        bxVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    @Override // defpackage.bx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View z(defpackage.yh1 r9) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr.z(yh1):android.view.View");
    }
}
