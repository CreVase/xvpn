package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.util.HandlerScheduler;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class MRAIDPresenter$scheduler$2 extends ji1 implements v31 {
    public static final MRAIDPresenter$scheduler$2 INSTANCE = new MRAIDPresenter$scheduler$2();

    public MRAIDPresenter$scheduler$2() {
        super(0);
    }

    @Override // defpackage.v31
    public final HandlerScheduler invoke() {
        return new HandlerScheduler();
    }
}
