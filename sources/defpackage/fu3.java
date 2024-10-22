package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.security.xvpn.z35kb.widget.RatioLayout;

/* loaded from: classes2.dex */
public abstract class fu3 extends RatioLayout {
    public boolean d;

    public fu3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
    }

    public final boolean getAttachToParent() {
        return this.d;
    }

    public final void setAttachToParent(boolean z) {
        this.d = z;
    }
}
