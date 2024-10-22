package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class wf0 {
    public static void a(AudioTrack audioTrack, yf0 yf0Var) {
        AudioDeviceInfo audioDeviceInfo;
        if (yf0Var == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = yf0Var.f5325a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
