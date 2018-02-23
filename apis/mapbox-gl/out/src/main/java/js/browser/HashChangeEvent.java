package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HashChangeEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 488937
  * declared in: tsd/browser/lib.es6.d.ts at pos 489067
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HashChangeEvent")
public class HashChangeEvent extends Event 
{

    /*
        Constructors
    */
    public HashChangeEvent (String typeArg, HashChangeEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public HashChangeEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String newURL;

    public String oldURL;

    /*
        Methods
    */
    @JsProperty(name = "newURL")
    public native String getNewURL();
    @JsProperty(name = "oldURL")
    public native String getOldURL();
    @JsProperty(name = "newURL")
    public native void setNewURL(String value);
    @JsProperty(name = "oldURL")
    public native void setOldURL(String value);
}
