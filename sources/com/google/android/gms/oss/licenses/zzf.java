package com.google.android.gms.oss.licenses;

import com.google.android.gms.tasks.OnCompleteListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzf implements OnCompleteListener {
    final /* synthetic */ OssLicensesActivity zza;

    public zzf(OssLicensesActivity ossLicensesActivity) {
        this.zza = ossLicensesActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:            if (r6.isEmpty() != false) goto L17;     */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onComplete(com.google.android.gms.tasks.Task r6) {
        /*
            r5 = this;
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            boolean r6 = r6.isDestroyed()
            if (r6 != 0) goto Lf9
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            boolean r6 = r6.isFinishing()
            if (r6 == 0) goto L11
            return
        L11:
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            java.lang.String r6 = r6.getPackageName()
            com.google.android.gms.oss.licenses.OssLicensesActivity r0 = r5.zza
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzd(r0)
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto L2f
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzd(r6)
            java.lang.Object r6 = r6.getResult()
            java.lang.String r6 = (java.lang.String) r6
        L2f:
            com.google.android.gms.oss.licenses.OssLicensesActivity r0 = r5.zza
            com.google.android.gms.oss.licenses.zzc r6 = com.google.android.gms.oss.licenses.zzd.zza(r0, r6)
            r0.zza = r6
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            android.view.LayoutInflater r0 = r6.getLayoutInflater()
            com.google.android.gms.oss.licenses.OssLicensesActivity r1 = r5.zza
            com.google.android.gms.oss.licenses.zzc r1 = r1.zza
            android.content.res.Resources r2 = r1.zza
            java.lang.String r1 = r1.zzb
            java.lang.String r3 = "libraries_social_licenses_license_activity"
            java.lang.String r4 = "layout"
            int r1 = r2.getIdentifier(r3, r4, r1)
            android.content.res.XmlResourceParser r1 = r2.getXml(r1)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r6.setContentView(r0)
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            com.google.android.gms.oss.licenses.zzc r0 = r6.zza
            android.content.res.Resources r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r2 = "license_activity_scrollview"
            java.lang.String r3 = "id"
            int r0 = r1.getIdentifier(r2, r3, r0)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            com.google.android.gms.oss.licenses.OssLicensesActivity.zzi(r6, r0)
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            com.google.android.gms.oss.licenses.zzc r0 = r6.zza
            android.content.res.Resources r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r2 = "license_activity_textview"
            int r0 = r1.getIdentifier(r2, r3, r0)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.google.android.gms.oss.licenses.OssLicensesActivity.zzj(r6, r0)
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.oss.licenses.OssLicensesActivity.zze(r6)
            boolean r6 = r6.isSuccessful()
            if (r6 == 0) goto La5
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zze(r6)
            java.lang.Object r0 = r0.getResult()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.oss.licenses.OssLicensesActivity.zzh(r6, r0)
        La5:
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            java.lang.String r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzg(r6)
            if (r0 == 0) goto Lb7
            java.lang.String r6 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzg(r6)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Lc6
        Lb7:
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            com.google.android.gms.internal.oss_licenses.zze r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzf(r6)
            int r1 = com.google.android.gms.oss.licenses.R.raw.keep_third_party_licenses
            java.lang.String r0 = com.google.android.gms.internal.oss_licenses.zzf.zza(r6, r0, r1)
            com.google.android.gms.oss.licenses.OssLicensesActivity.zzh(r6, r0)
        Lc6:
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            java.lang.String r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzg(r6)
            if (r0 != 0) goto Ld7
            int r0 = com.google.android.gms.oss.licenses.R.string.license_content_error
            java.lang.String r0 = r6.getString(r0)
            com.google.android.gms.oss.licenses.OssLicensesActivity.zzh(r6, r0)
        Ld7:
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            android.widget.TextView r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzc(r6)
            java.lang.String r6 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzg(r6)
            r0.setText(r6)
            com.google.android.gms.oss.licenses.OssLicensesActivity r6 = r5.zza
            int r0 = com.google.android.gms.oss.licenses.OssLicensesActivity.zza(r6)
            if (r0 != 0) goto Led
            return
        Led:
            android.widget.ScrollView r6 = com.google.android.gms.oss.licenses.OssLicensesActivity.zzb(r6)
            com.google.android.gms.oss.licenses.zze r0 = new com.google.android.gms.oss.licenses.zze
            r0.<init>(r5)
            r6.post(r0)
        Lf9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.oss.licenses.zzf.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
