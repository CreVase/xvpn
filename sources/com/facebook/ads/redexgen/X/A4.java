package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public interface A4 {
    void onAudioSessionId(A3 a3, int i);

    void onAudioUnderrun(A3 a3, int i, long j, long j2);

    void onDecoderDisabled(A3 a3, int i, C0272Au c0272Au);

    void onDecoderEnabled(A3 a3, int i, C0272Au c0272Au);

    void onDecoderInitialized(A3 a3, int i, String str, long j);

    void onDecoderInputFormatChanged(A3 a3, int i, Format format);

    void onDownstreamFormatChanged(A3 a3, C0348El c0348El);

    void onDrmKeysLoaded(A3 a3);

    void onDrmKeysRemoved(A3 a3);

    void onDrmKeysRestored(A3 a3);

    void onDrmSessionManagerError(A3 a3, Exception exc);

    void onDroppedVideoFrames(A3 a3, int i, long j);

    void onLoadError(A3 a3, C0347Ek c0347Ek, C0348El c0348El, IOException iOException, boolean z);

    void onLoadingChanged(A3 a3, boolean z);

    void onMediaPeriodCreated(A3 a3);

    void onMediaPeriodReleased(A3 a3);

    void onMetadata(A3 a3, Metadata metadata);

    void onPlaybackParametersChanged(A3 a3, C02329f c02329f);

    void onPlayerError(A3 a3, C9K c9k);

    void onPlayerStateChanged(A3 a3, boolean z, int i);

    void onPositionDiscontinuity(A3 a3, int i);

    void onReadingStarted(A3 a3);

    void onRenderedFirstFrame(A3 a3, Surface surface);

    void onSeekProcessed(A3 a3);

    void onSeekStarted(A3 a3);

    void onTimelineChanged(A3 a3, int i);

    void onTracksChanged(A3 a3, TrackGroupArray trackGroupArray, GP gp);

    void onVideoSizeChanged(A3 a3, int i, int i2, int i3, float f);
}
