package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.iv;
import defpackage.nl;
import defpackage.wb0;
import defpackage.yb3;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public yb3 create(wb0 wb0Var) {
        Context context = ((nl) wb0Var).f3479a;
        nl nlVar = (nl) wb0Var;
        return new iv(context, nlVar.f3480b, nlVar.c);
    }
}
