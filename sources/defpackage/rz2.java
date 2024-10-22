package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class rz2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ tz2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz2(tz2 tz2Var, c90 c90Var) {
        super(2, c90Var);
        this.f = tz2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new rz2(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((rz2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        int i;
        ba0 ba0Var = ba0.f430a;
        int i2 = this.e;
        tz2 tz2Var = this.f;
        AppCompatTextView appCompatTextView = null;
        if (i2 != 0) {
            if (i2 == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            mz2.c = ew3.C();
            boolean v = ew3.v();
            mz2.d = v;
            AppCompatTextView appCompatTextView2 = tz2Var.h;
            if (appCompatTextView2 == null) {
                appCompatTextView2 = null;
            }
            appCompatTextView2.setSelected(v);
            AppCompatTextView appCompatTextView3 = tz2Var.j;
            if (appCompatTextView3 == null) {
                appCompatTextView3 = null;
            }
            appCompatTextView3.setSelected(mz2.c);
            boolean u = ew3.u();
            mz2.f3380b = u;
            AppCompatTextView appCompatTextView4 = tz2Var.e;
            if (appCompatTextView4 == null) {
                appCompatTextView4 = null;
            }
            appCompatTextView4.setSelected(u);
            AppCompatTextView appCompatTextView5 = tz2Var.f;
            if (appCompatTextView5 == null) {
                appCompatTextView5 = null;
            }
            appCompatTextView5.setSelected(!mz2.f3380b);
            qe3 qe3Var = tz2Var.g;
            if (qe3Var == null) {
                qe3Var = null;
            }
            int childCount = qe3Var.getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = qe3Var.getChildAt(i3);
                if (i3 > 4) {
                    if (!z && !mz2.f3380b) {
                        z = childAt.isFocused();
                    }
                    m20.g1(childAt, mz2.f3380b);
                }
            }
            if (z) {
                AppCompatTextView appCompatTextView6 = tz2Var.e;
                if (appCompatTextView6 == null) {
                    appCompatTextView6 = null;
                }
                appCompatTextView6.requestFocus();
            }
            boolean z2 = mz2.d;
            sh0 sh0Var = vl0.c;
            qz2 qz2Var = new qz2(z2, null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, qz2Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        List list = (List) obj;
        mz2.f3379a = list;
        int size = list.size();
        if (size > 1) {
            i = R.string.NAppsSelected;
        } else {
            i = R.string.NAppsSelectedSingular;
        }
        AppCompatTextView appCompatTextView7 = tz2Var.i;
        if (appCompatTextView7 != null) {
            appCompatTextView = appCompatTextView7;
        }
        appCompatTextView.setText(pd0.z(i, new Integer(size)));
        return ch3.f636a;
    }
}
