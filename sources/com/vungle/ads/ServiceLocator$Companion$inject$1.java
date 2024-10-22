package com.vungle.ads;

import android.content.Context;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class ServiceLocator$Companion$inject$1 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$Companion$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.v31
    public final T invoke() {
        ServiceLocator.Companion.getInstance(this.$context);
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
