package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Ll, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0523Ll implements SensorEventListener {
    public static byte[] A0A;
    public long A04;
    public long A05;
    public long A06;
    public SensorManager A07;
    public final YA A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final Set<InterfaceC0522Lk> A09 = new CopyOnWriteArraySet();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{119, 65, 74, 87, 75, 86, 87, 4, 74, 75, 80, 4, 87, 81, 84, 84, 75, 86, 80, 65, 64, 17, 42, 35, 41, 43, 44, 37, 98, 44, 45, 54, 98, 49, 55, 50, 50, 45, 48, 54, 39, 38, 21, 3, 8, 21, 9, 20};
    }

    public C0523Ll(YA ya) {
        this.A08 = ya;
    }

    private void A01() {
        SensorManager sensorManager;
        SensorManager sensorManager2 = (SensorManager) this.A08.getSystemService(A00(42, 6, 41));
        this.A07 = sensorManager2;
        if (sensorManager2 == null) {
            Toast.makeText(this.A08, A00(0, 21, 107), 1).show();
        }
        boolean z = false;
        try {
            SensorManager sensorManager3 = this.A07;
            z = sensorManager3.registerListener(this, sensorManager3.getDefaultSensor(1), 3);
        } catch (Exception unused) {
            Toast.makeText(this.A08, A00(21, 21, 13), 1).show();
        }
        if (!z && (sensorManager = this.A07) != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public final void A03(InterfaceC0522Lk interfaceC0522Lk) {
        if (this.A09.isEmpty()) {
            A01();
        } else if (this.A09.contains(interfaceC0522Lk)) {
            return;
        }
        this.A09.add(interfaceC0522Lk);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long now = SystemClock.elapsedRealtime();
        if (now - this.A04 > 500) {
            this.A03 = 0;
        }
        long j = this.A06;
        if (now - j > 100) {
            float speed = (Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.A00) - this.A01) - this.A02) / ((float) (now - j))) * 10000.0f;
            if (speed > 800.0f) {
                int i = this.A03 + 1;
                this.A03 = i;
                if (i >= 3 && now - this.A05 > 1000) {
                    this.A05 = now;
                    this.A03 = 0;
                    Iterator<InterfaceC0522Lk> it = this.A09.iterator();
                    while (it.hasNext()) {
                        it.next().ACv();
                    }
                }
                this.A04 = now;
            }
            this.A06 = now;
            this.A00 = sensorEvent.values[0];
            this.A01 = sensorEvent.values[1];
            this.A02 = sensorEvent.values[2];
        }
    }
}
