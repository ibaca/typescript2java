package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Element
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 366414
  * declared in: tsd/browser/lib.es6.d.ts at pos 371735
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Element")
public class Element extends Node  implements GlobalEventHandlers, ElementTraversal, NodeSelector, ChildNode, ParentNode 
{

    /*
        Constructors
    */
    public Element () {
    } 

    /*
        Properties
    */

    public HTMLSlotElement assignedSlot;

    public Number childElementCount;

    public HTMLCollection children;

    public DOMTokenList classList;

    @JsProperty(name="className")
    public String cssClassName;

    public Number clientHeight;

    public Number clientLeft;

    public Number clientTop;

    public Number clientWidth;

    public Element firstElementChild;

    public String id;

    public String innerHTML;

    public Element lastElementChild;

    public Number msContentZoomFactor;

    public String msRegionOverflow;

    public Element nextElementSibling;

    public Function1<Event, Object> onariarequest;

    public Function1<Event, Object> oncommand;

    public Function1<PointerEvent, Object> ongotpointercapture;

    public Function1<PointerEvent, Object> onlostpointercapture;

    public Function1<MSGestureEvent, Object> onmsgesturechange;

    public Function1<MSGestureEvent, Object> onmsgesturedoubletap;

    public Function1<MSGestureEvent, Object> onmsgestureend;

    public Function1<MSGestureEvent, Object> onmsgesturehold;

    public Function1<MSGestureEvent, Object> onmsgesturestart;

    public Function1<MSGestureEvent, Object> onmsgesturetap;

    public Function1<MSPointerEvent, Object> onmsgotpointercapture;

    public Function1<MSGestureEvent, Object> onmsinertiastart;

    public Function1<MSPointerEvent, Object> onmslostpointercapture;

    public Function1<MSPointerEvent, Object> onmspointercancel;

    public Function1<MSPointerEvent, Object> onmspointerdown;

    public Function1<MSPointerEvent, Object> onmspointerenter;

    public Function1<MSPointerEvent, Object> onmspointerleave;

    public Function1<MSPointerEvent, Object> onmspointermove;

    public Function1<MSPointerEvent, Object> onmspointerout;

    public Function1<MSPointerEvent, Object> onmspointerover;

    public Function1<MSPointerEvent, Object> onmspointerup;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<TouchEvent, Object> ontouchcancel;

    public Function1<TouchEvent, Object> ontouchend;

    public Function1<TouchEvent, Object> ontouchmove;

    public Function1<TouchEvent, Object> ontouchstart;

    public Function1<Event, Object> onwebkitfullscreenchange;

    public Function1<Event, Object> onwebkitfullscreenerror;

    public Function1<WheelEvent, Object> onwheel;

    public String outerHTML;

    public String prefix;

    public Element previousElementSibling;

    public Number scrollHeight;

    public Number scrollLeft;

    public Number scrollTop;

    public Number scrollWidth;

    public ShadowRoot shadowRoot;

    public String slot;

    public String tagName;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@371399
     */
    public native ShadowRoot attachShadow(ShadowRootInit shadowRootInitDict);
    /** 
      * tsd/browser/lib.es6.d.ts@370819
     */
    public native Element closest(String selector);
    @JsProperty(name = "assignedSlot")
    public native HTMLSlotElement getAssignedSlot();
    /** 
      * tsd/browser/lib.es6.d.ts@368817
     */
    public native String getAttribute(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@368864
     */
    public native String getAttributeNS(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@368933
     */
    public native Attr getAttributeNode(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@368975
     */
    public native Attr getAttributeNodeNS(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@369046
     */
    public native ClientRect getBoundingClientRect();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "childElementCount")
    public native Number getChildElementCount();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    public native HTMLCollection getChildren();
    @JsProperty(name = "classList")
    public native DOMTokenList getClassList();
    @JsProperty(name = "clientHeight")
    public native Number getClientHeight();
    @JsProperty(name = "clientLeft")
    public native Number getClientLeft();
    /** 
      * tsd/browser/lib.es6.d.ts@369087
     */
    public native ClientRectList getClientRects();
    @JsProperty(name = "clientTop")
    public native Number getClientTop();
    @JsProperty(name = "clientWidth")
    public native Number getClientWidth();
    @JsProperty(name = "className")
    public native String getCssClassName();
    /** 
      * tsd/browser/lib.es6.d.ts@370710
     */
    public native NodeListOf<Element> getElementsByClassName(String classNames);
    /** 
      * tsd/browser/lib.es6.d.ts@369225
     */
    public native NodeListOf<Element> getElementsByTagName(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@369286
     */
    public native HTMLCollectionOf<HTMLElement> getElementsByTagNameNS(String namespaceURI, String localName);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "firstElementChild")
    public native Element getFirstElementChild();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "innerHTML")
    public native String getInnerHTML();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "lastElementChild")
    public native Element getLastElementChild();
    @JsProperty(name = "msContentZoomFactor")
    public native Number getMsContentZoomFactor();
    @JsProperty(name = "msRegionOverflow")
    public native String getMsRegionOverflow();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "nextElementSibling")
    public native Element getNextElementSibling();
    @JsProperty(name = "onariarequest")
    public native Function1<Event, Object> getOnariarequest();
    @JsProperty(name = "oncommand")
    public native Function1<Event, Object> getOncommand();
    @JsProperty(name = "ongotpointercapture")
    public native Function1<PointerEvent, Object> getOngotpointercapture();
    @JsProperty(name = "onlostpointercapture")
    public native Function1<PointerEvent, Object> getOnlostpointercapture();
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
    @JsProperty(name = "onmsgotpointercapture")
    public native Function1<MSPointerEvent, Object> getOnmsgotpointercapture();
    @JsProperty(name = "onmsinertiastart")
    public native Function1<MSGestureEvent, Object> getOnmsinertiastart();
    @JsProperty(name = "onmslostpointercapture")
    public native Function1<MSPointerEvent, Object> getOnmslostpointercapture();
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
    @JsProperty(name = "ontouchcancel")
    public native Function1<TouchEvent, Object> getOntouchcancel();
    @JsProperty(name = "ontouchend")
    public native Function1<TouchEvent, Object> getOntouchend();
    @JsProperty(name = "ontouchmove")
    public native Function1<TouchEvent, Object> getOntouchmove();
    @JsProperty(name = "ontouchstart")
    public native Function1<TouchEvent, Object> getOntouchstart();
    @JsProperty(name = "onwebkitfullscreenchange")
    public native Function1<Event, Object> getOnwebkitfullscreenchange();
    @JsProperty(name = "onwebkitfullscreenerror")
    public native Function1<Event, Object> getOnwebkitfullscreenerror();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    public native Function1<WheelEvent, Object> getOnwheel();
    @JsProperty(name = "outerHTML")
    public native String getOuterHTML();
    @JsProperty(name = "prefix")
    public native String getPrefix();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "previousElementSibling")
    public native Element getPreviousElementSibling();
    @JsProperty(name = "scrollHeight")
    public native Number getScrollHeight();
    @JsProperty(name = "scrollLeft")
    public native Number getScrollLeft();
    @JsProperty(name = "scrollTop")
    public native Number getScrollTop();
    @JsProperty(name = "scrollWidth")
    public native Number getScrollWidth();
    @JsProperty(name = "shadowRoot")
    public native ShadowRoot getShadowRoot();
    @JsProperty(name = "slot")
    public native String getSlot();
    @JsProperty(name = "tagName")
    public native String getTagName();
    /** 
      * tsd/browser/lib.es6.d.ts@369627
     */
    public native Boolean hasAttribute(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@369668
     */
    public native Boolean hasAttributeNS(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@371194
     */
    public native Element insertAdjacentElement(String position, Element insertedElement);
    /** 
      * tsd/browser/lib.es6.d.ts@371281
     */
    public native void insertAdjacentHTML(String where, String html);
    /** 
      * tsd/browser/lib.es6.d.ts@371340
     */
    public native void insertAdjacentText(String where, String text);
    /** 
      * tsd/browser/lib.es6.d.ts@370779
     */
    public native Boolean matches(String selector);
    /** 
      * tsd/browser/lib.es6.d.ts@369738
     */
    public native MSRangeCollection msGetRegionContent();
    /** 
      * tsd/browser/lib.es6.d.ts@369783
     */
    public native ClientRect msGetUntransformedBounds();
    /** 
      * tsd/browser/lib.es6.d.ts@369827
     */
    public native Boolean msMatchesSelector(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@369878
     */
    public native void msReleasePointerCapture(@DoNotAutobox Number pointerId);
    /** 
      * tsd/browser/lib.es6.d.ts@369932
     */
    public native void msSetPointerCapture(@DoNotAutobox Number pointerId);
    /** 
      * tsd/browser/lib.es6.d.ts@369982
     */
    public native void msZoomTo(MsZoomToOptions args);
    /** 
      * tsd/browser/lib.es6.d.ts@734337
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    public native Element querySelector(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@734492
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    public native NodeListOf<Element> querySelectorAll(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@370025
     */
    public native void releasePointerCapture(@DoNotAutobox Number pointerId);
    /** 
      * tsd/browser/lib.es6.d.ts@723950
      * inherited from (js.browser.ChildNode)
      * inherited from (js.browser.ChildNode)
      * inherited from (js.browser.ChildNode)
     */
    public native void remove();
    /** 
      * tsd/browser/lib.es6.d.ts@370077
     */
    public native void removeAttribute(String qualifiedName);
    /** 
      * tsd/browser/lib.es6.d.ts@370127
     */
    public native void removeAttributeNS(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@370197
     */
    public native Attr removeAttributeNode(Attr oldAttr);
    /** 
      * tsd/browser/lib.es6.d.ts@370243
     */
    public native void requestFullscreen();
    /** 
      * tsd/browser/lib.es6.d.ts@370274
     */
    public native void requestPointerLock();
    public native void scroll();
    /** 
      * tsd/browser/lib.es6.d.ts@370976
      * VERSION 1
     */
    public native void scroll(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@370931
     */
    public native void scroll(ScrollToOptions options /* optional */);
    public native void scrollBy();
    /** 
      * tsd/browser/lib.es6.d.ts@371152
      * VERSION 1
     */
    public native void scrollBy(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@371105
     */
    public native void scrollBy(ScrollToOptions options /* optional */);
    public native void scrollIntoView();
    public native void scrollIntoView(ScrollIntoViewOptions arg /* optional */);
    public native void scrollIntoView(Boolean arg /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@370866
     */
    public native void scrollIntoView(UnionOfBooleanAndScrollIntoViewOptions arg /* optional */);
    public native void scrollTo();
    /** 
      * tsd/browser/lib.es6.d.ts@371063
      * VERSION 1
     */
    public native void scrollTo(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@371016
     */
    public native void scrollTo(ScrollToOptions options /* optional */);
    @JsProperty(name = "assignedSlot")
    public native void setAssignedSlot(HTMLSlotElement value);
    /** 
      * tsd/browser/lib.es6.d.ts@370306
     */
    public native void setAttribute(String name, String value);
    /** 
      * tsd/browser/lib.es6.d.ts@370359
     */
    public native void setAttributeNS(String namespaceURI, String qualifiedName, String value);
    /** 
      * tsd/browser/lib.es6.d.ts@370445
     */
    public native Attr setAttributeNode(Attr newAttr);
    /** 
      * tsd/browser/lib.es6.d.ts@370488
     */
    public native Attr setAttributeNodeNS(Attr newAttr);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "childElementCount")
    public native void setChildElementCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    public native void setChildren(HTMLCollection value);
    @JsProperty(name = "classList")
    public native void setClassList(DOMTokenList value);
    @JsProperty(name = "clientHeight")
    public native void setClientHeight(@DoNotAutobox Number value);
    @JsProperty(name = "clientLeft")
    public native void setClientLeft(@DoNotAutobox Number value);
    @JsProperty(name = "clientTop")
    public native void setClientTop(@DoNotAutobox Number value);
    @JsProperty(name = "clientWidth")
    public native void setClientWidth(@DoNotAutobox Number value);
    @JsProperty(name = "className")
    public native void setCssClassName(String value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "firstElementChild")
    public native void setFirstElementChild(Element value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "innerHTML")
    public native void setInnerHTML(String value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "lastElementChild")
    public native void setLastElementChild(Element value);
    @JsProperty(name = "msContentZoomFactor")
    public native void setMsContentZoomFactor(@DoNotAutobox Number value);
    @JsProperty(name = "msRegionOverflow")
    public native void setMsRegionOverflow(String value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "nextElementSibling")
    public native void setNextElementSibling(Element value);
    @JsProperty(name = "onariarequest")
    public native void setOnariarequest(Function1<Event, Object> value);
    @JsProperty(name = "oncommand")
    public native void setOncommand(Function1<Event, Object> value);
    @JsProperty(name = "ongotpointercapture")
    public native void setOngotpointercapture(Function1<PointerEvent, Object> value);
    @JsProperty(name = "onlostpointercapture")
    public native void setOnlostpointercapture(Function1<PointerEvent, Object> value);
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
    @JsProperty(name = "onmsgotpointercapture")
    public native void setOnmsgotpointercapture(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmsinertiastart")
    public native void setOnmsinertiastart(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmslostpointercapture")
    public native void setOnmslostpointercapture(Function1<MSPointerEvent, Object> value);
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
    @JsProperty(name = "ontouchcancel")
    public native void setOntouchcancel(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchend")
    public native void setOntouchend(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchmove")
    public native void setOntouchmove(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchstart")
    public native void setOntouchstart(Function1<TouchEvent, Object> value);
    @JsProperty(name = "onwebkitfullscreenchange")
    public native void setOnwebkitfullscreenchange(Function1<Event, Object> value);
    @JsProperty(name = "onwebkitfullscreenerror")
    public native void setOnwebkitfullscreenerror(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    public native void setOnwheel(Function1<WheelEvent, Object> value);
    @JsProperty(name = "outerHTML")
    public native void setOuterHTML(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@370533
     */
    public native void setPointerCapture(@DoNotAutobox Number pointerId);
    @JsProperty(name = "prefix")
    public native void setPrefix(String value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "previousElementSibling")
    public native void setPreviousElementSibling(Element value);
    @JsProperty(name = "scrollHeight")
    public native void setScrollHeight(@DoNotAutobox Number value);
    @JsProperty(name = "scrollLeft")
    public native void setScrollLeft(@DoNotAutobox Number value);
    @JsProperty(name = "scrollTop")
    public native void setScrollTop(@DoNotAutobox Number value);
    @JsProperty(name = "scrollWidth")
    public native void setScrollWidth(@DoNotAutobox Number value);
    @JsProperty(name = "shadowRoot")
    public native void setShadowRoot(ShadowRoot value);
    @JsProperty(name = "slot")
    public native void setSlot(String value);
    @JsProperty(name = "tagName")
    public native void setTagName(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@370581
     */
    public native Boolean webkitMatchesSelector(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@370636
     */
    public native void webkitRequestFullScreen();
    /** 
      * tsd/browser/lib.es6.d.ts@370673
     */
    public native void webkitRequestFullscreen();
}
