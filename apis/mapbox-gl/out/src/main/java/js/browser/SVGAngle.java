package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAngle
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 569413
  * declared in: tsd/browser/lib.es6.d.ts at pos 569911
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAngle")
public class SVGAngle
{

    /*
        Constructors
    */
    public SVGAngle () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_DEG")
    public static Number SVG_ANGLETYPE_DEG;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_GRAD")
    public static Number SVG_ANGLETYPE_GRAD;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_RAD")
    public static Number SVG_ANGLETYPE_RAD;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_UNKNOWN")
    public static Number SVG_ANGLETYPE_UNKNOWN;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_UNSPECIFIED")
    public static Number SVG_ANGLETYPE_UNSPECIFIED;

    /*
        Properties
    */

    public Number unitType;

    public Number value;

    public String valueAsString;

    public Number valueInSpecifiedUnits;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@569552
     */
    public native void convertToSpecifiedUnits(@DoNotAutobox Number unitType);
    @JsProperty(name = "SVG_ANGLETYPE_DEG")
    public native Number getSVG_ANGLETYPE_DEG();
    @JsProperty(name = "SVG_ANGLETYPE_GRAD")
    public native Number getSVG_ANGLETYPE_GRAD();
    @JsProperty(name = "SVG_ANGLETYPE_RAD")
    public native Number getSVG_ANGLETYPE_RAD();
    @JsProperty(name = "SVG_ANGLETYPE_UNKNOWN")
    public native Number getSVG_ANGLETYPE_UNKNOWN();
    @JsProperty(name = "SVG_ANGLETYPE_UNSPECIFIED")
    public native Number getSVG_ANGLETYPE_UNSPECIFIED();
    @JsProperty(name = "unitType")
    public native Number getUnitType();
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "valueAsString")
    public native String getValueAsString();
    @JsProperty(name = "valueInSpecifiedUnits")
    public native Number getValueInSpecifiedUnits();
    /** 
      * tsd/browser/lib.es6.d.ts@569605
     */
    public native void newValueSpecifiedUnits(@DoNotAutobox Number unitType, @DoNotAutobox Number valueInSpecifiedUnits);
    @JsProperty(name = "SVG_ANGLETYPE_DEG")
    public native void setSVG_ANGLETYPE_DEG(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_ANGLETYPE_GRAD")
    public native void setSVG_ANGLETYPE_GRAD(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_ANGLETYPE_RAD")
    public native void setSVG_ANGLETYPE_RAD(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_ANGLETYPE_UNKNOWN")
    public native void setSVG_ANGLETYPE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_ANGLETYPE_UNSPECIFIED")
    public native void setSVG_ANGLETYPE_UNSPECIFIED(@DoNotAutobox Number value);
    @JsProperty(name = "unitType")
    public native void setUnitType(@DoNotAutobox Number value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
    @JsProperty(name = "valueAsString")
    public native void setValueAsString(String value);
    @JsProperty(name = "valueInSpecifiedUnits")
    public native void setValueInSpecifiedUnits(@DoNotAutobox Number value);
}
