package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class lq0 implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3171a;

    /* renamed from: b, reason: collision with root package name */
    public kq0 f3172b;

    public lq0(TextView textView) {
        this.f3171a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f3171a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = aq0.a().b();
        if (b2 != 0) {
            boolean z = true;
            if (b2 != 1) {
                if (b2 != 3) {
                    return charSequence;
                }
            } else {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (i != 0 || i2 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    return aq0.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        aq0 a2 = aq0.a();
        if (this.f3172b == null) {
            this.f3172b = new kq0(textView, this);
        }
        a2.h(this.f3172b);
        return charSequence;
    }
}
