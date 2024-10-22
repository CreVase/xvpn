package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ze3 extends RecyclerView {
    public ze3(Context context) {
        super(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        ViewParent viewParent;
        View focusSearch = super.focusSearch(view, i);
        if (i == 130) {
            if (focusSearch != null) {
                viewParent = focusSearch.getParent();
            } else {
                viewParent = null;
            }
            if (!m20.L(viewParent, this)) {
                return null;
            }
        }
        return focusSearch;
    }
}
