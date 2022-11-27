package com.sdv.kit.client.view.component;

import com.sdv.kit.client.view.content.SelectedBoardPageContent;
import com.sdv.kit.client.view.page.MainPage;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class BoardButton extends VerticalLayout {

    public BoardButton(MainPage mainPage,
                       String boardName) {

        add(new Span(boardName));
        setWidth(250, Unit.PIXELS);
        setHeight(100, Unit.PIXELS);
        getStyle()
                .set("color", "white")
                .set("border-radius", "5px")
                .set("float", "left")
                .set("background-color", "#005FDB")
                .set("text-align", "left")
                .set("cursor", "pointer")
                .set("font-size", "11pt")
                .set("margin-top", "10px")
                .set("margin-right", "10px");

        addClickListener(event -> mainPage.setContent(
                new SelectedBoardPageContent(mainPage).getContent()));
    }
}
