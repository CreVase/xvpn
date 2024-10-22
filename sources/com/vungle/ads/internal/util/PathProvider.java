package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import defpackage.ng0;
import defpackage.p71;
import defpackage.tf3;
import java.io.File;

/* loaded from: classes2.dex */
public final class PathProvider {
    public static final Companion Companion = new Companion(null);
    public static final String DOWNLOADS_FOLDER = "downloads";
    public static final String JS_FOLDER = "js";
    public static final String VUNGLE_FOLDER = "vungle";
    private final Context context;
    private final File downloadsDir;
    private final File jsDir;
    private final File vungleDir;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public PathProvider(Context context) {
        this.context = context;
        File file = new File(context.getApplicationInfo().dataDir, VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, DOWNLOADS_FOLDER);
        this.downloadsDir = file2;
        File file3 = new File(file, JS_FOLDER);
        this.jsDir = file3;
        for (File file4 : tf3.b0(file, file2, file3)) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(String str) {
        return new StatFs(str).getAvailableBytes();
    }

    public final Context getContext() {
        return this.context;
    }

    public final File getDownloadsDir$vungle_ads_release() {
        return this.downloadsDir;
    }

    public final File getDownloadsDirForAd(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        File file = new File(p71.m(this.downloadsDir.getPath(), File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getJsAssetDir(String str) {
        File file = new File(this.jsDir, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getJsDir() {
        return this.jsDir;
    }

    public final File getSharedPrefsDir() {
        return this.context.getNoBackupFilesDir();
    }

    public final File getVungleDir$vungle_ads_release() {
        return this.vungleDir;
    }
}
