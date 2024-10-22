package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
public final class zzfsw {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(hx2.m("negative size: ", i2));
            }
            zzb = zzftl.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zzb = zzftl.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzk(i, i2, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzftl.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z, String str, long j) {
        if (z) {
        } else {
            throw new IllegalArgumentException(zzftl.zzb(str, Long.valueOf(j)));
        }
    }

    public static void zzh(int i, int i2, int i3) {
        String zzk;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zzk = zzftl.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzk = zzk(i2, i3, "end index");
            }
        } else {
            zzk = zzk(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zzk);
    }

    public static void zzi(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzk(int i, int i2, String str) {
        if (i < 0) {
            return zzftl.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzftl.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(hx2.m("negative size: ", i2));
    }
}
