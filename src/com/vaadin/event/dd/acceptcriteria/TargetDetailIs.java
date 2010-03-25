/*
@ITMillApache2LicenseForJavaFiles@
 */
/**
 * 
 */
package com.vaadin.event.dd.acceptcriteria;

import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.TargetDetails;
import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.terminal.gwt.client.ui.dd.VTargetDetailIs;

/**
 * Criterion for checking if drop target details contains the specific property
 * with the specific value. Currently only String values are supported.
 * 
 * @since 6.3
 * 
 *        TODO add support for other basic data types that we support in UIDL.
 * 
 */
@ClientCriterion(VTargetDetailIs.class)
public class TargetDetailIs extends ClientSideCriterion {

    private static final long serialVersionUID = 763165450054331246L;
    private String propertyName;
    private Object value;

    /**
     * Constructs a criterion which ensures that the value there is a value in
     * {@link TargetDetails} that equals the reference value.
     * 
     * @param dataFlavor
     *            the type of data to be checked
     * @param value
     *            the reference value to which the drop target detail will be
     *            compared
     */
    public TargetDetailIs(String dataFlavor, String value) {
        propertyName = dataFlavor;
        this.value = value;
    }

    public TargetDetailIs(String dataFlavor, Boolean true1) {
        propertyName = dataFlavor;
        value = true1;
    }

    @Override
    public void paintContent(PaintTarget target) throws PaintException {
        super.paintContent(target);
        target.addAttribute("p", propertyName);
        if (value instanceof Boolean) {
            target.addAttribute("v", ((Boolean) value).booleanValue());
            target.addAttribute("t", "b");
        } else if (value instanceof String) {
            target.addAttribute("v", (String) value);
        }
    }

    public boolean accept(DragAndDropEvent dragEvent) {
        Object data = dragEvent.getTargetDetails().getData(propertyName);
        return value.equals(data);
    }

    @Override
    protected String getIdentifier() {
        // sub classes by default use VDropDetailEquals a client implementation
        return TargetDetailIs.class.getCanonicalName();
    }
}