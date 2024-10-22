package defpackage;

import com.vungle.ads.internal.network.TpatSender;

/* loaded from: classes2.dex */
public final /* synthetic */ class oa3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TpatSender f3633b;
    public final /* synthetic */ String c;

    public /* synthetic */ oa3(TpatSender tpatSender, String str, int i) {
        this.f3632a = i;
        this.f3633b = tpatSender;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3632a;
        String str = this.c;
        TpatSender tpatSender = this.f3633b;
        switch (i) {
            case 0:
                TpatSender.a(tpatSender, str);
                return;
            default:
                TpatSender.b(tpatSender, str);
                return;
        }
    }
}
