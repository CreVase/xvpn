package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import defpackage.fl;
import defpackage.gm1;
import defpackage.hm1;
import defpackage.ic;
import defpackage.jm1;
import defpackage.mm1;
import defpackage.nm1;
import defpackage.rx2;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class OssLicensesMenuActivity extends ic implements hm1 {
    private static String zza;
    private ListView zzb;
    private ArrayAdapter zzc;
    private boolean zzd;
    private zzc zze;
    private Task zzf;
    private zzd zzg;

    @KeepForSdk
    public static boolean fileExistsAndNotEmpty(Context context, String str) {
        boolean z = false;
        InputStream inputStream = null;
        try {
            Resources resources = context.getResources();
            inputStream = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            if (inputStream.available() > 0) {
                z = true;
            }
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static void setActivityTitle(String str) {
        zza = str;
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    @KeepForSdk
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.zzg = zzd.zzb(this);
        if (fileExistsAndNotEmpty(this, "third_party_licenses") && fileExistsAndNotEmpty(this, "third_party_license_metadata")) {
            z = true;
        } else {
            z = false;
        }
        this.zzd = z;
        if (zza == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                zza = intent.getStringExtra("title");
            }
        }
        String str = zza;
        if (str != null) {
            setTitle(str);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().m(true);
        }
        if (this.zzd) {
            zzl zzc = zzd.zzb(this).zzc();
            this.zzf = zzc.doRead(new zzi(zzc, getPackageName()));
            getSupportLoaderManager().b(54321, this);
            this.zzf.addOnCompleteListener(new zzp(this));
            return;
        }
        setContentView(R.layout.license_menu_activity_no_licenses);
    }

    @Override // defpackage.hm1
    @KeepForSdk
    public gm1 onCreateLoader(int i, Bundle bundle) {
        if (this.zzd) {
            return new zzn(this, zzd.zzb(this));
        }
        return null;
    }

    @Override // defpackage.ic, androidx.fragment.app.l, android.app.Activity
    @KeepForSdk
    public void onDestroy() {
        mm1 mm1Var = ((nm1) getSupportLoaderManager()).f3488b;
        if (!mm1Var.e) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                rx2 rx2Var = mm1Var.d;
                jm1 jm1Var = (jm1) rx2Var.d(54321, null);
                if (jm1Var != null) {
                    jm1Var.k();
                    int e = fl.e(rx2Var.d, 54321, rx2Var.f4232b);
                    if (e >= 0) {
                        Object[] objArr = rx2Var.c;
                        Object obj = objArr[e];
                        Object obj2 = rx2.e;
                        if (obj != obj2) {
                            objArr[e] = obj2;
                            rx2Var.f4231a = true;
                        }
                    }
                }
                super.onDestroy();
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // defpackage.hm1
    @KeepForSdk
    public void onLoaderReset(gm1 gm1Var) {
        this.zzc.clear();
        this.zzc.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    @KeepForSdk
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.hm1
    @KeepForSdk
    public void onLoadFinished(gm1 gm1Var, List<com.google.android.gms.internal.oss_licenses.zze> list) {
        this.zzc.clear();
        this.zzc.addAll(list);
        this.zzc.notifyDataSetChanged();
    }
}
