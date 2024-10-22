package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class mi {

    /* renamed from: a, reason: collision with root package name */
    public final li f3299a;

    /* renamed from: b, reason: collision with root package name */
    public int f3300b;
    public long c;
    public long d;
    public long e;
    public long f;

    public mi(AudioTrack audioTrack) {
        if (wi3.f5017a >= 19) {
            this.f3299a = new li(audioTrack);
            a();
        } else {
            this.f3299a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f3299a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.f3300b = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.d = 10000000L;
                return;
            }
            this.d = 10000L;
            return;
        }
        this.e = 0L;
        this.f = -1L;
        this.c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
