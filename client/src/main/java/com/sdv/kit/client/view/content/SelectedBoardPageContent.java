package com.sdv.kit.client.view.content;

import com.sdv.kit.client.view.component.BackButton;
import com.sdv.kit.client.view.page.MainPage;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@CssImport(value = "./styles/task-group-style.css", themeFor = "vaadin-grid")
public class SelectedBoardPageContent implements MainPageContent{

    private final MainPage mainPage;

    @Override
    public VerticalLayout getContent() {
        VerticalLayout verticalLayout = new VerticalLayout();

        BackButton backButton = new BackButton(mainPage, new BoardsMainPageContent(mainPage));

        Grid<Task> grid = new Grid<>(Task.class, false);
        grid.addColumn(Task::getName).setHeader("Task Group1");
        grid.addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS);
        grid.setWidth(200, Unit.PIXELS);
        grid.setAllRowsVisible(true);
        grid.setItems(
            List.of(
                    new Task("TASK1"),
                    new Task("TASK2"),
                    new Task("TASK3"),
                    new Task("TASK4"),
                    new Task("TASK1"),
                    new Task("TASK2"),
                    new Task("TASK3"),
                    new Task("TASK4"),
                    new Task("TASK1"),
                    new Task("TASK2"),
                    new Task("TASK3"),
                    new Task("TASK4"),
                    new Task("TASK1"),
                    new Task("TASK2"),
                    new Task("TASK3"),
                    new Task("TASK4")
            )
        );

        verticalLayout.add(backButton, grid);
        return verticalLayout;
    }

    @AllArgsConstructor
    class Task {
        private String name;

        public String getName() {
            return name;
        }
    }
}
