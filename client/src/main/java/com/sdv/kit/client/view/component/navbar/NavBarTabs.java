package com.sdv.kit.client.view.component.navbar;

import com.sdv.kit.client.view.content.BoardsMainPageContent;
import com.sdv.kit.client.view.content.TasksMainPageContent;
import com.sdv.kit.client.view.page.MainPage;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

import java.util.List;

public class NavBarTabs extends Tabs {

    public NavBarTabs(MainPage mainPage) {

        List.of(new Tab(VaadinIcon.TABLE.create(), new Span("Boards")),
                new Tab(VaadinIcon.TASKS.create(), new Span("My Tasks")),
                new Tab(VaadinIcon.USER.create(), new Span("Profile"))
        ).forEach(tab -> {
            tab.getStyle().set("cursor","pointer");
            add(tab);
        });

        setOrientation(Tabs.Orientation.VERTICAL);
        setHeight(240, Unit.PIXELS);
        setWidth(320, Unit.PIXELS);

        addSelectedChangeListener(event -> {
            if (indexOf(event.getSelectedTab()) == 0){
                mainPage.setContent(new BoardsMainPageContent(mainPage).getContent());
            }
            if (indexOf(event.getSelectedTab()) == 1) {
                mainPage.setContent( new TasksMainPageContent().getContent());
            }
        });
    }
}
