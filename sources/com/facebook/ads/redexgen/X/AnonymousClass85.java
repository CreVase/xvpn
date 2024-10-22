package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.85, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass85 implements SensorEventListener {
    public AnonymousClass85() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        AnonymousClass86.A0E(sensorEvent.values);
        AnonymousClass86.A05();
    }
}
