package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class ob2 implements tr1, xd2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3637a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3638b;
    public Object c;

    public ob2(Context context, Handler handler, yt0 yt0Var) {
        this.f3638b = context.getApplicationContext();
        this.c = new rh(this, handler, yt0Var);
    }

    @Override // defpackage.tr1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ah a(sr1 sr1Var) {
        MediaCodec mediaCodec;
        String str = sr1Var.f4400a.f5535a;
        ah ahVar = null;
        try {
            m20.N("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                ah ahVar2 = new ah(mediaCodec, (HandlerThread) ((g33) this.f3638b).get(), (HandlerThread) ((g33) this.c).get(), this.f3637a);
                try {
                    m20.e0();
                    ah.o(ahVar2, sr1Var.f4401b, sr1Var.d, sr1Var.e);
                    return ahVar2;
                } catch (Exception e) {
                    e = e;
                    ahVar = ahVar2;
                    if (ahVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        ahVar.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    @Override // defpackage.xd2
    public final void c(wd2 wd2Var, int i) {
        if (this.f3637a) {
            this.f3637a = false;
        } else {
            ((StringBuilder) this.f3638b).append(", ");
        }
        ((StringBuilder) this.f3638b).append(i);
    }

    public final void d(boolean z) {
        if (this.f3637a) {
            ((Context) this.f3638b).unregisterReceiver((rh) this.c);
            this.f3637a = false;
        }
    }

    public ob2(final int i, boolean z) {
        final int i2 = 0;
        g33 g33Var = new g33() { // from class: zg
            @Override // defpackage.g33
            public final Object get() {
                int i3 = i2;
                int i4 = i;
                switch (i3) {
                    case 0:
                        return new HandlerThread(ah.p(i4, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(ah.p(i4, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        };
        final int i3 = 1;
        g33 g33Var2 = new g33() { // from class: zg
            @Override // defpackage.g33
            public final Object get() {
                int i32 = i3;
                int i4 = i;
                switch (i32) {
                    case 0:
                        return new HandlerThread(ah.p(i4, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(ah.p(i4, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        };
        this.f3638b = g33Var;
        this.c = g33Var2;
        this.f3637a = z;
    }

    public ob2(yd2 yd2Var, StringBuilder sb) {
        this.c = yd2Var;
        this.f3638b = sb;
        this.f3637a = true;
    }
}
