package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class uy3 {
    public static final pq0 e = new pq0("AppUpdateService", 3);
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final az3 f4760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4761b;
    public final Context c;
    public final yy3 d;

    public uy3(Context context, yy3 yy3Var) {
        String str;
        this.f4761b = context.getPackageName();
        this.c = context;
        this.d = yy3Var;
        pq0 pq0Var = ww3.f5080a;
        boolean z = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    Object[] objArr = new Object[0];
                    boolean isLoggable = Log.isLoggable("PlayCore", 5);
                    pq0 pq0Var2 = ww3.f5080a;
                    if (isLoggable) {
                        pq0.h(pq0Var2.f3897b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    } else {
                        pq0Var2.getClass();
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z) {
            Context applicationContext = context.getApplicationContext();
            this.f4760a = new az3(applicationContext != null ? applicationContext : context, e, f);
        }
    }

    public static Bundle a(uy3 uy3Var, String str) {
        Integer num;
        Context context = uy3Var.c;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            boolean isLoggable = Log.isLoggable("PlayCore", 6);
            pq0 pq0Var = e;
            if (isLoggable) {
                Log.e("PlayCore", pq0.h(pq0Var.f3897b, "The current version of the app could not be retrieved", objArr));
            } else {
                pq0Var.getClass();
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static Bundle b() {
        Map map;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        HashMap hashMap = ey3.f2019a;
        synchronized (ey3.class) {
            HashMap hashMap2 = ey3.f2019a;
            if (!hashMap2.containsKey("app_update")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("java", 11004);
                hashMap2.put("app_update", hashMap3);
            }
            map = (Map) hashMap2.get("app_update");
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public static Task c() {
        Object[] objArr = {-9};
        boolean isLoggable = Log.isLoggable("PlayCore", 6);
        pq0 pq0Var = e;
        if (isLoggable) {
            Log.e("PlayCore", pq0.h(pq0Var.f3897b, "onError(%d)", objArr));
        } else {
            pq0Var.getClass();
        }
        return Tasks.forException(new tc1(-9));
    }
}
