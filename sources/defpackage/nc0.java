package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class nc0 extends ld {
    public nc0(Context context) {
        super(context, R.style.Theme_CustomDialog);
        e(1);
    }

    @Override // defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }
}
