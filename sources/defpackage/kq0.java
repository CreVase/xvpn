package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class kq0 extends yp0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2998a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2999b;

    public kq0(TextView textView, lq0 lq0Var) {
        this.f2998a = new WeakReference(textView);
        this.f2999b = new WeakReference(lq0Var);
    }

    @Override // defpackage.yp0
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f2998a.get();
        if (textView != null && (handler = textView.getHandler()) != null) {
            handler.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        CharSequence g;
        InputFilter[] filters;
        TextView textView = (TextView) this.f2998a.get();
        InputFilter inputFilter = (InputFilter) this.f2999b.get();
        boolean z = false;
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i = 0;
            while (true) {
                if (i >= filters.length) {
                    break;
                }
                if (filters[i] == inputFilter) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (!z || !textView.isAttachedToWindow() || text == (g = aq0.a().g((text = textView.getText())))) {
            return;
        }
        int selectionStart = Selection.getSelectionStart(g);
        int selectionEnd = Selection.getSelectionEnd(g);
        textView.setText(g);
        if (g instanceof Spannable) {
            Spannable spannable = (Spannable) g;
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(spannable, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(spannable, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(spannable, selectionEnd);
            }
        }
    }
}
