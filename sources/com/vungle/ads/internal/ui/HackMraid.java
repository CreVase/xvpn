package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.dx;
import defpackage.m20;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

/* loaded from: classes2.dex */
public final class HackMraid {
    public static final HackMraid INSTANCE = new HackMraid();

    private HackMraid() {
    }

    public final void apply(PathProvider pathProvider, PrintWriter printWriter) {
        BufferedReader bufferedReader;
        File file = new File(pathProvider.getJsAssetDir(ConfigManager.INSTANCE.getMraidJsVersion()), Constants.MRAID_JS_FILE_NAME);
        if (file.exists()) {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), dx.f1853a);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            printWriter.println(m20.N0(bufferedReader));
        }
    }
}
