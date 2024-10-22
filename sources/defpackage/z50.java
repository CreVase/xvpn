package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class z50 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ConnectionLogActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z50(ConnectionLogActivity connectionLogActivity, int i) {
        super(1);
        this.f = i;
        this.g = connectionLogActivity;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        ConnectionLogActivity connectionLogActivity = this.g;
        switch (i) {
            case 0:
                p9 p9Var = (p9) obj;
                p9Var.f3798a = pd0.y(R.string.ClearConnectionLogConfirm);
                p9Var.h = pd0.y(R.string.Cancel);
                p9.b(p9Var, pd0.y(R.string.Delete), new yy2(connectionLogActivity, 11), 2);
                return ch3Var;
            case 1:
                Toolbar toolbar = (Toolbar) obj;
                toolbar.setTitle(pd0.y(R.string.StaticIP));
                int i2 = 1;
                toolbar.setShowBackBtn(true);
                connectionLogActivity.bindInvalidate(toolbar);
                FrameLayout.LayoutParams layoutParams = null;
                AppCompatImageView appCompatImageView = new AppCompatImageView(toolbar.getContext(), null);
                appCompatImageView.setId(-1);
                appCompatImageView.setId(R.id.vDeleteAll);
                int K = tf3.K(44);
                ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                }
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(K, -1);
                }
                layoutParams.width = K;
                layoutParams.height = -1;
                layoutParams.gravity = Math.max(21, layoutParams.gravity);
                layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
                layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
                layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
                layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
                layoutParams.setMarginEnd(tf3.K(4));
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setOnClickListener(new y50(connectionLogActivity, i2));
                appCompatImageView.setImageResource(R.drawable.ic_clear_static_ip);
                toolbar.addView(appCompatImageView);
                return ch3Var;
            default:
                String str = (String) obj;
                if (!ew3.X()) {
                    int i3 = ConnectionLogActivity.s;
                    connectionLogActivity.getClass();
                    m20.C0(connectionLogActivity, 29);
                } else {
                    t9.u0(connectionLogActivity, new q90(7, str, connectionLogActivity));
                }
                return ch3Var;
        }
    }
}
