package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.internal.Model.CBError;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f825a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f826b;

        static {
            int[] iArr = new int[CBError.CBImpressionError.values().length];
            try {
                iArr[CBError.CBImpressionError.INTERNET_UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.CBImpressionError.TOO_MANY_CONNECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.CBImpressionError.NETWORK_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.CBImpressionError.NO_AD_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.CBImpressionError.SESSION_NOT_STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.CBImpressionError.INVALID_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CBError.CBImpressionError.ASSET_PREFETCH_IN_PROGRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CBError.CBImpressionError.ASSET_MISSING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_CACHE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CBError.CBImpressionError.NO_HOST_ACTIVITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CBError.CBImpressionError.USER_CANCELLATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CBError.CBImpressionError.VIDEO_UNAVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CBError.CBImpressionError.VIDEO_ID_MISSING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CBError.CBImpressionError.ERROR_PLAYING_VIDEO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CBError.CBImpressionError.ERROR_CREATING_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CBError.CBImpressionError.ERROR_DISPLAYING_VIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CBError.CBImpressionError.PENDING_IMPRESSION_ERROR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            f825a = iArr;
            int[] iArr2 = new int[CBError.CBClickError.values().length];
            try {
                iArr2[CBError.CBClickError.URI_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CBError.CBClickError.URI_UNRECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            f826b = iArr2;
        }
    }

    public static final CacheError a(CBError.CBImpressionError cBImpressionError) {
        CacheError.Code code;
        switch (a.f825a[cBImpressionError.ordinal()]) {
            case 1:
                code = CacheError.Code.INTERNET_UNAVAILABLE;
                break;
            case 2:
                code = CacheError.Code.NETWORK_FAILURE;
                break;
            case 3:
                code = CacheError.Code.NETWORK_FAILURE;
                break;
            case 4:
                code = CacheError.Code.NO_AD_FOUND;
                break;
            case 5:
                code = CacheError.Code.SESSION_NOT_STARTED;
                break;
            case 6:
                code = CacheError.Code.SERVER_ERROR;
                break;
            case 7:
                code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
                break;
            case 8:
                code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
                break;
            case 9:
                code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
                break;
            case 10:
                code = CacheError.Code.INTERNET_UNAVAILABLE;
                break;
            default:
                code = CacheError.Code.INTERNAL;
                break;
        }
        return new CacheError(code, null, 2, null);
    }

    public static final ShowError b(CBError.CBImpressionError cBImpressionError) {
        ShowError.Code code;
        int i = a.f825a[cBImpressionError.ordinal()];
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    switch (i) {
                        case 11:
                            code = ShowError.Code.AD_ALREADY_VISIBLE;
                            break;
                        case 12:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 13:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 14:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 15:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 16:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 17:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 18:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 19:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 20:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 21:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 22:
                            code = ShowError.Code.PRESENTATION_FAILURE;
                            break;
                        case 23:
                            code = ShowError.Code.INTERNET_UNAVAILABLE;
                            break;
                        default:
                            code = ShowError.Code.INTERNAL;
                            break;
                    }
                } else {
                    code = ShowError.Code.SESSION_NOT_STARTED;
                }
            } else {
                code = ShowError.Code.NO_CACHED_AD;
            }
        } else {
            code = ShowError.Code.INTERNET_UNAVAILABLE;
        }
        return new ShowError(code, null, 2, null);
    }

    public static final ClickError a(CBError.CBClickError cBClickError, String str) {
        ClickError.Code code;
        int i = a.f826b[cBClickError.ordinal()];
        if (i == 1) {
            code = ClickError.Code.URI_INVALID;
        } else if (i != 2) {
            code = ClickError.Code.INTERNAL;
        } else {
            code = ClickError.Code.URI_UNRECOGNIZED;
        }
        return new ClickError(code, new Exception(str));
    }
}
