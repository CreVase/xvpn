package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.chartboost.sdk.view.CBImpressionActivity;

/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f700a;

    public a5(Context context) {
        this.f700a = context;
    }

    public final Intent a() {
        return new Intent(this.f700a, (Class<?>) CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
    }

    public final void a(Intent intent) {
        try {
            this.f700a.startActivity(intent);
        } catch (Exception e) {
            Log.e("ImpressionActivity", "Cannot start the activity: " + e);
        }
    }
}
