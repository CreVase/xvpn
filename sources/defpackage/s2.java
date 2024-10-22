package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s2 {
    public static /* synthetic */ PrecomputedText.Params.Builder k(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean z(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
