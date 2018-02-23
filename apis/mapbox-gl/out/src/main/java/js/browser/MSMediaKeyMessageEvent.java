package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSMediaKeyMessageEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 510886
  * declared in: tsd/browser/lib.es6.d.ts at pos 511029
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeyMessageEvent")
public class MSMediaKeyMessageEvent extends Event 
{

    /*
        Constructors
    */
    public MSMediaKeyMessageEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String destinationURL;

    public Uint8Array message;

    /*
        Methods
    */
    @JsProperty(name = "destinationURL")
    public native String getDestinationURL();
    @JsProperty(name = "message")
    public native Uint8Array getMessage();
    @JsProperty(name = "destinationURL")
    public native void setDestinationURL(String value);
    @JsProperty(name = "message")
    public native void setMessage(Uint8Array value);
}
