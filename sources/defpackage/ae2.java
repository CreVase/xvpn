package defpackage;

import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.quickconn.QuickConnTileService;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QuickConnTileService f69b;

    public /* synthetic */ ae2(QuickConnTileService quickConnTileService, int i) {
        this.f68a = i;
        this.f69b = quickConnTileService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f68a;
        QuickConnTileService quickConnTileService = this.f69b;
        switch (i) {
            case 0:
                int i2 = QuickConnTileService.f1610b;
                XApplication.d();
                quickConnTileService.c(rt3.e().f4214b);
                rt3.e().i(ew3.o(), ew3.X());
                return;
            default:
                int i3 = QuickConnTileService.f1610b;
                quickConnTileService.b();
                return;
        }
    }
}
