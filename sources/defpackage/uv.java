package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.c;

/* loaded from: classes2.dex */
public final class uv extends nk1 {
    public final int p;
    public final int q;

    public uv(Context context, int i) {
        super(context);
        this.p = i;
        this.q = 50;
    }

    @Override // defpackage.nk1
    public final int b(View view, int i) {
        c cVar = this.c;
        if (cVar != null && cVar.d() && view.getParent() != null) {
            int width = ((((View) view.getParent()).getWidth() - view.getWidth()) / 2) + this.p;
            return nk1.a(view.getLeft(), view.getRight(), width, view.getWidth() + width, i);
        }
        return 0;
    }

    @Override // defpackage.nk1
    public final int c(View view, int i) {
        c cVar = this.c;
        if (cVar != null && cVar.e() && view.getParent() != null) {
            int height = ((((View) view.getParent()).getHeight() - view.getHeight()) / 2) + this.p;
            return nk1.a(view.getTop(), view.getBottom(), height, view.getHeight() + height, i);
        }
        return 0;
    }

    @Override // defpackage.nk1
    public final int e(int i) {
        int e = super.e(i);
        int i2 = this.q;
        if (e < i2) {
            return i2;
        }
        return e;
    }
}
