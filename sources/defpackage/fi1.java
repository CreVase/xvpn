package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class fi1 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ hi1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi1(hi1 hi1Var, int i) {
        super(0);
        this.f = i;
        this.g = hi1Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m100invoke() {
        int i = this.f;
        hi1 hi1Var = this.g;
        switch (i) {
            case 0:
                t9.a();
                boolean z = !ew3.U();
                int i2 = hi1.c;
                hi1Var.m(z);
                return;
            default:
                int i3 = hi1.c;
                hi1Var.getClass();
                if (!ew3.X()) {
                    bx3.d0(hi1Var.requireActivity());
                    return;
                }
                ew3.m(true);
                boolean U = ew3.U();
                AppCompatTextView appCompatTextView = hi1Var.f2427a;
                if (appCompatTextView == null) {
                    appCompatTextView = null;
                }
                appCompatTextView.setSelected(U);
                AppCompatTextView appCompatTextView2 = hi1Var.f2428b;
                (appCompatTextView2 != null ? appCompatTextView2 : null).setSelected(!U);
                return;
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m100invoke();
                return ch3Var;
            default:
                m100invoke();
                return ch3Var;
        }
    }
}
