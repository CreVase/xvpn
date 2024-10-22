package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class CleanupJob implements Job {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final PathProvider pathProvider;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ JobInfo makeJobInfo$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.makeJobInfo(str);
        }

        public final JobInfo makeJobInfo(String str) {
            boolean z = false;
            JobInfo priority = new JobInfo(CleanupJob.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(CleanupJob.AD_ID_KEY, str);
            }
            JobInfo extras = priority.setExtras(bundle);
            if (str == null) {
                z = true;
            }
            return extras.setUpdateCurrent(z);
        }
    }

    public CleanupJob(Context context, PathProvider pathProvider) {
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void dropOldFilesData() {
        int i = Build.VERSION.SDK_INT;
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            FileUtility.delete(file);
            FileUtility.delete(new File(p71.l(file.getPath(), "-journal")));
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String string = sharedPreferences.getString("cache_path", null);
        if (i >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            sharedPreferences.edit().clear().apply();
        }
        FileUtility.delete(new File(this.context.getNoBackupFilesDir(), "vungle_settings"));
        if (string != null) {
            FileUtility.delete(new File(string));
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        File file;
        File downloadsDir$vungle_ads_release = this.pathProvider.getDownloadsDir$vungle_ads_release();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (file = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            file = downloadsDir$vungle_ads_release;
        }
        try {
            if (m20.L(file, downloadsDir$vungle_ads_release)) {
                dropOldFilesData();
                FileUtility.deleteContents(file);
                return 0;
            }
            FileUtility.delete(file);
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
