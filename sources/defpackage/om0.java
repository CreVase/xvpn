package defpackage;

import com.google.android.exoplayer2.scheduler.Requirements;

/* loaded from: classes.dex */
public interface om0 {
    void onDownloadChanged(qm0 qm0Var, jm0 jm0Var, Exception exc);

    void onDownloadRemoved(qm0 qm0Var, jm0 jm0Var);

    void onDownloadsPausedChanged(qm0 qm0Var, boolean z);

    void onIdle(qm0 qm0Var);

    void onInitialized(qm0 qm0Var);

    void onRequirementsStateChanged(qm0 qm0Var, Requirements requirements, int i);

    void onWaitingForRequirementsChanged(qm0 qm0Var, boolean z);
}
