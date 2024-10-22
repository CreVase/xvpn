package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class xe3 extends StateListDrawable {
    public xe3() {
        Drawable A = zf3.A(R.drawable.tv_ic_checked);
        A.setBounds(new Rect(0, 0, tf3.K(17), tf3.K(11)));
        addState(new int[]{android.R.attr.state_selected, -16842908}, new we3(A, false, true));
        addState(new int[]{-16842913, android.R.attr.state_focused}, new we3(A, true, false));
        addState(new int[]{android.R.attr.state_selected, android.R.attr.state_focused}, new we3(A, true, true));
        addState(StateSet.WILD_CARD, new we3(A, false, false));
    }
}
