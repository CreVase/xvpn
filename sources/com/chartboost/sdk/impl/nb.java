package com.chartboost.sdk.impl;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class nb extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    public a f1022a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1023b;

    /* loaded from: classes.dex */
    public interface a {
        void a(nb nbVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public nb(b bVar) {
        this.f1023b = bVar;
    }

    public void a(a aVar) {
        this.f1022a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f1022a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
