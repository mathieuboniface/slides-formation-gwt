package com.excilys.formation.gwt.client.formation.development_mode;

import com.excilys.formation.gwt.client.formation.FormationGwt.Plan;
import com.excilys.formation.gwt.client.slider.slides.Chapter;
import com.excilys.formation.gwt.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class DevelopmentMode extends Chapter {

    @UiTemplate("Titre.ui.xml")
    interface Titre extends UiBinder<Element, ElementSlide> {
        Titre binder = GWT.create(Titre.class);
    }

    @UiTemplate("Indispensable.ui.xml")
    interface Indispensable extends UiBinder<Element, ElementSlide> {
        Indispensable binder = GWT.create(Indispensable.class);
    }

    @Override
    protected void buildSlides() {
        addSlide(Titre.binder);
        addSlide(Indispensable.binder);
        addSlide(Plan.binder);
    }

}