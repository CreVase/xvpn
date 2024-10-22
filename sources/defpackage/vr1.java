package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class vr1 {
    public static void a(ji jiVar, Object obj) {
        yf0 yf0Var;
        AudioDeviceInfo e = vf0.e(obj);
        ig0 ig0Var = (ig0) jiVar;
        if (e == null) {
            yf0Var = null;
        } else {
            ig0Var.getClass();
            yf0Var = new yf0(e);
        }
        ig0Var.Y = yf0Var;
        AudioTrack audioTrack = ig0Var.u;
        if (audioTrack != null) {
            wf0.a(audioTrack, yf0Var);
        }
    }
}
