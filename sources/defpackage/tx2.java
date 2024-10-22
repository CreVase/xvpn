package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.p;

/* loaded from: classes.dex */
public enum tx2 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public final void a(View view) {
        ViewGroup viewGroup;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (p.I(2)) {
                            view.toString();
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (p.I(2)) {
                    view.toString();
                }
                view.setVisibility(8);
                return;
            }
            if (p.I(2)) {
                view.toString();
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (p.I(2)) {
                view.toString();
                viewGroup.toString();
            }
            viewGroup.removeView(view);
        }
    }
}
