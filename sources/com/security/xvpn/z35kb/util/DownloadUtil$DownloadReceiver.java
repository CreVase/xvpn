package com.security.xvpn.z35kb.util;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* loaded from: classes2.dex */
public class DownloadUtil$DownloadReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.equals(action, "android.intent.action.DOWNLOAD_COMPLETE")) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            DownloadManager downloadManager = (DownloadManager) context.getSystemService(NativeAdPresenter.DOWNLOAD);
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(longExtra);
            Cursor query2 = downloadManager.query(query);
            if (query2 != null && query2.moveToFirst() && query2.getInt(query2.getColumnIndex("status")) == 8) {
                Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(longExtra);
                Intent intent2 = new Intent("android.intent.action.INSTALL_PACKAGE");
                intent2.setFlags(268435456);
                intent2.addFlags(1);
                intent2.setDataAndType(uriForDownloadedFile, "application/vnd.android.package-archive");
                context.startActivity(intent2);
                return;
            }
            return;
        }
        TextUtils.equals(action, "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED");
    }
}
