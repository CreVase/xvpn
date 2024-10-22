package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.util.ConcurrencyTimeoutProvider;
import defpackage.kj1;
import defpackage.li3;
import defpackage.m20;
import defpackage.ui1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class VungleInternal {
    /* renamed from: getAvailableBidTokens$lambda-0 */
    private static final ConcurrencyTimeoutProvider m64getAvailableBidTokens$lambda0(ui1 ui1Var) {
        return (ConcurrencyTimeoutProvider) ui1Var.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-1 */
    private static final SDKExecutors m65getAvailableBidTokens$lambda1(ui1 ui1Var) {
        return (SDKExecutors) ui1Var.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-2 */
    private static final BidTokenEncoder m66getAvailableBidTokens$lambda2(ui1 ui1Var) {
        return (BidTokenEncoder) ui1Var.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-3 */
    public static final String m67getAvailableBidTokens$lambda3(ui1 ui1Var) {
        return m66getAvailableBidTokens$lambda2(ui1Var).encode();
    }

    public final String getAvailableBidTokens(Context context) {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        kj1 kj1Var = kj1.f2953a;
        ui1 D0 = m20.D0(kj1Var, new VungleInternal$getAvailableBidTokens$$inlined$inject$1(context));
        return (String) new FutureResult(m65getAvailableBidTokens$lambda1(m20.D0(kj1Var, new VungleInternal$getAvailableBidTokens$$inlined$inject$2(context))).getIoExecutor().submit(new li3(m20.D0(kj1Var, new VungleInternal$getAvailableBidTokens$$inlined$inject$3(context)), 2))).get(m64getAvailableBidTokens$lambda0(D0).getTimeout(), TimeUnit.MILLISECONDS);
    }

    public final String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }
}
