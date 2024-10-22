package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;

/* loaded from: classes2.dex */
public final class a60 extends ji1 implements l41 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a60(int i, Object obj, Object obj2) {
        super(2);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public final void a(View view, int i) {
        boolean z;
        int i2 = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        boolean z2 = false;
        switch (i2) {
            case 1:
                ei2 ei2Var = (ei2) obj2;
                View view2 = (View) ei2Var.f1938a;
                if (view2 != null) {
                    view2.setSelected(false);
                }
                view.setSelected(true);
                ei2Var.f1938a = view;
                int i3 = in1.t;
                ((in1) obj).G(i, false);
                return;
            default:
                ei2 ei2Var2 = (ei2) obj2;
                View view3 = (View) ei2Var2.f1938a;
                if (view3 != null) {
                    view3.setSelected(false);
                }
                view.setSelected(true);
                ei2Var2.f1938a = view;
                xa2 xa2Var = (xa2) obj;
                RecyclerView recyclerView = xa2Var.h;
                if (recyclerView != null) {
                    if (i == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m20.g1(recyclerView, z);
                }
                gu3 gu3Var = xa2Var.i;
                if (gu3Var != null) {
                    if (i == 2) {
                        z2 = true;
                    }
                    m20.g1(gu3Var, z2);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                boolean isChecked = ((CompoundButton) obj2).isChecked();
                Object obj3 = this.h;
                if (isChecked) {
                    ConnectionLogActivity connectionLogActivity = (ConnectionLogActivity) this.g;
                    t9.w0(connectionLogActivity.getSupportFragmentManager(), new q90(6, (SwitchCompat) obj3, connectionLogActivity));
                } else {
                    ew3.k0(true);
                    ((SwitchCompat) obj3).setChecked(true);
                }
                return ch3Var;
            case 1:
                a((View) obj2, ((Number) obj).intValue());
                return ch3Var;
            default:
                a((View) obj2, ((Number) obj).intValue());
                return ch3Var;
        }
    }
}
