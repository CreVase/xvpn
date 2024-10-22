package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jt1 implements xa, r52 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final mi0 f2825b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public o52 n;
    public f30 o;
    public f30 p;
    public f30 q;
    public y01 r;
    public y01 s;
    public y01 t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final z83 e = new z83();
    public final y83 f = new y83();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public jt1(Context context, PlaybackSession playbackSession) {
        this.f2824a = context.getApplicationContext();
        this.c = playbackSession;
        mi0 mi0Var = new mi0();
        this.f2825b = mi0Var;
        mi0Var.d = this;
    }

    public static int c(int i) {
        switch (wi3.o(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public final boolean a(f30 f30Var) {
        String str;
        if (f30Var != null) {
            String str2 = (String) f30Var.d;
            mi0 mi0Var = this.f2825b;
            synchronized (mi0Var) {
                str = mi0Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            PlaybackMetrics.Builder builder2 = this.j;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.h.get(this.i);
            PlaybackMetrics.Builder builder3 = this.j;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.j;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            build = this.j.build();
            this.c.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void d(long j, y01 y01Var, int i) {
        int i2;
        if (wi3.a(this.s, y01Var)) {
            return;
        }
        if (this.s == null && i == 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        this.s = y01Var;
        i(0, j, y01Var, i2);
    }

    public final void e(long j, y01 y01Var, int i) {
        int i2;
        if (wi3.a(this.t, y01Var)) {
            return;
        }
        if (this.t == null && i == 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        this.t = y01Var;
        i(2, j, y01Var, i2);
    }

    public final void f(a93 a93Var, rt1 rt1Var) {
        int b2;
        int i;
        PlaybackMetrics.Builder builder = this.j;
        if (rt1Var == null || (b2 = a93Var.b(rt1Var.f3536a)) == -1) {
            return;
        }
        y83 y83Var = this.f;
        a93Var.f(b2, y83Var);
        int i2 = y83Var.c;
        z83 z83Var = this.e;
        a93Var.n(i2, z83Var);
        zs1 zs1Var = z83Var.c.f1834b;
        int i3 = 2;
        if (zs1Var == null) {
            i = 0;
        } else {
            int y = wi3.y(zs1Var.f5381a, zs1Var.f5382b);
            if (y != 0) {
                if (y != 1) {
                    if (y != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        if (z83Var.n != -9223372036854775807L && !z83Var.l && !z83Var.i && !z83Var.a()) {
            builder.setMediaDurationMillis(wi3.K(z83Var.n));
        }
        if (!z83Var.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.A = true;
    }

    public final void g(long j, y01 y01Var, int i) {
        int i2;
        if (wi3.a(this.r, y01Var)) {
            return;
        }
        if (this.r == null && i == 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        this.r = y01Var;
        i(1, j, y01Var, i2);
    }

    public final void h(wa waVar, String str) {
        rt1 rt1Var = waVar.d;
        if ((rt1Var == null || !rt1Var.a()) && str.equals(this.i)) {
            b();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void i(int i, long j, y01 y01Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        String str;
        timeSinceCreatedMillis = it1.j(i).setTimeSinceCreatedMillis(j - this.d);
        if (y01Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = y01Var.k;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = y01Var.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = y01Var.i;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = y01Var.h;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = y01Var.q;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = y01Var.r;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = y01Var.y;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = y01Var.z;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = y01Var.c;
            if (str5 != null) {
                int i9 = wi3.f5017a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = y01Var.s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
