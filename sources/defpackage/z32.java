package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes2.dex */
public final class z32 extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5421b;

    public /* synthetic */ z32(Object obj, int i) {
        this.f5420a = i;
        this.f5421b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5420a) {
            case 0:
                textPaint.setTypeface(n01.a());
                return;
            case 1:
                textPaint.setColor(-917504);
                textPaint.setTypeface(n01.a());
                return;
            default:
                textPaint.setColor(-11153696);
                textPaint.setTypeface(n01.c());
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f5420a) {
            case 0:
                textPaint.setTypeface(n01.a());
                return;
            case 1:
                textPaint.setTypeface(n01.a());
                return;
            default:
                textPaint.setTypeface(n01.c());
                return;
        }
    }
}
