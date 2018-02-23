package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigationEventWithReferrer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 530046
  * declared in: tsd/browser/lib.es6.d.ts at pos 530156
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigationEventWithReferrer")
public class NavigationEventWithReferrer extends NavigationEvent 
{

    /*
        Constructors
    */
    public NavigationEventWithReferrer () {
    } 

    /*
        Properties
    */

    public String referer;

    /*
        Methods
    */
    @JsProperty(name = "referer")
    public native String getReferer();
    @JsProperty(name = "referer")
    public native void setReferer(String value);
}
