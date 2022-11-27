package com.sdv.kit.client.view.content;

import com.sdv.kit.client.view.component.BoardButton;
import com.sdv.kit.client.view.page.MainPage;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BoardsMainPageContent implements MainPageContent {

    private final MainPage mainPage;

    public VerticalLayout getContent() {
        VerticalLayout verticalLayout = new VerticalLayout();

        H1 title = new H1("Boards");
        title.getStyle()
                .set("font-size", "18pt")
                .set("padding", "0")
                .set("margin-left", "30px");

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setWidthFull();
        horizontalLayout.setSpacing(true);
        horizontalLayout.setPadding(true);
        horizontalLayout.getStyle().set("display", "block");

        for (int i = 1; i <= 20; i++) {
            BoardButton boardsButton = new BoardButton(mainPage, "Button " + i);
            horizontalLayout.add(boardsButton);
        }

        verticalLayout.add(title, new Hr(), horizontalLayout);
        return verticalLayout;
    }
}
