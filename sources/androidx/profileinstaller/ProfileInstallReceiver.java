package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import defpackage.ew3;
import defpackage.mp0;
import defpackage.tf3;
import defpackage.v51;
import defpackage.vk0;
import defpackage.zf;
import java.io.File;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File cacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ew3.h1(context, new zf(9), new v51(this, 16), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    zf zfVar = new zf(10);
                    v51 v51Var = new v51(this, 16);
                    try {
                        ew3.Y0(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        zfVar.execute(new vk0(v51Var, 10, (Object) null, 1));
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        zfVar.execute(new vk0(v51Var, 7, e, 1));
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    zf zfVar2 = new zf(11);
                    v51 v51Var2 = new v51(this, 16);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    zfVar2.execute(new vk0(v51Var2, 11, (Object) null, 1));
                    return;
                }
                return;
            }
            return;
        }
        boolean equals = "androidx.profileinstaller.action.SAVE_PROFILE".equals(action);
        mp0 mp0Var = ew3.t;
        if (equals) {
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                mp0Var.f(12, null);
                setResultCode(12);
                return;
            } else {
                mp0Var.f(13, null);
                setResultCode(13);
                return;
            }
        }
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    cacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else if (i >= 23) {
                    cacheDir = context.getCodeCacheDir();
                } else {
                    cacheDir = context.getCacheDir();
                }
                if (tf3.C(cacheDir)) {
                    mp0Var.f(14, null);
                    setResultCode(14);
                    return;
                } else {
                    mp0Var.f(15, null);
                    setResultCode(15);
                    return;
                }
            }
            mp0Var.f(16, null);
            setResultCode(16);
        }
    }
}
