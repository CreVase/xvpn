package defpackage;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.internal.VungleInitializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class vn3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4867a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InitializationListener f4868b;
    public final /* synthetic */ VungleInitializer c;

    public /* synthetic */ vn3(InitializationListener initializationListener, VungleInitializer vungleInitializer) {
        this.f4868b = initializationListener;
        this.c = vungleInitializer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4867a;
        InitializationListener initializationListener = this.f4868b;
        VungleInitializer vungleInitializer = this.c;
        switch (i) {
            case 0:
                VungleInitializer.b(initializationListener, vungleInitializer);
                return;
            default:
                VungleInitializer.c(initializationListener, vungleInitializer);
                return;
        }
    }

    public /* synthetic */ vn3(VungleInitializer vungleInitializer, InitializationListener initializationListener) {
        this.c = vungleInitializer;
        this.f4868b = initializationListener;
    }
}
