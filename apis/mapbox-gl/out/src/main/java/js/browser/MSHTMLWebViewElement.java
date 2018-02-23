package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSHTMLWebViewElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 506092
  * declared in: tsd/browser/lib.es6.d.ts at pos 507582
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSHTMLWebViewElement")
public class MSHTMLWebViewElement extends HTMLElement 
{

    /*
        Constructors
    */
    public MSHTMLWebViewElement () {
    } 

    /*
        Properties
    */

    public Boolean canGoBack;

    public Boolean canGoForward;

    public Number childElementCount;

    public HTMLCollection children;

    public Boolean containsFullScreenElement;

    public String documentTitle;

    public Element firstElementChild;

    public Number height;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    public Element previousElementSibling;

    public MSWebViewSettings settings;

    public String src;

    public Number width;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@506403
     */
    public native void addWebAllowedObject(String name, Object applicationObject);
    /** 
      * tsd/browser/lib.es6.d.ts@506472
     */
    public native String buildLocalStreamUri(String contentIdentifier, String relativePath);
    /** 
      * tsd/browser/lib.es6.d.ts@506554
     */
    public native MSWebViewAsyncOperation capturePreviewToBlobAsync();
    /** 
      * tsd/browser/lib.es6.d.ts@506612
     */
    public native MSWebViewAsyncOperation captureSelectedContentToDataPackageAsync();
    @JsProperty(name = "canGoBack")
    public native Boolean getCanGoBack();
    @JsProperty(name = "canGoForward")
    public native Boolean getCanGoForward();
    @JsProperty(name = "containsFullScreenElement")
    public native Boolean getContainsFullScreenElement();
    /** 
      * tsd/browser/lib.es6.d.ts@506685
     */
    public native DeferredPermissionRequest getDeferredPermissionRequestById(@DoNotAutobox Number id);
    /** 
      * tsd/browser/lib.es6.d.ts@506762
     */
    public native Array<DeferredPermissionRequest> getDeferredPermissionRequests();
    @JsProperty(name = "documentTitle")
    public native String getDocumentTitle();
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "settings")
    public native MSWebViewSettings getSettings();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "width")
    public native Number getWidth();
    /** 
      * tsd/browser/lib.es6.d.ts@506828
     */
    public native void goBack();
    /** 
      * tsd/browser/lib.es6.d.ts@506848
     */
    public native void goForward();
    public native MSWebViewAsyncOperation invokeScriptAsync(String scriptName);
    /** 
      * tsd/browser/lib.es6.d.ts@506871
     */
    public native MSWebViewAsyncOperation invokeScriptAsync(String scriptName, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@506955
     */
    public native void navigate(String uri);
    /** 
      * tsd/browser/lib.es6.d.ts@506988
     */
    public native void navigateFocus(String navigationReason, FocusNavigationOrigin origin);
    /** 
      * tsd/browser/lib.es6.d.ts@507070
     */
    public native void navigateToLocalStreamUri(String source, Object streamResolver);
    /** 
      * tsd/browser/lib.es6.d.ts@507143
     */
    public native void navigateToString(String contents);
    /** 
      * tsd/browser/lib.es6.d.ts@507189
     */
    public native void navigateWithHttpRequestMessage(Object requestMessage);
    /** 
      * tsd/browser/lib.es6.d.ts@507252
     */
    public native void refresh();
    @JsProperty(name = "canGoBack")
    public native void setCanGoBack(Boolean value);
    @JsProperty(name = "canGoForward")
    public native void setCanGoForward(Boolean value);
    @JsProperty(name = "containsFullScreenElement")
    public native void setContainsFullScreenElement(Boolean value);
    @JsProperty(name = "documentTitle")
    public native void setDocumentTitle(String value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "settings")
    public native void setSettings(MSWebViewSettings value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@507273
     */
    public native void stop();
}
