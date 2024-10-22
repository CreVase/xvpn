package defpackage;

import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class gd {

    /* renamed from: a, reason: collision with root package name */
    public fd f2236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jd f2237b;

    public gd(jd jdVar) {
        this.f2237b = jdVar;
    }

    public final void a() {
        fd fdVar = this.f2236a;
        if (fdVar != null) {
            try {
                this.f2237b.k.unregisterReceiver(fdVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f2236a = null;
        }
    }

    public abstract int b();

    public final void c() {
        IntentFilter intentFilter;
        a();
        switch (((ed) this).c) {
            case 0:
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                break;
            default:
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIME_SET");
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_TICK");
                break;
        }
        if (intentFilter.countActions() == 0) {
            return;
        }
        if (this.f2236a == null) {
            this.f2236a = new fd(this, 0);
        }
        this.f2237b.k.registerReceiver(this.f2236a, intentFilter);
    }
}
