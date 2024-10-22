package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class ha extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ na g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(na naVar, c90 c90Var) {
        super(2, c90Var);
        this.g = naVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        ha haVar = new ha(this.g, c90Var);
        haVar.f = obj;
        return haVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((ha) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        aa0 aa0Var;
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        dn dnVar = null;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                aa0Var = (aa0) this.f;
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            aa0 aa0Var2 = (aa0) this.f;
            sh0 sh0Var = vl0.c;
            ga gaVar = new ga(null);
            this.f = aa0Var2;
            this.e = 1;
            Object p0 = zf3.p0(this, sh0Var, gaVar);
            if (p0 == ba0Var) {
                return ba0Var;
            }
            aa0Var = aa0Var2;
            obj = p0;
        }
        String str = (String) obj;
        int i2 = na.e;
        na naVar = this.g;
        l activity = naVar.getActivity();
        if (activity instanceof dn) {
            dnVar = (dn) activity;
        }
        if (dnVar != null) {
            dnVar.N();
        }
        int i3 = 5;
        if (bx3.E(str)) {
            t9.w0(naVar.getChildFragmentManager(), new q90(i3, pd0.y(R.string.DeleteAccountNetworkFailed), naVar));
        } else if (TextUtils.equals(str, "ErrCantDeleteVipUser")) {
            t9.w0(naVar.getChildFragmentManager(), y62.y);
        } else {
            if (str.length() != 0) {
                z = false;
            }
            if (z) {
                t9.w0(naVar.getChildFragmentManager(), new q90(3, aa0Var, naVar));
            } else {
                t9.w0(naVar.getChildFragmentManager(), new q90(i3, "Delete Failed,error:".concat(str), naVar));
            }
        }
        return ch3.f636a;
    }
}
