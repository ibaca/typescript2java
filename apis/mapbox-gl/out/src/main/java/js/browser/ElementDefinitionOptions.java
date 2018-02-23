package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ElementDefinitionOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 744166

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ElementDefinitionOptions
{

    /*
        Properties
    */

    @JsProperty(name="extends")
    public String extends_;

    /*
        Methods
    */
    @JsProperty(name = "extends")
    public native String getExtends_();
    @JsProperty(name = "extends")
    public native void setExtends_(String value);
}
