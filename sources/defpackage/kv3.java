package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kv3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3022a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f3023b;
    public final s71 c;
    public final hs2 d;
    public float e;

    public kv3(Handler handler, Context context, s71 s71Var, hs2 hs2Var) {
        super(handler);
        this.f3022a = context;
        this.f3023b = (AudioManager) context.getSystemService("audio");
        this.c = s71Var;
        this.d = hs2Var;
    }

    public final float a() {
        AudioManager audioManager = this.f3023b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void b() {
        float f = this.e;
        hs2 hs2Var = this.d;
        hs2Var.f2479a = f;
        if (((dv3) hs2Var.e) == null) {
            hs2Var.e = dv3.c;
        }
        Iterator it = ((dv3) hs2Var.e).a().iterator();
        while (it.hasNext()) {
            v73.d.a(((mu3) it.next()).d.e(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        boolean z2;
        super.onChange(z);
        float a2 = a();
        if (a2 != this.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.e = a2;
            b();
        }
    }
}
