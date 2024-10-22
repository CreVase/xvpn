package com.vungle.ads.internal;

import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;

/* loaded from: classes2.dex */
public final class VungleInitializer$downloadJs$1 extends ji1 implements x31 {
    final /* synthetic */ x31 $downloadListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInitializer$downloadJs$1(x31 x31Var) {
        super(1);
        this.$downloadListener = x31Var;
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return ch3.f636a;
    }

    public final void invoke(int i) {
        if (i == 11) {
            this.$downloadListener.invoke(Boolean.FALSE);
        } else {
            this.$downloadListener.invoke(Boolean.TRUE);
        }
    }
}
