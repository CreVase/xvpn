package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzflf implements zzfld {
    private final zzfld zza;

    public zzflf(zzfld zzfldVar) {
        this.zza = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final JSONObject zza(View view) {
        boolean z = false;
        JSONObject zza = zzfln.zza(0, 0, 0, 0);
        int zzb = zzflq.zzb();
        int i = zzb - 1;
        if (zzb != 0) {
            if (i == 0) {
                z = true;
            }
            try {
                zza.put("noOutputDevice", z);
            } catch (JSONException e) {
                zzflo.zza("Error with setting output device status", e);
            }
            return zza;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final void zzb(View view, JSONObject jSONObject, zzflc zzflcVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfku zza = zzfku.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzfkg) it.next()).zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                Object parent = view2.getParent();
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                } else {
                                    view2 = null;
                                }
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzflt.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzflt.zza((View) arrayList.get(i)) <= zza2) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzflcVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
