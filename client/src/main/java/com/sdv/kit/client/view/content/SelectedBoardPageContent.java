package com.sdv.kit.client.view.content;

import com.sdv.kit.client.view.component.BackButton;
import com.sdv.kit.client.view.page.MainPage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SelectedBoardPageContent implements MainPageContent{

    private final MainPage mainPage;

    @Override
    public VerticalLayout getContent() {
        VerticalLayout verticalLayout = new VerticalLayout();

        verticalLayout.add(new BackButton(mainPage, new BoardsMainPageContent(mainPage)));
        return verticalLayout;
    }
}
