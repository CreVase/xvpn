package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.m20;

/* loaded from: classes2.dex */
public final class VungleJobCreator implements JobCreator {
    private final Context context;
    private final PathProvider pathProvider;

    public VungleJobCreator(Context context, PathProvider pathProvider) {
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.JobCreator
    public Job create(String str) throws UnknownTagException {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (m20.L(str, CleanupJob.TAG)) {
                return new CleanupJob(this.context, this.pathProvider);
            }
            throw new UnknownTagException("Unknown Job Type ".concat(str));
        }
        throw new UnknownTagException("Job tag is null");
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }
}
