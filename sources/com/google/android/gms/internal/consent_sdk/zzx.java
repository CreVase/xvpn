package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.vungle.ads.VungleError;
import defpackage.m60;
import defpackage.p60;
import defpackage.q60;
import defpackage.r60;
import defpackage.s60;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzx {
    private final Application zza;
    private final zzae zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzas zze;
    private final zzbq zzf;
    private final zzn zzg;
    private final zzaa zzh;
    private final zzg zzi;

    public zzx(Application application, zzae zzaeVar, Handler handler, Executor executor, zzas zzasVar, zzbq zzbqVar, zzn zznVar, zzaa zzaaVar, zzg zzgVar) {
        this.zza = application;
        this.zzb = zzaeVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzasVar;
        this.zzf = zzbqVar;
        this.zzg = zznVar;
        this.zzh = zzaaVar;
        this.zzi = zzgVar;
    }

    private final zzcm zzd(zzck zzckVar) throws zzi {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(VungleError.DEFAULT);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzckVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = zzckVar.zzb;
                    if (str2 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str2);
                    }
                    zzcg zzcgVar = zzckVar.zzc;
                    if (zzcgVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzcgVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    jsonWriter.value("ANDROID");
                                }
                            } else {
                                jsonWriter.value("UNKNOWN");
                            }
                        }
                        String str3 = zzcgVar.zza;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = zzcgVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = zzckVar.zzd;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = zzckVar.zze;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzckVar.zzf;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzci zzciVar = zzckVar.zzg;
                    if (zzciVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzciVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzciVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = zzciVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzch> list = zzciVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzch zzchVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzchVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzchVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzchVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzchVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzce zzceVar = zzckVar.zzh;
                    if (zzceVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = zzceVar.zza;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzceVar.zzb;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzceVar.zzc;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    zzcj zzcjVar = zzckVar.zzi;
                    if (zzcjVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = zzcjVar.zza;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzckVar.zzj;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int ordinal = ((zzcf) it.next()).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal != 3) {
                                            if (ordinal == 4) {
                                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                            }
                                        } else {
                                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                        }
                                    } else {
                                        jsonWriter.value("GEO_OVERRIDE_EEA");
                                    }
                                } else {
                                    jsonWriter.value("ALWAYS_SHOW");
                                }
                            } else {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                        if (headerField != null) {
                            zzcm zza = zzcm.zza(new JsonReader(new StringReader(headerField)));
                            zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                            return zza;
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        try {
                            bufferedReader.readLine();
                            JsonReader jsonReader = new JsonReader(bufferedReader);
                            try {
                                zzcm zza2 = zzcm.zza(jsonReader);
                                jsonReader.close();
                                bufferedReader.close();
                                return zza2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                    throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new zzi(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzi(2, "Error making request.", e2);
        }
    }

    public final /* synthetic */ void zza(final q60 q60Var, zzac zzacVar) {
        Handler handler = this.zzc;
        q60Var.getClass();
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                q60.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzacVar.zzb != r60.NOT_REQUIRED) {
            this.zzf.zzc();
        }
    }

    public final void zzb(Activity activity, s60 s60Var, final q60 q60Var, final p60 p60Var) {
        try {
            m60 m60Var = s60Var.c;
            if (m60Var == null || !m60Var.f3240a) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcn.zza(this.zza) + "\") to set this as a debug device.");
            }
            final zzac zza = new zzz(this.zzh, zzd(this.zzg.zzd(activity, s60Var))).zza();
            this.zze.zzg(zza.zza);
            this.zze.zzh(zza.zzb);
            this.zzf.zzd(zza.zzc);
            this.zzi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    zzx.this.zza(q60Var, zza);
                }
            });
        } catch (zzi e) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    p60.this.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (RuntimeException e2) {
            final zzi zziVar = new zzi(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
                @Override // java.lang.Runnable
                public final void run() {
                    p60.this.onConsentInfoUpdateFailure(zziVar.zza());
                }
            });
        }
    }

    public final void zzc(final Activity activity, final s60 s60Var, final q60 q60Var, final p60 p60Var) {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzx.this.zzb(activity, s60Var, q60Var, p60Var);
            }
        });
    }
}
