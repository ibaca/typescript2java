package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSMediaRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 294912
  * declared in: tsd/browser/lib.es6.d.ts at pos 295009
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSMediaRule")
public class CSSMediaRule extends CSSConditionRule 
{

    /*
        Constructors
    */
    public CSSMediaRule () {
    } 

    /*
        Properties
    */

    public MediaList media;

    /*
        Methods
    */
    @JsProperty(name = "media")
    public native MediaList getMedia();
    @JsProperty(name = "media")
    public native void setMedia(MediaList value);
}
