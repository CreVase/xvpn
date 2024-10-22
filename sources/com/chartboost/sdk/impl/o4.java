package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import defpackage.ji1;
import defpackage.kb3;
import defpackage.lb3;
import defpackage.x31;
import defpackage.yl3;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final /* synthetic */ class o4 {

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONArray f1041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONArray jSONArray) {
            super(1);
            this.f1041a = jSONArray;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        public final T a(int i) {
            return this.f1041a.get(i);
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final <T> Iterator<T> a(JSONArray jSONArray) {
        return new kb3(new lb3(new yl3(defpackage.t9.I0(0, jSONArray.length()), 1), new a(jSONArray)));
    }

    public static final o3 a(Context context) {
        String str;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        DisplayMetrics displayMetrics2 = (DisplayMetrics) p4.a().a(new DisplayMetrics());
        displayMetrics2.setTo(displayMetrics);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        }
        int i3 = displayMetrics2.widthPixels;
        int i4 = displayMetrics2.heightPixels;
        float f = displayMetrics2.density;
        String str2 = "" + displayMetrics2.densityDpi;
        Integer b2 = q3.b(context);
        String d = q3.d(context);
        String str3 = null;
        try {
            str = context.getPackageName();
        } catch (Exception e) {
            e = e;
            str = null;
        }
        try {
            str3 = context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Exception e2) {
            e = e2;
            f6.a("Request Body", "Exception raised getting package manager object", e);
            return new o3(i, i2, i3, i4, f, str2, b2.intValue(), d, str, str3, CBUtility.a(CBUtility.a(context)));
        }
        return new o3(i, i2, i3, i4, f, str2, b2.intValue(), d, str, str3, CBUtility.a(CBUtility.a(context)));
    }

    public static final i9 a(h9 h9Var) {
        return new i9(h9Var.a(), h9Var.b(), h9Var.c());
    }

    public static final z7 a(a2 a2Var) {
        return new z7(Integer.valueOf(a2Var.a()), Integer.valueOf(a2Var.c().b()), a2Var.b(), a2Var.f());
    }
}
