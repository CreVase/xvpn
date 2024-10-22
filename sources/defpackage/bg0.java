package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class bg0 {

    /* renamed from: a, reason: collision with root package name */
    public final y01 f460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f461b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final zh[] i;

    public bg0(y01 y01Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, zh[] zhVarArr) {
        this.f460a = y01Var;
        this.f461b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = zhVarArr;
    }

    public static AudioAttributes c(qh qhVar, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) qhVar.a().f4780b;
    }

    public final AudioTrack a(boolean z, qh qhVar, int i) {
        boolean z2;
        boolean z3;
        int i2 = this.c;
        try {
            AudioTrack b2 = b(z, qhVar, i);
            int state = b2.getState();
            if (state == 1) {
                return b2;
            }
            try {
                b2.release();
            } catch (Exception unused) {
            }
            int i3 = this.e;
            int i4 = this.f;
            int i5 = this.h;
            y01 y01Var = this.f460a;
            if (i2 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            throw new gi(state, i3, i4, i5, y01Var, z3, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            int i6 = this.e;
            int i7 = this.f;
            int i8 = this.h;
            y01 y01Var2 = this.f460a;
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            throw new gi(0, i6, i7, i8, y01Var2, z2, e);
        }
    }

    public final AudioTrack b(boolean z, qh qhVar, int i) {
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        AudioTrack.Builder offloadedPlayback;
        AudioTrack build;
        int i2 = wi3.f5017a;
        int i3 = this.g;
        int i4 = this.f;
        int i5 = this.e;
        if (i2 >= 29) {
            AudioFormat e = ig0.e(i5, i4, i3);
            audioAttributes = vf0.f().setAudioAttributes(c(qhVar, z));
            audioFormat = audioAttributes.setAudioFormat(e);
            transferMode = audioFormat.setTransferMode(1);
            bufferSizeInBytes = transferMode.setBufferSizeInBytes(this.h);
            sessionId = bufferSizeInBytes.setSessionId(i);
            boolean z2 = true;
            if (this.c != 1) {
                z2 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z2);
            build = offloadedPlayback.build();
            return build;
        }
        if (i2 >= 21) {
            return new AudioTrack(c(qhVar, z), ig0.e(i5, i4, i3), this.h, 1, i);
        }
        int t = wi3.t(qhVar.c);
        if (i == 0) {
            return new AudioTrack(t, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(t, this.e, this.f, this.g, this.h, 1, i);
    }
}
