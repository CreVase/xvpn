package com.vungle.ads.internal.load;

import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import defpackage.m20;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class AdRequest implements Serializable {
    private final BidPayload adMarkup;
    private final Placement placement;

    public AdRequest(Placement placement, BidPayload bidPayload) {
        this.placement = placement;
        this.adMarkup = bidPayload;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m20.L(AdRequest.class, obj.getClass())) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (!m20.L(this.placement.getReferenceId(), adRequest.placement.getReferenceId())) {
            return false;
        }
        BidPayload bidPayload = this.adMarkup;
        BidPayload bidPayload2 = adRequest.adMarkup;
        if (bidPayload != null) {
            return m20.L(bidPayload, bidPayload2);
        }
        if (bidPayload2 == null) {
            return true;
        }
        return false;
    }

    public final BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int i;
        int hashCode = this.placement.getReferenceId().hashCode() * 31;
        BidPayload bidPayload = this.adMarkup;
        if (bidPayload != null) {
            i = bidPayload.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + "}";
    }
}
