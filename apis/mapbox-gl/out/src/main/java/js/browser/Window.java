package js.browser;

import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Window
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 707084
  * declared in: tsd/browser/lib.es6.d.ts at pos 715983
  * 1 constructors
  * 
  * original implementationSuperTypes :
  * - js.browser.EventTarget
  * - js.browser.WindowTimers
  * original super type js.browser.EventTarget has been replaced by js.browser.EventTarget_Interface
  * 
  * original implementationSuperTypes :
  * - js.browser.EventTarget
  * - js.browser.WindowTimers
  * original super type js.browser.WindowTimers has been replaced by js.browser.WindowTimers_Interface
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Window")
public class Window implements WindowSessionStorage, WindowLocalStorage, WindowConsole, GlobalEventHandlers, IDBEnvironment, WindowBase64, GlobalFetch, EventTarget_Interface, WindowTimers_Interface 
{

    /*
        Constructors
    */
    public Window () {
    } 

    /*
        Properties
    */

    public Object Blob;

    public Object URL;

    public ApplicationCache applicationCache;

    public CacheStorage caches;

    public Navigator clientInformation;

    public Boolean closed;

    public Console console;

    public Crypto crypto;

    public CustomElementRegistry customElements;

    public String defaultStatus;

    public Number devicePixelRatio;

    public String doNotTrack;

    public Document document;

    public Event event;

    public External external;

    public Element frameElement;

    public Window frames;

    public History history;

    public IDBFactory indexedDB;

    public Number innerHeight;

    public Number innerWidth;

    public Boolean isSecureContext;

    public int length;

    public Storage localStorage;

    public Location location;

    public BarProp locationbar;

    public BarProp menubar;

    public ExtensionScriptApis msContentScript;

    public MSCredentials msCredentials;

    public String name;

    public Navigator navigator;

    public UnionOfBooleanAndString offscreenBuffering;

    public Function1<UIEvent, Object> onabort;

    public Function1<Event, Object> onafterprint;

    public Function1<Event, Object> onbeforeprint;

    public Function1<BeforeUnloadEvent, Object> onbeforeunload;

    public Function1<FocusEvent, Object> onblur;

    public Function1<Event, Object> oncanplay;

    public Function1<Event, Object> oncanplaythrough;

    public Function1<Event, Object> onchange;

    public Function1<MouseEvent, Object> onclick;

    public Function1<Event, Object> oncompassneedscalibration;

    public Function1<PointerEvent, Object> oncontextmenu;

    public Function1<MouseEvent, Object> ondblclick;

    public Function1<DeviceLightEvent, Object> ondevicelight;

    public Function1<DeviceMotionEvent, Object> ondevicemotion;

    public Function1<DeviceOrientationEvent, Object> ondeviceorientation;

    public Function1<DragEvent, Object> ondrag;

    public Function1<DragEvent, Object> ondragend;

    public Function1<DragEvent, Object> ondragenter;

    public Function1<DragEvent, Object> ondragleave;

    public Function1<DragEvent, Object> ondragover;

    public Function1<DragEvent, Object> ondragstart;

    public Function1<DragEvent, Object> ondrop;

    public Function1<Event, Object> ondurationchange;

    public Function1<Event, Object> onemptied;

    public Function1<MediaStreamErrorEvent, Object> onended;

    public ErrorEventHandler onerror;

    public Function1<FocusEvent, Object> onfocus;

    public Function1<HashChangeEvent, Object> onhashchange;

    public Function1<Event, Object> oninput;

    public Function1<Event, Object> oninvalid;

    public Function1<KeyboardEvent, Object> onkeydown;

    public Function1<KeyboardEvent, Object> onkeypress;

    public Function1<KeyboardEvent, Object> onkeyup;

    public Function1<Event, Object> onload;

    public Function1<Event, Object> onloadeddata;

    public Function1<Event, Object> onloadedmetadata;

    public Function1<Event, Object> onloadstart;

    public Function1<MessageEvent, Object> onmessage;

    public Function1<MouseEvent, Object> onmousedown;

    public Function1<MouseEvent, Object> onmouseenter;

    public Function1<MouseEvent, Object> onmouseleave;

    public Function1<MouseEvent, Object> onmousemove;

    public Function1<MouseEvent, Object> onmouseout;

    public Function1<MouseEvent, Object> onmouseover;

    public Function1<MouseEvent, Object> onmouseup;

    public Function1<WheelEvent, Object> onmousewheel;

    public Function1<MSGestureEvent, Object> onmsgesturechange;

    public Function1<MSGestureEvent, Object> onmsgesturedoubletap;

    public Function1<MSGestureEvent, Object> onmsgestureend;

    public Function1<MSGestureEvent, Object> onmsgesturehold;

    public Function1<MSGestureEvent, Object> onmsgesturestart;

    public Function1<MSGestureEvent, Object> onmsgesturetap;

    public Function1<MSGestureEvent, Object> onmsinertiastart;

    public Function1<MSPointerEvent, Object> onmspointercancel;

    public Function1<MSPointerEvent, Object> onmspointerdown;

    public Function1<MSPointerEvent, Object> onmspointerenter;

    public Function1<MSPointerEvent, Object> onmspointerleave;

    public Function1<MSPointerEvent, Object> onmspointermove;

    public Function1<MSPointerEvent, Object> onmspointerout;

    public Function1<MSPointerEvent, Object> onmspointerover;

    public Function1<MSPointerEvent, Object> onmspointerup;

    public Function1<Event, Object> onoffline;

    public Function1<Event, Object> ononline;

    public Function1<Event, Object> onorientationchange;

    public Function1<PageTransitionEvent, Object> onpagehide;

    public Function1<PageTransitionEvent, Object> onpageshow;

    public Function1<Event, Object> onpause;

    public Function1<Event, Object> onplay;

    public Function1<Event, Object> onplaying;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<PopStateEvent, Object> onpopstate;

    public Function1<ProgressEvent, Object> onprogress;

    public Function1<Event, Object> onratechange;

    public Function1<ProgressEvent, Object> onreadystatechange;

    public Function1<Event, Object> onreset;

    public Function1<UIEvent, Object> onresize;

    public Function1<UIEvent, Object> onscroll;

    public Function1<Event, Object> onseeked;

    public Function1<Event, Object> onseeking;

    public Function1<UIEvent, Object> onselect;

    public Function1<Event, Object> onstalled;

    public Function1<StorageEvent, Object> onstorage;

    public Function1<Event, Object> onsubmit;

    public Function1<Event, Object> onsuspend;

    public Function1<Event, Object> ontimeupdate;

    public Function1<TouchEvent, Object> ontouchcancel;

    public Function1<TouchEvent, Object> ontouchend;

    public Function1<TouchEvent, Object> ontouchmove;

    public Function1<TouchEvent, Object> ontouchstart;

    public Function1<Event, Object> onunload;

    public Function1<Event, Object> onvolumechange;

    public Function1<Event, Object> onwaiting;

    public Function1<WheelEvent, Object> onwheel;

    public Object opener;

    public PropertyKey_UnionOfFakeEsSymbolAndNumberAndString orientation;

    public Number outerHeight;

    public Number outerWidth;

    public Number pageXOffset;

    public Number pageYOffset;

    public Window parent;

    public Performance performance;

    public BarProp personalbar;

    public Screen screen;

    public Number screenLeft;

    public Number screenTop;

    public Number screenX;

    public Number screenY;

    public Number scrollX;

    public Number scrollY;

    public BarProp scrollbars;

    public Window self;

    public Storage sessionStorage;

    public SpeechSynthesis speechSynthesis;

    public String status;

    public BarProp statusbar;

    public StyleMedia styleMedia;

    public BarProp toolbar;

    public Window top;

    public Window window;

    /*
        Methods
    */
    public native void addEventListener(String type, EventListenerObject listener);
    public native void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    public native void addEventListener(String type, EventListener listener);
    public native void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * tsd/browser/lib.es6.d.ts@730813
      * inherited from (js.browser.GlobalEventHandlers)
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
    public native void alert();
    /** 
      * tsd/browser/lib.es6.d.ts@714058
     */
    public native void alert(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@735437
      * inherited from (js.browser.WindowBase64)
     */
    public native String atob(String encodedString);
    /** 
      * tsd/browser/lib.es6.d.ts@714090
     */
    public native void blur();
    /** 
      * tsd/browser/lib.es6.d.ts@735478
      * inherited from (js.browser.WindowBase64)
     */
    public native String btoa(String rawString);
    /** 
      * tsd/browser/lib.es6.d.ts@714108
     */
    public native void cancelAnimationFrame(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@714156
     */
    public native void captureEvents();
    /** 
      * tsd/browser/lib.es6.d.ts@736195
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    public native void clearImmediate(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@735785
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native void clearInterval(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@735826
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native void clearTimeout(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@714183
     */
    public native void close();
    public native Boolean confirm();
    /** 
      * tsd/browser/lib.es6.d.ts@714202
     */
    public native Boolean confirm(String message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714242
     */
    public native void departFocus(String navigationReason, FocusNavigationOrigin origin);
    /** 
      * tsd/browser/lib.es6.d.ts@373380
      * inherited from (js.browser.EventTarget_Interface)
     */
    public native Boolean dispatchEvent(Event evt);
    public native Promise<Response> fetch(String input);
    public native Promise<Response> fetch(String input, RequestInit init /* optional */);
    public native Promise<Response> fetch(Request input);
    public native Promise<Response> fetch(Request input, RequestInit init /* optional */);
    public native Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input);
    /** 
      * tsd/browser/lib.es6.d.ts@730950
      * inherited from (js.browser.GlobalFetch)
     */
    public native Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input, RequestInit init /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714322
     */
    public native void focus();
    @JsProperty(name = "applicationCache")
    public native ApplicationCache getApplicationCache();
    @JsProperty(name = "Blob")
    public native Object getBlob();
    @JsProperty(name = "caches")
    public native CacheStorage getCaches();
    @JsProperty(name = "clientInformation")
    public native Navigator getClientInformation();
    @JsProperty(name = "closed")
    public native Boolean getClosed();
    public native CSSStyleDeclaration getComputedStyle(Element elt);
    /** 
      * tsd/browser/lib.es6.d.ts@714341
     */
    public native CSSStyleDeclaration getComputedStyle(Element elt, String pseudoElt /* optional */);
    /** 
      * inherited from (js.browser.WindowConsole)
     */
    @JsProperty(name = "console")
    public native Console getConsole();
    @JsProperty(name = "crypto")
    public native Crypto getCrypto();
    @JsProperty(name = "customElements")
    public native CustomElementRegistry getCustomElements();
    @JsProperty(name = "defaultStatus")
    public native String getDefaultStatus();
    @JsProperty(name = "devicePixelRatio")
    public native Number getDevicePixelRatio();
    @JsProperty(name = "doNotTrack")
    public native String getDoNotTrack();
    @JsProperty(name = "document")
    public native Document getDocument();
    @JsProperty(name = "event")
    public native Event getEvent();
    @JsProperty(name = "external")
    public native External getExternal();
    @JsProperty(name = "frameElement")
    public native Element getFrameElement();
    @JsProperty(name = "frames")
    public native Window getFrames();
    @JsProperty(name = "history")
    public native History getHistory();
    /** 
      * inherited from (js.browser.IDBEnvironment)
     */
    @JsProperty(name = "indexedDB")
    public native IDBFactory getIndexedDB();
    @JsProperty(name = "innerHeight")
    public native Number getInnerHeight();
    @JsProperty(name = "innerWidth")
    public native Number getInnerWidth();
    @JsProperty(name = "isSecureContext")
    public native Boolean getIsSecureContext();
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * inherited from (js.browser.WindowLocalStorage)
     */
    @JsProperty(name = "localStorage")
    public native Storage getLocalStorage();
    @JsProperty(name = "location")
    public native Location getLocation();
    @JsProperty(name = "locationbar")
    public native BarProp getLocationbar();
    public native CSSRuleList getMatchedCSSRules(Element elt);
    /** 
      * tsd/browser/lib.es6.d.ts@714418
     */
    public native CSSRuleList getMatchedCSSRules(Element elt, String pseudoElt /* optional */);
    @JsProperty(name = "menubar")
    public native BarProp getMenubar();
    @JsProperty(name = "msContentScript")
    public native ExtensionScriptApis getMsContentScript();
    @JsProperty(name = "msCredentials")
    public native MSCredentials getMsCredentials();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "navigator")
    public native Navigator getNavigator();
    @JsProperty(name = "offscreenBuffering")
    public native UnionOfBooleanAndString getOffscreenBuffering();
    @JsProperty(name = "onabort")
    public native Function1<UIEvent, Object> getOnabort();
    @JsProperty(name = "onafterprint")
    public native Function1<Event, Object> getOnafterprint();
    @JsProperty(name = "onbeforeprint")
    public native Function1<Event, Object> getOnbeforeprint();
    @JsProperty(name = "onbeforeunload")
    public native Function1<BeforeUnloadEvent, Object> getOnbeforeunload();
    @JsProperty(name = "onblur")
    public native Function1<FocusEvent, Object> getOnblur();
    @JsProperty(name = "oncanplay")
    public native Function1<Event, Object> getOncanplay();
    @JsProperty(name = "oncanplaythrough")
    public native Function1<Event, Object> getOncanplaythrough();
    @JsProperty(name = "onchange")
    public native Function1<Event, Object> getOnchange();
    @JsProperty(name = "onclick")
    public native Function1<MouseEvent, Object> getOnclick();
    @JsProperty(name = "oncompassneedscalibration")
    public native Function1<Event, Object> getOncompassneedscalibration();
    @JsProperty(name = "oncontextmenu")
    public native Function1<PointerEvent, Object> getOncontextmenu();
    @JsProperty(name = "ondblclick")
    public native Function1<MouseEvent, Object> getOndblclick();
    @JsProperty(name = "ondevicelight")
    public native Function1<DeviceLightEvent, Object> getOndevicelight();
    @JsProperty(name = "ondevicemotion")
    public native Function1<DeviceMotionEvent, Object> getOndevicemotion();
    @JsProperty(name = "ondeviceorientation")
    public native Function1<DeviceOrientationEvent, Object> getOndeviceorientation();
    @JsProperty(name = "ondrag")
    public native Function1<DragEvent, Object> getOndrag();
    @JsProperty(name = "ondragend")
    public native Function1<DragEvent, Object> getOndragend();
    @JsProperty(name = "ondragenter")
    public native Function1<DragEvent, Object> getOndragenter();
    @JsProperty(name = "ondragleave")
    public native Function1<DragEvent, Object> getOndragleave();
    @JsProperty(name = "ondragover")
    public native Function1<DragEvent, Object> getOndragover();
    @JsProperty(name = "ondragstart")
    public native Function1<DragEvent, Object> getOndragstart();
    @JsProperty(name = "ondrop")
    public native Function1<DragEvent, Object> getOndrop();
    @JsProperty(name = "ondurationchange")
    public native Function1<Event, Object> getOndurationchange();
    @JsProperty(name = "onemptied")
    public native Function1<Event, Object> getOnemptied();
    @JsProperty(name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();
    @JsProperty(name = "onerror")
    public native ErrorEventHandler getOnerror();
    @JsProperty(name = "onfocus")
    public native Function1<FocusEvent, Object> getOnfocus();
    @JsProperty(name = "onhashchange")
    public native Function1<HashChangeEvent, Object> getOnhashchange();
    @JsProperty(name = "oninput")
    public native Function1<Event, Object> getOninput();
    @JsProperty(name = "oninvalid")
    public native Function1<Event, Object> getOninvalid();
    @JsProperty(name = "onkeydown")
    public native Function1<KeyboardEvent, Object> getOnkeydown();
    @JsProperty(name = "onkeypress")
    public native Function1<KeyboardEvent, Object> getOnkeypress();
    @JsProperty(name = "onkeyup")
    public native Function1<KeyboardEvent, Object> getOnkeyup();
    @JsProperty(name = "onload")
    public native Function1<Event, Object> getOnload();
    @JsProperty(name = "onloadeddata")
    public native Function1<Event, Object> getOnloadeddata();
    @JsProperty(name = "onloadedmetadata")
    public native Function1<Event, Object> getOnloadedmetadata();
    @JsProperty(name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();
    @JsProperty(name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();
    @JsProperty(name = "onmousedown")
    public native Function1<MouseEvent, Object> getOnmousedown();
    @JsProperty(name = "onmouseenter")
    public native Function1<MouseEvent, Object> getOnmouseenter();
    @JsProperty(name = "onmouseleave")
    public native Function1<MouseEvent, Object> getOnmouseleave();
    @JsProperty(name = "onmousemove")
    public native Function1<MouseEvent, Object> getOnmousemove();
    @JsProperty(name = "onmouseout")
    public native Function1<MouseEvent, Object> getOnmouseout();
    @JsProperty(name = "onmouseover")
    public native Function1<MouseEvent, Object> getOnmouseover();
    @JsProperty(name = "onmouseup")
    public native Function1<MouseEvent, Object> getOnmouseup();
    @JsProperty(name = "onmousewheel")
    public native Function1<WheelEvent, Object> getOnmousewheel();
    @JsProperty(name = "onmsgesturechange")
    public native Function1<MSGestureEvent, Object> getOnmsgesturechange();
    @JsProperty(name = "onmsgesturedoubletap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturedoubletap();
    @JsProperty(name = "onmsgestureend")
    public native Function1<MSGestureEvent, Object> getOnmsgestureend();
    @JsProperty(name = "onmsgesturehold")
    public native Function1<MSGestureEvent, Object> getOnmsgesturehold();
    @JsProperty(name = "onmsgesturestart")
    public native Function1<MSGestureEvent, Object> getOnmsgesturestart();
    @JsProperty(name = "onmsgesturetap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturetap();
    @JsProperty(name = "onmsinertiastart")
    public native Function1<MSGestureEvent, Object> getOnmsinertiastart();
    @JsProperty(name = "onmspointercancel")
    public native Function1<MSPointerEvent, Object> getOnmspointercancel();
    @JsProperty(name = "onmspointerdown")
    public native Function1<MSPointerEvent, Object> getOnmspointerdown();
    @JsProperty(name = "onmspointerenter")
    public native Function1<MSPointerEvent, Object> getOnmspointerenter();
    @JsProperty(name = "onmspointerleave")
    public native Function1<MSPointerEvent, Object> getOnmspointerleave();
    @JsProperty(name = "onmspointermove")
    public native Function1<MSPointerEvent, Object> getOnmspointermove();
    @JsProperty(name = "onmspointerout")
    public native Function1<MSPointerEvent, Object> getOnmspointerout();
    @JsProperty(name = "onmspointerover")
    public native Function1<MSPointerEvent, Object> getOnmspointerover();
    @JsProperty(name = "onmspointerup")
    public native Function1<MSPointerEvent, Object> getOnmspointerup();
    @JsProperty(name = "onoffline")
    public native Function1<Event, Object> getOnoffline();
    @JsProperty(name = "ononline")
    public native Function1<Event, Object> getOnonline();
    @JsProperty(name = "onorientationchange")
    public native Function1<Event, Object> getOnorientationchange();
    @JsProperty(name = "onpagehide")
    public native Function1<PageTransitionEvent, Object> getOnpagehide();
    @JsProperty(name = "onpageshow")
    public native Function1<PageTransitionEvent, Object> getOnpageshow();
    @JsProperty(name = "onpause")
    public native Function1<Event, Object> getOnpause();
    @JsProperty(name = "onplay")
    public native Function1<Event, Object> getOnplay();
    @JsProperty(name = "onplaying")
    public native Function1<Event, Object> getOnplaying();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointercancel")
    public native Function1<PointerEvent, Object> getOnpointercancel();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerdown")
    public native Function1<PointerEvent, Object> getOnpointerdown();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerenter")
    public native Function1<PointerEvent, Object> getOnpointerenter();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerleave")
    public native Function1<PointerEvent, Object> getOnpointerleave();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointermove")
    public native Function1<PointerEvent, Object> getOnpointermove();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerout")
    public native Function1<PointerEvent, Object> getOnpointerout();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerover")
    public native Function1<PointerEvent, Object> getOnpointerover();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerup")
    public native Function1<PointerEvent, Object> getOnpointerup();
    @JsProperty(name = "onpopstate")
    public native Function1<PopStateEvent, Object> getOnpopstate();
    @JsProperty(name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();
    @JsProperty(name = "onratechange")
    public native Function1<Event, Object> getOnratechange();
    @JsProperty(name = "onreadystatechange")
    public native Function1<ProgressEvent, Object> getOnreadystatechange();
    @JsProperty(name = "onreset")
    public native Function1<Event, Object> getOnreset();
    @JsProperty(name = "onresize")
    public native Function1<UIEvent, Object> getOnresize();
    @JsProperty(name = "onscroll")
    public native Function1<UIEvent, Object> getOnscroll();
    @JsProperty(name = "onseeked")
    public native Function1<Event, Object> getOnseeked();
    @JsProperty(name = "onseeking")
    public native Function1<Event, Object> getOnseeking();
    @JsProperty(name = "onselect")
    public native Function1<UIEvent, Object> getOnselect();
    @JsProperty(name = "onstalled")
    public native Function1<Event, Object> getOnstalled();
    @JsProperty(name = "onstorage")
    public native Function1<StorageEvent, Object> getOnstorage();
    @JsProperty(name = "onsubmit")
    public native Function1<Event, Object> getOnsubmit();
    @JsProperty(name = "onsuspend")
    public native Function1<Event, Object> getOnsuspend();
    @JsProperty(name = "ontimeupdate")
    public native Function1<Event, Object> getOntimeupdate();
    @JsProperty(name = "ontouchcancel")
    public native Function1<TouchEvent, Object> getOntouchcancel();
    @JsProperty(name = "ontouchend")
    public native Function1<TouchEvent, Object> getOntouchend();
    @JsProperty(name = "ontouchmove")
    public native Function1<TouchEvent, Object> getOntouchmove();
    @JsProperty(name = "ontouchstart")
    public native Function1<TouchEvent, Object> getOntouchstart();
    @JsProperty(name = "onunload")
    public native Function1<Event, Object> getOnunload();
    @JsProperty(name = "onvolumechange")
    public native Function1<Event, Object> getOnvolumechange();
    @JsProperty(name = "onwaiting")
    public native Function1<Event, Object> getOnwaiting();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    public native Function1<WheelEvent, Object> getOnwheel();
    @JsProperty(name = "opener")
    public native Object getOpener();
    @JsProperty(name = "orientation")
    public native PropertyKey_UnionOfFakeEsSymbolAndNumberAndString getOrientation();
    @JsProperty(name = "outerHeight")
    public native Number getOuterHeight();
    @JsProperty(name = "outerWidth")
    public native Number getOuterWidth();
    @JsProperty(name = "pageXOffset")
    public native Number getPageXOffset();
    @JsProperty(name = "pageYOffset")
    public native Number getPageYOffset();
    @JsProperty(name = "parent")
    public native Window getParent();
    @JsProperty(name = "performance")
    public native Performance getPerformance();
    @JsProperty(name = "personalbar")
    public native BarProp getPersonalbar();
    @JsProperty(name = "screen")
    public native Screen getScreen();
    @JsProperty(name = "screenLeft")
    public native Number getScreenLeft();
    @JsProperty(name = "screenTop")
    public native Number getScreenTop();
    @JsProperty(name = "screenX")
    public native Number getScreenX();
    @JsProperty(name = "screenY")
    public native Number getScreenY();
    @JsProperty(name = "scrollX")
    public native Number getScrollX();
    @JsProperty(name = "scrollY")
    public native Number getScrollY();
    @JsProperty(name = "scrollbars")
    public native BarProp getScrollbars();
    /** 
      * tsd/browser/lib.es6.d.ts@714489
     */
    public native Selection getSelection();
    @JsProperty(name = "self")
    public native Window getSelf();
    /** 
      * inherited from (js.browser.WindowSessionStorage)
     */
    @JsProperty(name = "sessionStorage")
    public native Storage getSessionStorage();
    @JsProperty(name = "speechSynthesis")
    public native SpeechSynthesis getSpeechSynthesis();
    @JsProperty(name = "status")
    public native String getStatus();
    @JsProperty(name = "statusbar")
    public native BarProp getStatusbar();
    @JsProperty(name = "styleMedia")
    public native StyleMedia getStyleMedia();
    @JsProperty(name = "toolbar")
    public native BarProp getToolbar();
    @JsProperty(name = "top")
    public native Window getTop();
    @JsProperty(name = "URL")
    public native Object getURL();
    @JsProperty(name = "window")
    public native Window getWindow();
    /** 
      * tsd/browser/lib.es6.d.ts@714520
     */
    public native MediaQueryList matchMedia(String mediaQuery);
    public native void moveBy();
    public native void moveBy(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714572
     */
    public native void moveBy(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    public native void moveTo();
    public native void moveTo(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714614
     */
    public native void moveTo(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714656
     */
    public native void msWriteProfilerMark(String profilerMarkName);
    public native Window open();
    public native Window open(String url /* optional */);
    public native Window open(String url /* optional */, String target /* optional */);
    public native Window open(String url /* optional */, String target /* optional */, String features /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714713
     */
    public native Window open(String url /* optional */, String target /* optional */, String features /* optional */, Boolean replace /* optional */);
    public native void postMessage(Object message, String targetOrigin);
    /** 
      * tsd/browser/lib.es6.d.ts@714800
     */
    public native void postMessage(Object message, String targetOrigin, Array<Object> transfer /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714877
     */
    public native void print();
    public native String prompt();
    public native String prompt(String message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714896
     */
    public native String prompt(String message /* optional */, String _default /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714960
     */
    public native void releaseEvents();
    public native void removeEventListener(String type);
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    public native void removeEventListener(String type, EventListener listener /* optional */);
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373420
      * inherited from (js.browser.EventTarget_Interface)
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@714987
     */
    public native Number requestAnimationFrame(FrameRequestCallback callback);
    public native void resizeBy();
    public native void resizeBy(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715054
     */
    public native void resizeBy(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    public native void resizeTo();
    public native void resizeTo(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715098
     */
    public native void resizeTo(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    public native void scroll();
    public native void scroll(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715142
     */
    public native void scroll(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715577
      * VERSION 1
     */
    public native void scroll(ScrollToOptions options /* optional */);
    public native void scrollBy();
    public native void scrollBy(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715184
     */
    public native void scrollBy(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715669
      * VERSION 1
     */
    public native void scrollBy(ScrollToOptions options /* optional */);
    public native void scrollTo();
    public native void scrollTo(@DoNotAutobox Number x /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715228
     */
    public native void scrollTo(@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@715622
      * VERSION 1
     */
    public native void scrollTo(ScrollToOptions options /* optional */);
    @JsProperty(name = "applicationCache")
    public native void setApplicationCache(ApplicationCache value);
    @JsProperty(name = "Blob")
    public native void setBlob(Object value);
    @JsProperty(name = "caches")
    public native void setCaches(CacheStorage value);
    @JsProperty(name = "clientInformation")
    public native void setClientInformation(Navigator value);
    @JsProperty(name = "closed")
    public native void setClosed(Boolean value);
    /** 
      * inherited from (js.browser.WindowConsole)
     */
    @JsProperty(name = "console")
    public native void setConsole(Console value);
    @JsProperty(name = "crypto")
    public native void setCrypto(Crypto value);
    @JsProperty(name = "customElements")
    public native void setCustomElements(CustomElementRegistry value);
    @JsProperty(name = "defaultStatus")
    public native void setDefaultStatus(String value);
    @JsProperty(name = "devicePixelRatio")
    public native void setDevicePixelRatio(@DoNotAutobox Number value);
    @JsProperty(name = "doNotTrack")
    public native void setDoNotTrack(String value);
    @JsProperty(name = "document")
    public native void setDocument(Document value);
    @JsProperty(name = "event")
    public native void setEvent(Event value);
    @JsProperty(name = "external")
    public native void setExternal(External value);
    @JsProperty(name = "frameElement")
    public native void setFrameElement(Element value);
    @JsProperty(name = "frames")
    public native void setFrames(Window value);
    @JsProperty(name = "history")
    public native void setHistory(History value);
    public native Number setImmediate(Object handler);
    /** 
      * tsd/browser/lib.es6.d.ts@736298
      * VERSION 1
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    public native Number setImmediate(Object handler, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@736237
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    public native Number setImmediate(Action1<Object> handler);
    /** 
      * inherited from (js.browser.IDBEnvironment)
     */
    @JsProperty(name = "indexedDB")
    public native void setIndexedDB(IDBFactory value);
    @JsProperty(name = "innerHeight")
    public native void setInnerHeight(@DoNotAutobox Number value);
    @JsProperty(name = "innerWidth")
    public native void setInnerWidth(@DoNotAutobox Number value);
    public native Number setInterval(Object handler);
    public native Number setInterval(Object handler, Object timeout /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@735943
      * VERSION 1
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setInterval(Object handler, Object timeout /* optional */, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@735866
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setInterval(Action1<Object> handler, @DoNotAutobox Number timeout);
    @JsProperty(name = "isSecureContext")
    public native void setIsSecureContext(Boolean value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.WindowLocalStorage)
     */
    @JsProperty(name = "localStorage")
    public native void setLocalStorage(Storage value);
    @JsProperty(name = "location")
    public native void setLocation(Location value);
    @JsProperty(name = "locationbar")
    public native void setLocationbar(BarProp value);
    @JsProperty(name = "menubar")
    public native void setMenubar(BarProp value);
    @JsProperty(name = "msContentScript")
    public native void setMsContentScript(ExtensionScriptApis value);
    @JsProperty(name = "msCredentials")
    public native void setMsCredentials(MSCredentials value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "navigator")
    public native void setNavigator(Navigator value);
    @JsProperty(name = "offscreenBuffering")
    public native void setOffscreenBuffering(String value);
    @JsProperty(name = "offscreenBuffering")
    public native void setOffscreenBuffering(Boolean value);
    @JsProperty(name = "offscreenBuffering")
    public native void setOffscreenBuffering(UnionOfBooleanAndString value);
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<UIEvent, Object> value);
    @JsProperty(name = "onafterprint")
    public native void setOnafterprint(Function1<Event, Object> value);
    @JsProperty(name = "onbeforeprint")
    public native void setOnbeforeprint(Function1<Event, Object> value);
    @JsProperty(name = "onbeforeunload")
    public native void setOnbeforeunload(Function1<BeforeUnloadEvent, Object> value);
    @JsProperty(name = "onblur")
    public native void setOnblur(Function1<FocusEvent, Object> value);
    @JsProperty(name = "oncanplay")
    public native void setOncanplay(Function1<Event, Object> value);
    @JsProperty(name = "oncanplaythrough")
    public native void setOncanplaythrough(Function1<Event, Object> value);
    @JsProperty(name = "onchange")
    public native void setOnchange(Function1<Event, Object> value);
    @JsProperty(name = "onclick")
    public native void setOnclick(Function1<MouseEvent, Object> value);
    @JsProperty(name = "oncompassneedscalibration")
    public native void setOncompassneedscalibration(Function1<Event, Object> value);
    @JsProperty(name = "oncontextmenu")
    public native void setOncontextmenu(Function1<PointerEvent, Object> value);
    @JsProperty(name = "ondblclick")
    public native void setOndblclick(Function1<MouseEvent, Object> value);
    @JsProperty(name = "ondevicelight")
    public native void setOndevicelight(Function1<DeviceLightEvent, Object> value);
    @JsProperty(name = "ondevicemotion")
    public native void setOndevicemotion(Function1<DeviceMotionEvent, Object> value);
    @JsProperty(name = "ondeviceorientation")
    public native void setOndeviceorientation(Function1<DeviceOrientationEvent, Object> value);
    @JsProperty(name = "ondrag")
    public native void setOndrag(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragend")
    public native void setOndragend(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragenter")
    public native void setOndragenter(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragleave")
    public native void setOndragleave(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragover")
    public native void setOndragover(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragstart")
    public native void setOndragstart(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondrop")
    public native void setOndrop(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondurationchange")
    public native void setOndurationchange(Function1<Event, Object> value);
    @JsProperty(name = "onemptied")
    public native void setOnemptied(Function1<Event, Object> value);
    @JsProperty(name = "onended")
    public native void setOnended(Function1<MediaStreamErrorEvent, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(ErrorEventHandler value);
    @JsProperty(name = "onfocus")
    public native void setOnfocus(Function1<FocusEvent, Object> value);
    @JsProperty(name = "onhashchange")
    public native void setOnhashchange(Function1<HashChangeEvent, Object> value);
    @JsProperty(name = "oninput")
    public native void setOninput(Function1<Event, Object> value);
    @JsProperty(name = "oninvalid")
    public native void setOninvalid(Function1<Event, Object> value);
    @JsProperty(name = "onkeydown")
    public native void setOnkeydown(Function1<KeyboardEvent, Object> value);
    @JsProperty(name = "onkeypress")
    public native void setOnkeypress(Function1<KeyboardEvent, Object> value);
    @JsProperty(name = "onkeyup")
    public native void setOnkeyup(Function1<KeyboardEvent, Object> value);
    @JsProperty(name = "onload")
    public native void setOnload(Function1<Event, Object> value);
    @JsProperty(name = "onloadeddata")
    public native void setOnloadeddata(Function1<Event, Object> value);
    @JsProperty(name = "onloadedmetadata")
    public native void setOnloadedmetadata(Function1<Event, Object> value);
    @JsProperty(name = "onloadstart")
    public native void setOnloadstart(Function1<Event, Object> value);
    @JsProperty(name = "onmessage")
    public native void setOnmessage(Function1<MessageEvent, Object> value);
    @JsProperty(name = "onmousedown")
    public native void setOnmousedown(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseenter")
    public native void setOnmouseenter(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseleave")
    public native void setOnmouseleave(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmousemove")
    public native void setOnmousemove(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseout")
    public native void setOnmouseout(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseover")
    public native void setOnmouseover(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseup")
    public native void setOnmouseup(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmousewheel")
    public native void setOnmousewheel(Function1<WheelEvent, Object> value);
    @JsProperty(name = "onmsgesturechange")
    public native void setOnmsgesturechange(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturedoubletap")
    public native void setOnmsgesturedoubletap(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgestureend")
    public native void setOnmsgestureend(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturehold")
    public native void setOnmsgesturehold(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturestart")
    public native void setOnmsgesturestart(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturetap")
    public native void setOnmsgesturetap(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsinertiastart")
    public native void setOnmsinertiastart(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmspointercancel")
    public native void setOnmspointercancel(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerdown")
    public native void setOnmspointerdown(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerenter")
    public native void setOnmspointerenter(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerleave")
    public native void setOnmspointerleave(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointermove")
    public native void setOnmspointermove(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerout")
    public native void setOnmspointerout(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerover")
    public native void setOnmspointerover(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerup")
    public native void setOnmspointerup(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onoffline")
    public native void setOnoffline(Function1<Event, Object> value);
    @JsProperty(name = "ononline")
    public native void setOnonline(Function1<Event, Object> value);
    @JsProperty(name = "onorientationchange")
    public native void setOnorientationchange(Function1<Event, Object> value);
    @JsProperty(name = "onpagehide")
    public native void setOnpagehide(Function1<PageTransitionEvent, Object> value);
    @JsProperty(name = "onpageshow")
    public native void setOnpageshow(Function1<PageTransitionEvent, Object> value);
    @JsProperty(name = "onpause")
    public native void setOnpause(Function1<Event, Object> value);
    @JsProperty(name = "onplay")
    public native void setOnplay(Function1<Event, Object> value);
    @JsProperty(name = "onplaying")
    public native void setOnplaying(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointercancel")
    public native void setOnpointercancel(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerdown")
    public native void setOnpointerdown(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerenter")
    public native void setOnpointerenter(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerleave")
    public native void setOnpointerleave(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointermove")
    public native void setOnpointermove(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerout")
    public native void setOnpointerout(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerover")
    public native void setOnpointerover(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerup")
    public native void setOnpointerup(Function1<PointerEvent, Object> value);
    @JsProperty(name = "onpopstate")
    public native void setOnpopstate(Function1<PopStateEvent, Object> value);
    @JsProperty(name = "onprogress")
    public native void setOnprogress(Function1<ProgressEvent, Object> value);
    @JsProperty(name = "onratechange")
    public native void setOnratechange(Function1<Event, Object> value);
    @JsProperty(name = "onreadystatechange")
    public native void setOnreadystatechange(Function1<ProgressEvent, Object> value);
    @JsProperty(name = "onreset")
    public native void setOnreset(Function1<Event, Object> value);
    @JsProperty(name = "onresize")
    public native void setOnresize(Function1<UIEvent, Object> value);
    @JsProperty(name = "onscroll")
    public native void setOnscroll(Function1<UIEvent, Object> value);
    @JsProperty(name = "onseeked")
    public native void setOnseeked(Function1<Event, Object> value);
    @JsProperty(name = "onseeking")
    public native void setOnseeking(Function1<Event, Object> value);
    @JsProperty(name = "onselect")
    public native void setOnselect(Function1<UIEvent, Object> value);
    @JsProperty(name = "onstalled")
    public native void setOnstalled(Function1<Event, Object> value);
    @JsProperty(name = "onstorage")
    public native void setOnstorage(Function1<StorageEvent, Object> value);
    @JsProperty(name = "onsubmit")
    public native void setOnsubmit(Function1<Event, Object> value);
    @JsProperty(name = "onsuspend")
    public native void setOnsuspend(Function1<Event, Object> value);
    @JsProperty(name = "ontimeupdate")
    public native void setOntimeupdate(Function1<Event, Object> value);
    @JsProperty(name = "ontouchcancel")
    public native void setOntouchcancel(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchend")
    public native void setOntouchend(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchmove")
    public native void setOntouchmove(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchstart")
    public native void setOntouchstart(Function1<TouchEvent, Object> value);
    @JsProperty(name = "onunload")
    public native void setOnunload(Function1<Event, Object> value);
    @JsProperty(name = "onvolumechange")
    public native void setOnvolumechange(Function1<Event, Object> value);
    @JsProperty(name = "onwaiting")
    public native void setOnwaiting(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    public native void setOnwheel(Function1<WheelEvent, Object> value);
    @JsProperty(name = "opener")
    public native void setOpener(Object value);
    @JsProperty(name = "orientation")
    public native void setOrientation(String value);
    @JsProperty(name = "orientation")
    public native void setOrientation(@DoNotAutobox Number value);
    @JsProperty(name = "orientation")
    public native void setOrientation(PropertyKey_UnionOfFakeEsSymbolAndNumberAndString value);
    @JsProperty(name = "outerHeight")
    public native void setOuterHeight(@DoNotAutobox Number value);
    @JsProperty(name = "outerWidth")
    public native void setOuterWidth(@DoNotAutobox Number value);
    @JsProperty(name = "pageXOffset")
    public native void setPageXOffset(@DoNotAutobox Number value);
    @JsProperty(name = "pageYOffset")
    public native void setPageYOffset(@DoNotAutobox Number value);
    @JsProperty(name = "parent")
    public native void setParent(Window value);
    @JsProperty(name = "performance")
    public native void setPerformance(Performance value);
    @JsProperty(name = "personalbar")
    public native void setPersonalbar(BarProp value);
    @JsProperty(name = "screen")
    public native void setScreen(Screen value);
    @JsProperty(name = "screenLeft")
    public native void setScreenLeft(@DoNotAutobox Number value);
    @JsProperty(name = "screenTop")
    public native void setScreenTop(@DoNotAutobox Number value);
    @JsProperty(name = "screenX")
    public native void setScreenX(@DoNotAutobox Number value);
    @JsProperty(name = "screenY")
    public native void setScreenY(@DoNotAutobox Number value);
    @JsProperty(name = "scrollX")
    public native void setScrollX(@DoNotAutobox Number value);
    @JsProperty(name = "scrollY")
    public native void setScrollY(@DoNotAutobox Number value);
    @JsProperty(name = "scrollbars")
    public native void setScrollbars(BarProp value);
    @JsProperty(name = "self")
    public native void setSelf(Window value);
    /** 
      * inherited from (js.browser.WindowSessionStorage)
     */
    @JsProperty(name = "sessionStorage")
    public native void setSessionStorage(Storage value);
    @JsProperty(name = "speechSynthesis")
    public native void setSpeechSynthesis(SpeechSynthesis value);
    @JsProperty(name = "status")
    public native void setStatus(String value);
    @JsProperty(name = "statusbar")
    public native void setStatusbar(BarProp value);
    @JsProperty(name = "styleMedia")
    public native void setStyleMedia(StyleMedia value);
    public native Number setTimeout(Object handler);
    public native Number setTimeout(Object handler, Object timeout /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@736089
      * VERSION 1
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setTimeout(Object handler, Object timeout /* optional */, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@736013
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setTimeout(Action1<Object> handler, @DoNotAutobox Number timeout);
    @JsProperty(name = "toolbar")
    public native void setToolbar(BarProp value);
    @JsProperty(name = "top")
    public native void setTop(Window value);
    @JsProperty(name = "URL")
    public native void setURL(Object value);
    @JsProperty(name = "window")
    public native void setWindow(Window value);
    /** 
      * tsd/browser/lib.es6.d.ts@715272
     */
    public native void stop();
    /** 
      * tsd/browser/lib.es6.d.ts@715290
     */
    public native void webkitCancelAnimationFrame(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@715344
     */
    public native WebKitPoint webkitConvertPointFromNodeToPage(Node node, WebKitPoint pt);
    /** 
      * tsd/browser/lib.es6.d.ts@715424
     */
    public native WebKitPoint webkitConvertPointFromPageToNode(Node node, WebKitPoint pt);
    /** 
      * tsd/browser/lib.es6.d.ts@715504
     */
    public native Number webkitRequestAnimationFrame(FrameRequestCallback callback);
}
