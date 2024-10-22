package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzrj implements zzrv {
    private final zzftm zzb;
    private final zzftm zzc;

    public zzrj(int i, boolean z) {
        zzrh zzrhVar = new zzrh(i);
        zzri zzriVar = new zzri(i);
        this.zzb = zzrhVar;
        this.zzc = zzriVar;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        String zzs;
        zzs = zzrl.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        String zzs;
        zzs = zzrl.zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzrl zzc(zzru zzruVar) throws IOException {
        MediaCodec mediaCodec;
        String str = zzruVar.zza.zza;
        zzrl zzrlVar = null;
        try {
            int i = zzfk.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzrl zzrlVar2 = new zzrl(mediaCodec, zza(((zzrh) this.zzb).zza), zzb(((zzri) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzrl.zzh(zzrlVar2, zzruVar.zzb, zzruVar.zzd, null, 0);
                    return zzrlVar2;
                } catch (Exception e) {
                    e = e;
                    zzrlVar = zzrlVar2;
                    if (zzrlVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        zzrlVar.zzl();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }
}
