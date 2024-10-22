package defpackage;

import android.util.Log;
import com.google.ads.mediation.vungle.VungleConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class iw1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f2659b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final jx0 f2660a;

    public iw1(jx0 jx0Var) {
        this.f2660a = jx0Var;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public final Map b(String str, boolean z) {
        File o;
        FileInputStream fileInputStream;
        jx0 jx0Var = this.f2660a;
        if (z) {
            o = jx0Var.o(str, "internal-keys");
        } else {
            o = jx0Var.o(str, "keys");
        }
        if (o.exists() && o.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(o);
                    try {
                        HashMap a2 = a(m20.c1(fileInputStream));
                        m20.U(fileInputStream, "Failed to close user metadata file.");
                        return a2;
                    } catch (Exception unused) {
                        fileInputStream2 = fileInputStream;
                        d(o);
                        m20.U(fileInputStream2, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    } catch (Throwable th) {
                        th = th;
                        m20.U(fileInputStream, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            } catch (Exception unused2) {
            }
        } else {
            d(o);
            return Collections.emptyMap();
        }
    }

    public final String c(String str) {
        FileInputStream fileInputStream;
        File o = this.f2660a.o(str, "user-data");
        FileInputStream fileInputStream2 = null;
        String str2 = null;
        if (o.exists() && o.length() != 0) {
            try {
                fileInputStream = new FileInputStream(o);
            } catch (Exception unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                m20.U(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    JSONObject jSONObject = new JSONObject(m20.c1(fileInputStream));
                    if (!jSONObject.isNull(VungleConstants.KEY_USER_ID)) {
                        str2 = jSONObject.optString(VungleConstants.KEY_USER_ID, null);
                    }
                    m20.U(fileInputStream, "Failed to close user metadata file.");
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    m20.U(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception unused2) {
                d(o);
                m20.U(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        d(o);
        return null;
    }

    public final void e(String str, Map map, boolean z) {
        File o;
        BufferedWriter bufferedWriter;
        jx0 jx0Var = this.f2660a;
        if (z) {
            o = jx0Var.o(str, "internal-keys");
        } else {
            o = jx0Var.o(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(o), f2659b));
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                    m20.U(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception unused) {
                    bufferedWriter2 = bufferedWriter;
                    d(o);
                    m20.U(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    m20.U(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
            }
        } catch (Exception unused2) {
        }
    }

    public final void f(String str, String str2) {
        File o = this.f2660a.o(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            String obj = new hw1(str2).toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(o), f2659b));
            try {
                bufferedWriter2.write(obj);
                bufferedWriter2.flush();
                m20.U(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception unused) {
                bufferedWriter = bufferedWriter2;
                m20.U(bufferedWriter, "Failed to close user metadata file.");
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                m20.U(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
