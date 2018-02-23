package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: XPathExpression
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 719869
  * declared in: tsd/browser/lib.es6.d.ts at pos 720001
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathExpression")
public class XPathExpression
{

    /*
        Constructors
    */
    public XPathExpression () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@719903
     */
    public native XPathResult evaluate(Node contextNode, @DoNotAutobox Number type, XPathResult result);
}
