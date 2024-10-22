package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class wm3 implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Context context;
        Activity activity;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        View view2 = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null) {
            view2 = activity.findViewById(R.id.tabBar);
        }
        if (view2 == null || !view2.requestFocus()) {
            return false;
        }
        return true;
    }
}
