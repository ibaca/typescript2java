package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSImportRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 294162
  * declared in: tsd/browser/lib.es6.d.ts at pos 294318
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSImportRule")
public class CSSImportRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSImportRule () {
    } 

    /*
        Properties
    */

    public String href;

    public MediaList media;

    public CSSStyleSheet styleSheet;

    /*
        Methods
    */
    @JsProperty(name = "href")
    public native String getHref();
    @JsProperty(name = "media")
    public native MediaList getMedia();
    @JsProperty(name = "styleSheet")
    public native CSSStyleSheet getStyleSheet();
    @JsProperty(name = "href")
    public native void setHref(String value);
    @JsProperty(name = "media")
    public native void setMedia(MediaList value);
    @JsProperty(name = "styleSheet")
    public native void setStyleSheet(CSSStyleSheet value);
}
