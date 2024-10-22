package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public class ex2 extends mp0 {
    public final View j;

    public ex2(View view) {
        super(3);
        this.j = view;
    }

    @Override // defpackage.mp0
    public void n() {
        View view = this.j;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.mp0
    public void q() {
        View view;
        View view2 = this.j;
        if (view2 == null) {
            return;
        }
        if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
            view = view2.getRootView().findFocus();
        } else {
            view2.requestFocus();
            view = view2;
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view != null && view.hasWindowFocus()) {
            view.post(new dx2(view, 0));
        }
    }
}
