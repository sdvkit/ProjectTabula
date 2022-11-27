package com.sdv.kit.client.view.component.navbar;

import com.vaadin.flow.component.html.H1;

public class Logotype extends H1{

    public Logotype() {
        setText("Project Tabula");
        getStyle()
                .set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "0");
    }
}
