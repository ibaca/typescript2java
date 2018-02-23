package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 522836
  * declared in: tsd/browser/lib.es6.d.ts at pos 522936
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamEvent")
public class MediaStreamEvent extends Event 
{

    /*
        Constructors
    */
    public MediaStreamEvent (String type, MediaStreamEventInit eventInitDict) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public MediaStream stream;

    /*
        Methods
    */
    @JsProperty(name = "stream")
    public native MediaStream getStream();
    @JsProperty(name = "stream")
    public native void setStream(MediaStream value);
}
