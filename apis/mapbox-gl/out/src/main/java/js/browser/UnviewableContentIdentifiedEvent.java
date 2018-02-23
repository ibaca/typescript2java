package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: UnviewableContentIdentifiedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 660998
  * declared in: tsd/browser/lib.es6.d.ts at pos 661127
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="UnviewableContentIdentifiedEvent")
public class UnviewableContentIdentifiedEvent extends NavigationEventWithReferrer 
{

    /*
        Constructors
    */
    public UnviewableContentIdentifiedEvent () {
    } 

    /*
        Properties
    */

    public String mediaType;

    /*
        Methods
    */
    @JsProperty(name = "mediaType")
    public native String getMediaType();
    @JsProperty(name = "mediaType")
    public native void setMediaType(String value);
}
