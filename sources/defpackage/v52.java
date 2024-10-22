package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* loaded from: classes.dex */
public interface v52 {
    void onAvailableCommandsChanged(t52 t52Var);

    void onCues(ic0 ic0Var);

    void onCues(List list);

    void onDeviceInfoChanged(tk0 tk0Var);

    void onDeviceVolumeChanged(int i, boolean z);

    void onEvents(x52 x52Var, u52 u52Var);

    void onIsLoadingChanged(boolean z);

    void onIsPlayingChanged(boolean z);

    void onLoadingChanged(boolean z);

    void onMediaItemTransition(dt1 dt1Var, int i);

    void onMediaMetadataChanged(gt1 gt1Var);

    void onMetadata(Metadata metadata);

    void onPlayWhenReadyChanged(boolean z, int i);

    void onPlaybackParametersChanged(q52 q52Var);

    void onPlaybackStateChanged(int i);

    void onPlaybackSuppressionReasonChanged(int i);

    void onPlayerError(o52 o52Var);

    void onPlayerErrorChanged(o52 o52Var);

    void onPlayerStateChanged(boolean z, int i);

    void onPositionDiscontinuity(int i);

    void onPositionDiscontinuity(w52 w52Var, w52 w52Var2, int i);

    void onRenderedFirstFrame();

    void onSeekProcessed();

    void onSkipSilenceEnabledChanged(boolean z);

    void onSurfaceSizeChanged(int i, int i2);

    void onTimelineChanged(a93 a93Var, int i);

    void onTracksChanged(gb3 gb3Var);

    void onVideoSizeChanged(lk3 lk3Var);

    void onVolumeChanged(float f);
}
