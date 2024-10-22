package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class px2 implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3934a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f3935b = new AtomicInteger(0);

    public px2(Object obj) {
        this.f3934a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f3934a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f3934a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f3935b.get() > 0 && (obj instanceof sf3)) {
            return;
        }
        ((SpanWatcher) this.f3934a).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f3935b.get() > 0 && (obj instanceof sf3)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i > i2) {
                i = 0;
            }
            if (i3 > i4) {
                i5 = i;
                i6 = 0;
                ((SpanWatcher) this.f3934a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }
        i5 = i;
        i6 = i3;
        ((SpanWatcher) this.f3934a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f3935b.get() > 0 && (obj instanceof sf3)) {
            return;
        }
        ((SpanWatcher) this.f3934a).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f3934a).onTextChanged(charSequence, i, i2, i3);
    }
}
