package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpm {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private zzdy zzJ;
    private final zzpl zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpk zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpm(zzpl zzplVar) {
        this.zza = zzplVar;
        int i = zzfk.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzJ = zzdy.zza;
    }

    private final long zzm() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, this.zzA + zzfk.zzn(zzfk.zzo(zzfk.zzq(elapsedRealtime) - this.zzy, this.zzj), this.zzg));
        }
        if (elapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.zzh) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzv = this.zzt;
                        }
                        playState = 2;
                    }
                    playbackHeadPosition += this.zzv;
                }
                if (zzfk.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzt > 0 && playState == 3) {
                            if (this.zzz == -9223372036854775807L) {
                                this.zzz = elapsedRealtime;
                            }
                        }
                    } else {
                        j = playbackHeadPosition;
                    }
                    this.zzz = -9223372036854775807L;
                    playbackHeadPosition = j;
                }
                if (this.zzt > playbackHeadPosition) {
                    this.zzu++;
                }
                this.zzt = playbackHeadPosition;
            }
            this.zzs = elapsedRealtime;
        }
        return this.zzt + this.zzI + (this.zzu << 32);
    }

    private final long zzn() {
        long zzm = zzm();
        int i = this.zzg;
        int i2 = zzfk.zza;
        return (zzm * 1000000) / i;
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long zzo;
        long j;
        zzpf zzpfVar;
        zzpf zzpfVar2;
        zzpb zzpbVar;
        Method method;
        long zzH;
        long zzI;
        long zzH2;
        long zzI2;
        zzpm zzpmVar = this;
        AudioTrack audioTrack = zzpmVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzpmVar.zzm >= 30000) {
                long zzn = zzn();
                if (zzn != 0) {
                    zzpmVar.zzb[zzpmVar.zzw] = zzfk.zzp(zzn, zzpmVar.zzj) - nanoTime;
                    zzpmVar.zzw = (zzpmVar.zzw + 1) % 10;
                    int i = zzpmVar.zzx;
                    if (i < 10) {
                        zzpmVar.zzx = i + 1;
                    }
                    zzpmVar.zzm = nanoTime;
                    zzpmVar.zzl = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = zzpmVar.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        zzpmVar.zzl = (zzpmVar.zzb[i2] / i3) + zzpmVar.zzl;
                        i2++;
                    }
                }
            }
            if (!zzpmVar.zzh) {
                zzpk zzpkVar = zzpmVar.zzf;
                zzpkVar.getClass();
                if (zzpkVar.zzg(nanoTime)) {
                    long zzb = zzpkVar.zzb();
                    long zza = zzpkVar.zza();
                    long zzn2 = zzn();
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzqi zzqiVar = ((zzqd) zzpmVar.zza).zza;
                        zzH2 = zzqiVar.zzH();
                        zzI2 = zzqiVar.zzI();
                        zzer.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzn2 + ", " + zzH2 + ", " + zzI2);
                        zzpkVar.zzd();
                    } else {
                        int i4 = zzpmVar.zzg;
                        int i5 = zzfk.zza;
                        if (Math.abs(((zza * 1000000) / i4) - zzn2) > 5000000) {
                            zzqi zzqiVar2 = ((zzqd) zzpmVar.zza).zza;
                            zzH = zzqiVar2.zzH();
                            zzI = zzqiVar2.zzI();
                            zzer.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzn2 + ", " + zzH + ", " + zzI);
                            zzpkVar.zzd();
                        } else {
                            zzpkVar.zzc();
                        }
                        zzpmVar = this;
                    }
                }
                if (zzpmVar.zzq && (method = zzpmVar.zzn) != null && nanoTime - zzpmVar.zzr >= 500000) {
                    try {
                        AudioTrack audioTrack2 = zzpmVar.zzc;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                        int i6 = zzfk.zza;
                        long intValue = (num.intValue() * 1000) - zzpmVar.zzi;
                        zzpmVar.zzo = intValue;
                        long max = Math.max(intValue, 0L);
                        zzpmVar.zzo = max;
                        if (max > 5000000) {
                            zzer.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            zzpmVar.zzo = 0L;
                        }
                    } catch (Exception unused) {
                        zzpmVar.zzn = null;
                    }
                    zzpmVar.zzr = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpk zzpkVar2 = zzpmVar.zzf;
        zzpkVar2.getClass();
        boolean zzf = zzpkVar2.zzf();
        if (zzf) {
            long zza2 = zzpkVar2.zza();
            int i7 = zzpmVar.zzg;
            int i8 = zzfk.zza;
            j = zzfk.zzo(nanoTime2 - zzpkVar2.zzb(), zzpmVar.zzj) + ((zza2 * 1000000) / i7);
        } else {
            if (zzpmVar.zzx == 0) {
                zzo = zzn();
            } else {
                zzo = zzfk.zzo(zzpmVar.zzl + nanoTime2, zzpmVar.zzj);
            }
            j = zzo;
            if (!z) {
                j = Math.max(0L, j - zzpmVar.zzo);
            }
        }
        if (zzpmVar.zzE != zzf) {
            zzpmVar.zzG = zzpmVar.zzD;
            zzpmVar.zzF = zzpmVar.zzC;
        }
        long j2 = nanoTime2 - zzpmVar.zzG;
        if (j2 < 1000000) {
            long zzo2 = zzfk.zzo(j2, zzpmVar.zzj) + zzpmVar.zzF;
            long j3 = (j2 * 1000) / 1000000;
            j = (((1000 - j3) * zzo2) + (j * j3)) / 1000;
        }
        if (!zzpmVar.zzk) {
            long j4 = zzpmVar.zzC;
            if (j > j4) {
                zzpmVar.zzk = true;
                int i9 = zzfk.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzfk.zzs(zzfk.zzp(zzfk.zzs(j - j4), zzpmVar.zzj));
                zzqi zzqiVar3 = ((zzqd) zzpmVar.zza).zza;
                zzpfVar = zzqiVar3.zzp;
                if (zzpfVar != null) {
                    zzpfVar2 = zzqiVar3.zzp;
                    zzpbVar = ((zzqn) zzpfVar2).zza.zzc;
                    zzpbVar.zzr(currentTimeMillis);
                }
            }
        }
        zzpmVar.zzD = nanoTime2;
        zzpmVar.zzC = j;
        zzpmVar.zzE = zzf;
        return j;
    }

    public final void zzc(long j) {
        this.zzA = zzm();
        this.zzy = zzfk.zzq(SystemClock.elapsedRealtime());
        this.zzB = j;
    }

    public final void zzd() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(android.media.AudioTrack r5, boolean r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r4.zzc = r5
            r4.zzd = r8
            r4.zze = r9
            com.google.android.gms.internal.ads.zzpk r0 = new com.google.android.gms.internal.ads.zzpk
            r0.<init>(r5)
            r4.zzf = r0
            int r5 = r5.getSampleRate()
            r4.zzg = r5
            r5 = 0
            if (r6 == 0) goto L25
            int r6 = com.google.android.gms.internal.ads.zzfk.zza
            r0 = 23
            if (r6 >= r0) goto L25
            r6 = 5
            r0 = 1
            if (r7 == r6) goto L26
            r6 = 6
            if (r7 != r6) goto L25
            r7 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r4.zzh = r0
            boolean r6 = com.google.android.gms.internal.ads.zzfk.zzF(r7)
            r4.zzq = r6
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L41
            int r9 = r9 / r8
            long r6 = (long) r9
            int r8 = r4.zzg
            long r8 = (long) r8
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r2
            long r6 = r6 / r8
            goto L42
        L41:
            r6 = r0
        L42:
            r4.zzi = r6
            r6 = 0
            r4.zzt = r6
            r4.zzu = r6
            r4.zzH = r5
            r4.zzI = r6
            r4.zzv = r6
            r4.zzp = r5
            r4.zzy = r0
            r4.zzz = r0
            r4.zzr = r6
            r4.zzo = r6
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.zzj = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpm.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzf(zzdy zzdyVar) {
        this.zzJ = zzdyVar;
    }

    public final void zzg() {
        zzpk zzpkVar = this.zzf;
        zzpkVar.getClass();
        zzpkVar.zze();
    }

    public final boolean zzh(long j) {
        if (j <= zzfk.zzn(zzb(false), this.zzg)) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && zzm() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzj(long j) {
        if (this.zzz != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200) {
            return true;
        }
        return false;
    }

    public final boolean zzk(long j) {
        zzpf zzpfVar;
        long j2;
        zzpf zzpfVar2;
        zzpb zzpbVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzh = zzh(j);
        this.zzp = zzh;
        if (z && !zzh && playState != 1) {
            zzpl zzplVar = this.zza;
            int i = this.zze;
            long zzs = zzfk.zzs(this.zzi);
            zzqd zzqdVar = (zzqd) zzplVar;
            zzqi zzqiVar = zzqdVar.zza;
            zzpfVar = zzqiVar.zzp;
            if (zzpfVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = zzqiVar.zzV;
                zzpfVar2 = zzqdVar.zza.zzp;
                zzpbVar = ((zzqn) zzpfVar2).zza.zzc;
                zzpbVar.zzt(i, zzs, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzy == -9223372036854775807L) {
            zzpk zzpkVar = this.zzf;
            zzpkVar.getClass();
            zzpkVar.zze();
            return true;
        }
        return false;
    }
}
