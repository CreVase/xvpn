package androidx.work;

import android.content.Context;
import defpackage.bo1;
import defpackage.d5;
import defpackage.gc1;
import defpackage.hs3;
import defpackage.u40;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements gc1 {
    static {
        bo1.e("WrkMgrInitializer");
    }

    @Override // defpackage.gc1
    public final List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.gc1
    public final Object b(Context context) {
        bo1.c().a(new Throwable[0]);
        hs3.b0(context, new u40(new d5()));
        return hs3.a0(context);
    }
}
