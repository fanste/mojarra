/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.taglib.html_basic;

import jakarta.servlet.jsp.JspException;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.event.MethodExpressionValueChangeListener;
import jakarta.faces.validator.MethodExpressionValidator;
import jakarta.faces.webapp.UIComponentELTag;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

public class InputSecretTag extends UIComponentELTag {

    // Setter Methods
    // PROPERTY: converter
    private jakarta.el.ValueExpression converter;

    public void setConverter(jakarta.el.ValueExpression converter) {
        this.converter = converter;
    }

    // PROPERTY: converterMessage
    private jakarta.el.ValueExpression converterMessage;

    public void setConverterMessage(jakarta.el.ValueExpression converterMessage) {
        this.converterMessage = converterMessage;
    }

    // PROPERTY: immediate
    private jakarta.el.ValueExpression immediate;

    public void setImmediate(jakarta.el.ValueExpression immediate) {
        this.immediate = immediate;
    }

    // PROPERTY: required
    private jakarta.el.ValueExpression required;

    public void setRequired(jakarta.el.ValueExpression required) {
        this.required = required;
    }

    // PROPERTY: requiredMessage
    private jakarta.el.ValueExpression requiredMessage;

    public void setRequiredMessage(jakarta.el.ValueExpression requiredMessage) {
        this.requiredMessage = requiredMessage;
    }

    // PROPERTY: validator
    private jakarta.el.MethodExpression validator;

    public void setValidator(jakarta.el.MethodExpression validator) {
        this.validator = validator;
    }

    // PROPERTY: validatorMessage
    private jakarta.el.ValueExpression validatorMessage;

    public void setValidatorMessage(jakarta.el.ValueExpression validatorMessage) {
        this.validatorMessage = validatorMessage;
    }

    // PROPERTY: value
    private jakarta.el.ValueExpression value;

    public void setValue(jakarta.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: valueChangeListener
    private jakarta.el.MethodExpression valueChangeListener;

    public void setValueChangeListener(jakarta.el.MethodExpression valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
    }

    // PROPERTY: accesskey
    private jakarta.el.ValueExpression accesskey;

    public void setAccesskey(jakarta.el.ValueExpression accesskey) {
        this.accesskey = accesskey;
    }

    // PROPERTY: alt
    private jakarta.el.ValueExpression alt;

    public void setAlt(jakarta.el.ValueExpression alt) {
        this.alt = alt;
    }

    // PROPERTY: autocomplete
    private jakarta.el.ValueExpression autocomplete;

    public void setAutocomplete(jakarta.el.ValueExpression autocomplete) {
        this.autocomplete = autocomplete;
    }

    // PROPERTY: dir
    private jakarta.el.ValueExpression dir;

    public void setDir(jakarta.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: disabled
    private jakarta.el.ValueExpression disabled;

    public void setDisabled(jakarta.el.ValueExpression disabled) {
        this.disabled = disabled;
    }

    // PROPERTY: label
    private jakarta.el.ValueExpression label;

    public void setLabel(jakarta.el.ValueExpression label) {
        this.label = label;
    }

    // PROPERTY: lang
    private jakarta.el.ValueExpression lang;

    public void setLang(jakarta.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: maxlength
    private jakarta.el.ValueExpression maxlength;

    public void setMaxlength(jakarta.el.ValueExpression maxlength) {
        this.maxlength = maxlength;
    }

    // PROPERTY: onblur
    private jakarta.el.ValueExpression onblur;

    public void setOnblur(jakarta.el.ValueExpression onblur) {
        this.onblur = onblur;
    }

    // PROPERTY: onchange
    private jakarta.el.ValueExpression onchange;

    public void setOnchange(jakarta.el.ValueExpression onchange) {
        this.onchange = onchange;
    }

    // PROPERTY: onclick
    private jakarta.el.ValueExpression onclick;

    public void setOnclick(jakarta.el.ValueExpression onclick) {
        this.onclick = onclick;
    }

    // PROPERTY: ondblclick
    private jakarta.el.ValueExpression ondblclick;

    public void setOndblclick(jakarta.el.ValueExpression ondblclick) {
        this.ondblclick = ondblclick;
    }

    // PROPERTY: onfocus
    private jakarta.el.ValueExpression onfocus;

    public void setOnfocus(jakarta.el.ValueExpression onfocus) {
        this.onfocus = onfocus;
    }

    // PROPERTY: onkeydown
    private jakarta.el.ValueExpression onkeydown;

    public void setOnkeydown(jakarta.el.ValueExpression onkeydown) {
        this.onkeydown = onkeydown;
    }

    // PROPERTY: onkeypress
    private jakarta.el.ValueExpression onkeypress;

    public void setOnkeypress(jakarta.el.ValueExpression onkeypress) {
        this.onkeypress = onkeypress;
    }

    // PROPERTY: onkeyup
    private jakarta.el.ValueExpression onkeyup;

    public void setOnkeyup(jakarta.el.ValueExpression onkeyup) {
        this.onkeyup = onkeyup;
    }

    // PROPERTY: onmousedown
    private jakarta.el.ValueExpression onmousedown;

    public void setOnmousedown(jakarta.el.ValueExpression onmousedown) {
        this.onmousedown = onmousedown;
    }

    // PROPERTY: onmousemove
    private jakarta.el.ValueExpression onmousemove;

    public void setOnmousemove(jakarta.el.ValueExpression onmousemove) {
        this.onmousemove = onmousemove;
    }

    // PROPERTY: onmouseout
    private jakarta.el.ValueExpression onmouseout;

    public void setOnmouseout(jakarta.el.ValueExpression onmouseout) {
        this.onmouseout = onmouseout;
    }

    // PROPERTY: onmouseover
    private jakarta.el.ValueExpression onmouseover;

    public void setOnmouseover(jakarta.el.ValueExpression onmouseover) {
        this.onmouseover = onmouseover;
    }

    // PROPERTY: onmouseup
    private jakarta.el.ValueExpression onmouseup;

    public void setOnmouseup(jakarta.el.ValueExpression onmouseup) {
        this.onmouseup = onmouseup;
    }

    // PROPERTY: onselect
    private jakarta.el.ValueExpression onselect;

    public void setOnselect(jakarta.el.ValueExpression onselect) {
        this.onselect = onselect;
    }

    // PROPERTY: readonly
    private jakarta.el.ValueExpression readonly;

    public void setReadonly(jakarta.el.ValueExpression readonly) {
        this.readonly = readonly;
    }

    // PROPERTY: redisplay
    private jakarta.el.ValueExpression redisplay;

    public void setRedisplay(jakarta.el.ValueExpression redisplay) {
        this.redisplay = redisplay;
    }

    // PROPERTY: role
    private jakarta.el.ValueExpression role;

    public void setRole(jakarta.el.ValueExpression role) {
        this.role = role;
    }

    // PROPERTY: size
    private jakarta.el.ValueExpression size;

    public void setSize(jakarta.el.ValueExpression size) {
        this.size = size;
    }

    // PROPERTY: style
    private jakarta.el.ValueExpression style;

    public void setStyle(jakarta.el.ValueExpression style) {
        this.style = style;
    }

    // PROPERTY: styleClass
    private jakarta.el.ValueExpression styleClass;

    public void setStyleClass(jakarta.el.ValueExpression styleClass) {
        this.styleClass = styleClass;
    }

    // PROPERTY: tabindex
    private jakarta.el.ValueExpression tabindex;

    public void setTabindex(jakarta.el.ValueExpression tabindex) {
        this.tabindex = tabindex;
    }

    // PROPERTY: title
    private jakarta.el.ValueExpression title;

    public void setTitle(jakarta.el.ValueExpression title) {
        this.title = title;
    }

    // General Methods
    public String getRendererType() {
        return "jakarta.faces.Secret";
    }

    public String getComponentType() {
        return "jakarta.faces.HtmlInputSecret";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        jakarta.faces.component.UIInput input = null;
        try {
            input = (jakarta.faces.component.UIInput) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException(
                    "Component " + component.toString() + " not expected type.  Expected: jakarta.faces.component.UIInput.  Perhaps you're missing a tag?");
        }

        if (converter != null) {
            if (!converter.isLiteralText()) {
                input.setValueExpression("converter", converter);
            } else {
                Converter conv = FacesContext.getCurrentInstance().getApplication().createConverter(converter.getExpressionString());
                input.setConverter(conv);
            }
        }

        if (converterMessage != null) {
            input.setValueExpression("converterMessage", converterMessage);
        }
        if (immediate != null) {
            input.setValueExpression("immediate", immediate);
        }
        if (required != null) {
            input.setValueExpression("required", required);
        }
        if (requiredMessage != null) {
            input.setValueExpression("requiredMessage", requiredMessage);
        }
        if (validator != null) {
            input.addValidator(new MethodExpressionValidator(validator));
        }
        if (validatorMessage != null) {
            input.setValueExpression("validatorMessage", validatorMessage);
        }
        if (value != null) {
            input.setValueExpression("value", value);
        }
        if (valueChangeListener != null) {
            input.addValueChangeListener(new MethodExpressionValueChangeListener(valueChangeListener));
        }
        if (accesskey != null) {
            input.setValueExpression("accesskey", accesskey);
        }
        if (alt != null) {
            input.setValueExpression("alt", alt);
        }
        if (autocomplete != null) {
            input.setValueExpression("autocomplete", autocomplete);
        }
        if (dir != null) {
            input.setValueExpression("dir", dir);
        }
        if (disabled != null) {
            input.setValueExpression("disabled", disabled);
        }
        if (label != null) {
            input.setValueExpression("label", label);
        }
        if (lang != null) {
            input.setValueExpression("lang", lang);
        }
        if (maxlength != null) {
            input.setValueExpression("maxlength", maxlength);
        }
        if (onblur != null) {
            input.setValueExpression("onblur", onblur);
        }
        if (onchange != null) {
            input.setValueExpression("onchange", onchange);
        }
        if (onclick != null) {
            input.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            input.setValueExpression("ondblclick", ondblclick);
        }
        if (onfocus != null) {
            input.setValueExpression("onfocus", onfocus);
        }
        if (onkeydown != null) {
            input.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            input.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            input.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            input.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            input.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            input.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            input.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            input.setValueExpression("onmouseup", onmouseup);
        }
        if (onselect != null) {
            input.setValueExpression("onselect", onselect);
        }
        if (readonly != null) {
            input.setValueExpression("readonly", readonly);
        }
        if (redisplay != null) {
            input.setValueExpression("redisplay", redisplay);
        }
        if (role != null) {
            input.setValueExpression("role", role);
        }
        if (size != null) {
            input.setValueExpression("size", size);
        }
        if (style != null) {
            input.setValueExpression("style", style);
        }
        if (styleClass != null) {
            input.setValueExpression("styleClass", styleClass);
        }
        if (tabindex != null) {
            input.setValueExpression("tabindex", tabindex);
        }
        if (title != null) {
            input.setValueExpression("title", title);
        }
    }

    // Methods From TagSupport
    public int doStartTag() throws JspException {
        try {
            return super.doStartTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    public int doEndTag() throws JspException {
        try {
            return super.doEndTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    // RELEASE
    public void release() {
        super.release();

        // component properties
        this.converter = null;
        this.converterMessage = null;
        this.immediate = null;
        this.required = null;
        this.requiredMessage = null;
        this.validator = null;
        this.validatorMessage = null;
        this.value = null;
        this.valueChangeListener = null;

        // rendered attributes
        this.accesskey = null;
        this.alt = null;
        this.autocomplete = null;
        this.dir = null;
        this.disabled = null;
        this.label = null;
        this.lang = null;
        this.maxlength = null;
        this.onblur = null;
        this.onchange = null;
        this.onclick = null;
        this.ondblclick = null;
        this.onfocus = null;
        this.onkeydown = null;
        this.onkeypress = null;
        this.onkeyup = null;
        this.onmousedown = null;
        this.onmousemove = null;
        this.onmouseout = null;
        this.onmouseover = null;
        this.onmouseup = null;
        this.onselect = null;
        this.readonly = null;
        this.redisplay = null;
        this.role = null;
        this.size = null;
        this.style = null;
        this.styleClass = null;
        this.tabindex = null;
        this.title = null;
    }

    public String getDebugString() {
        return "id: " + this.getId() + " class: " + this.getClass().getName();
    }

}
