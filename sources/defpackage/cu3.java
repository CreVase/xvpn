package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class cu3 extends ConstraintLayout {
    public boolean q;

    public cu3(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.q = true;
    }

    public final boolean getAttachToParent() {
        return this.q;
    }

    public final void setAttachToParent(boolean z) {
        this.q = z;
    }
}
