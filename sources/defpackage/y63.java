package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class y63 {
    public float c;
    public WeakReference e;
    public s63 f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f5281a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final sz f5282b = new sz(this, 1);
    public boolean d = true;

    public y63(x63 x63Var) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(x63Var);
    }

    public final float a(String str) {
        float measureText;
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.f5281a;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
