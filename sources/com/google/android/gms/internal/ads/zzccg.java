package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import defpackage.p71;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzccg extends zzcci implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcdc zzd;
    private final zzcdd zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcda zzn;
    private final boolean zzo;
    private int zzp;
    private zzcch zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzccg(Context context, zzcdc zzcdcVar, boolean z, boolean z2, zzcdb zzcdbVar, zzcdd zzcddVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzcdcVar;
        this.zze = zzcddVar;
        this.zzo = z;
        this.zzf = z2;
        zzcddVar.zza(this);
    }

    private final void zzD() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj != null && surfaceTexture != null) {
            zzE(false);
            try {
                com.google.android.gms.ads.internal.zzt.zzk();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.zzi = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.zzi.setOnCompletionListener(this);
                this.zzi.setOnErrorListener(this);
                this.zzi.setOnInfoListener(this);
                this.zzi.setOnPreparedListener(this);
                this.zzi.setOnVideoSizeChangedListener(this);
                this.zzm = 0;
                if (this.zzo) {
                    zzcda zzcdaVar = new zzcda(getContext());
                    this.zzn = zzcdaVar;
                    zzcdaVar.zzd(surfaceTexture, getWidth(), getHeight());
                    this.zzn.start();
                    SurfaceTexture zzb = this.zzn.zzb();
                    if (zzb != null) {
                        surfaceTexture = zzb;
                    } else {
                        this.zzn.zze();
                        this.zzn = null;
                    }
                }
                this.zzi.setDataSource(getContext(), this.zzj);
                com.google.android.gms.ads.internal.zzt.zzl();
                this.zzi.setSurface(new Surface(surfaceTexture));
                this.zzi.setAudioStreamType(3);
                this.zzi.setScreenOnWhilePlaying(true);
                this.zzi.prepareAsync();
                zzF(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                zzcat.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
                onError(this.zzi, 1, 0);
            }
        }
    }

    private final void zzE(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcda zzcdaVar = this.zzn;
        if (zzcdaVar != null) {
            zzcdaVar.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzcat.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final boolean zzH() {
        int i;
        return (this.zzi == null || (i = this.zzg) == -1 || i == 0 || i == 1) ? false : true;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzccg zzccgVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzccgVar.zzd != null && mediaPlayer != null) {
            try {
                MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                if (trackInfo != null) {
                    HashMap hashMap = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType != 1) {
                                if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                    if (format.containsKey("mime")) {
                                        hashMap.put("audioMime", format.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                        hashMap.put("audioCodec", format.getString("codecs-string"));
                                    }
                                }
                            } else {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        zzccgVar.zzs = valueOf;
                                        hashMap.put("bitRate", String.valueOf(valueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                    }
                                    if (format2.containsKey("mime")) {
                                        hashMap.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        hashMap.put("videoCodec", format2.getString("codecs-string"));
                                    }
                                }
                            }
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        zzccgVar.zzd.zzd("onMetadataEvent", hashMap);
                    }
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdMediaPlayerView.reportMetadata");
            }
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcbz(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        zzcat.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcca(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:            if (r1 > r6) goto L30;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzk
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L7e
            int r2 = r5.zzl
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.zzcda r2 = r5.zzn
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcda r6 = r5.zzn
            if (r6 == 0) goto L88
            r6.zzc(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccg.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcby(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i = this.zzp;
        if (i != 0) {
            zzq(i);
        }
        if (this.zzf && zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            while (zzH() && this.zzi.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzi.pause();
            zzn();
        }
        zzcat.zzi("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccb(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzcda zzcdaVar = this.zzn;
        if (zzcdaVar != null) {
            zzcdaVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccd(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzh;
        boolean z = false;
        if (this.zzk == i && this.zzl == i2) {
            z = true;
        }
        if (this.zzi != null && i3 == 3 && z) {
            int i4 = this.zzp;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzcda zzcdaVar = this.zzn;
        if (zzcdaVar != null) {
            zzcdaVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccc(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbx
            @Override // java.lang.Runnable
            public final void run() {
                zzccg.this.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return p71.m(zzccg.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zzb() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT >= 26 && zzH()) {
            metrics = this.zzi.getMetrics();
            return metrics.getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * this.zzm) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzh() {
        if (this.zzs != null) {
            return zzc() * this.zzs.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    public final /* synthetic */ void zzm(int i) {
        zzcch zzcchVar = this.zzq;
        if (zzcchVar != null) {
            zzcchVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci, com.google.android.gms.internal.ads.zzcdf
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccf(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcce(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i);
        if (zzH()) {
            this.zzi.seekTo(i);
            this.zzp = 0;
        } else {
            this.zzp = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzr(zzcch zzcchVar) {
        this.zzq = zzcchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzaxh zza = zzaxh.zza(parse);
        if (zza != null && zza.zza == null) {
            return;
        }
        if (zza != null) {
            parse = Uri.parse(zza.zza);
        }
        this.zzj = parse;
        this.zzp = 0;
        zzD();
        requestLayout();
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzu(float f, float f2) {
        zzcda zzcdaVar = this.zzn;
        if (zzcdaVar != null) {
            zzcdaVar.zzf(f, f2);
        }
    }
}
