package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import defpackage.ht1;
import defpackage.it1;
import defpackage.vf0;
import defpackage.vq;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzoh implements zzme, zzoi {
    private final Context zza;
    private final zzoj zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzce zzn;
    private zzog zzo;
    private zzog zzp;
    private zzog zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcu zze = new zzcu();
    private final zzcs zzf = new zzcs();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzoh(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzof zzofVar = new zzof(zzof.zza);
        this.zzb = zzofVar;
        zzofVar.zzh(this);
    }

    public static zzoh zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager i = vq.i(context.getSystemService("media_metrics"));
        if (i != null) {
            createPlaybackSession = i.createPlaybackSession();
            return new zzoh(context, createPlaybackSession);
        }
        return null;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i) {
        switch (zzfk.zzi(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.zzj;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            PlaybackSession playbackSession = this.zzc;
            build = this.zzj.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzam zzamVar, int i) {
        int i2;
        if (zzfk.zzE(this.zzs, zzamVar)) {
            return;
        }
        if (this.zzs == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.zzs = zzamVar;
        zzx(0, j, zzamVar, i2);
    }

    private final void zzu(long j, zzam zzamVar, int i) {
        int i2;
        if (zzfk.zzE(this.zzt, zzamVar)) {
            return;
        }
        if (this.zzt == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.zzt = zzamVar;
        zzx(2, j, zzamVar, i2);
    }

    private final void zzv(zzcv zzcvVar, zztw zztwVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztwVar == null || (zza = zzcvVar.zza(zztwVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcvVar.zzd(zza, this.zzf, false);
        zzcvVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zze.zzd;
        int i2 = 2;
        if (zzbiVar != null) {
            int zzm = zzfk.zzm(zzbiVar.zzb);
            if (zzm != 0) {
                if (zzm != 1) {
                    if (zzm != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        zzcu zzcuVar = this.zze;
        if (zzcuVar.zzo != -9223372036854775807L && !zzcuVar.zzm && !zzcuVar.zzj && !zzcuVar.zzb()) {
            builder.setMediaDurationMillis(zzfk.zzs(this.zze.zzo));
        }
        if (true != this.zze.zzb()) {
            i2 = 1;
        }
        builder.setPlaybackType(i2);
        this.zzz = true;
    }

    private final void zzw(long j, zzam zzamVar, int i) {
        int i2;
        if (zzfk.zzE(this.zzr, zzamVar)) {
            return;
        }
        if (this.zzr == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.zzr = zzamVar;
        zzx(1, j, zzamVar, i2);
    }

    private final void zzx(int i, long j, zzam zzamVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        String str;
        timeSinceCreatedMillis = it1.j(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = zzamVar.zzl;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzamVar.zzm;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzamVar.zzj;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = zzamVar.zzi;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzamVar.zzr;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzamVar.zzs;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzamVar.zzz;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzamVar.zzA;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = zzamVar.zzd;
            if (str5 != null) {
                int i9 = zzfk.zza;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzamVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private final boolean zzy(zzog zzogVar) {
        if (zzogVar != null) {
            if (zzogVar.zzc.equals(this.zzb.zze())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzc(zzmc zzmcVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zztw zztwVar = zzmcVar.zzd;
        if (zztwVar != null && zztwVar.zzb()) {
            return;
        }
        zzs();
        this.zzi = str;
        playerName = it1.h().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.2.0-alpha01");
        this.zzj = playerVersion;
        zzv(zzmcVar.zzb, zzmcVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzd(zzmc zzmcVar, String str, boolean z) {
        zztw zztwVar = zzmcVar.zzd;
        if ((zztwVar == null || !zztwVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zze(zzmc zzmcVar, zzam zzamVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzf(zzmc zzmcVar, int i, long j, long j2) {
        long longValue;
        zztw zztwVar = zzmcVar.zzd;
        if (zztwVar != null) {
            zzoj zzojVar = this.zzb;
            zzcv zzcvVar = zzmcVar.zzb;
            HashMap hashMap = this.zzh;
            String zzf = zzojVar.zzf(zzcvVar, zztwVar);
            Long l = (Long) hashMap.get(zzf);
            Long l2 = (Long) this.zzg.get(zzf);
            HashMap hashMap2 = this.zzh;
            long j3 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap2.put(zzf, Long.valueOf(longValue + j));
            HashMap hashMap3 = this.zzg;
            if (l2 != null) {
                j3 = l2.longValue();
            }
            hashMap3.put(zzf, Long.valueOf(j3 + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzg(zzmc zzmcVar, zzts zztsVar) {
        zztw zztwVar = zzmcVar.zzd;
        if (zztwVar == null) {
            return;
        }
        zzam zzamVar = zztsVar.zzb;
        zzamVar.getClass();
        zzog zzogVar = new zzog(zzamVar, 0, this.zzb.zzf(zzmcVar.zzb, zztwVar));
        int i = zztsVar.zza;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.zzq = zzogVar;
                    return;
                }
            } else {
                this.zzp = zzogVar;
                return;
            }
        }
        this.zzo = zzogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzh(zzmc zzmcVar, int i, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzi(zzco zzcoVar, zzmd zzmdVar) {
        int i;
        int i2;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        boolean z;
        int i3;
        int i4;
        int errorCode;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        zzad zzadVar;
        int i5;
        int i6;
        if (zzmdVar.zzb() != 0) {
            for (int i7 = 0; i7 < zzmdVar.zzb(); i7++) {
                int zza = zzmdVar.zza(i7);
                zzmc zzc = zzmdVar.zzc(zza);
                if (zza == 0) {
                    this.zzb.zzk(zzc);
                } else if (zza == 11) {
                    this.zzb.zzj(zzc, this.zzk);
                } else {
                    this.zzb.zzi(zzc);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (zzmdVar.zzd(0)) {
                zzmc zzc2 = zzmdVar.zzc(0);
                if (this.zzj != null) {
                    zzv(zzc2.zzb, zzc2.zzd);
                }
            }
            if (zzmdVar.zzd(2) && this.zzj != null) {
                zzfvs zza2 = zzcoVar.zzo().zza();
                int size = zza2.size();
                int i8 = 0;
                loop1: while (true) {
                    if (i8 < size) {
                        zzdf zzdfVar = (zzdf) zza2.get(i8);
                        char c = 0;
                        while (true) {
                            int i9 = zzdfVar.zzb;
                            i6 = i8 + 1;
                            if (c <= 0) {
                                if (zzdfVar.zzd(0) && (zzadVar = zzdfVar.zzb(0).zzp) != null) {
                                    break loop1;
                                } else {
                                    c = 1;
                                }
                            }
                        }
                    } else {
                        zzadVar = null;
                        break;
                    }
                    i8 = i6;
                }
                if (zzadVar != null) {
                    PlaybackMetrics.Builder builder = this.zzj;
                    int i10 = zzfk.zza;
                    int i11 = 0;
                    while (true) {
                        if (i11 < zzadVar.zzb) {
                            UUID uuid = zzadVar.zza(i11).zza;
                            if (uuid.equals(zzo.zzd)) {
                                i5 = 3;
                                break;
                            } else if (uuid.equals(zzo.zze)) {
                                i5 = 2;
                                break;
                            } else {
                                if (uuid.equals(zzo.zzc)) {
                                    i5 = 6;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            i5 = 1;
                            break;
                        }
                    }
                    builder.setDrmType(i5);
                }
            }
            if (zzmdVar.zzd(1011)) {
                this.zzy++;
            }
            zzce zzceVar = this.zzn;
            if (zzceVar != null) {
                Context context = this.zza;
                if (zzceVar.zzb == 1001) {
                    i4 = 20;
                } else {
                    zzil zzilVar = (zzil) zzceVar;
                    if (zzilVar.zze == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i12 = zzilVar.zzi;
                    Throwable cause = zzceVar.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof zzhd) {
                            errorCode = ((zzhd) cause).zzd;
                            i3 = 5;
                        } else if (!(cause instanceof zzhc) && !(cause instanceof zzcc)) {
                            boolean z2 = cause instanceof zzhb;
                            if (!z2 && !(cause instanceof zzhl)) {
                                if (zzceVar.zzb == 1002) {
                                    i4 = 21;
                                } else if (cause instanceof zzqv) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    int i13 = zzfk.zza;
                                    if (i13 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                        errorCode = zzfk.zzj(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                        i3 = zzr(errorCode);
                                    } else if (i13 >= 23 && vf0.B(cause2)) {
                                        i4 = 27;
                                    } else if (cause2 instanceof NotProvisionedException) {
                                        i4 = 24;
                                    } else if (cause2 instanceof DeniedByServerException) {
                                        i4 = 29;
                                    } else {
                                        if (!(cause2 instanceof zzrg)) {
                                            if (cause2 instanceof zzqt) {
                                                i4 = 28;
                                            } else {
                                                i4 = 30;
                                            }
                                        }
                                        i4 = 23;
                                    }
                                } else if ((cause instanceof zzgx) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    if (zzfk.zza >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                        i4 = 32;
                                    } else {
                                        i4 = 31;
                                    }
                                } else {
                                    i4 = 9;
                                }
                            } else if (zzez.zzb(context).zza() == 1) {
                                i4 = 3;
                            } else {
                                Throwable cause5 = cause.getCause();
                                if (cause5 instanceof UnknownHostException) {
                                    i4 = 6;
                                } else if (cause5 instanceof SocketTimeoutException) {
                                    i4 = 7;
                                } else if (z2 && ((zzhb) cause).zzc == 1) {
                                    i4 = 4;
                                } else {
                                    i4 = 8;
                                }
                            }
                        } else {
                            i4 = 11;
                        }
                    } else if (z && (i12 == 0 || i12 == 1)) {
                        i4 = 35;
                    } else if (z && i12 == 3) {
                        i4 = 15;
                    } else {
                        if (!z || i12 != 2) {
                            if (cause instanceof zzsc) {
                                errorCode = zzfk.zzj(((zzsc) cause).zzd);
                                i3 = 13;
                            } else {
                                i3 = 14;
                                if (cause instanceof zzrx) {
                                    errorCode = zzfk.zzj(((zzrx) cause).zzb);
                                } else if (cause instanceof OutOfMemoryError) {
                                    i4 = 14;
                                } else if (cause instanceof zzpe) {
                                    errorCode = ((zzpe) cause).zza;
                                    i3 = 17;
                                } else if (cause instanceof zzph) {
                                    errorCode = ((zzph) cause).zza;
                                    i3 = 18;
                                } else {
                                    int i14 = zzfk.zza;
                                    if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        i3 = zzr(errorCode);
                                    } else {
                                        i4 = 22;
                                    }
                                }
                            }
                        }
                        i4 = 23;
                    }
                    PlaybackSession playbackSession = this.zzc;
                    timeSinceCreatedMillis3 = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i3);
                    subErrorCode = errorCode2.setSubErrorCode(errorCode);
                    exception = subErrorCode.setException(zzceVar);
                    build3 = exception.build();
                    playbackSession.reportPlaybackErrorEvent(build3);
                    this.zzz = true;
                    this.zzn = null;
                }
                i3 = i4;
                errorCode = 0;
                PlaybackSession playbackSession2 = this.zzc;
                timeSinceCreatedMillis3 = ht1.e().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i3);
                subErrorCode = errorCode2.setSubErrorCode(errorCode);
                exception = subErrorCode.setException(zzceVar);
                build3 = exception.build();
                playbackSession2.reportPlaybackErrorEvent(build3);
                this.zzz = true;
                this.zzn = null;
            }
            if (zzmdVar.zzd(2)) {
                zzdg zzo = zzcoVar.zzo();
                boolean zzb = zzo.zzb(2);
                boolean zzb2 = zzo.zzb(1);
                boolean zzb3 = zzo.zzb(3);
                if (!zzb && !zzb2) {
                    if (zzb3) {
                        zzb3 = true;
                    }
                }
                if (!zzb) {
                    zzw(elapsedRealtime, null, 0);
                }
                if (!zzb2) {
                    zzt(elapsedRealtime, null, 0);
                }
                if (!zzb3) {
                    zzu(elapsedRealtime, null, 0);
                }
            }
            if (zzy(this.zzo)) {
                zzam zzamVar = this.zzo.zza;
                if (zzamVar.zzs != -1) {
                    zzw(elapsedRealtime, zzamVar, 0);
                    this.zzo = null;
                }
            }
            if (zzy(this.zzp)) {
                zzt(elapsedRealtime, this.zzp.zza, 0);
                this.zzp = null;
            }
            if (zzy(this.zzq)) {
                zzu(elapsedRealtime, this.zzq.zza, 0);
                this.zzq = null;
            }
            switch (zzez.zzb(this.zza).zza()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 9;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                case 8:
                default:
                    i = 1;
                    break;
                case 7:
                    i = 3;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 7;
                    break;
            }
            if (i != this.zzm) {
                this.zzm = i;
                PlaybackSession playbackSession3 = this.zzc;
                networkType = ht1.a().setNetworkType(i);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                build2 = timeSinceCreatedMillis2.build();
                playbackSession3.reportNetworkEvent(build2);
            }
            if (zzcoVar.zzf() != 2) {
                this.zzu = false;
            }
            if (((zzlx) zzcoVar).zzC() == null) {
                this.zzv = false;
            } else if (zzmdVar.zzd(10)) {
                this.zzv = true;
            }
            int zzf = zzcoVar.zzf();
            if (this.zzu) {
                i2 = 5;
            } else if (this.zzv) {
                i2 = 13;
            } else {
                i2 = 4;
                if (zzf == 4) {
                    i2 = 11;
                } else if (zzf == 2) {
                    int i15 = this.zzl;
                    if (i15 != 0 && i15 != 2) {
                        if (!zzcoVar.zzv()) {
                            i2 = 7;
                        } else if (zzcoVar.zzg() != 0) {
                            i2 = 10;
                        } else {
                            i2 = 6;
                        }
                    } else {
                        i2 = 2;
                    }
                } else if (zzf == 3) {
                    if (zzcoVar.zzv()) {
                        if (zzcoVar.zzg() != 0) {
                            i2 = 9;
                        } else {
                            i2 = 3;
                        }
                    }
                } else if (zzf == 1 && this.zzl != 0) {
                    i2 = 12;
                } else {
                    i2 = this.zzl;
                }
            }
            if (this.zzl != i2) {
                this.zzl = i2;
                this.zzz = true;
                PlaybackSession playbackSession4 = this.zzc;
                state = it1.i().setState(this.zzl);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                build = timeSinceCreatedMillis.build();
                playbackSession4.reportPlaybackStateEvent(build);
            }
            if (zzmdVar.zzd(1028)) {
                this.zzb.zzg(zzmdVar.zzc(1028));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzj(zzmc zzmcVar, zztn zztnVar, zzts zztsVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzk(zzmc zzmcVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzl(zzmc zzmcVar, zzce zzceVar) {
        this.zzn = zzceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzm(zzmc zzmcVar, zzcn zzcnVar, zzcn zzcnVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzn(zzmc zzmcVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzo(zzmc zzmcVar, zzid zzidVar) {
        this.zzw += zzidVar.zzg;
        this.zzx += zzidVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzp(zzmc zzmcVar, zzam zzamVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzq(zzmc zzmcVar, zzdm zzdmVar) {
        zzog zzogVar = this.zzo;
        if (zzogVar != null) {
            zzam zzamVar = zzogVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzb = zzamVar.zzb();
                zzb.zzab(zzdmVar.zzc);
                zzb.zzH(zzdmVar.zzd);
                this.zzo = new zzog(zzb.zzac(), 0, zzogVar.zzc);
            }
        }
    }
}
