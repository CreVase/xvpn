package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class sh3 implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4345a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f4346b;

    public sh3(Spannable spannable) {
        this.f4346b = spannable;
    }

    public final void a() {
        mp0 rh3Var;
        Spannable spannable = this.f4346b;
        if (!this.f4345a) {
            if (Build.VERSION.SDK_INT < 28) {
                rh3Var = new mp0(7);
            } else {
                rh3Var = new rh3();
            }
            if (rh3Var.p(spannable)) {
                this.f4346b = new SpannableString(spannable);
            }
        }
        this.f4345a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4346b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f4346b.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f4346b.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4346b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4346b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4346b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f4346b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4346b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4346b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f4346b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f4346b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f4346b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4346b.toString();
    }

    public sh3(CharSequence charSequence) {
        this.f4346b = new SpannableString(charSequence);
    }
}
