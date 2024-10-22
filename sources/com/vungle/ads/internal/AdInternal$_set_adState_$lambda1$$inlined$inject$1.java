package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.task.JobRunner;
import defpackage.ji1;
import defpackage.v31;

/* renamed from: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AdInternal$_set_adState_$lambda1$$inlined$inject$1 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInternal$_set_adState_$lambda1$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.task.JobRunner] */
    @Override // defpackage.v31
    public final JobRunner invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getOrBuild$vungle_ads_release(JobRunner.class);
    }
}
