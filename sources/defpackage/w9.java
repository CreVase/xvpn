package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes2.dex */
public final class w9 extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(-13841976);
        textPaint.setTypeface(n01.c());
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(n01.c());
    }
}
