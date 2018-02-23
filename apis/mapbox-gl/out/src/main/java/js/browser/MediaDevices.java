package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaDevices
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 516551
  * declared in: tsd/browser/lib.es6.d.ts at pos 517116
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaDevices")
public class MediaDevices extends EventTarget 
{

    /*
        Constructors
    */
    public MediaDevices () {
    } 

    /*
        Properties
    */

    public Function1<Event, Object> ondevicechange;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@516662
     */
    public native Object enumerateDevices();
    @JsProperty(name = "ondevicechange")
    public native Function1<Event, Object> getOndevicechange();
    /** 
      * tsd/browser/lib.es6.d.ts@516691
     */
    public native MediaTrackSupportedConstraints getSupportedConstraints();
    /** 
      * tsd/browser/lib.es6.d.ts@516754
     */
    public native Promise<MediaStream> getUserMedia(MediaStreamConstraints constraints);
    @JsProperty(name = "ondevicechange")
    public native void setOndevicechange(Function1<Event, Object> value);
}
