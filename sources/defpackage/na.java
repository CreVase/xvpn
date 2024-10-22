package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;

/* loaded from: classes2.dex */
public final class na extends sn {
    public static final /* synthetic */ int e = 0;
    public final ui1 d;

    public na() {
        super(0);
        this.d = m20.D0(kj1.f2953a, new ma(this, 0));
    }

    public static final void z(na naVar) {
        dn dnVar;
        l activity = naVar.getActivity();
        if (activity instanceof dn) {
            dnVar = (dn) activity;
        } else {
            dnVar = null;
        }
        if (dnVar != null) {
            dnVar.T();
        }
        zf3.T(naVar, null, new ha(naVar, null), 3);
    }

    public final m11 D() {
        return (m11) this.d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return D().f3217a;
    }

    @Override // defpackage.sn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        if (!z) {
            D().f3218b.setTextColor(new ColorStateList(new int[][]{ew3.o, StateSet.WILD_CARD}, new int[]{-13779511, v73.j(1000013)}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d2, code lost:            if (r9.equals("Broadband") == false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0299, code lost:            defpackage.tf3.v0(D().k);        r9 = new android.text.SpannableStringBuilder(defpackage.pd0.y(com.security.xvpn.z35kb.R.string.AccountPurchaseHoldPrompt));        defpackage.bx3.i(r9, defpackage.pd0.y(com.security.xvpn.z35kb.R.string.AccountPurchaseHoldPromptHighlight), new defpackage.ja(r0));        D().k.setText(r9);        D().k.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0296, code lost:            if (r9.equals("HoldOn") == false) goto L56;     */
    @Override // defpackage.sn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na.t(android.view.View, android.os.Bundle):void");
    }
}
