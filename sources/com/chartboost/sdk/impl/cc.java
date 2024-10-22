package com.chartboost.sdk.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    public static i7 f744a = i7.UNKNOWN;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            i7 i7Var;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    i7Var = i7.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    i7Var = i7.UNKNOWN;
                }
                i7 unused = cc.f744a = i7Var;
            }
        }
    }

    public static i7 a() {
        return cb.a() != p3.CTV ? i7.UNKNOWN : f744a;
    }

    public static void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
