package defpackage;

import android.view.View;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class y8 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5290b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y8(int i, int i2, Object obj) {
        this.f5289a = i2;
        this.c = obj;
        this.f5290b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5289a;
        int i2 = this.f5290b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = AdvancedFeaturesActivity.n;
                ((x31) obj).invoke(Integer.valueOf(i2));
                return;
            default:
                x31 x31Var = ((ac) obj).g;
                if (x31Var != null) {
                    x31Var.invoke(Integer.valueOf(i2));
                    return;
                }
                return;
        }
    }
}
