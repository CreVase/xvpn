package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes2.dex */
public final /* synthetic */ class wl3 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i23.R0(charSequence, " ", false)) {
            return i23.k1(charSequence.toString(), " ", "", false);
        }
        return null;
    }
}
