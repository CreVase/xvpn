package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: classes.dex */
public final class zzeg {
    public static void zza() throws zzef {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (!z) {
        } else {
            throw new zzef(sb.toString());
        }
    }

    public static void zzb(boolean z, String str) throws zzef {
        if (z) {
        } else {
            throw new zzef(str);
        }
    }

    public static boolean zzc(Context context) {
        int i = zzfk.zza;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(zzfk.zzc) || "XT1650".equals(zzfk.zzd))) {
            return false;
        }
        if (i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return false;
        }
        return zzee.zzk("EGL_EXT_protected_content");
    }

    public static boolean zzd() {
        int i = zzfk.zza;
        if (zzee.zzk("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }
}
