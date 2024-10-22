package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.vungle.ads.internal.util.FileUtility;
import defpackage.g53;
import defpackage.ng0;
import defpackage.pe0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class OMInjector {
    public static final Companion Companion = new Companion(null);
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private final AtomicReference<Context> contextRef;
    private final Handler uiHandler = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public OMInjector(Context context) {
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    /* renamed from: init$lambda-0 */
    public static final void m77init$lambda0(OMInjector oMInjector) {
        try {
            if (!pe0.m.f4027a) {
                pe0.f(oMInjector.contextRef.get());
            }
        } catch (NoClassDefFoundError e) {
            Log.e("OMSDK", "error: " + e.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws IOException {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            FileUtility.INSTANCE.closeQuietly(fileWriter);
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            FileUtility.INSTANCE.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public final void init() {
        this.uiHandler.post(new g53(this, 11));
    }

    public final List<File> injectJsFiles(File file) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(writeToFile(Res.OM_JS, new File(file, OM_SDK_JS)));
        arrayList.add(writeToFile(Res.OM_SESSION_JS, new File(file, OM_SESSION_JS)));
        return arrayList;
    }
}
