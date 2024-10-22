package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class dy3 {
    public static final i4 c = new i4("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    public final xy3 f1863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1864b;

    public dy3(Context context) {
        String str;
        this.f1864b = context.getPackageName();
        i4 i4Var = zy3.f5570a;
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
                    i4 i4Var2 = zy3.f5570a;
                    if (isLoggable) {
                        i4.b(i4Var2.f2534a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    } else {
                        i4Var2.getClass();
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z) {
            this.f1863a = new xy3(context, c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
        }
    }
}
