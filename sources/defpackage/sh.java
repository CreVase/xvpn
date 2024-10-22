package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class sh {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f4341a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        boolean isDirectPlaybackSupported;
        db1 db1Var = hb1.f2394b;
        cb1 cb1Var = new cb1();
        oi2 oi2Var = th.e;
        mi2 mi2Var = oi2Var.f2924b;
        if (mi2Var == null) {
            mi2 mi2Var2 = new mi2(oi2Var, new ni2(oi2Var.e, 0, oi2Var.f));
            oi2Var.f2924b = mi2Var2;
            mi2Var = mi2Var2;
        }
        kh3 it = mi2Var.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f4341a);
            if (isDirectPlaybackSupported) {
                cb1Var.Z(Integer.valueOf(intValue));
            }
        }
        cb1Var.Z(2);
        return cp3.Q(cb1Var.b0());
    }

    public static int b(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(wi3.n(i3)).build(), f4341a);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }
}
