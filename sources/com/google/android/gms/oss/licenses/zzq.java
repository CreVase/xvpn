package com.google.android.gms.oss.licenses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
final class zzq extends ArrayAdapter {
    final /* synthetic */ OssLicensesMenuActivity zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzq(com.google.android.gms.oss.licenses.OssLicensesMenuActivity r3, android.content.Context r4) {
        /*
            r2 = this;
            r2.zza = r3
            com.google.android.gms.oss.licenses.zzc r0 = com.google.android.gms.oss.licenses.OssLicensesMenuActivity.zzc(r3)
            int r0 = com.google.android.gms.oss.licenses.zzd.zzd(r0)
            com.google.android.gms.oss.licenses.zzc r3 = com.google.android.gms.oss.licenses.OssLicensesMenuActivity.zzc(r3)
            int r3 = com.google.android.gms.oss.licenses.zzd.zze(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.<init>(r4, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.oss.licenses.zzq.<init>(com.google.android.gms.oss.licenses.OssLicensesMenuActivity, android.content.Context):void");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        zzc zzcVar;
        zzc zzcVar2;
        if (view == null) {
            LayoutInflater layoutInflater = this.zza.getLayoutInflater();
            zzcVar2 = this.zza.zze;
            view = layoutInflater.inflate((XmlPullParser) zzcVar2.zza.getXml(zzd.zzd(zzcVar2)), viewGroup, false);
        }
        zzcVar = this.zza.zze;
        ((TextView) view.findViewById(zzd.zze(zzcVar))).setText(((com.google.android.gms.internal.oss_licenses.zze) getItem(i)).zzd());
        return view;
    }
}
