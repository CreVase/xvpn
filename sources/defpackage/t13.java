package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class t13 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4440a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4441b;
    public final s13 c;
    public final AudioManager d;
    public fd e;
    public int f;
    public int g;
    public boolean h;

    public t13(Context context, Handler handler, yt0 yt0Var) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        this.f4440a = applicationContext;
        this.f4441b = handler;
        this.c = yt0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        cp3.o(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = a(audioManager, 3);
        int i = this.f;
        if (wi3.f5017a >= 23) {
            z = audioManager.isStreamMute(i);
        } else if (a(audioManager, i) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        fd fdVar = new fd(this);
        try {
            applicationContext.registerReceiver(fdVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = fdVar;
        } catch (RuntimeException e) {
            sn1.g("Error registering stream volume receiver", e);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            sn1.g("Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        c();
        bu0 bu0Var = ((yt0) this.c).f5387a;
        tk0 b2 = bu0.b(bu0Var.y);
        if (!b2.equals(bu0Var.Y)) {
            bu0Var.Y = b2;
            bu0Var.k.l(29, new z5(b2, 16));
        }
    }

    public final void c() {
        final boolean z;
        int i = this.f;
        AudioManager audioManager = this.d;
        final int a2 = a(audioManager, i);
        int i2 = this.f;
        if (wi3.f5017a >= 23) {
            z = audioManager.isStreamMute(i2);
        } else if (a(audioManager, i2) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.g != a2 || this.h != z) {
            this.g = a2;
            this.h = z;
            ((yt0) this.c).f5387a.k.l(30, new rl1() { // from class: wt0
                @Override // defpackage.rl1
                public final void invoke(Object obj) {
                    ((v52) obj).onDeviceVolumeChanged(a2, z);
                }
            });
        }
    }
}
