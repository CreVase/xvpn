package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcc implements zzf {
    private final Application zza;
    private final zzby zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzg zze;
    private final zzaq zzf;
    private final zzbe zzg;
    private final zzas zzh;

    public zzcc(Application application, zzby zzbyVar, Handler handler, Executor executor, zzg zzgVar, zzaq zzaqVar, zzbe zzbeVar, zzas zzasVar) {
        this.zza = application;
        this.zzb = zzbyVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzgVar;
        this.zzf = zzaqVar;
        this.zzg = zzbeVar;
        this.zzh = zzasVar;
    }

    private final void zzf(JSONObject jSONObject) {
        String optString = jSONObject.optString(ImagesContract.URL);
        TextUtils.isEmpty(optString);
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            "Action[browser]: empty scheme: ".concat(String.valueOf(optString));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException unused) {
            "Action[browser]: can not open url: ".concat(String.valueOf(optString));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzf
    public final Executor zza() {
        final Handler handler = this.zzc;
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzca
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzf
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return false;
                    }
                    this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcb
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcc.this.zzc();
                        }
                    });
                    return true;
                }
                zzf(jSONObject);
                return true;
            }
            String optString = jSONObject.optString("status");
            switch (optString.hashCode()) {
                case -954325659:
                    if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString.equals("personalized")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString.equals("non_personalized")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            if (c2 != 0 && c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4) {
                this.zzg.zzd(new zzi(1, "We are getting something wrong with the webview."));
            } else {
                this.zzg.zzc(3);
            }
            return true;
        }
        this.zzg.zze();
        return true;
    }

    public final /* synthetic */ void zzc() {
        String concat;
        Application application = this.zza;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            jSONObject.put("stored_infos_map", this.zzh.zzc());
        } catch (JSONException unused) {
        }
        this.zzg.zza().zzc("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    public final void zzd(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    public final void zze(int i, String str, String str2) {
        this.zzg.zzf(new zzi(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }
}
