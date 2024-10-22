package defpackage;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public abstract class xu3 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public eb3 f5228a;

    /* renamed from: b, reason: collision with root package name */
    public final uy0 f5229b;

    public xu3(uy0 uy0Var) {
        this.f5229b = uy0Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        eb3 eb3Var = this.f5228a;
        if (eb3Var != null) {
            eb3Var.d = null;
            xu3 xu3Var = (xu3) ((ArrayDeque) eb3Var.c).poll();
            eb3Var.d = xu3Var;
            if (xu3Var != null) {
                xu3Var.executeOnExecutor((ThreadPoolExecutor) eb3Var.f1908b, new Object[0]);
            }
        }
    }
}
