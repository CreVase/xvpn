package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes2.dex */
public final class z40 extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5422a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5422a) {
            case 0:
                textPaint.setTypeface(n01.a());
                textPaint.setColor(v73.j(1000013));
                return;
            case 1:
                textPaint.setTypeface(n01.a());
                textPaint.setColor(v73.j(1000013));
                return;
            default:
                textPaint.setTypeface(Typeface.SANS_SERIF);
                return;
        }
    }
}
