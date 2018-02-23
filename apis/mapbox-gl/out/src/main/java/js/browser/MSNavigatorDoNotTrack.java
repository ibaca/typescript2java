package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: MSNavigatorDoNotTrack
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 732756
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSNavigatorDoNotTrack
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@732796
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    Boolean confirmSiteSpecificTrackingException(ConfirmSiteSpecificExceptionsInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@732895
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    Boolean confirmWebWideTrackingException(ExceptionInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@732969
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    void removeSiteSpecificTrackingException(ExceptionInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@733044
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    void removeWebWideTrackingException(ExceptionInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@733114
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    void storeSiteSpecificTrackingException(StoreSiteSpecificExceptionsInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@733206
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    void storeWebWideTrackingException(StoreExceptionsInformation args);
}
