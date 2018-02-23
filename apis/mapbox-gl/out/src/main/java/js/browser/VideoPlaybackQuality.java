package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: VideoPlaybackQuality
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 661725
  * declared in: tsd/browser/lib.es6.d.ts at pos 661970
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VideoPlaybackQuality")
public class VideoPlaybackQuality
{

    /*
        Constructors
    */
    public VideoPlaybackQuality () {
    } 

    /*
        Properties
    */

    public Number corruptedVideoFrames;

    public Number creationTime;

    public Number droppedVideoFrames;

    public Number totalFrameDelay;

    public Number totalVideoFrames;

    /*
        Methods
    */
    @JsProperty(name = "corruptedVideoFrames")
    public native Number getCorruptedVideoFrames();
    @JsProperty(name = "creationTime")
    public native Number getCreationTime();
    @JsProperty(name = "droppedVideoFrames")
    public native Number getDroppedVideoFrames();
    @JsProperty(name = "totalFrameDelay")
    public native Number getTotalFrameDelay();
    @JsProperty(name = "totalVideoFrames")
    public native Number getTotalVideoFrames();
    @JsProperty(name = "corruptedVideoFrames")
    public native void setCorruptedVideoFrames(@DoNotAutobox Number value);
    @JsProperty(name = "creationTime")
    public native void setCreationTime(@DoNotAutobox Number value);
    @JsProperty(name = "droppedVideoFrames")
    public native void setDroppedVideoFrames(@DoNotAutobox Number value);
    @JsProperty(name = "totalFrameDelay")
    public native void setTotalFrameDelay(@DoNotAutobox Number value);
    @JsProperty(name = "totalVideoFrames")
    public native void setTotalVideoFrames(@DoNotAutobox Number value);
}
