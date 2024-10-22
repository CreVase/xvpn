package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzcas {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzcas() {
        this(null);
    }

    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzcat.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static synchronized void zzm(String str) {
        synchronized (zzcas.class) {
            zzcat.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                zzcat.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            zzcat.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String str, zzcar zzcarVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzcarVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzcat.zzh("unable to log", e);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(final String str) {
        zzn("onNetworkRequestError", new zzcar() { // from class: com.google.android.gms.internal.ads.zzcap
            @Override // com.google.android.gms.internal.ads.zzcar
            public final void zza(JsonWriter jsonWriter) {
                int i = zzcas.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final String str, final String str2, final Map map, final byte[] bArr) {
        zzn("onNetworkRequest", new zzcar() { // from class: com.google.android.gms.internal.ads.zzcan
            @Override // com.google.android.gms.internal.ads.zzcar
            public final void zza(JsonWriter jsonWriter) {
                zzcas.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzq(final Map map, final int i) {
        zzn("onNetworkResponse", new zzcar() { // from class: com.google.android.gms.internal.ads.zzcaq
            @Override // com.google.android.gms.internal.ads.zzcar
            public final void zza(JsonWriter jsonWriter) {
                zzcas.zzb(i, map, jsonWriter);
            }
        });
    }

    private static void zzr(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzcat.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (!zzk()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (!zzk()) {
            return;
        }
        zzp(str, "GET", map, bArr);
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (!zzk()) {
            return;
        }
        String str = null;
        if (httpURLConnection.getHeaderFields() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getHeaderFields());
        }
        zzq(hashMap, i);
        if (i >= 200 && i < 300) {
            return;
        }
        try {
            str = httpURLConnection.getResponseMessage();
        } catch (IOException e) {
            zzcat.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
        }
        zzo(str);
    }

    public final void zzf(Map map, int i) {
        if (!zzk()) {
            return;
        }
        zzq(map, i);
        if (i >= 200 && i < 300) {
            return;
        }
        zzo(null);
    }

    public final void zzg(String str) {
        if (!zzk() || str == null) {
            return;
        }
        zzh(str.getBytes());
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new zzcar() { // from class: com.google.android.gms.internal.ads.zzcao
            @Override // com.google.android.gms.internal.ads.zzcar
            public final void zza(JsonWriter jsonWriter) {
                int i = zzcas.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String zze2 = zzcam.zze(encode);
                    if (zze2 != null) {
                        jsonWriter.name("bodydigest").value(zze2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzcas(String str) {
        List asList;
        if (!zzk()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.zzg = asList;
    }
}
