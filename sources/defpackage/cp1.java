package defpackage;

import a.du;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import com.security.xvpn.z35kb.protocol.ProtocolActivity;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.security.xvpn.z35kb.widget.DotImageView;

/* loaded from: classes2.dex */
public final class cp1 extends je0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1646b;
    public final /* synthetic */ dp1 c;

    public /* synthetic */ cp1(dp1 dp1Var, int i) {
        this.f1646b = i;
        this.c = dp1Var;
    }

    @Override // defpackage.je0
    public final void a(View view) {
        int i = this.f1646b;
        int i2 = 1;
        dp1 dp1Var = this.c;
        switch (i) {
            case 0:
                MainActivity mainActivity = dp1Var.e;
                mainActivity.getClass();
                du.d(185, null);
                mainActivity.startActivityForResult(new Intent(mainActivity, (Class<?>) ServerChooseActivity.class), 1);
                return;
            case 1:
                MainActivity mainActivity2 = dp1Var.e;
                mainActivity2.getClass();
                mainActivity2.startActivityForResult(new Intent(mainActivity2, (Class<?>) ProtocolActivity.class), 2);
                return;
            case 2:
                ew3.d0(new le(dp1Var.requireActivity(), new Bundle()));
                du.d(62, null);
                DotImageView dotImageView = dp1Var.k;
                dotImageView.g = false;
                dotImageView.invalidate();
                return;
            default:
                if (!ew3.X()) {
                    t9.w0(dp1Var.getChildFragmentManager(), new bp1(this, i2));
                    return;
                }
                l requireActivity = dp1Var.requireActivity();
                br brVar = br.f513a;
                Intent intent = new Intent(requireActivity, (Class<?>) PrivateBrowserActivity.class);
                intent.putExtra("newTab", false);
                requireActivity.startActivity(intent);
                dp1Var.getActivity().overridePendingTransition(R.anim.browser_slide_right_in, R.anim.browser_slide_left_out);
                return;
        }
    }
}
