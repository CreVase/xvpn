package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.b82;
import defpackage.bv3;
import defpackage.d9;
import defpackage.dc3;
import defpackage.fi3;
import defpackage.lm;
import defpackage.y33;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1455a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        dc3.b(context);
        y33 a2 = lm.a();
        a2.G(queryParameter);
        a2.H(b82.b(intValue));
        int i2 = 0;
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        fi3 fi3Var = dc3.a().d;
        lm o = a2.o();
        d9 d9Var = new d9(i2);
        fi3Var.getClass();
        fi3Var.e.execute(new bv3(fi3Var, o, i, d9Var));
    }
}
