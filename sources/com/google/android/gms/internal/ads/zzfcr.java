package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfcr {
    public final String zzA;
    public final String zzB;
    public final zzbxr zzC;
    public final String zzD;
    public final JSONObject zzE;
    public final JSONObject zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final String zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final int zzS;
    public final int zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final String zzW;
    public final zzfdq zzX;
    public final boolean zzY;
    public final boolean zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final int zzac;
    public final String zzad;
    public final boolean zzae;
    public final zzbtb zzaf;
    public final com.google.android.gms.ads.internal.client.zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final String zzaq;
    public final String zzar;
    public final boolean zzas;
    public final int zzat;
    public final String zzau;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final List zzk;
    public final String zzl;
    public final String zzm;
    public final zzbwi zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final List zzr;
    public final int zzs;
    public final List zzt;
    public final zzfcx zzu;
    public final List zzv;
    public final List zzw;
    public final JSONObject zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x062e. Please report as an issue. */
    public zzfcr(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        String str;
        List list;
        List list2;
        char c;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfvs zzl = zzfvs.zzl();
        zzfvs zzl2 = zzfvs.zzl();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        List list3 = zzl;
        List list4 = zzl2;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        zzfcx zzfcxVar = null;
        zzbxr zzbxrVar = null;
        zzbtb zzbtbVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str20 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = -1;
        int i3 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i4 = 0;
        int i5 = -1;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i6 = 0;
        List list5 = emptyList11;
        List list6 = emptyList12;
        List list7 = emptyList13;
        List list8 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        String str21 = str19;
        String str22 = str21;
        zzbwi zzbwiVar = null;
        int i7 = 0;
        int i8 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName == null) {
                str = "";
            } else {
                str = nextName;
            }
            switch (str.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_name")) {
                        c = '<';
                        break;
                    }
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_signals")) {
                        c = 29;
                        break;
                    }
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("omid_settings")) {
                        c = '*';
                        break;
                    }
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("recursive_server_response_data")) {
                        c = 'F';
                        break;
                    }
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_consent")) {
                        c = 'G';
                        break;
                    }
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("play_prewarm_options")) {
                        c = '2';
                        break;
                    }
                    break;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("parallel_key")) {
                        c = 'I';
                        break;
                    }
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_name")) {
                        c = ':';
                        break;
                    }
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_interscroller")) {
                        c = '6';
                        break;
                    }
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("backend_query_id")) {
                        c = '0';
                        break;
                    }
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("nofill_urls")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_custom_close_blocked")) {
                        c = '$';
                        break;
                    }
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("orientation")) {
                        c = '&';
                        break;
                    }
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("enable_omid")) {
                        c = '(';
                        break;
                    }
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'D';
                        break;
                    }
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("showable_impression_type")) {
                        c = '-';
                        break;
                    }
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_cover")) {
                        c = '7';
                        break;
                    }
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_sizes")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapters")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("test_mode_enabled")) {
                        c = '#';
                        break;
                    }
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("extras")) {
                        c = 30;
                        break;
                    }
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_event_value")) {
                        c = '4';
                        break;
                    }
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        c = 31;
                        break;
                    }
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_urls")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_scroll_aware")) {
                        c = ',';
                        break;
                    }
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allocation_id")) {
                        c = 22;
                        break;
                    }
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("active_view")) {
                        c = 26;
                        break;
                    }
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_id")) {
                        c = '=';
                        break;
                    }
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    break;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("late_load_urls")) {
                        c = 5;
                        break;
                    }
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("safe_browsing")) {
                        c = 27;
                        break;
                    }
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rtb_native_required_assets")) {
                        c = '?';
                        break;
                    }
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_timeout_ms")) {
                        c = '\'';
                        break;
                    }
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_close_time_ms")) {
                        c = '.';
                        break;
                    }
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("content_url")) {
                        c = 'A';
                        break;
                    }
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_close_button_enabled")) {
                        c = '3';
                        break;
                    }
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        c = 'B';
                        break;
                    }
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("watermark")) {
                        c = '/';
                        break;
                    }
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("native_required_asset_viewability")) {
                        c = '@';
                        break;
                    }
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_offline_ad")) {
                        c = '>';
                        break;
                    }
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_custom_click_gesture")) {
                        c = '!';
                        break;
                    }
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad")) {
                        c = 19;
                        break;
                    }
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(FacebookMediationAdapter.KEY_ID)) {
                        c = 24;
                        break;
                    }
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("data")) {
                        c = 23;
                        break;
                    }
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("request_id")) {
                        c = 'E';
                        break;
                    }
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_test_label")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("qdata")) {
                        c = 25;
                        break;
                    }
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_closable_area_disabled")) {
                        c = '%';
                        break;
                    }
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("consent_form_action_identifier")) {
                        c = 'H';
                        break;
                    }
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_timeout_ms")) {
                        c = 17;
                        break;
                    }
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_dialog_string")) {
                        c = 28;
                        break;
                    }
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("container_sizes")) {
                        c = 18;
                        break;
                    }
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("impression_type")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("transaction_id")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapter_response_info_key")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("cache_hit_urls")) {
                        c = 'C';
                        break;
                    }
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_id")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("bid_response")) {
                        c = ')';
                        break;
                    }
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_start_urls")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_network_class_name")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("use_third_party_container_height")) {
                        c = '1';
                        break;
                    }
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_analytics_logging_enabled")) {
                        c = '+';
                        break;
                    }
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rule_line_external_id")) {
                        c = '5';
                        break;
                    }
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str.equals("manual_tracking_urls")) {
                        c = 16;
                        break;
                    }
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 1:
                    i7 = zzb(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 5:
                    list4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 6:
                    i8 = zzc(jsonReader.nextInt());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 7:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\b':
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\t':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\n':
                    str22 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 11:
                    str21 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\f':
                    zzbwiVar = zzbwi.zza(com.google.android.gms.ads.internal.util.zzbw.zze(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\r':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 14:
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    break;
                case 15:
                    emptyList10 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case 16:
                    list5 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 17:
                    i = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 18:
                    list6 = zzfcs.zza(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 19:
                    zzfcxVar = new zzfcx(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 20:
                    list8 = zzfcs.zza(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 21:
                    list7 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 22:
                    str2 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 23:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 24:
                    str3 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 25:
                    str4 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 26:
                    str5 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader).toString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 27:
                    zzbxrVar = zzbxr.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 28:
                    str6 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 29:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 30:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 31:
                    z = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ' ':
                    z2 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '!':
                    z3 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\"':
                    z4 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '#':
                    z5 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '$':
                    z6 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '%':
                    z7 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '&':
                    i2 = zzd(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\'':
                    i3 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '(':
                    z8 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ')':
                    str7 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '*':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '+':
                    z9 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ',':
                    z10 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '-':
                    i4 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '.':
                    i5 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '/':
                    str8 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '0':
                    str9 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '1':
                    z11 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '2':
                    zzbtbVar = zzbtb.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '3':
                    jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '4':
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '5':
                    str10 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '6':
                    z12 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '7':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '8':
                    str11 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '9':
                    str18 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ':':
                    if (((Boolean) zzbci.zzgK.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList10 = list2;
                        emptyList9 = list;
                    }
                case ';':
                    if (((Boolean) zzbci.zzgK.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList10 = list2;
                        emptyList9 = list;
                    }
                case '<':
                    if (((Boolean) zzbci.zzgK.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList10 = list2;
                        emptyList9 = list;
                    }
                case '=':
                    if (((Boolean) zzbci.zzgK.zzl()).booleanValue()) {
                        str15 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList10 = list2;
                        emptyList9 = list;
                    }
                case '>':
                    z13 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '?':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '@':
                    z14 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'A':
                    str20 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'B':
                    z15 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'C':
                    list3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'D':
                    z16 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'E':
                    str16 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'F':
                    str17 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'G':
                    z17 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'H':
                    i6 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'I':
                    str19 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i7;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i8;
        this.zzi = emptyList5;
        this.zzj = emptyList6;
        this.zzk = emptyList7;
        this.zzl = str22;
        this.zzm = str21;
        this.zzn = zzbwiVar;
        this.zzo = emptyList8;
        this.zzp = emptyList9;
        this.zzq = emptyList10;
        this.zzr = list5;
        this.zzs = i;
        this.zzt = list6;
        this.zzu = zzfcxVar;
        this.zzv = list7;
        this.zzw = list8;
        this.zzy = str2;
        this.zzx = jSONObject12;
        this.zzz = str3;
        this.zzA = str4;
        this.zzB = str5;
        this.zzC = zzbxrVar;
        this.zzD = str6;
        this.zzE = jSONObject7;
        this.zzF = jSONObject8;
        this.zzL = z;
        this.zzM = z2;
        this.zzN = z3;
        this.zzO = z4;
        this.zzP = z5;
        this.zzQ = z6;
        this.zzR = z7;
        this.zzS = i2;
        this.zzT = i3;
        this.zzV = z8;
        this.zzW = str7;
        this.zzX = new zzfdq(jSONObject9);
        this.zzY = z9;
        this.zzZ = z10;
        this.zzaa = i4;
        this.zzab = str8;
        this.zzac = i5;
        this.zzad = str9;
        this.zzae = z11;
        this.zzaf = zzbtbVar;
        this.zzag = zzsVar;
        this.zzah = str10;
        this.zzai = z12;
        this.zzaj = jSONObject10;
        this.zzG = str11;
        this.zzH = str12;
        this.zzI = str13;
        this.zzJ = str14;
        this.zzK = str15;
        this.zzak = z13;
        this.zzal = jSONObject11;
        this.zzam = z14;
        this.zzan = str20;
        this.zzao = z15;
        this.zze = list3;
        this.zzU = z16;
        this.zzap = str16;
        this.zzaq = str17;
        this.zzar = str18;
        this.zzas = z17;
        this.zzat = i6;
        this.zzh = list4;
        this.zzau = str19;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        if ("rewarded_interstitial".equals(str)) {
            return 7;
        }
        return 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            return 7;
        }
        return -1;
    }
}
