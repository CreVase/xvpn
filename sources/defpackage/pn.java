package defpackage;

import a.du;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.R;
import com.vungle.ads.VungleError;

/* loaded from: classes2.dex */
public abstract class pn extends qn {
    public final Activity j;
    public final View k;
    public final View l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(Activity activity, int i) {
        super(activity, R.style.DialogBase_Fullscreen);
        View decorView = activity.getWindow().getDecorView();
        this.j = activity;
        this.k = decorView;
        setOwnerActivity(activity);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        this.l = getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    @Override // defpackage.ld, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
            l();
        }
    }

    @Override // defpackage.ld, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.qn
    public final String f() {
        return l();
    }

    @Override // defpackage.qn
    public boolean g() {
        return !(this instanceof ld2);
    }

    public abstract String l();

    @Override // defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.l;
        if (view != null) {
            setContentView(view);
        }
        getWindow().getDecorView().setBackground(new ColorDrawable(0));
        if (!(this instanceof ld2)) {
            getWindow().setLayout(-1, -1);
            view.setFitsSystemWindows(true);
            getWindow().setStatusBarColor(0);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().getDecorView().setSystemUiVisibility(VungleError.DEFAULT);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            du.d(486, null);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.qn, defpackage.t30, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ew3.b0(new on(this, 0));
    }

    @Override // defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onStop() {
        super.onStop();
        ew3.b0(new on(this, 1));
    }

    @Override // android.app.Dialog
    public void show() {
        Activity activity = this.j;
        if ((activity instanceof Activity) && activity.isFinishing()) {
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
            l();
        }
    }
}
