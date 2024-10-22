package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public final class i13 {
    public static final int m;
    public static boolean n;
    public static Constructor o;
    public static TextDirectionHeuristic p;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2518a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f2519b;
    public final int c;
    public int d;
    public boolean k;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;
    public int i = m;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        } else {
            i = 0;
        }
        m = i;
    }

    public i13(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f2518a = charSequence;
        this.f2519b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic2;
        StaticLayout build;
        if (this.f2518a == null) {
            this.f2518a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f2518a;
        int i = this.f;
        TextPaint textPaint = this.f2519b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.k && this.f == 1) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.e);
            obtain.setIncludePad(this.j);
            if (this.k) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f);
            float f = this.g;
            if (f != 0.0f || this.h != 1.0f) {
                obtain.setLineSpacing(f, this.h);
            }
            if (this.f > 1) {
                obtain.setHyphenationFrequency(this.i);
            }
            build = obtain.build();
            return build;
        }
        if (!n) {
            try {
                if (this.k && i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                p = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                n = true;
            } catch (Exception e) {
                throw new h13(e);
            }
        }
        try {
            Constructor constructor = o;
            constructor.getClass();
            TextDirectionHeuristic textDirectionHeuristic3 = p;
            textDirectionHeuristic3.getClass();
            return (StaticLayout) constructor.newInstance(charSequence, 0, Integer.valueOf(this.d), textPaint, Integer.valueOf(max), this.e, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.j), null, Integer.valueOf(max), Integer.valueOf(this.f));
        } catch (Exception e2) {
            throw new h13(e2);
        }
    }
}
