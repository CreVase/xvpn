package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.p91;
import defpackage.q91;
import defpackage.uc0;
import defpackage.vc0;
import defpackage.yc0;
import defpackage.zc0;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbdj {
    private zc0 zza;
    private vc0 zzb;
    private yc0 zzc;
    private zzbdh zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzhbq.zza(context));
                }
            }
        }
        return false;
    }

    public final zc0 zza() {
        zc0 zc0Var;
        boolean z;
        vc0 vc0Var = this.zzb;
        if (vc0Var != null) {
            if (this.zza == null) {
                uc0 uc0Var = new uc0();
                try {
                    p91 p91Var = (p91) vc0Var.f4813a;
                    p91Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                        obtain.writeStrongBinder(uc0Var);
                        z = false;
                        if (!p91Var.f3800a.transact(3, obtain, obtain2, 0)) {
                            int i = q91.f3971a;
                        }
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            z = true;
                        }
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (RemoteException unused) {
                }
                if (z) {
                    zc0Var = new zc0(uc0Var, vc0Var.f4814b);
                    this.zza = zc0Var;
                }
            }
            return this.zza;
        }
        zc0Var = null;
        this.zza = zc0Var;
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb != null || (zza = zzhbq.zza(activity)) == null) {
            return;
        }
        zzhbr zzhbrVar = new zzhbr(this);
        this.zzc = zzhbrVar;
        zzhbrVar.setApplicationContext(activity.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(zza)) {
            intent.setPackage(zza);
        }
        activity.bindService(intent, zzhbrVar, 33);
    }

    public final void zzc(vc0 vc0Var) {
        this.zzb = vc0Var;
        vc0Var.getClass();
        try {
            p91 p91Var = (p91) vc0Var.f4813a;
            p91Var.getClass();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                obtain.writeLong(0L);
                if (!p91Var.f3800a.transact(2, obtain, obtain2, 0)) {
                    int i = q91.f3971a;
                }
                obtain2.readException();
                obtain2.readInt();
                obtain2.recycle();
                obtain.recycle();
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException unused) {
        }
        zzbdh zzbdhVar = this.zzd;
        if (zzbdhVar != null) {
            zzbdhVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbdh zzbdhVar) {
        this.zzd = zzbdhVar;
    }

    public final void zzf(Activity activity) {
        yc0 yc0Var = this.zzc;
        if (yc0Var == null) {
            return;
        }
        activity.unbindService(yc0Var);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
