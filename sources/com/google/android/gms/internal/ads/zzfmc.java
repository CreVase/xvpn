package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfmc implements zzflc {
    private static final zzfmc zza = new zzfmc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfly();
    private static final Runnable zze = new zzflz();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzflv zzk = new zzflv();
    private final zzfle zzj = new zzfle();
    private final zzflw zzl = new zzflw(new zzfmf());

    public static zzfmc zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfmc zzfmcVar) {
        zzfmcVar.zzg = 0;
        zzfmcVar.zzi.clear();
        zzfmcVar.zzh = false;
        for (zzfkg zzfkgVar : zzfku.zza().zzb()) {
        }
        zzfmcVar.zzm = System.nanoTime();
        zzfmcVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfld zza2 = zzfmcVar.zzj.zza();
        if (zzfmcVar.zzk.zze().size() > 0) {
            Iterator it = zzfmcVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfmcVar.zzk.zza(str);
                zzfld zzb2 = zzfmcVar.zzj.zzb();
                String zzc2 = zzfmcVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfln.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzflo.zza("Error with setting not visible reason", e);
                    }
                    zzfln.zzc(zza3, zza5);
                }
                zzfln.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmcVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfmcVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfmcVar.zzk(null, zza2, zza6, 1, false);
            zzfln.zzf(zza6);
            zzfmcVar.zzl.zzd(zza6, zzfmcVar.zzk.zzf(), nanoTime);
        } else {
            zzfmcVar.zzl.zzb();
        }
        zzfmcVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfmcVar.zzm;
        if (zzfmcVar.zzf.size() > 0) {
            for (zzfmb zzfmbVar : zzfmcVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfmbVar.zzb();
                if (zzfmbVar instanceof zzfma) {
                    ((zzfma) zzfmbVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfld zzfldVar, JSONObject jSONObject, int i, boolean z) {
        boolean z2;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzfldVar.zzb(view, jSONObject, this, z2, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflc
    public final void zza(View view, zzfld zzfldVar, JSONObject jSONObject, boolean z) {
        int zzk;
        boolean z2;
        boolean z3;
        if (zzflt.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfldVar.zza(view);
        zzfln.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfln.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzflo.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzflu zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfkx zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzb3.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e2) {
                    zzflo.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            zzk(view, zzfldVar, zza2, zzk, z3);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzflx(this));
    }
}
