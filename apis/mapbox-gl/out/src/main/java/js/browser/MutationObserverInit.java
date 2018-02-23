package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MutationObserverInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271249

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MutationObserverInit
{

    /*
        Properties
    */

    public Array<String> attributeFilter;

    public Boolean attributeOldValue;

    public Boolean attributes;

    public Boolean characterData;

    public Boolean characterDataOldValue;

    public Boolean childList;

    public Boolean subtree;

    /*
        Methods
    */
    @JsProperty(name = "attributeFilter")
    public native Array<String> getAttributeFilter();
    @JsProperty(name = "attributeOldValue")
    public native Boolean getAttributeOldValue();
    @JsProperty(name = "attributes")
    public native Boolean getAttributes();
    @JsProperty(name = "characterData")
    public native Boolean getCharacterData();
    @JsProperty(name = "characterDataOldValue")
    public native Boolean getCharacterDataOldValue();
    @JsProperty(name = "childList")
    public native Boolean getChildList();
    @JsProperty(name = "subtree")
    public native Boolean getSubtree();
    @JsProperty(name = "attributeFilter")
    public native void setAttributeFilter(Array<String> value);
    @JsProperty(name = "attributeOldValue")
    public native void setAttributeOldValue(Boolean value);
    @JsProperty(name = "attributes")
    public native void setAttributes(Boolean value);
    @JsProperty(name = "characterData")
    public native void setCharacterData(Boolean value);
    @JsProperty(name = "characterDataOldValue")
    public native void setCharacterDataOldValue(Boolean value);
    @JsProperty(name = "childList")
    public native void setChildList(Boolean value);
    @JsProperty(name = "subtree")
    public native void setSubtree(Boolean value);
}
