package com.google.ads.conversiontracking;

import android.content.Context;

/* loaded from: classes.dex */
public final class AdWordsAutomatedUsageReporter {
    public static void disableAutomatedUsageReporting(Context context, String str) {
        c.a(context).b(str);
    }

    public static void enableAutomatedUsageReporting(Context context, String str) {
        c.a(context).a(str);
    }
}
