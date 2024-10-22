package com.chartboost.sdk.impl;

import com.vungle.ads.internal.util.PathProvider;
import java.io.File;

/* loaded from: classes.dex */
public class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final File f1125a;

    /* renamed from: b, reason: collision with root package name */
    public final File f1126b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    public final File g;
    public final File h;
    public final File i;

    public s4(File file) {
        File file2 = new File(file, ".chartboost");
        this.f1125a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f1126b = a(file2, "css");
        this.c = a(file2, "html");
        this.d = a(file2, "images");
        this.e = a(file2, PathProvider.JS_FOLDER);
        this.f = a(file2, "templates");
        this.g = a(file2, "videos");
        this.h = a(file2, "precache");
        this.i = a(file2, "precache_queue");
    }

    public File a() {
        return this.f1125a;
    }

    public static File a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
