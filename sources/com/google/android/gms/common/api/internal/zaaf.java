package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zaaf {
    private final ApiKey zaa;
    private final TaskCompletionSource zab = new TaskCompletionSource();

    public zaaf(ApiKey apiKey) {
        this.zaa = apiKey;
    }

    public final ApiKey zaa() {
        return this.zaa;
    }

    public final TaskCompletionSource zab() {
        return this.zab;
    }
}
