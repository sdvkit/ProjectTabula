package com.sdv.kit.client.view.content;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class TasksMainPageContent implements MainPageContent {


    public VerticalLayout getContent() {
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(new Button("TASK GROUP"));
        return verticalLayout;
    }
}
