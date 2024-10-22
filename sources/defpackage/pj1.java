package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;

/* loaded from: classes2.dex */
public final /* synthetic */ class pj1 implements v30 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3853b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pj1(String str, Object obj, int i) {
        this.f3852a = i;
        this.f3853b = str;
        this.c = obj;
    }

    @Override // defpackage.v30
    public final Object h(aa3 aa3Var) {
        String a2;
        int i;
        int i2 = this.f3852a;
        String str = this.f3853b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                Context context = (Context) aa3Var.a(Context.class);
                switch (((ef0) ((qj1) obj)).f1928a) {
                    case 19:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            a2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        a2 = "";
                        break;
                    case 20:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i = applicationInfo2.minSdkVersion;
                            a2 = String.valueOf(i);
                            break;
                        }
                        a2 = "";
                        break;
                    case 21:
                        int i3 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            a2 = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            a2 = "watch";
                            break;
                        } else if (i3 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            a2 = "auto";
                            break;
                        } else {
                            if (i3 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                a2 = "embedded";
                                break;
                            }
                            a2 = "";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            a2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        a2 = "";
                        break;
                }
                return new vl(str, a2);
            default:
                h30 h30Var = (h30) obj;
                try {
                    Trace.beginSection(str);
                    return h30Var.f.h(aa3Var);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
