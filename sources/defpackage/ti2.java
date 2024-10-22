package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ti2 extends pc0 {
    public final /* synthetic */ ui2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti2(ui2 ui2Var, Context context) {
        super(context);
        this.j = ui2Var;
    }

    @Override // defpackage.t30, android.app.Dialog
    public final void onBackPressed() {
        v31 v31Var = this.j.e;
        boolean z = false;
        if (v31Var != null && ((Boolean) v31Var.invoke()).booleanValue()) {
            z = true;
        }
        if (!z) {
            super.onBackPressed();
        }
    }
}
