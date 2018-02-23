package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaQueryList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 520141
  * declared in: tsd/browser/lib.es6.d.ts at pos 520360
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaQueryList")
public class MediaQueryList
{

    /*
        Constructors
    */
    public MediaQueryList () {
    } 

    /*
        Properties
    */

    public Boolean matches;

    public String media;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@520233
     */
    public native void addListener(MediaQueryListListener listener);
    @JsProperty(name = "matches")
    public native Boolean getMatches();
    @JsProperty(name = "media")
    public native String getMedia();
    /** 
      * tsd/browser/lib.es6.d.ts@520290
     */
    public native void removeListener(MediaQueryListListener listener);
    @JsProperty(name = "matches")
    public native void setMatches(Boolean value);
    @JsProperty(name = "media")
    public native void setMedia(String value);
}
