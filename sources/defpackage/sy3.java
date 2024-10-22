package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class sy3 extends py3 {
    public final /* synthetic */ uy3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy3(uy3 uy3Var, TaskCompletionSource taskCompletionSource, String str) {
        super(uy3Var, new pq0("OnRequestInstallCallback", 3), taskCompletionSource);
        this.e = uy3Var;
    }

    @Override // defpackage.py3, defpackage.cy3
    public final void d(Bundle bundle) {
        super.d(bundle);
        int i = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i != 0) {
            taskCompletionSource.trySetException(new tc1(bundle.getInt("error.code", -2)));
            return;
        }
        bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        long j = bundle.getLong("additional.size.required");
        yy3 yy3Var = this.e.d;
        yy3Var.getClass();
        long a2 = yy3.a(new File(yy3Var.f5403a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        hashMap.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        hashMap.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        hashMap.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        hashMap.put("nonblocking.intent", hashSet4);
        taskCompletionSource.trySetResult(new sf(i2, j, a2, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
    }
}
