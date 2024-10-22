package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgy;
import com.google.android.gms.internal.ads.zzdpw;
import com.google.android.gms.internal.ads.zzfcr;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfsh;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzhbq;
import defpackage.ml1;
import defpackage.p71;
import defpackage.wc0;
import defpackage.x50;
import defpackage.x80;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzt {
    public static final zzfps zza = new zzf(Looper.getMainLooper());
    private String zzh;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Executor zzk = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzB(String str) {
        if (!zzcas.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeO)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeQ);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeP);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzC(Context context) {
        KeyguardManager zzW;
        if (context == null || (zzW = zzW(context)) == null || !zzW.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean zzD(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzcat.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzE() {
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            return false;
        }
        return true;
    }

    public static final boolean zzF(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        if (powerManager.isScreenOn()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        Bundle zzX = zzX(context);
        String string = zzX.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
        if (TextUtils.isEmpty(zzY(zzX)) && !TextUtils.isEmpty(string)) {
            return true;
        }
        return false;
    }

    public static final boolean zzH(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzI(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        zzfcr zzD;
        zzfcv zzP;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdpw) {
                view2 = ((zzdpw) view2).getChildAt(0);
            }
            if (!(view2 instanceof com.google.android.gms.ads.formats.zzg) && !(view2 instanceof NativeAdView)) {
                str = "UNKNOWN";
                i2 = 0;
            } else {
                str = "NATIVE";
                i2 = 1;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzv = zzv(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            boolean z = view2 instanceof zzcgy;
            String str3 = DevicePublicKeyStringDef.NONE;
            if (z && (zzP = ((zzcgy) view2).zzP()) != null) {
                str2 = zzP.zzb;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            } else {
                str2 = DevicePublicKeyStringDef.NONE;
            }
            if ((view2 instanceof zzcfs) && (zzD = ((zzcfs) view2).zzD()) != null) {
                str = zzfcr.zza(zzD.zzb);
                i2 = zzD.zzf;
                str3 = zzD.zzG;
            }
            zzcat.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(zzv), Integer.toString(i, 2)));
        } catch (Exception e) {
            zzcat.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzJ(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzK(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzca(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzL(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbek.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzM(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public static final int zzN(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            zzcat.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map zzO(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] zzP(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(R.id.content)) != null) {
            return new int[]{findViewById.getWidth(), findViewById.getHeight()};
        }
        return zzt();
    }

    public static final int[] zzQ(Activity activity) {
        int[] zzt;
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(R.id.content)) != null) {
            zzt = new int[]{findViewById.getTop(), findViewById.getBottom()};
        } else {
            zzt = zzt();
        }
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzt[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzt[1])};
    }

    public static final boolean zzR(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!com.google.android.gms.ads.internal.zzt.zzp().zzf && keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && !zzn(view)) {
            z = false;
        } else {
            z = true;
        }
        long zzv = zzv(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbj)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjL)).booleanValue()) {
                    return true;
                }
                if (zzv >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjN)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzS(Context context, Intent intent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkd)).booleanValue()) {
            try {
                zzaa(context, intent);
                return;
            } catch (SecurityException e) {
                zzcat.zzk("", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdUtil.startActivityWithUnknownContext");
                return;
            }
        }
        zzaa(context, intent);
    }

    public static final void zzT(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzo(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzcat.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            zzcat.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzU(Activity activity) {
        int[] zzP = zzP(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzP[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzP[1])};
    }

    public static final boolean zzV(View view, Context context) {
        PowerManager powerManager;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        return zzR(view, powerManager, zzW(context));
    }

    private static KeyguardManager zzW(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    private static Bundle zzX(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    private static String zzY(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (!string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") && !string.matches("^/\\d+~.+$")) {
            return "";
        }
        return string;
    }

    private static boolean zzZ(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i > 0) {
            zzcat.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    private static final void zzaa(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static List zzd() {
        zzbca zzbcaVar = zzbci.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzftj.zzc(zzfsh.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzn(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzn(android.view.View):boolean");
    }

    public static final void zzo(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() != null) {
            bundle = intent.getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(bundle);
    }

    public static final String zzp(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzY(zzX(context));
    }

    public static final String zzq() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzr() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return p71.m(str, " ", str2);
    }

    public static final DisplayMetrics zzs(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzt() {
        return new int[]{0, 0};
    }

    public static final Map zzu(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzv(View view) {
        float f;
        float f2 = Float.MAX_VALUE;
        do {
            f = 0.0f;
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f2 = Math.min(f2, view2.getAlpha());
            view = view2.getParent();
        } while (f2 > 0.0f);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return Math.round(f * 100.0f);
    }

    public static final WebResourceResponse zzw(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbq(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzcat.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzx() {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd != null) {
            return zzd.getString(com.google.android.gms.ads.impl.R.string.s7);
        }
        return "Test Ad";
    }

    public static final zzbt zzy(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcat.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbt) {
                return (zzbt) queryLocalInterface;
            }
            return new zzbr(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzz(Context context, String str) {
        Context zza2 = zzbvu.zza(context);
        if (Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public final ml1 zzb(final Uri uri) {
        return zzfzt.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfps zzfpsVar = zzt.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzt.zzO(uri);
            }
        }, this.zzk);
    }

    public final String zzc(final Context context, String str) {
        String str2;
        synchronized (this.zzg) {
            String str3 = this.zzh;
            if (str3 != null) {
                return str3;
            }
            if (str == null) {
                return zzq();
            }
            try {
                zzck zza2 = zzck.zza();
                if (TextUtils.isEmpty(zza2.zza)) {
                    if (ClientLibraryUtils.isPackageSide()) {
                        str2 = (String) zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzci
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                    return defaultUserAgent;
                                }
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                        });
                    } else {
                        final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        str2 = (String) zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = remoteContext;
                                Context context3 = context;
                                boolean z = false;
                                if (context2 != null) {
                                    zze.zza("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.zza("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    zza2.zza = str2;
                }
                this.zzh = zza2.zza;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.zzh)) {
                this.zzh = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.zzh)) {
                this.zzh = zzq();
            }
            this.zzh = this.zzh + " (Mobile; " + str;
            try {
                if (Wrappers.packageManager(context).isCallerInstantApp()) {
                    this.zzh = this.zzh + ";aia";
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdUtil.getUserAgent");
            }
            String str4 = this.zzh + ")";
            this.zzh = str4;
            return str4;
        }
    }

    public final void zzf(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        zzcat.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final /* synthetic */ void zzg(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzad.zzb(context, str));
    }

    public final void zzh(final Context context, final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzp();
        bundle.putString("device", zzr());
        zzbca zzbcaVar = zzbci.zza;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza()));
        if (bundle.isEmpty()) {
            zzcat.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjI);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        zzt.this.zzg(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        zzcam.zzw(context, str, "gmob-apps", bundle, true, new zzcal() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.internal.ads.zzcal
            public final boolean zza(String str4) {
                zzfps zzfpsVar = zzt.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzt.zzK(context, str, str4);
                return true;
            }
        });
    }

    public final boolean zzi(String str) {
        return zzZ(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzab));
    }

    public final boolean zzj(String str) {
        return zzZ(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzac));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzk(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbci.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter);
        }
        this.zzj = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.zzi) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbci.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzs(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzs(this, null), intentFilter);
        }
        this.zzi = true;
        return true;
    }

    public final int zzm(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        zzbca zzbcaVar = zzbci.zzet;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar);
        zzbca zzbcaVar2 = zzbci.zzeu;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
            zzbdj zzbdjVar = new zzbdj();
            zzbdjVar.zze(new zzo(this, zzbdjVar, context, uri));
            zzbdjVar.zzb((Activity) context);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar2)).booleanValue()) {
            x50 a2 = new wc0().a();
            ((Intent) a2.f5117b).setPackage(zzhbq.zza(context));
            ((Intent) a2.f5117b).setData(uri);
            x80.startActivity(context, (Intent) a2.f5117b, (Bundle) a2.c);
            return 5;
        }
        return 5;
    }
}
