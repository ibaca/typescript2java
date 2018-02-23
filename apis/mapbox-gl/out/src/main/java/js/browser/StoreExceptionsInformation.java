package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StoreExceptionsInformation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 280935
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface StoreExceptionsInformation extends ExceptionInformation 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "detailURI")
    String getDetailURI();
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "explanationString")
    String getExplanationString();
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "siteName")
    String getSiteName();
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "detailURI")
    void setDetailURI(String value);
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "explanationString")
    void setExplanationString(String value);
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "siteName")
    void setSiteName(String value);
}
