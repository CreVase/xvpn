package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.bo1;
import defpackage.e32;
import defpackage.hs3;
import java.util.Collections;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f297a = bo1.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        bo1.c().a(new Throwable[0]);
        try {
            hs3.a0(context).Y(Collections.singletonList(new e32(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e) {
            bo1.c().b(f297a, "WorkManager is not initialized", e);
        }
    }
}
