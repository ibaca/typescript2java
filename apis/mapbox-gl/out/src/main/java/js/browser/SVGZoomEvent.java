package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGZoomEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 637484
  * declared in: tsd/browser/lib.es6.d.ts at pos 637725
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGZoomEvent")
public class SVGZoomEvent extends UIEvent 
{

    /*
        Constructors
    */
    public SVGZoomEvent () {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Properties
    */

    public Number newScale;

    public SVGPoint newTranslate;

    public Number previousScale;

    public SVGPoint previousTranslate;

    public SVGRect zoomRectScreen;

    /*
        Methods
    */
    @JsProperty(name = "newScale")
    public native Number getNewScale();
    @JsProperty(name = "newTranslate")
    public native SVGPoint getNewTranslate();
    @JsProperty(name = "previousScale")
    public native Number getPreviousScale();
    @JsProperty(name = "previousTranslate")
    public native SVGPoint getPreviousTranslate();
    @JsProperty(name = "zoomRectScreen")
    public native SVGRect getZoomRectScreen();
    @JsProperty(name = "newScale")
    public native void setNewScale(@DoNotAutobox Number value);
    @JsProperty(name = "newTranslate")
    public native void setNewTranslate(SVGPoint value);
    @JsProperty(name = "previousScale")
    public native void setPreviousScale(@DoNotAutobox Number value);
    @JsProperty(name = "previousTranslate")
    public native void setPreviousTranslate(SVGPoint value);
    @JsProperty(name = "zoomRectScreen")
    public native void setZoomRectScreen(SVGRect value);
}
