package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Navigator
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 530273
  * declared in: tsd/browser/lib.es6.d.ts at pos 531445
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Navigator")
public class Navigator implements NavigatorID, NavigatorOnLine, NavigatorContentUtils, NavigatorStorageUtils, NavigatorGeolocation, MSNavigatorDoNotTrack, MSFileSaver, NavigatorBeacon, NavigatorConcurrentHardware, NavigatorUserMedia 
{

    /*
        Constructors
    */
    public Navigator () {
    } 

    /*
        Properties
    */

    public String appCodeName;

    public String appName;

    public String appVersion;

    public WebAuthentication authentication;

    public Boolean cookieEnabled;

    public String gamepadInputEmulation;

    public Geolocation geolocation;

    public Number hardwareConcurrency;

    public String language;

    public Number maxTouchPoints;

    public MediaDevices mediaDevices;

    public MimeTypeArray mimeTypes;

    public Boolean msManipulationViewsEnabled;

    public Number msMaxTouchPoints;

    public Boolean msPointerEnabled;

    public Boolean onLine;

    public String platform;

    public PluginArray plugins;

    public Boolean pointerEnabled;

    public String product;

    public String productSub;

    public ServiceWorkerContainer serviceWorker;

    public String userAgent;

    public String vendor;

    public String vendorSub;

    public Boolean webdriver;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@732796
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    public native Boolean confirmSiteSpecificTrackingException(ConfirmSiteSpecificExceptionsInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@732895
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    public native Boolean confirmWebWideTrackingException(ExceptionInformation args);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "appCodeName")
    public native String getAppCodeName();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "appName")
    public native String getAppName();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "appVersion")
    public native String getAppVersion();
    @JsProperty(name = "authentication")
    public native WebAuthentication getAuthentication();
    @JsProperty(name = "cookieEnabled")
    public native Boolean getCookieEnabled();
    @JsProperty(name = "gamepadInputEmulation")
    public native String getGamepadInputEmulation();
    /** 
      * tsd/browser/lib.es6.d.ts@531072
     */
    public native Array<Gamepad> getGamepads();
    /** 
      * inherited from (js.browser.NavigatorGeolocation)
     */
    @JsProperty(name = "geolocation")
    public native Geolocation getGeolocation();
    /** 
      * inherited from (js.browser.NavigatorConcurrentHardware)
     */
    @JsProperty(name = "hardwareConcurrency")
    public native Number getHardwareConcurrency();
    @JsProperty(name = "language")
    public native String getLanguage();
    @JsProperty(name = "maxTouchPoints")
    public native Number getMaxTouchPoints();
    /** 
      * inherited from (js.browser.NavigatorUserMedia)
     */
    @JsProperty(name = "mediaDevices")
    public native MediaDevices getMediaDevices();
    @JsProperty(name = "mimeTypes")
    public native MimeTypeArray getMimeTypes();
    @JsProperty(name = "msManipulationViewsEnabled")
    public native Boolean getMsManipulationViewsEnabled();
    @JsProperty(name = "msMaxTouchPoints")
    public native Number getMsMaxTouchPoints();
    @JsProperty(name = "msPointerEnabled")
    public native Boolean getMsPointerEnabled();
    /** 
      * inherited from (js.browser.NavigatorOnLine)
     */
    @JsProperty(name = "onLine")
    public native Boolean getOnLine();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "platform")
    public native String getPlatform();
    @JsProperty(name = "plugins")
    public native PluginArray getPlugins();
    @JsProperty(name = "pointerEnabled")
    public native Boolean getPointerEnabled();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "product")
    public native String getProduct();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "productSub")
    public native String getProductSub();
    @JsProperty(name = "serviceWorker")
    public native ServiceWorkerContainer getServiceWorker();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "userAgent")
    public native String getUserAgent();
    /** 
      * tsd/browser/lib.es6.d.ts@734051
      * inherited from (js.browser.NavigatorUserMedia)
     */
    public native void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "vendor")
    public native String getVendor();
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "vendorSub")
    public native String getVendorSub();
    @JsProperty(name = "webdriver")
    public native Boolean getWebdriver();
    /** 
      * tsd/browser/lib.es6.d.ts@531102
     */
    public native Boolean javaEnabled();
    public native void msLaunchUri(String uri);
    public native void msLaunchUri(String uri, MSLaunchUriCallback successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@531130
     */
    public native void msLaunchUri(String uri, MSLaunchUriCallback successCallback /* optional */, MSLaunchUriCallback noHandlerCallback /* optional */);
    public native Boolean msSaveBlob(Object blob);
    /** 
      * tsd/browser/lib.es6.d.ts@732637
      * inherited from (js.browser.MSFileSaver)
     */
    public native Boolean msSaveBlob(Object blob, String defaultName /* optional */);
    public native Boolean msSaveOrOpenBlob(Object blob);
    /** 
      * tsd/browser/lib.es6.d.ts@732695
      * inherited from (js.browser.MSFileSaver)
     */
    public native Boolean msSaveOrOpenBlob(Object blob, String defaultName /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@732969
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    public native void removeSiteSpecificTrackingException(ExceptionInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@733044
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    public native void removeWebWideTrackingException(ExceptionInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@531246
     */
    public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, Array<MediaKeySystemConfiguration> supportedConfigurations);
    public native Boolean sendBeacon(String url);
    /** 
      * tsd/browser/lib.es6.d.ts@733312
      * inherited from (js.browser.NavigatorBeacon)
     */
    public native Boolean sendBeacon(String url, Object data /* optional */);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "appCodeName")
    public native void setAppCodeName(String value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "appName")
    public native void setAppName(String value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "appVersion")
    public native void setAppVersion(String value);
    @JsProperty(name = "authentication")
    public native void setAuthentication(WebAuthentication value);
    @JsProperty(name = "cookieEnabled")
    public native void setCookieEnabled(Boolean value);
    @JsProperty(name = "gamepadInputEmulation")
    public native void setGamepadInputEmulation(String value);
    /** 
      * inherited from (js.browser.NavigatorGeolocation)
     */
    @JsProperty(name = "geolocation")
    public native void setGeolocation(Geolocation value);
    /** 
      * inherited from (js.browser.NavigatorConcurrentHardware)
     */
    @JsProperty(name = "hardwareConcurrency")
    public native void setHardwareConcurrency(@DoNotAutobox Number value);
    @JsProperty(name = "language")
    public native void setLanguage(String value);
    @JsProperty(name = "maxTouchPoints")
    public native void setMaxTouchPoints(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.NavigatorUserMedia)
     */
    @JsProperty(name = "mediaDevices")
    public native void setMediaDevices(MediaDevices value);
    @JsProperty(name = "mimeTypes")
    public native void setMimeTypes(MimeTypeArray value);
    @JsProperty(name = "msManipulationViewsEnabled")
    public native void setMsManipulationViewsEnabled(Boolean value);
    @JsProperty(name = "msMaxTouchPoints")
    public native void setMsMaxTouchPoints(@DoNotAutobox Number value);
    @JsProperty(name = "msPointerEnabled")
    public native void setMsPointerEnabled(Boolean value);
    /** 
      * inherited from (js.browser.NavigatorOnLine)
     */
    @JsProperty(name = "onLine")
    public native void setOnLine(Boolean value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "platform")
    public native void setPlatform(String value);
    @JsProperty(name = "plugins")
    public native void setPlugins(PluginArray value);
    @JsProperty(name = "pointerEnabled")
    public native void setPointerEnabled(Boolean value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "product")
    public native void setProduct(String value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "productSub")
    public native void setProductSub(String value);
    @JsProperty(name = "serviceWorker")
    public native void setServiceWorker(ServiceWorkerContainer value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "userAgent")
    public native void setUserAgent(String value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "vendor")
    public native void setVendor(String value);
    /** 
      * inherited from (js.browser.NavigatorID)
     */
    @JsProperty(name = "vendorSub")
    public native void setVendorSub(String value);
    @JsProperty(name = "webdriver")
    public native void setWebdriver(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@733114
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    public native void storeSiteSpecificTrackingException(StoreSiteSpecificExceptionsInformation args);
    /** 
      * tsd/browser/lib.es6.d.ts@733206
      * inherited from (js.browser.MSNavigatorDoNotTrack)
     */
    public native void storeWebWideTrackingException(StoreExceptionsInformation args);
    public native Boolean vibrate(@DoNotAutobox Number pattern);
    public native Boolean vibrate(Array<Number> pattern);
    /** 
      * tsd/browser/lib.es6.d.ts@531385
     */
    public native Boolean vibrate(UnionOfArrayOfNumberAndNumber pattern);
}
