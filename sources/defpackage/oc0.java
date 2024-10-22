package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final class oc0 extends qr0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc0(pr0 pr0Var, int i) {
        super(pr0Var);
        this.e = i;
    }

    @Override // defpackage.qr0
    public final void r() {
        switch (this.e) {
            case 0:
                pr0 pr0Var = this.f4045b;
                pr0Var.o = null;
                CheckableImageButton checkableImageButton = pr0Var.g;
                checkableImageButton.setOnLongClickListener(null);
                m20.V0(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
