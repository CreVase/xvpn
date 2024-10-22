package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class sf3 extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final rf3 f4335b;
    public TextPaint e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f4334a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public sf3(rf3 rf3Var) {
        if (rf3Var != null) {
            this.f4335b = rf3Var;
            return;
        }
        throw new NullPointerException("rasterizer cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.f4334a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        rf3 rf3Var = this.f4335b;
        mw1 c = rf3Var.c();
        int a2 = c.a(14);
        short s2 = 0;
        if (a2 != 0) {
            s = ((ByteBuffer) c.d).getShort(a2 + c.f5118a);
        } else {
            s = 0;
        }
        this.d = abs / s;
        mw1 c2 = rf3Var.c();
        int a3 = c2.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c2.d).getShort(a3 + c2.f5118a);
        }
        mw1 c3 = rf3Var.c();
        int a4 = c3.a(12);
        if (a4 != 0) {
            s2 = ((ByteBuffer) c3.d).getShort(a4 + c3.f5118a);
        }
        short s3 = (short) (s2 * this.d);
        this.c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        aq0.a().getClass();
        float f2 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        rf3 rf3Var = this.f4335b;
        wq2 wq2Var = rf3Var.f4147b;
        Typeface typeface = (Typeface) wq2Var.d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wq2Var.f5057b, rf3Var.f4146a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }
}
