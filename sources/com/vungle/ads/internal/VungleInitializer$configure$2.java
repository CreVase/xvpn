package com.vungle.ads.internal;

import com.vungle.ads.ConfigurationError;
import com.vungle.ads.InitializationListener;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;

/* loaded from: classes2.dex */
public final class VungleInitializer$configure$2 extends ji1 implements x31 {
    final /* synthetic */ InitializationListener $callback;
    final /* synthetic */ VungleInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInitializer$configure$2(VungleInitializer vungleInitializer, InitializationListener initializationListener) {
        super(1);
        this.this$0 = vungleInitializer;
        this.$callback = initializationListener;
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return ch3.f636a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.setInitialized$vungle_ads_release(true);
            this.this$0.onInitSuccess(this.$callback);
            this.this$0.isInitializing$vungle_ads_release().set(false);
        } else {
            this.this$0.setInitialized$vungle_ads_release(false);
            this.this$0.isInitializing$vungle_ads_release().set(false);
            this.this$0.onInitError(this.$callback, new ConfigurationError());
        }
    }
}
