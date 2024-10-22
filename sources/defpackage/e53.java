package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class e53 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j53 f1891b;

    public /* synthetic */ e53(j53 j53Var, int i) {
        this.f1890a = i;
        this.f1891b = j53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1890a;
        int i2 = 8;
        j53 j53Var = this.f1891b;
        switch (i) {
            case 0:
                j53Var.a(false);
                return;
            case 1:
                dn dnVar = j53Var.f2705a;
                View inflate = LayoutInflater.from(dnVar).inflate(R.layout.popupwindow_private_browser_layout, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
                j53Var.s = popupWindow;
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                j53Var.s.setOutsideTouchable(true);
                j53Var.s.setFocusable(true);
                if (zf3.R()) {
                    inflate.findViewById(R.id.iv_hint).getBackground().setAutoMirrored(true);
                }
                inflate.findViewById(R.id.iv_hint).setOnClickListener(new f53(j53Var, i2));
                j53Var.s.showAsDropDown(j53Var.f2706b, -bx3.t(dnVar, 10), -((int) (bx3.z(dnVar) * 10)));
                return;
            default:
                View view = j53Var.e;
                if (!j53Var.r) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                return;
        }
    }
}
