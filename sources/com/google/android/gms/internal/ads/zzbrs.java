package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbrs extends zzbry {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcgb zzk;
    private final Activity zzl;
    private zzchq zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbrz zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbrs(zzcgb zzcgbVar, zzbrz zzbrzVar) {
        super(zzcgbVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcgbVar;
        this.zzl = zzcgbVar.zzi();
        this.zzp = zzbrzVar;
    }

    public final void zza(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzag(this.zzm);
                }
                if (z) {
                    zzk("default");
                    zzbrz zzbrzVar = this.zzp;
                    if (zzbrzVar != null) {
                        zzbrzVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0260, code lost:            zzg("Resize location out of screen or close button is not visible.");     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0266, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0287 A[Catch: all -> 0x0484, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002f, B:18:0x0034, B:20:0x0036, B:22:0x003e, B:24:0x004c, B:25:0x005d, B:27:0x006b, B:28:0x007c, B:30:0x008a, B:31:0x009b, B:33:0x00a9, B:34:0x00ba, B:36:0x00c8, B:37:0x00d6, B:39:0x00e4, B:40:0x00e6, B:42:0x00ea, B:44:0x00ee, B:46:0x00f6, B:49:0x00fe, B:53:0x0126, B:59:0x0132, B:61:0x0260, B:62:0x0265, B:64:0x0267, B:66:0x0287, B:68:0x028b, B:70:0x0298, B:71:0x02d5, B:86:0x0390, B:87:0x03bf, B:89:0x03d7, B:90:0x03f8, B:92:0x0400, B:93:0x0407, B:94:0x042e, B:98:0x0431, B:100:0x0451, B:101:0x0466, B:103:0x0397, B:104:0x039e, B:105:0x03a5, B:106:0x03ac, B:107:0x03b2, B:108:0x03b9, B:125:0x02d2, B:126:0x0468, B:127:0x046d, B:129:0x0139, B:131:0x013d, B:142:0x0190, B:143:0x01e0, B:144:0x01eb, B:146:0x01ee, B:148:0x01f1, B:150:0x01f6, B:153:0x01fc, B:154:0x019b, B:155:0x01b1, B:156:0x01bc, B:157:0x01a6, B:158:0x01b4, B:159:0x01c1, B:160:0x01d5, B:161:0x01e3, B:178:0x0210, B:182:0x023e, B:185:0x024e, B:186:0x0244, B:188:0x024c, B:189:0x0234, B:191:0x023a, B:193:0x0253, B:194:0x0259, B:195:0x046f, B:196:0x0474, B:198:0x0476, B:199:0x047b, B:201:0x047d, B:202:0x0482), top: B:3:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrs.zzb(java.util.Map):void");
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzj) {
            if (this.zzq != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
