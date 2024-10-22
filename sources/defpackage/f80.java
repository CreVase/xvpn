package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f80 implements e80, g80 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2059b;
    public int c;
    public int d;
    public Comparable e;
    public Object f;

    public f80(Context context) {
        this.f2058a = 2;
        this.d = 0;
        this.f2059b = context;
    }

    public static String f(px0 px0Var) {
        px0Var.a();
        String str = px0Var.c.e;
        if (str != null) {
            return str;
        }
        px0Var.a();
        String str2 = px0Var.c.f1862b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // defpackage.g80
    public final ClipData a() {
        return (ClipData) this.f2059b;
    }

    @Override // defpackage.e80
    public final void b(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.e80
    public final h80 build() {
        return new h80(new f80(this));
    }

    @Override // defpackage.e80
    public final void c(int i) {
        this.d = i;
    }

    public final synchronized String d() {
        if (((String) this.e) == null) {
            h();
        }
        return (String) this.e;
    }

    public final synchronized String e() {
        if (((String) this.f) == null) {
            h();
        }
        return (String) this.f;
    }

    public final boolean g() {
        int i;
        synchronized (this) {
            i = this.d;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f2059b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.d = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.d = 2;
                        i = 2;
                    } else {
                        if (PlatformVersion.isAtLeastO()) {
                            this.d = 2;
                        } else {
                            this.d = 1;
                        }
                        i = this.d;
                    }
                }
            }
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void h() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.f2059b).getPackageManager().getPackageInfo(((Context) this.f2059b).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.e = Integer.toString(packageInfo.versionCode);
            this.f = packageInfo.versionName;
        }
    }

    @Override // defpackage.g80
    public final int r() {
        return this.d;
    }

    @Override // defpackage.g80
    public final ContentInfo s() {
        return null;
    }

    @Override // defpackage.e80
    public final void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f2058a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f2059b).getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.d;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                String str3 = "";
                if (((Uri) this.e) == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + ((Uri) this.e).toString().length() + ")";
                }
                sb.append(str2);
                if (((Bundle) this.f) != null) {
                    str3 = ", hasExtras";
                }
                return hx2.s(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.g80
    public final int w() {
        return this.c;
    }

    public f80(f80 f80Var) {
        this.f2058a = 1;
        ClipData clipData = (ClipData) f80Var.f2059b;
        clipData.getClass();
        this.f2059b = clipData;
        int i = f80Var.c;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i <= 5) {
            this.c = i;
            int i2 = f80Var.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.e = (Uri) f80Var.e;
                this.f = (Bundle) f80Var.f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
    }

    public f80(ClipData clipData, int i) {
        this.f2058a = 0;
        this.f2059b = clipData;
        this.c = i;
    }
}
