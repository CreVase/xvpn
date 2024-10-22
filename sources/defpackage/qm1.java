package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class qm1 extends qn {
    public TextView j;
    public pm1 k;

    public qm1(Context context) {
        super(context, R.style.CustomDialog);
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_loading, (ViewGroup) null);
        this.j = (TextView) inflate.findViewById(R.id.tv_status_text);
        View findViewById = inflate.findViewById(R.id.llContainer);
        findViewById.setBackground(new zg2(1000008, 8 * tf3.F, 0.0f, false));
        fl.j(findViewById, this);
        fl.n(this, this.j, 1000015);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(inflate);
    }

    @Override // defpackage.qn
    public final String f() {
        return "Loading";
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        pm1 pm1Var;
        if (i == 4 && (pm1Var = this.k) != null) {
            pm1Var.a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.qn, defpackage.t30, android.app.Dialog
    public final void onStart() {
        super.onStart();
    }

    @Override // defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onStop() {
        super.onStop();
    }
}
