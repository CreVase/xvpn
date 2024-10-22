package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfcv {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfct zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final String zzo;
    public final int zzp;

    public zzfcv(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        zzfct zzfctVar = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        long j = 0;
        int i3 = 1;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str8 = str6;
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzib)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfctVar = new zzfct(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjC)).booleanValue() && zzfcu.zza(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str6 = jsonReader.nextString();
                        jSONObject = jSONObject2;
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgM)).booleanValue()) {
                            try {
                                Bundle zza = com.google.android.gms.ads.internal.util.zzbw.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                                if (zza != null) {
                                    bundle = zza;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziY)).booleanValue()) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziY)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbca zzbcaVar = zzbci.zziZ;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue() && zzfcu.zza(nextName, "adResponseBody")) {
                            str5 = jsonReader.nextString();
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue() && zzfcu.zza(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                        } else {
                            if (zzfcu.zza(nextName, "max_parallel_renderers")) {
                                i3 = Math.max(1, jsonReader.nextInt());
                            } else {
                                jsonReader.skipValue();
                            }
                            str6 = str8;
                            jSONObject = jSONObject2;
                        }
                    }
                    str6 = str8;
                    jSONObject = jSONObject2;
                }
                str6 = str8;
                jSONObject = jSONObject2;
            }
            str6 = str8;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i;
        this.zzb = str;
        this.zzd = str2;
        this.zze = i2;
        this.zzf = j;
        this.zzi = zzfctVar;
        this.zzg = z;
        this.zzh = str7;
        this.zzj = bundle;
        this.zzk = str3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = jSONObject;
        this.zzo = str6;
        zzbdn zzbdnVar = zzbeg.zza;
        this.zzp = ((Long) zzbdnVar.zze()).longValue() > 0 ? ((Long) zzbdnVar.zze()).intValue() : i3;
    }
}
