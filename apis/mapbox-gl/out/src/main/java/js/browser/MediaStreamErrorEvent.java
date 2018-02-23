package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamErrorEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 522570
  * declared in: tsd/browser/lib.es6.d.ts at pos 522679
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamErrorEvent")
public class MediaStreamErrorEvent extends Event 
{

    /*
        Constructors
    */
    public MediaStreamErrorEvent (String typeArg, MediaStreamErrorEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public MediaStreamErrorEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public MediaStreamError error;

    /*
        Methods
    */
    @JsProperty(name = "error")
    public native MediaStreamError getError();
    @JsProperty(name = "error")
    public native void setError(MediaStreamError value);
}
