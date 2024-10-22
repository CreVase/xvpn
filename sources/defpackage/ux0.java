package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.VungleError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ux0 {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final fb2 f4750b;
    public final oj2 c = new oj2();

    public ux0(Context context, fb2 fb2Var) {
        this.f4749a = context;
        this.f4750b = fb2Var;
    }

    public static URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new yx0(e2.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String p;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            if (TextUtils.isEmpty(str)) {
                p = "";
            } else {
                p = hx2.p(", ", str);
            }
            objArr[2] = p;
            String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
        }
    }

    public static long d(String str) {
        Preconditions.checkArgument(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static tl e(HttpURLConnection httpURLConnection) {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        long j = 0L;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        km kmVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str5 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str2 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        j = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (j == null) {
                    str = " tokenExpirationTimestamp";
                } else {
                    str = "";
                }
                if (str.isEmpty()) {
                    kmVar = new km(str2, j.longValue(), null);
                    jsonReader.endObject();
                } else {
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new tl(str3, str4, str5, kmVar, xc1.OK);
    }

    public static km f(HttpURLConnection httpURLConnection) {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        long j = 0L;
        jsonReader.beginObject();
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        n93 n93Var = n93.OK;
        if (j == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            return new km(str2, j.longValue(), n93Var);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final HttpURLConnection c(URL url, String str) {
        String str2;
        byte[] packageCertificateHashBytes;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(VungleError.DEFAULT);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(VungleError.DEFAULT);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f4749a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            t71 t71Var = (t71) this.f4750b.get();
            if (t71Var != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((nh0) t71Var).b()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            try {
                packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e2);
            }
            if (packageCertificateHashBytes == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                str2 = null;
                httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                httpURLConnection.addRequestProperty("x-goog-api-key", str);
                return httpURLConnection;
            }
            str2 = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
