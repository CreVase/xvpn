package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class wh {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f5005a;

    /* renamed from: b, reason: collision with root package name */
    public final uh f5006b;
    public vh c;
    public qh d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public wh(Context context, Handler handler, yt0 yt0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f5005a = audioManager;
        this.c = yt0Var;
        this.f5006b = new uh(this, handler);
        this.e = 0;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        int i = wi3.f5017a;
        AudioManager audioManager = this.f5005a;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f5006b);
        }
        d(0);
    }

    public final void b(int i) {
        vh vhVar = this.c;
        if (vhVar != null) {
            bu0 bu0Var = ((yt0) vhVar).f5387a;
            boolean n = bu0Var.n();
            int i2 = 1;
            if (n && i != 1) {
                i2 = 2;
            }
            bu0Var.z(i, i2, n);
        }
    }

    public final void c() {
        if (!wi3.a(this.d, null)) {
            this.d = null;
            this.f = 0;
        }
    }

    public final void d(int i) {
        float f;
        if (this.e == i) {
            return;
        }
        this.e = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.g == f) {
            return;
        }
        this.g = f;
        vh vhVar = this.c;
        if (vhVar != null) {
            bu0 bu0Var = ((yt0) vhVar).f5387a;
            bu0Var.v(1, 2, Float.valueOf(bu0Var.U * bu0Var.x.g));
        }
    }

    public final int e(int i, boolean z) {
        boolean z2;
        int requestAudioFocus;
        AudioFocusRequest.Builder j;
        boolean z3;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int i2 = 1;
        if (i != 1 && this.f == 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            a();
            if (z) {
                return 1;
            }
            return -1;
        }
        if (!z) {
            return -1;
        }
        if (this.e != 1) {
            int i3 = wi3.f5017a;
            uh uhVar = this.f5006b;
            AudioManager audioManager = this.f5005a;
            if (i3 >= 26) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        r2.p();
                        j = r2.f(this.f);
                    } else {
                        r2.p();
                        j = r2.j(this.h);
                    }
                    qh qhVar = this.d;
                    if (qhVar != null && qhVar.f3995a == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    qhVar.getClass();
                    audioAttributes = j.setAudioAttributes((AudioAttributes) qhVar.a().f4780b);
                    willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z3);
                    onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(uhVar);
                    build = onAudioFocusChangeListener.build();
                    this.h = build;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this.h);
            } else {
                qh qhVar2 = this.d;
                qhVar2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(uhVar, wi3.t(qhVar2.c), this.f);
            }
            if (requestAudioFocus == 1) {
                d(1);
            } else {
                d(0);
                i2 = -1;
            }
        }
        return i2;
    }
}
