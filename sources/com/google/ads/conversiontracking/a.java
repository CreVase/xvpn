package com.google.ads.conversiontracking;

import android.content.Context;
import com.google.ads.conversiontracking.i;
import defpackage.ju3;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ju3 f1379a;

    public a(Context context) {
        this.f1379a = new ju3(context);
    }

    public i.a a() {
        try {
            return i.a(this.f1379a);
        } catch (j | k | IOException | IllegalStateException unused) {
            return null;
        }
    }
}
