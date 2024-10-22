package defpackage;

import android.graphics.drawable.Icon;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class vf0 {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    public static /* bridge */ /* synthetic */ boolean B(Throwable th) {
        return th instanceof MediaDrmResetException;
    }

    public static /* bridge */ /* synthetic */ Icon d(Object obj) {
        return (Icon) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo e(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder f() {
        return new AudioTrack.Builder();
    }
}
