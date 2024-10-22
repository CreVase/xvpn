package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzg {
    private final Executor zza;

    public zzg(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzf... zzfVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                String str4 = str2;
                zzf[] zzfVarArr2 = zzfVarArr;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                jSONObject.toString();
                for (final zzf zzfVar : zzfVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzf.this.zzb(lowerCase, jSONObject));
                        }
                    });
                    zzfVar.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException unused2) {
                    } catch (ExecutionException e) {
                        e.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
