package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcgt implements Runnable {
    final /* synthetic */ zzcgu zza;

    public zzcgt(zzcgu zzcguVar) {
        this.zza = zzcguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
