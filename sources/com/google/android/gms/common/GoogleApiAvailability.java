package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a7;
import defpackage.m02;
import defpackage.s02;
import defpackage.u02;
import defpackage.z51;
import java.util.ArrayList;
import java.util.Arrays;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    @HideFirstParty
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaa2 = zacc.zaa(activity);
        zaa2.zah(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        NotificationChannel notificationChannel;
        if (PlatformVersion.isAtLeastO()) {
            notificationChannel = ((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str);
            Preconditions.checkNotNull(notificationChannel);
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog zaa(Context context, int i, zag zagVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zac = com.google.android.gms.common.internal.zac.zac(context, i);
        if (zac != null) {
            if (zagVar == null) {
                zagVar = onClickListener;
            }
            builder.setPositiveButton(zac, zagVar);
        }
        String zag = com.google.android.gms.common.internal.zac.zag(context, i);
        if (zag != null) {
            builder.setTitle(zag);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (!isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            zabwVar.zaa();
            zabxVar.zab();
            return null;
        }
        return zabxVar;
    }

    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof l) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((l) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void zae(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String zaf = com.google.android.gms.common.internal.zac.zaf(context, i);
        String zae = com.google.android.gms.common.internal.zac.zae(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        u02 u02Var = new u02(context, null);
        u02Var.p = true;
        u02Var.d(16, true);
        u02Var.c(zaf);
        s02 s02Var = new s02();
        s02Var.f4250b = u02.b(zae);
        u02Var.f(s02Var);
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            u02Var.x.icon = context.getApplicationInfo().icon;
            u02Var.j = 2;
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                u02Var.f4608b.add(new m02(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent));
            } else {
                u02Var.g = pendingIntent;
            }
        } else {
            u02Var.x.icon = android.R.drawable.stat_sys_warning;
            u02Var.x.tickerText = u02.b(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker));
            u02Var.x.when = System.currentTimeMillis();
            u02Var.g = pendingIntent;
            u02Var.f = u02.b(zae);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String zab2 = com.google.android.gms.common.internal.zac.zab(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(z51.e(zab2));
                } else {
                    name = notificationChannel.getName();
                    if (!zab2.contentEquals(name)) {
                        notificationChannel.setName(zab2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            u02Var.t = str2;
        }
        Notification a2 = u02Var.a();
        if (i != 1 && i != 2 && i != 3) {
            i2 = 39789;
        } else {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i2 = 10436;
        }
        notificationManager.notify(i2, a2);
    }

    public final void zaf(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), zap.zaa | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, zag.zab(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public Dialog getErrorDialog(Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, a7 a7Var, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i, null, onCancelListener, new zac(this, activity, i, a7Var));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(Fragment fragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener, null);
    }
}
