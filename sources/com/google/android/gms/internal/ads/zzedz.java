package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.l12;
import defpackage.u02;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes.dex */
public final class zzedz extends zzbsn {
    private final Context zza;
    private final zzdso zzb;
    private final zzcay zzc;
    private final zzedo zzd;
    private final zzfib zze;
    private String zzf;
    private String zzg;

    public zzedz(Context context, zzedo zzedoVar, zzcay zzcayVar, zzdso zzdsoVar, zzfib zzfibVar) {
        this.zza = context;
        this.zzb = zzdsoVar;
        this.zzc = zzcayVar;
        this.zzd = zzedoVar;
        this.zze = zzfibVar;
    }

    public static void zzc(Context context, zzdso zzdsoVar, zzfib zzfibVar, zzedo zzedoVar, String str, String str2, Map map) {
        String str3;
        String zza;
        if (true != com.google.android.gms.ads.internal.zzt.zzo().zzx(context)) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue() && zzdsoVar != null) {
            zzdsn zza2 = zzdsoVar.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str3);
            zza2.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza2.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            zza = zza2.zzf();
        } else {
            zzfia zzb = zzfia.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", str3);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zzb.zza((String) entry2.getKey(), (String) entry2.getValue());
            }
            zza = zzfibVar.zza(zzb);
        }
        zzedoVar.zzd(new zzedq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, zza, 2));
    }

    private static String zzo(int i, String str) {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd == null) {
            return str;
        }
        return zzd.getString(i);
    }

    private final void zzp(String str, String str2, Map map) {
        zzc(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private final void zzq() {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzy(this.zza).zzf(ObjectWrapper.wrap(this.zza), this.zzg, this.zzf)) {
                return;
            }
        } catch (RemoteException e) {
            zzcat.zzh("Failed to schedule offline notification poster.", e);
        }
        this.zzd.zzc(this.zzf);
        zzp(this.zzf, "offline_notification_worker_not_scheduled", zzfvv.zzd());
    }

    private final void zzr(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new l12(activity).a()) {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzp(this.zzf, "asnpdi", zzfvv.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
            zzJ.setTitle(zzo(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzo(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzedz.this.zzd(activity, zzlVar, dialogInterface, i);
                }
            }).setNegativeButton(zzo(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeds
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzedz.this.zzj(zzlVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedt
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzedz.this.zzk(zzlVar, dialogInterface);
                }
            });
            zzJ.create().show();
            zzp(this.zzf, "rtsdi", zzfvv.zzd());
            return;
        }
        zzq();
        zzs(activity, zzlVar);
    }

    private final void zzs(Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        String zzo = zzo(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
        zzJ.setMessage(zzo).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = com.google.android.gms.ads.internal.overlay.zzl.this;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        AlertDialog create = zzJ.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzedy(this, create, timer, zzlVar), 3000L);
    }

    private static final PendingIntent zzt(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfqb.zza(context, 0, intent, zzfqb.zza | 1073741824, 0);
    }

    public final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzp(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzq().zzg(activity));
        zzq();
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean zzx = com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza);
        HashMap hashMap = new HashMap();
        char c = 2;
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true == zzx) {
                c = 1;
            }
            hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
            try {
                Intent launchIntentForPackage = this.zza.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                this.zza.startActivity(launchIntentForPackage);
                hashMap.put("olaa", "olas");
            } catch (ActivityNotFoundException unused) {
                hashMap.put("olaa", "olaf");
            }
        } else {
            hashMap.put("offline_notification_action", "offline_notification_dismissed");
        }
        zzp(stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
            if (c == 1) {
                this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
            } else {
                zzedo.zzi(writableDatabase, stringExtra2);
            }
        } catch (SQLiteException e) {
            zzcat.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeeb zzeebVar = (zzeeb) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzeebVar.zza();
                com.google.android.gms.ads.internal.overlay.zzl zzb = zzeebVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzq();
                    zzs(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzp(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzeeb zzeebVar = (zzeeb) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzeebVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzl zzb = zzeebVar.zzb();
        this.zzf = zzeebVar.zzc();
        this.zzg = zzeebVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzik)).booleanValue()) {
            zzp(this.zzf, "dialog_impression", zzfvv.zzd());
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(zza);
            zzJ.setTitle(zzo(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzo(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzo(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzedz.this.zzl(zza, zzb, dialogInterface, i);
                }
            }).setNegativeButton(zzo(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzedz.this.zzm(zzb, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedw
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzedz.this.zzn(zzb, dialogInterface);
                }
            });
            zzJ.create().show();
            return;
        }
        zzr(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzh() {
        final zzcay zzcayVar = this.zzc;
        this.zzd.zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzedh
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                zzedo.zzb(zzcay.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzt = zzt(context, "offline_notification_clicked", str2, str);
        PendingIntent zzt2 = zzt(context, "offline_notification_dismissed", str2, str);
        u02 u02Var = new u02(context, "offline_notification_channel");
        u02Var.c(zzo(R.string.offline_notification_title, "View the ad you saved when you were offline"));
        u02Var.f = u02.b(zzo(R.string.offline_notification_text, "Tap to open ad"));
        u02Var.d(16, true);
        Notification notification = u02Var.x;
        notification.deleteIntent = zzt2;
        u02Var.g = zzt;
        notification.icon = context.getApplicationInfo().icon;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, u02Var.a());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        zzp(str2, str3, hashMap);
    }

    public final /* synthetic */ void zzj(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzp(this.zzf, "dialog_click", hashMap);
        zzr(activity, zzlVar);
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
