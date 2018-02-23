package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLVideoElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 486846
  * declared in: tsd/browser/lib.es6.d.ts at pos 488853
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLVideoElement")
public class HTMLVideoElement extends HTMLMediaElement 
{

    /*
        Constructors
    */
    public HTMLVideoElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    /** 
      * Gets or sets the height of the video element.
     */
    public Number height;

    public Element lastElementChild;

    public Boolean msHorizontalMirror;

    public Boolean msIsLayoutOptimalForPlayback;

    public Boolean msIsStereo3D;

    public String msStereo3DPackingMode;

    public String msStereo3DRenderMode;

    public Boolean msZoom;

    public Element nextElementSibling;

    public Function1<Event, Object> onMSVideoFormatChanged;

    public Function1<Event, Object> onMSVideoFrameStepCompleted;

    public Function1<Event, Object> onMSVideoOptimalLayoutChanged;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    /** 
      * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
     */
    public String poster;

    public Element previousElementSibling;

    /** 
      * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
     */
    public Number videoHeight;

    /** 
      * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
     */
    public Number videoWidth;

    public Boolean webkitDisplayingFullscreen;

    public Boolean webkitSupportsFullscreen;

    /** 
      * Gets or sets the width of the video element.
     */
    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "msHorizontalMirror")
    public native Boolean getMsHorizontalMirror();
    @JsProperty(name = "msIsLayoutOptimalForPlayback")
    public native Boolean getMsIsLayoutOptimalForPlayback();
    @JsProperty(name = "msIsStereo3D")
    public native Boolean getMsIsStereo3D();
    @JsProperty(name = "msStereo3DPackingMode")
    public native String getMsStereo3DPackingMode();
    @JsProperty(name = "msStereo3DRenderMode")
    public native String getMsStereo3DRenderMode();
    @JsProperty(name = "msZoom")
    public native Boolean getMsZoom();
    @JsProperty(name = "onMSVideoFormatChanged")
    public native Function1<Event, Object> getOnMSVideoFormatChanged();
    @JsProperty(name = "onMSVideoFrameStepCompleted")
    public native Function1<Event, Object> getOnMSVideoFrameStepCompleted();
    @JsProperty(name = "onMSVideoOptimalLayoutChanged")
    public native Function1<Event, Object> getOnMSVideoOptimalLayoutChanged();
    @JsProperty(name = "poster")
    public native String getPoster();
    @JsProperty(name = "videoHeight")
    public native Number getVideoHeight();
    /** 
      * tsd/browser/lib.es6.d.ts@488137
     */
    public native VideoPlaybackQuality getVideoPlaybackQuality();
    @JsProperty(name = "videoWidth")
    public native Number getVideoWidth();
    @JsProperty(name = "webkitDisplayingFullscreen")
    public native Boolean getWebkitDisplayingFullscreen();
    @JsProperty(name = "webkitSupportsFullscreen")
    public native Boolean getWebkitSupportsFullscreen();
    @JsProperty(name = "width")
    public native Number getWidth();
    /** 
      * tsd/browser/lib.es6.d.ts@488190
     */
    public native void msFrameStep(Boolean forward);
    public native void msInsertVideoEffect(String activatableClassId, Boolean effectRequired);
    /** 
      * tsd/browser/lib.es6.d.ts@488231
     */
    public native void msInsertVideoEffect(String activatableClassId, Boolean effectRequired, Object config /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@488329
     */
    public native void msSetVideoRectangle(@DoNotAutobox Number left, @DoNotAutobox Number top, @DoNotAutobox Number right, @DoNotAutobox Number bottom);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "msHorizontalMirror")
    public native void setMsHorizontalMirror(Boolean value);
    @JsProperty(name = "msIsLayoutOptimalForPlayback")
    public native void setMsIsLayoutOptimalForPlayback(Boolean value);
    @JsProperty(name = "msIsStereo3D")
    public native void setMsIsStereo3D(Boolean value);
    @JsProperty(name = "msStereo3DPackingMode")
    public native void setMsStereo3DPackingMode(String value);
    @JsProperty(name = "msStereo3DRenderMode")
    public native void setMsStereo3DRenderMode(String value);
    @JsProperty(name = "msZoom")
    public native void setMsZoom(Boolean value);
    @JsProperty(name = "onMSVideoFormatChanged")
    public native void setOnMSVideoFormatChanged(Function1<Event, Object> value);
    @JsProperty(name = "onMSVideoFrameStepCompleted")
    public native void setOnMSVideoFrameStepCompleted(Function1<Event, Object> value);
    @JsProperty(name = "onMSVideoOptimalLayoutChanged")
    public native void setOnMSVideoOptimalLayoutChanged(Function1<Event, Object> value);
    @JsProperty(name = "poster")
    public native void setPoster(String value);
    @JsProperty(name = "videoHeight")
    public native void setVideoHeight(@DoNotAutobox Number value);
    @JsProperty(name = "videoWidth")
    public native void setVideoWidth(@DoNotAutobox Number value);
    @JsProperty(name = "webkitDisplayingFullscreen")
    public native void setWebkitDisplayingFullscreen(Boolean value);
    @JsProperty(name = "webkitSupportsFullscreen")
    public native void setWebkitSupportsFullscreen(Boolean value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@488418
     */
    public native void webkitEnterFullScreen();
    /** 
      * tsd/browser/lib.es6.d.ts@488453
     */
    public native void webkitEnterFullscreen();
    /** 
      * tsd/browser/lib.es6.d.ts@488488
     */
    public native void webkitExitFullScreen();
    /** 
      * tsd/browser/lib.es6.d.ts@488522
     */
    public native void webkitExitFullscreen();
}
