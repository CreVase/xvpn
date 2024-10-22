package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public class pc0 extends qn {
    public /* synthetic */ pc0(Context context) {
        this(context, R.style.DialogBase_Fullscreen);
    }

    @Override // defpackage.qn
    public final String f() {
        return "";
    }

    @Override // defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public pc0(Context context, int i) {
        super(context, i);
        e(1);
    }
}
