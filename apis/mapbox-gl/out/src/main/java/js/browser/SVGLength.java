package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGLength
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 602397
  * declared in: tsd/browser/lib.es6.d.ts at pos 603142
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGLength")
public class SVGLength
{

    /*
        Constructors
    */
    public SVGLength () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_CM")
    public static Number SVG_LENGTHTYPE_CM;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_EMS")
    public static Number SVG_LENGTHTYPE_EMS;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_EXS")
    public static Number SVG_LENGTHTYPE_EXS;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_IN")
    public static Number SVG_LENGTHTYPE_IN;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_MM")
    public static Number SVG_LENGTHTYPE_MM;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_NUMBER")
    public static Number SVG_LENGTHTYPE_NUMBER;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PC")
    public static Number SVG_LENGTHTYPE_PC;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PERCENTAGE")
    public static Number SVG_LENGTHTYPE_PERCENTAGE;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PT")
    public static Number SVG_LENGTHTYPE_PT;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PX")
    public static Number SVG_LENGTHTYPE_PX;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_UNKNOWN")
    public static Number SVG_LENGTHTYPE_UNKNOWN;

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
      * tsd/browser/lib.es6.d.ts@602537
     */
    public native void convertToSpecifiedUnits(@DoNotAutobox Number unitType);
    @JsProperty(name = "SVG_LENGTHTYPE_CM")
    public native Number getSVG_LENGTHTYPE_CM();
    @JsProperty(name = "SVG_LENGTHTYPE_EMS")
    public native Number getSVG_LENGTHTYPE_EMS();
    @JsProperty(name = "SVG_LENGTHTYPE_EXS")
    public native Number getSVG_LENGTHTYPE_EXS();
    @JsProperty(name = "SVG_LENGTHTYPE_IN")
    public native Number getSVG_LENGTHTYPE_IN();
    @JsProperty(name = "SVG_LENGTHTYPE_MM")
    public native Number getSVG_LENGTHTYPE_MM();
    @JsProperty(name = "SVG_LENGTHTYPE_NUMBER")
    public native Number getSVG_LENGTHTYPE_NUMBER();
    @JsProperty(name = "SVG_LENGTHTYPE_PC")
    public native Number getSVG_LENGTHTYPE_PC();
    @JsProperty(name = "SVG_LENGTHTYPE_PERCENTAGE")
    public native Number getSVG_LENGTHTYPE_PERCENTAGE();
    @JsProperty(name = "SVG_LENGTHTYPE_PT")
    public native Number getSVG_LENGTHTYPE_PT();
    @JsProperty(name = "SVG_LENGTHTYPE_PX")
    public native Number getSVG_LENGTHTYPE_PX();
    @JsProperty(name = "SVG_LENGTHTYPE_UNKNOWN")
    public native Number getSVG_LENGTHTYPE_UNKNOWN();
    @JsProperty(name = "unitType")
    public native Number getUnitType();
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "valueAsString")
    public native String getValueAsString();
    @JsProperty(name = "valueInSpecifiedUnits")
    public native Number getValueInSpecifiedUnits();
    /** 
      * tsd/browser/lib.es6.d.ts@602590
     */
    public native void newValueSpecifiedUnits(@DoNotAutobox Number unitType, @DoNotAutobox Number valueInSpecifiedUnits);
    @JsProperty(name = "SVG_LENGTHTYPE_CM")
    public native void setSVG_LENGTHTYPE_CM(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_EMS")
    public native void setSVG_LENGTHTYPE_EMS(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_EXS")
    public native void setSVG_LENGTHTYPE_EXS(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_IN")
    public native void setSVG_LENGTHTYPE_IN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_MM")
    public native void setSVG_LENGTHTYPE_MM(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_NUMBER")
    public native void setSVG_LENGTHTYPE_NUMBER(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_PC")
    public native void setSVG_LENGTHTYPE_PC(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_PERCENTAGE")
    public native void setSVG_LENGTHTYPE_PERCENTAGE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_PT")
    public native void setSVG_LENGTHTYPE_PT(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_PX")
    public native void setSVG_LENGTHTYPE_PX(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_LENGTHTYPE_UNKNOWN")
    public native void setSVG_LENGTHTYPE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "unitType")
    public native void setUnitType(@DoNotAutobox Number value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
    @JsProperty(name = "valueAsString")
    public native void setValueAsString(String value);
    @JsProperty(name = "valueInSpecifiedUnits")
    public native void setValueInSpecifiedUnits(@DoNotAutobox Number value);
}
