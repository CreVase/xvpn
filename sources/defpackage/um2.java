package defpackage;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class um2 implements ym2 {

    /* renamed from: a, reason: collision with root package name */
    public final zm2 f4698a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4699b;
    public Bundle c;
    public final k43 d;

    public um2(zm2 zm2Var, lm3 lm3Var) {
        this.f4698a = zm2Var;
        this.d = new k43(new yy2(lm3Var, 2));
    }

    @Override // defpackage.ym2
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((vm2) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((tm2) entry.getValue()).e.a();
            if (!m20.L(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.f4699b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f4699b) {
            Bundle a2 = this.f4698a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a2 != null) {
                bundle.putAll(a2);
            }
            this.c = bundle;
            this.f4699b = true;
        }
    }
}
