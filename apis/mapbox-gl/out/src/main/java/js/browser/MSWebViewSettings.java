package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSWebViewSettings
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 516047
  * declared in: tsd/browser/lib.es6.d.ts at pos 516160
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSWebViewSettings")
public class MSWebViewSettings
{

    /*
        Constructors
    */
    public MSWebViewSettings () {
    } 

    /*
        Properties
    */

    public Boolean isIndexedDBEnabled;

    public Boolean isJavaScriptEnabled;

    /*
        Methods
    */
    @JsProperty(name = "isIndexedDBEnabled")
    public native Boolean getIsIndexedDBEnabled();
    @JsProperty(name = "isJavaScriptEnabled")
    public native Boolean getIsJavaScriptEnabled();
    @JsProperty(name = "isIndexedDBEnabled")
    public native void setIsIndexedDBEnabled(Boolean value);
    @JsProperty(name = "isJavaScriptEnabled")
    public native void setIsJavaScriptEnabled(Boolean value);
}
