package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes2.dex */
public final class q81 extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3967a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3967a) {
            case 0:
                if (textPaint != null) {
                    textPaint.setColor(-10152);
                }
                if (textPaint != null) {
                    textPaint.setUnderlineText(true);
                }
                if (textPaint != null) {
                    textPaint.setFakeBoldText(true);
                    return;
                }
                return;
            default:
                if (textPaint != null) {
                    textPaint.setColor(-10066330);
                }
                if (textPaint != null) {
                    textPaint.setTypeface(n01.d());
                    return;
                }
                return;
        }
    }
}
