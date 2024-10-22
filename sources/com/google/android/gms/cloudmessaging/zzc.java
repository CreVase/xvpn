package com.google.android.gms.cloudmessaging;

/* loaded from: classes.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return zzd.class;
        }
        return super.loadClass(str, z);
    }
}
