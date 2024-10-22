package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class v42 extends qr0 {
    public final int e;
    public EditText f;
    public final cr1 g;

    public v42(pr0 pr0Var, int i) {
        super(pr0Var);
        this.e = ue2.design_password_eye;
        this.g = new cr1(this, 3);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.qr0
    public final void b() {
        q();
    }

    @Override // defpackage.qr0
    public final int c() {
        return mf2.password_toggle_content_description;
    }

    @Override // defpackage.qr0
    public final int d() {
        return this.e;
    }

    @Override // defpackage.qr0
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.qr0
    public final boolean k() {
        return true;
    }

    @Override // defpackage.qr0
    public final boolean l() {
        boolean z;
        EditText editText = this.f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // defpackage.qr0
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.qr0
    public final void r() {
        boolean z;
        EditText editText = this.f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.qr0
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
