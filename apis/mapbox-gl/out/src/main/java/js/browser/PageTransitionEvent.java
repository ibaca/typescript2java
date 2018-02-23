package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PageTransitionEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 540120
  * declared in: tsd/browser/lib.es6.d.ts at pos 540215
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PageTransitionEvent")
public class PageTransitionEvent extends Event 
{

    /*
        Constructors
    */
    public PageTransitionEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Boolean persisted;

    /*
        Methods
    */
    @JsProperty(name = "persisted")
    public native Boolean getPersisted();
    @JsProperty(name = "persisted")
    public native void setPersisted(Boolean value);
}
