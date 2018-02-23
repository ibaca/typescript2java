package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MimeType
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 525930
  * declared in: tsd/browser/lib.es6.d.ts at pos 526095
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MimeType")
public class MimeType
{

    /*
        Constructors
    */
    public MimeType () {
    } 

    /*
        Properties
    */

    public String description;

    public Plugin enabledPlugin;

    public String suffixes;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "description")
    public native String getDescription();
    @JsProperty(name = "enabledPlugin")
    public native Plugin getEnabledPlugin();
    @JsProperty(name = "suffixes")
    public native String getSuffixes();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "description")
    public native void setDescription(String value);
    @JsProperty(name = "enabledPlugin")
    public native void setEnabledPlugin(Plugin value);
    @JsProperty(name = "suffixes")
    public native void setSuffixes(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
