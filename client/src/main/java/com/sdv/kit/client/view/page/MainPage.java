package com.sdv.kit.client.view.page;

import com.sdv.kit.client.view.component.navbar.Logotype;
import com.sdv.kit.client.view.component.navbar.NavBarTabs;
import com.sdv.kit.client.view.component.navbar.AvatarLayout;
import com.sdv.kit.client.view.component.navbar.SearchField;
import com.sdv.kit.client.view.content.BoardsMainPageContent;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

@Route("")
@PreserveOnRefresh
public class MainPage extends AppLayout {

    private final DrawerToggle menu = new DrawerToggle();

    public MainPage() {
        addToDrawer(new AvatarLayout(),
                new Hr(),
                new NavBarTabs(this));
        addToNavbar(menu,
                new Logotype(),
                new SearchField());
        setContent(new BoardsMainPageContent(this).getContent());
    }
}
