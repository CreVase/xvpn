package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ld extends t30 implements lc {
    public jd d;
    public final kd e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v2, types: [kd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ld(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = defpackage.ie2.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r6
        L15:
            r4.<init>(r5, r1)
            kd r1 = new kd
            r1.<init>()
            r4.e = r1
            sc r1 = r4.c()
            if (r6 != 0) goto L35
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = defpackage.ie2.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L35:
            r5 = r1
            jd r5 = (defpackage.jd) r5
            r5.Y = r6
            r5 = 0
            r1.i(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.t30, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().a(view, layoutParams);
    }

    public final sc c() {
        if (this.d == null) {
            mf mfVar = sc.f4311a;
            this.d = new jd(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        c().j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m20.d0(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(int i) {
        return c().l(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        jd jdVar = (jd) c();
        jdVar.E();
        return jdVar.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().g();
    }

    @Override // defpackage.t30, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().f();
        super.onCreate(bundle);
        c().i(bundle);
    }

    @Override // defpackage.t30, android.app.Dialog
    public void onStop() {
        super.onStop();
        jd jdVar = (jd) c();
        jdVar.K();
        k4 k4Var = jdVar.o;
        if (k4Var != null) {
            k4Var.p(false);
        }
    }

    @Override // defpackage.lc
    public final void onSupportActionModeFinished(h5 h5Var) {
    }

    @Override // defpackage.lc
    public final void onSupportActionModeStarted(h5 h5Var) {
    }

    @Override // defpackage.lc
    public final h5 onWindowStartingSupportActionMode(g5 g5Var) {
        return null;
    }

    @Override // defpackage.t30, android.app.Dialog
    public final void setContentView(int i) {
        c().n(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().r(charSequence);
    }

    @Override // defpackage.t30, android.app.Dialog
    public void setContentView(View view) {
        c().o(view);
    }

    @Override // defpackage.t30, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().p(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().r(getContext().getString(i));
    }
}
