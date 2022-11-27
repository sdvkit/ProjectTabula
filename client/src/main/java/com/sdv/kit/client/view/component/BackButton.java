package com.sdv.kit.client.view.component;

import com.sdv.kit.client.view.content.BoardsMainPageContent;
import com.sdv.kit.client.view.content.MainPageContent;
import com.sdv.kit.client.view.page.MainPage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

public class BackButton extends Button{

    public BackButton(MainPage mainPage,
                      MainPageContent mainPageContent) {
        setText("Back");
        setIcon(new Icon(VaadinIcon.ARROW_LEFT));
        addClickListener(event -> mainPage.setContent(
                mainPageContent.getContent()));

        getStyle().set("cursor", "pointer");
    }
}
