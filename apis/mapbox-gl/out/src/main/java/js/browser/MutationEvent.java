package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MutationEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 527688
  * declared in: tsd/browser/lib.es6.d.ts at pos 528201
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationEvent")
public class MutationEvent extends Event 
{

    /*
        Constructors
    */
    public MutationEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MutationEvent", name="ADDITION")
    public static Number ADDITION;

    @JsProperty(namespace="MutationEvent", name="MODIFICATION")
    public static Number MODIFICATION;

    @JsProperty(namespace="MutationEvent", name="REMOVAL")
    public static Number REMOVAL;

    /*
        Properties
    */

    public Number attrChange;

    public String attrName;

    public String newValue;

    public String prevValue;

    public Node relatedNode;

    /*
        Methods
    */
    @JsProperty(name = "ADDITION")
    public native Number getADDITION();
    @JsProperty(name = "attrChange")
    public native Number getAttrChange();
    @JsProperty(name = "attrName")
    public native String getAttrName();
    @JsProperty(name = "MODIFICATION")
    public native Number getMODIFICATION();
    @JsProperty(name = "newValue")
    public native String getNewValue();
    @JsProperty(name = "prevValue")
    public native String getPrevValue();
    @JsProperty(name = "REMOVAL")
    public native Number getREMOVAL();
    @JsProperty(name = "relatedNode")
    public native Node getRelatedNode();
    /** 
      * tsd/browser/lib.es6.d.ts@527893
     */
    public native void initMutationEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Node relatedNodeArg, String prevValueArg, String newValueArg, String attrNameArg, @DoNotAutobox Number attrChangeArg);
    @JsProperty(name = "ADDITION")
    public native void setADDITION(@DoNotAutobox Number value);
    @JsProperty(name = "attrChange")
    public native void setAttrChange(@DoNotAutobox Number value);
    @JsProperty(name = "attrName")
    public native void setAttrName(String value);
    @JsProperty(name = "MODIFICATION")
    public native void setMODIFICATION(@DoNotAutobox Number value);
    @JsProperty(name = "newValue")
    public native void setNewValue(String value);
    @JsProperty(name = "prevValue")
    public native void setPrevValue(String value);
    @JsProperty(name = "REMOVAL")
    public native void setREMOVAL(@DoNotAutobox Number value);
    @JsProperty(name = "relatedNode")
    public native void setRelatedNode(Node value);
}
