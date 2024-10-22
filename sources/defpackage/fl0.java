package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.f;
import androidx.fragment.app.p;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fl0 implements a22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2109a;

    public fl0(f fVar) {
        this.f2109a = fVar;
    }

    @Override // defpackage.a22
    public final void F(Object obj) {
        boolean z;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((bk1) obj) != null) {
            f fVar = this.f2109a;
            z = fVar.mShowsDialog;
            if (z) {
                View requireView = fVar.requireView();
                if (requireView.getParent() == null) {
                    dialog = fVar.mDialog;
                    if (dialog != null) {
                        if (p.I(3)) {
                            dialog3 = fVar.mDialog;
                            Objects.toString(dialog3);
                        }
                        dialog2 = fVar.mDialog;
                        dialog2.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
