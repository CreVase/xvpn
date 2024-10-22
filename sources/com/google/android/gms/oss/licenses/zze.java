package com.google.android.gms.oss.licenses;

import android.text.Layout;
import android.widget.ScrollView;
import android.widget.TextView;

/* loaded from: classes2.dex */
final class zze implements Runnable {
    final /* synthetic */ zzf zza;

    public zze(zzf zzfVar) {
        this.zza = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        int i;
        TextView textView2;
        ScrollView scrollView;
        textView = this.zza.zza.zze;
        Layout layout = textView.getLayout();
        i = this.zza.zza.zzf;
        int lineForOffset = layout.getLineForOffset(i);
        textView2 = this.zza.zza.zze;
        int lineTop = textView2.getLayout().getLineTop(lineForOffset);
        scrollView = this.zza.zza.zzd;
        scrollView.scrollTo(0, lineTop);
    }
}
