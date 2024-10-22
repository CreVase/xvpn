package com.security.xvpn.z35kb.util;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes2.dex */
public class ColorFontSpan extends ForegroundColorSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f1619a;

    public ColorFontSpan(Typeface typeface, int i) {
        super(i);
        this.f1619a = typeface;
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(this.f1619a);
    }
}
