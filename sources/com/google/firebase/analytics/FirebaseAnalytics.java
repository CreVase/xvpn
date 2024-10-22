package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.tasks.Tasks;
import defpackage.hx3;
import defpackage.px0;
import defpackage.wx0;
import defpackage.xx0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f1580b;

    /* renamed from: a, reason: collision with root package name */
    public final zzdf f1581a;

    public FirebaseAnalytics(zzdf zzdfVar) {
        Preconditions.checkNotNull(zzdfVar);
        this.f1581a = zzdfVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f1580b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f1580b == null) {
                    f1580b = new FirebaseAnalytics(zzdf.zza(context));
                }
            }
        }
        return f1580b;
    }

    @Keep
    public static zzjz getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdf zza = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new hx3(zza);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = wx0.m;
            px0 b2 = px0.b();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            b2.a();
            return (String) Tasks.await(((wx0) b2.d.a(xx0.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f1581a.zza(activity, str, str2);
    }
}
