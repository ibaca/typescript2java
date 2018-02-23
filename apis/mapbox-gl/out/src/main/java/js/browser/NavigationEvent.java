package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigationEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 529881
  * declared in: tsd/browser/lib.es6.d.ts at pos 529965
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigationEvent")
public class NavigationEvent extends Event 
{

    /*
        Constructors
    */
    public NavigationEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String uri;

    /*
        Methods
    */
    @JsProperty(name = "uri")
    public native String getUri();
    @JsProperty(name = "uri")
    public native void setUri(String value);
}
