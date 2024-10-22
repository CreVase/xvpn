package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class pd {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3825a;

    /* renamed from: b, reason: collision with root package name */
    public final ja1 f3826b;

    public pd(TextView textView) {
        this.f3825a = textView;
        this.f3826b = new ja1(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((c02) this.f3826b.f2735b).h(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3825a.getContext().obtainStyledAttributes(attributeSet, cg2.AppCompatTextView, i, 0);
        try {
            int i2 = cg2.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((c02) this.f3826b.f2735b).m(z);
    }

    public final void d(boolean z) {
        ((c02) this.f3826b.f2735b).n(z);
    }
}
