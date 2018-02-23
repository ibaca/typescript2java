package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Comment
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 316231
  * declared in: tsd/browser/lib.es6.d.ts at pos 316307
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Comment")
public class Comment extends CharacterData 
{

    /*
        Constructors
    */
    public Comment () {
    } 

    /*
        Properties
    */

    public String text;

    /*
        Methods
    */
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "text")
    public native void setText(String value);
}
