package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.facebook.ads.redexgen.X.Ks, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0504Ks {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(context).setTitle(IP.A0X(context)).setMessage(IP.A0V(context)).setPositiveButton(IP.A0W(context), new Kr(onClickListener)).setNegativeButton(IP.A0U(context), new Kq(onClickListener2));
            builder.show();
        }
    }
}
