package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGTextPathElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 631895
  * declared in: tsd/browser/lib.es6.d.ts at pos 632698
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTextPathElement")
public class SVGTextPathElement extends SVGTextContentElement  implements SVGURIReference 
{

    /*
        Constructors
    */
    public SVGTextPathElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGTextPathElement", name="TEXTPATH_METHODTYPE_ALIGN")
    public static Number TEXTPATH_METHODTYPE_ALIGN;

    @JsProperty(namespace="SVGTextPathElement", name="TEXTPATH_METHODTYPE_STRETCH")
    public static Number TEXTPATH_METHODTYPE_STRETCH;

    @JsProperty(namespace="SVGTextPathElement", name="TEXTPATH_METHODTYPE_UNKNOWN")
    public static Number TEXTPATH_METHODTYPE_UNKNOWN;

    @JsProperty(namespace="SVGTextPathElement", name="TEXTPATH_SPACINGTYPE_AUTO")
    public static Number TEXTPATH_SPACINGTYPE_AUTO;

    @JsProperty(namespace="SVGTextPathElement", name="TEXTPATH_SPACINGTYPE_EXACT")
    public static Number TEXTPATH_SPACINGTYPE_EXACT;

    @JsProperty(namespace="SVGTextPathElement", name="TEXTPATH_SPACINGTYPE_UNKNOWN")
    public static Number TEXTPATH_SPACINGTYPE_UNKNOWN;

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedString href;

    public Element lastElementChild;

    public SVGAnimatedEnumeration method;

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

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGAnimatedEnumeration spacing;

    public SVGAnimatedLength startOffset;

    public SVGStringList systemLanguage;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
     */
    @JsProperty(name = "href")
    public native SVGAnimatedString getHref();
    @JsProperty(name = "method")
    public native SVGAnimatedEnumeration getMethod();
    @JsProperty(name = "spacing")
    public native SVGAnimatedEnumeration getSpacing();
    @JsProperty(name = "startOffset")
    public native SVGAnimatedLength getStartOffset();
    @JsProperty(name = "TEXTPATH_METHODTYPE_ALIGN")
    public native Number getTEXTPATH_METHODTYPE_ALIGN();
    @JsProperty(name = "TEXTPATH_METHODTYPE_STRETCH")
    public native Number getTEXTPATH_METHODTYPE_STRETCH();
    @JsProperty(name = "TEXTPATH_METHODTYPE_UNKNOWN")
    public native Number getTEXTPATH_METHODTYPE_UNKNOWN();
    @JsProperty(name = "TEXTPATH_SPACINGTYPE_AUTO")
    public native Number getTEXTPATH_SPACINGTYPE_AUTO();
    @JsProperty(name = "TEXTPATH_SPACINGTYPE_EXACT")
    public native Number getTEXTPATH_SPACINGTYPE_EXACT();
    @JsProperty(name = "TEXTPATH_SPACINGTYPE_UNKNOWN")
    public native Number getTEXTPATH_SPACINGTYPE_UNKNOWN();
    /** 
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
     */
    @JsProperty(name = "href")
    public native void setHref(SVGAnimatedString value);
    @JsProperty(name = "method")
    public native void setMethod(SVGAnimatedEnumeration value);
    @JsProperty(name = "spacing")
    public native void setSpacing(SVGAnimatedEnumeration value);
    @JsProperty(name = "startOffset")
    public native void setStartOffset(SVGAnimatedLength value);
    @JsProperty(name = "TEXTPATH_METHODTYPE_ALIGN")
    public native void setTEXTPATH_METHODTYPE_ALIGN(@DoNotAutobox Number value);
    @JsProperty(name = "TEXTPATH_METHODTYPE_STRETCH")
    public native void setTEXTPATH_METHODTYPE_STRETCH(@DoNotAutobox Number value);
    @JsProperty(name = "TEXTPATH_METHODTYPE_UNKNOWN")
    public native void setTEXTPATH_METHODTYPE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "TEXTPATH_SPACINGTYPE_AUTO")
    public native void setTEXTPATH_SPACINGTYPE_AUTO(@DoNotAutobox Number value);
    @JsProperty(name = "TEXTPATH_SPACINGTYPE_EXACT")
    public native void setTEXTPATH_SPACINGTYPE_EXACT(@DoNotAutobox Number value);
    @JsProperty(name = "TEXTPATH_SPACINGTYPE_UNKNOWN")
    public native void setTEXTPATH_SPACINGTYPE_UNKNOWN(@DoNotAutobox Number value);
}
