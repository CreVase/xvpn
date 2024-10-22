package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.f;

/* loaded from: classes.dex */
public final class el0 implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1955a;

    public el0(f fVar) {
        this.f1955a = fVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        f fVar = this.f1955a;
        dialog = fVar.mDialog;
        if (dialog != null) {
            dialog2 = fVar.mDialog;
            fVar.onDismiss(dialog2);
        }
    }
}
