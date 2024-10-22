package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class a40 implements fb2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20a;

    @Override // defpackage.fb2
    public final Object get() {
        switch (this.f20a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                vi1 vi1Var = ExecutorsRegistrar.f1582a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    detectNetwork.detectResourceMismatches();
                    if (i >= 26) {
                        detectNetwork.detectUnbufferedIo();
                    }
                }
                return new ck0(Executors.newFixedThreadPool(4, new ad0("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                vi1 vi1Var2 = ExecutorsRegistrar.f1582a;
                return new ck0(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ad0("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                vi1 vi1Var3 = ExecutorsRegistrar.f1582a;
                return new ck0(Executors.newCachedThreadPool(new ad0("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                vi1 vi1Var4 = ExecutorsRegistrar.f1582a;
                return Executors.newSingleThreadScheduledExecutor(new ad0("Firebase Scheduler", 0, null));
        }
    }
}
