package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzfqb {
    public static final int zza;
    public static final ClipData zzb;

    static {
        int i;
        if (Build.VERSION.SDK_INT > 22) {
            i = 67108864;
        } else {
            i = 0;
        }
        zza = i;
        zzb = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if ((i2 & 88) == 0) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzf(z, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i2 & 1) != 0 && !zzb(0, 3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzfsw.zzf(z2, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i2 & 2) != 0 && !zzb(0, 5)) {
            z3 = false;
        } else {
            z3 = true;
        }
        zzfsw.zzf(z3, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i2 & 4) != 0 && !zzb(0, 9)) {
            z4 = false;
        } else {
            z4 = true;
        }
        zzfsw.zzf(z4, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i2 & 128) != 0 && !zzb(0, 17)) {
            z5 = false;
        } else {
            z5 = true;
        }
        zzfsw.zzf(z5, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        zzfsw.zzf(z6, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzfsw.zzf(!zzb(i2, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzb(i2, 67108864)) {
                z7 = false;
            }
            zzfsw.zzf(z7, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzb(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    private static boolean zzb(int i, int i2) {
        return (i & i2) == i2;
    }
}
