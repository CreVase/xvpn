package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ur1 {
    void a();

    MediaFormat b();

    void c(Bundle bundle);

    void d(int i, long j);

    int e();

    void f(ns1 ns1Var, Handler handler);

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(int i, boolean z);

    void i(int i, fc0 fc0Var, long j);

    void j(int i);

    ByteBuffer k(int i);

    void l(Surface surface);

    ByteBuffer m(int i);

    void n(int i, int i2, long j, int i3);

    void release();
}
