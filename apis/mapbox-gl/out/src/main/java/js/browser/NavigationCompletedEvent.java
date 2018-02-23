package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigationCompletedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 529626
  * declared in: tsd/browser/lib.es6.d.ts at pos 529773
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigationCompletedEvent")
public class NavigationCompletedEvent extends NavigationEvent 
{

    /*
        Constructors
    */
    public NavigationCompletedEvent () {
    } 

    /*
        Properties
    */

    public Boolean isSuccess;

    public Number webErrorStatus;

    /*
        Methods
    */
    @JsProperty(name = "isSuccess")
    public native Boolean getIsSuccess();
    @JsProperty(name = "webErrorStatus")
    public native Number getWebErrorStatus();
    @JsProperty(name = "isSuccess")
    public native void setIsSuccess(Boolean value);
    @JsProperty(name = "webErrorStatus")
    public native void setWebErrorStatus(@DoNotAutobox Number value);
}
