/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 06:25:15 PM CET 
//


package org.openhab.ui.cometvisu.internal.config.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for widgetaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="widgetaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{}Infoaction_WidgetActions"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "widgetaction", propOrder = {
    "_switch",
    "toggle",
    "trigger",
    "pushbutton",
    "urltrigger",
    "multitrigger",
    "image",
    "imagetrigger",
    "pagejump",
    "info"
})
public class Widgetaction {

    @XmlElement(name = "switch")
    protected Switch _switch;
    protected Toggle toggle;
    protected Trigger trigger;
    protected Pushbutton pushbutton;
    protected Urltrigger urltrigger;
    protected Multitrigger multitrigger;
    protected Image image;
    protected Imagetrigger imagetrigger;
    protected Pagejump pagejump;
    protected Info info;

    /**
     * Gets the value of the switch property.
     * 
     * @return
     *     possible object is
     *     {@link Switch }
     *     
     */
    public Switch getSwitch() {
        return _switch;
    }

    /**
     * Sets the value of the switch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Switch }
     *     
     */
    public void setSwitch(Switch value) {
        this._switch = value;
    }

    /**
     * Gets the value of the toggle property.
     * 
     * @return
     *     possible object is
     *     {@link Toggle }
     *     
     */
    public Toggle getToggle() {
        return toggle;
    }

    /**
     * Sets the value of the toggle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Toggle }
     *     
     */
    public void setToggle(Toggle value) {
        this.toggle = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link Trigger }
     *     
     */
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trigger }
     *     
     */
    public void setTrigger(Trigger value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the pushbutton property.
     * 
     * @return
     *     possible object is
     *     {@link Pushbutton }
     *     
     */
    public Pushbutton getPushbutton() {
        return pushbutton;
    }

    /**
     * Sets the value of the pushbutton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pushbutton }
     *     
     */
    public void setPushbutton(Pushbutton value) {
        this.pushbutton = value;
    }

    /**
     * Gets the value of the urltrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Urltrigger }
     *     
     */
    public Urltrigger getUrltrigger() {
        return urltrigger;
    }

    /**
     * Sets the value of the urltrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Urltrigger }
     *     
     */
    public void setUrltrigger(Urltrigger value) {
        this.urltrigger = value;
    }

    /**
     * Gets the value of the multitrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Multitrigger }
     *     
     */
    public Multitrigger getMultitrigger() {
        return multitrigger;
    }

    /**
     * Sets the value of the multitrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Multitrigger }
     *     
     */
    public void setMultitrigger(Multitrigger value) {
        this.multitrigger = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the imagetrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Imagetrigger }
     *     
     */
    public Imagetrigger getImagetrigger() {
        return imagetrigger;
    }

    /**
     * Sets the value of the imagetrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Imagetrigger }
     *     
     */
    public void setImagetrigger(Imagetrigger value) {
        this.imagetrigger = value;
    }

    /**
     * Gets the value of the pagejump property.
     * 
     * @return
     *     possible object is
     *     {@link Pagejump }
     *     
     */
    public Pagejump getPagejump() {
        return pagejump;
    }

    /**
     * Sets the value of the pagejump property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagejump }
     *     
     */
    public void setPagejump(Pagejump value) {
        this.pagejump = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

}
