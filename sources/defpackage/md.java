package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.f;

/* loaded from: classes.dex */
public class md extends f {
    @Override // androidx.fragment.app.f
    public Dialog onCreateDialog(Bundle bundle) {
        return new ld(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.f
    public final void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof ld) {
            ld ldVar = (ld) dialog;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            ldVar.e(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
