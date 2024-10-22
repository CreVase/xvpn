package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class r62 {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f4108a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f4109b;
    public final int c;
    public final int d;

    public r62(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = s2.k(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f4108a = textPaint;
        this.f4109b = textDirectionHeuristic;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:            if (r7.d != r8.d) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:            if (r1 == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:            if (r3.getTypeface() != null) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:            if (r5.getTypeface() == null) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:            r1 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:            if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:            if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.r62
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r62 r8 = (defpackage.r62) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L20
            int r3 = r8.c
            int r4 = r7.c
            if (r4 == r3) goto L19
            goto L30
        L19:
            int r3 = r7.d
            int r4 = r8.d
            if (r3 == r4) goto L20
            goto L30
        L20:
            android.text.TextPaint r3 = r7.f4108a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f4108a
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L33
        L30:
            r1 = 0
            goto Lb6
        L33:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f4108a
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            goto L30
        L42:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4f
            goto L30
        L4f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L5c
            goto L30
        L5c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L6b
            goto L30
        L6b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L76
            goto L30
        L76:
            r4 = 24
            if (r1 < r4) goto L89
            android.os.LocaleList r1 = defpackage.q62.g(r3)
            android.os.LocaleList r4 = defpackage.q62.g(r5)
            boolean r1 = defpackage.q2.z(r4, r1)
            if (r1 != 0) goto L98
            goto L30
        L89:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L98
            goto L30
        L98:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La5
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb5
            goto L30
        La5:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb5
            goto L30
        Lb5:
            r1 = 1
        Lb6:
            if (r1 != 0) goto Lb9
            return r2
        Lb9:
            android.text.TextDirectionHeuristic r1 = r7.f4109b
            android.text.TextDirectionHeuristic r8 = r8.f4109b
            if (r1 == r8) goto Lc0
            return r2
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r62.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.d;
        int i3 = this.c;
        TextDirectionHeuristic textDirectionHeuristic = this.f4109b;
        TextPaint textPaint = this.f4108a;
        if (i >= 24) {
            textLocales = textPaint.getTextLocales();
            return w12.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
        }
        return w12.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4108a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f4109b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public r62(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f4108a = textPaint;
        textDirection = params.getTextDirection();
        this.f4109b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.d = hyphenationFrequency;
    }
}
