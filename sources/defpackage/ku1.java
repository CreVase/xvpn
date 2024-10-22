package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class ku1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, iv1 {

    /* renamed from: a, reason: collision with root package name */
    public final ju1 f3014a;

    /* renamed from: b, reason: collision with root package name */
    public s9 f3015b;
    public zk1 c;

    public ku1(ju1 ju1Var) {
        this.f3014a = ju1Var;
    }

    @Override // defpackage.iv1
    public final void a(ju1 ju1Var, boolean z) {
        s9 s9Var;
        if ((z || ju1Var == this.f3014a) && (s9Var = this.f3015b) != null) {
            s9Var.dismiss();
        }
    }

    @Override // defpackage.iv1
    public final boolean n(ju1 ju1Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zk1 zk1Var = this.c;
        if (zk1Var.g == null) {
            zk1Var.g = new yk1(zk1Var);
        }
        this.f3014a.q(zk1Var.g.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.f3014a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ju1 ju1Var = this.f3014a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3015b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3015b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                ju1Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return ju1Var.performShortcut(i, keyEvent, 0);
    }
}
