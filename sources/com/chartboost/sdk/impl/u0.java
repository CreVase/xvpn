package com.chartboost.sdk.impl;

import android.util.Log;
import defpackage.ji1;
import defpackage.x31;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1167a = "v0";

    /* renamed from: b, reason: collision with root package name */
    public static final x31 f1168b = a.f1169a;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1169a = new a();

        public a() {
            super(1);
        }

        @Override // defpackage.x31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t8 invoke(q0 q0Var) {
            JSONObject jSONObject;
            String str = "{}";
            try {
                String string = q0Var.f().getString("config", "{}");
                if (string != null) {
                    str = string;
                }
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                Log.e(u0.f1167a, "Error reading config from shared preferences", e);
                jSONObject = new JSONObject();
            }
            return new t8(jSONObject);
        }
    }
}
