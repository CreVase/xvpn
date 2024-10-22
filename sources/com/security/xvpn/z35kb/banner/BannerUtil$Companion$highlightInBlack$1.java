package com.security.xvpn.z35kb.banner;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import defpackage.n01;

/* loaded from: classes2.dex */
public final class BannerUtil$Companion$highlightInBlack$1 extends ForegroundColorSpan {
    public BannerUtil$Companion$highlightInBlack$1() {
        super(-14848);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(n01.a());
    }
}
