package defpackage;

import android.view.ViewGroup;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class o81 extends t81 {
    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
            if (viewGroup2 != null) {
                m20.u0(viewGroup2);
            }
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
            if (viewGroup2 != null) {
                m20.Y0(viewGroup2);
            }
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            ew3.b0(new d9(11));
            x8.a(viewGroup2);
            x8.e();
        }
    }
}
