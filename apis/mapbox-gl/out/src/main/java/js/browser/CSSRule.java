package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 295547
  * declared in: tsd/browser/lib.es6.d.ts at pos 296132
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSRule")
public class CSSRule
{

    /*
        Constructors
    */
    public CSSRule () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="CSSRule", name="CHARSET_RULE")
    public static Number CHARSET_RULE;

    @JsProperty(namespace="CSSRule", name="FONT_FACE_RULE")
    public static Number FONT_FACE_RULE;

    @JsProperty(namespace="CSSRule", name="IMPORT_RULE")
    public static Number IMPORT_RULE;

    @JsProperty(namespace="CSSRule", name="KEYFRAMES_RULE")
    public static Number KEYFRAMES_RULE;

    @JsProperty(namespace="CSSRule", name="KEYFRAME_RULE")
    public static Number KEYFRAME_RULE;

    @JsProperty(namespace="CSSRule", name="MEDIA_RULE")
    public static Number MEDIA_RULE;

    @JsProperty(namespace="CSSRule", name="NAMESPACE_RULE")
    public static Number NAMESPACE_RULE;

    @JsProperty(namespace="CSSRule", name="PAGE_RULE")
    public static Number PAGE_RULE;

    @JsProperty(namespace="CSSRule", name="STYLE_RULE")
    public static Number STYLE_RULE;

    @JsProperty(namespace="CSSRule", name="SUPPORTS_RULE")
    public static Number SUPPORTS_RULE;

    @JsProperty(namespace="CSSRule", name="UNKNOWN_RULE")
    public static Number UNKNOWN_RULE;

    @JsProperty(namespace="CSSRule", name="VIEWPORT_RULE")
    public static Number VIEWPORT_RULE;

    /*
        Properties
    */

    public String cssText;

    public CSSRule parentRule;

    public CSSStyleSheet parentStyleSheet;

    public Number type;

    /*
        Methods
    */
    @JsProperty(name = "CHARSET_RULE")
    public native Number getCHARSET_RULE();
    @JsProperty(name = "cssText")
    public native String getCssText();
    @JsProperty(name = "FONT_FACE_RULE")
    public native Number getFONT_FACE_RULE();
    @JsProperty(name = "IMPORT_RULE")
    public native Number getIMPORT_RULE();
    @JsProperty(name = "KEYFRAMES_RULE")
    public native Number getKEYFRAMES_RULE();
    @JsProperty(name = "KEYFRAME_RULE")
    public native Number getKEYFRAME_RULE();
    @JsProperty(name = "MEDIA_RULE")
    public native Number getMEDIA_RULE();
    @JsProperty(name = "NAMESPACE_RULE")
    public native Number getNAMESPACE_RULE();
    @JsProperty(name = "PAGE_RULE")
    public native Number getPAGE_RULE();
    @JsProperty(name = "parentRule")
    public native CSSRule getParentRule();
    @JsProperty(name = "parentStyleSheet")
    public native CSSStyleSheet getParentStyleSheet();
    @JsProperty(name = "STYLE_RULE")
    public native Number getSTYLE_RULE();
    @JsProperty(name = "SUPPORTS_RULE")
    public native Number getSUPPORTS_RULE();
    @JsProperty(name = "type")
    public native Number getType();
    @JsProperty(name = "UNKNOWN_RULE")
    public native Number getUNKNOWN_RULE();
    @JsProperty(name = "VIEWPORT_RULE")
    public native Number getVIEWPORT_RULE();
    @JsProperty(name = "CHARSET_RULE")
    public native void setCHARSET_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "cssText")
    public native void setCssText(String value);
    @JsProperty(name = "FONT_FACE_RULE")
    public native void setFONT_FACE_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "IMPORT_RULE")
    public native void setIMPORT_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "KEYFRAMES_RULE")
    public native void setKEYFRAMES_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "KEYFRAME_RULE")
    public native void setKEYFRAME_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "MEDIA_RULE")
    public native void setMEDIA_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "NAMESPACE_RULE")
    public native void setNAMESPACE_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "PAGE_RULE")
    public native void setPAGE_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "parentRule")
    public native void setParentRule(CSSRule value);
    @JsProperty(name = "parentStyleSheet")
    public native void setParentStyleSheet(CSSStyleSheet value);
    @JsProperty(name = "STYLE_RULE")
    public native void setSTYLE_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "SUPPORTS_RULE")
    public native void setSUPPORTS_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(@DoNotAutobox Number value);
    @JsProperty(name = "UNKNOWN_RULE")
    public native void setUNKNOWN_RULE(@DoNotAutobox Number value);
    @JsProperty(name = "VIEWPORT_RULE")
    public native void setVIEWPORT_RULE(@DoNotAutobox Number value);
}
