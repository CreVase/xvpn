package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class as2 implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final Object f328a;

    public /* synthetic */ as2(mv0 mv0Var) {
        this.f328a = mv0Var;
    }

    public final vr2 a(JSONObject jSONObject) {
        bs2 s71Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            s71Var = new mp0(25);
        } else {
            s71Var = new s71(25);
        }
        return s71Var.g((mp0) this.f328a, jSONObject);
    }

    public final JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.f328a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(m20.c1(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        m20.U(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    m20.U(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                jSONObject = null;
            }
            m20.U(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            m20.U(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        at3 at3Var = (at3) this.f328a;
        y33 y33Var = (y33) at3Var.f;
        ds2 ds2Var = (ds2) at3Var.f338b;
        y33Var.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap w = y33.w(ds2Var);
            c02 c02Var = (c02) y33Var.c;
            String str = (String) y33Var.f5263b;
            c02Var.getClass();
            y33 y33Var2 = new y33(str, w);
            ((Map) y33Var2.d).put("User-Agent", "Crashlytics Android SDK/18.5.1");
            ((Map) y33Var2.d).put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            y33.j(y33Var2, ds2Var);
            ((d5) y33Var.d).getClass();
            d5 d5Var = (d5) y33Var.d;
            w.toString();
            d5Var.getClass();
            jSONObject = y33Var.y(y33Var2.q());
        } catch (IOException e) {
            ((d5) y33Var.d).getClass();
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            vr2 a2 = ((as2) at3Var.c).a(jSONObject);
            as2 as2Var = (as2) at3Var.e;
            long j = a2.c;
            as2Var.getClass();
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) as2Var.f328a);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e2) {
                    e = e2;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        m20.U(fileWriter, "Failed to close settings writer.");
                        jSONObject.toString();
                        String str2 = ((ds2) at3Var.f338b).f;
                        SharedPreferences.Editor edit = ((Context) at3Var.f337a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str2);
                        edit.apply();
                        ((AtomicReference) at3Var.h).set(a2);
                        ((TaskCompletionSource) ((AtomicReference) at3Var.i).get()).trySetResult(a2);
                        return Tasks.forResult(null);
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        fileWriter = fileWriter2;
                        m20.U(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m20.U(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                m20.U(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            m20.U(fileWriter, "Failed to close settings writer.");
            jSONObject.toString();
            String str22 = ((ds2) at3Var.f338b).f;
            SharedPreferences.Editor edit2 = ((Context) at3Var.f337a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str22);
            edit2.apply();
            ((AtomicReference) at3Var.h).set(a2);
            ((TaskCompletionSource) ((AtomicReference) at3Var.i).get()).trySetResult(a2);
        }
        return Tasks.forResult(null);
    }

    public as2(jx0 jx0Var) {
        this.f328a = new File((File) jx0Var.f2846b, "com.crashlytics.settings.json");
    }
}
