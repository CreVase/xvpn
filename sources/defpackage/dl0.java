package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.f;

/* loaded from: classes.dex */
public final class dl0 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1802a;

    public dl0(f fVar) {
        this.f1802a = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        f fVar = this.f1802a;
        dialog = fVar.mDialog;
        if (dialog != null) {
            dialog2 = fVar.mDialog;
            fVar.onCancel(dialog2);
        }
    }
}
