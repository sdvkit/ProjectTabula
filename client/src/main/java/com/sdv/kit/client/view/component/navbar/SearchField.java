package com.sdv.kit.client.view.component.navbar;

import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.textfield.TextField;

public class SearchField extends TextField {

    public SearchField() {
        getElement().setAttribute("aria-label", "search");
        setPlaceholder("Search");
        setClearButtonVisible(true);
        setPrefixComponent(VaadinIcon.SEARCH.create());
        setWidth(35, Unit.PERCENTAGE);
        getStyle()
                .set("font-size", "var(--lumo-font-size-l)")
                .set("right", "var(--lumo-space-l)")
                .set("margin-right", "10%")
                .set("position", "absolute");
    }
}
