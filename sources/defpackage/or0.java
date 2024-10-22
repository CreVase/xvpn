package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class or0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr0 f3717a;

    public or0(pr0 pr0Var) {
        this.f3717a = pr0Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        pr0 pr0Var = this.f3717a;
        if (pr0Var.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pr0Var.s;
        nr0 nr0Var = pr0Var.v;
        if (editText != null) {
            editText.removeTextChangedListener(nr0Var);
            if (pr0Var.s.getOnFocusChangeListener() == pr0Var.b().e()) {
                pr0Var.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pr0Var.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nr0Var);
        }
        pr0Var.b().m(pr0Var.s);
        pr0Var.j(pr0Var.b());
    }
}
