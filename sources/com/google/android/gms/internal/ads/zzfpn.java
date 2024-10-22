package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class zzfpn extends zzfpb {
    private zzftm<Integer> zza;
    private zzftm<Integer> zzb;
    private zzfpm zzc;
    private HttpURLConnection zzd;

    public zzfpn(zzftm<Integer> zzftmVar, zzftm<Integer> zzftmVar2, zzfpm zzfpmVar) {
        this.zza = zzftmVar;
        this.zzb = zzftmVar2;
        this.zzc = zzfpmVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfpc.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfpc.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfpm zzfpmVar = this.zzc;
        zzfpmVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfpmVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfpm zzfpmVar, final int i, final int i2) throws IOException {
        this.zza = new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpf
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpg
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfpmVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzftm() { // from class: com.google.android.gms.internal.ads.zzfph
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpi
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfpm() { // from class: com.google.android.gms.internal.ads.zzfpj
            @Override // com.google.android.gms.internal.ads.zzfpm
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpk
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzfpm() { // from class: com.google.android.gms.internal.ads.zzfpl
            @Override // com.google.android.gms.internal.ads.zzfpm
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzfpn() {
        this(new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpd
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return zzfpn.zzf();
            }
        }, new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpe
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return zzfpn.zzg();
            }
        }, null);
    }
}
