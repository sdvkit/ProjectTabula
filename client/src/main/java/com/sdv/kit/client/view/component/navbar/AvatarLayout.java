package com.sdv.kit.client.view.component.navbar;

import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.Setter;

public class AvatarLayout extends VerticalLayout {

    @Setter
    private static String personName;

    private static Integer colorIndex = 0;

    public AvatarLayout() {
        // TODO credentials
        personName = "Mikola Delopata";

        H5 name = new H5(personName);
        name.getStyle()
                .set("margin-top", "-5px")
                .set("font-size", "16pt");

        Avatar avatar = new Avatar(personName);
        avatar.setWidth(80, Unit.PIXELS);
        avatar.setHeight(80, Unit.PIXELS);
        avatar.setColorIndex(colorIndex++);

        setHorizontalComponentAlignment(Alignment.CENTER, avatar);
        setHorizontalComponentAlignment(Alignment.CENTER, name);

        add(avatar, name);
    }
}
