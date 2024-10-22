package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import com.google.android.material.datepicker.f;
import com.security.xvpn.z35kb.DebugPageActivity;

/* loaded from: classes.dex */
public final class f9 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2061b;

    public /* synthetic */ f9(Object obj, int i) {
        this.f2060a = i;
        this.f2061b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        su1 su1Var;
        int i = this.f2060a;
        Object obj = this.f2061b;
        switch (i) {
            case 0:
                m9 m9Var = (m9) obj;
                Button button = m9Var.f;
                Button button2 = m9Var.g;
                Button button3 = m9Var.h;
                m9Var.w.obtainMessage(1, m9Var.f3255b).sendToTarget();
                return;
            case 1:
                h hVar = ((Toolbar) obj).M;
                if (hVar == null) {
                    su1Var = null;
                } else {
                    su1Var = hVar.f180b;
                }
                if (su1Var != null) {
                    su1Var.collapseActionView();
                    return;
                }
                return;
            case 2:
                f fVar = (f) obj;
                int i2 = fVar.e;
                if (i2 == 2) {
                    fVar.s(1);
                    return;
                } else {
                    if (i2 == 1) {
                        fVar.s(2);
                        return;
                    }
                    return;
                }
            default:
                ((DebugPageActivity) obj).finish();
                return;
        }
    }
}
