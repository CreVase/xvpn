package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzyt {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;

    public static zzae zza(float f) {
        try {
            if (zza == null || zzb == null || zzc == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                zza = cls.getConstructor(new Class[0]);
                zzb = cls.getMethod("setRotationDegrees", Float.TYPE);
                zzc = cls.getMethod("build", new Class[0]);
            }
            Object newInstance = zza.newInstance(new Object[0]);
            zzb.invoke(newInstance, Float.valueOf(f));
            Object invoke = zzc.invoke(newInstance, new Object[0]);
            invoke.getClass();
            return (zzae) invoke;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
