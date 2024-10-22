package defpackage;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

/* loaded from: classes2.dex */
public final class qd3 extends StateListDrawable {
    public qd3(boolean z) {
        addState(new int[]{R.attr.state_selected, -16842908}, new pd3(506251720, 1174805532, z));
        addState(ew3.p, new pd3(-13841976, -16177112, z));
        addState(StateSet.WILD_CARD, new ColorDrawable(0));
    }

    public qd3() {
        addState(new int[]{R.attr.state_selected, -16842908}, new af3(506251720, 1174805532));
        addState(ew3.p, new af3(-13841976, -16177112));
        addState(StateSet.WILD_CARD, new ColorDrawable(0));
    }
}
