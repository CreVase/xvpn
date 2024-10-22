package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class zzfme extends AsyncTask {
    private zzfmf zza;
    protected final zzflw zzd;

    public zzfme(zzflw zzflwVar) {
        this.zzd = zzflwVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfmf zzfmfVar = this.zza;
        if (zzfmfVar != null) {
            zzfmfVar.zza(this);
        }
    }

    public final void zzb(zzfmf zzfmfVar) {
        this.zza = zzfmfVar;
    }
}
